package typingsSlinky.rcEditorCore.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorCore extends js.Object {
  var context: js.Any = js.native
  var props: js.Any = js.native
  var refs: js.Any = js.native
  var state: js.Any = js.native
  def forceUpdate(): js.Any = js.native
  def render(): js.Any = js.native
  def setState(): js.Any = js.native
}

@JSImport("rc-editor-core", "EditorCore")
@js.native
object EditorCore extends TopLevel[IEditor]

