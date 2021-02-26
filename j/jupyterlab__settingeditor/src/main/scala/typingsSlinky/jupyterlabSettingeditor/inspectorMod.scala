package typingsSlinky.jupyterlabSettingeditor

import typingsSlinky.jupyterlabInspector.mod.InspectorPanel
import typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typingsSlinky.jupyterlabSettingeditor.raweditorMod.RawEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inspectorMod {
  
  @JSImport("@jupyterlab/settingeditor/lib/inspector", "createInspector")
  @js.native
  def createInspector(editor: RawEditor): InspectorPanel = js.native
  @JSImport("@jupyterlab/settingeditor/lib/inspector", "createInspector")
  @js.native
  def createInspector(editor: RawEditor, rendermime: IRenderMimeRegistry): InspectorPanel = js.native
}
