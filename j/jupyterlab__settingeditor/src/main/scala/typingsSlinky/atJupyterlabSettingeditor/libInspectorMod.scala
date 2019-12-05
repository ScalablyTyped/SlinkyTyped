package typingsSlinky.atJupyterlabSettingeditor

import typingsSlinky.atJupyterlabInspector.atJupyterlabInspectorMod.InspectorPanel
import typingsSlinky.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typingsSlinky.atJupyterlabSettingeditor.libRaweditorMod.RawEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/settingeditor/lib/inspector", JSImport.Namespace)
@js.native
object libInspectorMod extends js.Object {
  def createInspector(editor: RawEditor): InspectorPanel = js.native
  def createInspector(editor: RawEditor, rendermime: IRenderMimeRegistry): InspectorPanel = js.native
}

