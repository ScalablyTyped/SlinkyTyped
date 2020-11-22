package typingsSlinky.jupyterlabSettingeditor

import typingsSlinky.jupyterlabInspector.mod.InspectorPanel
import typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typingsSlinky.jupyterlabSettingeditor.raweditorMod.RawEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/settingeditor/lib/inspector", JSImport.Namespace)
@js.native
object inspectorMod extends js.Object {
  
  def createInspector(editor: RawEditor): InspectorPanel = js.native
  def createInspector(editor: RawEditor, rendermime: IRenderMimeRegistry): InspectorPanel = js.native
}
