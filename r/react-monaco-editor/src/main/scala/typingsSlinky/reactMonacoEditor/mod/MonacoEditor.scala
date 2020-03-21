package typingsSlinky.reactMonacoEditor.mod

import typingsSlinky.monacoEditor.mod.editor.IStandaloneCodeEditor
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonacoEditor
  extends Component[MonacoEditorProps, js.Object, js.Any] {
  var editor: js.UndefOr[IStandaloneCodeEditor] = js.native
}

