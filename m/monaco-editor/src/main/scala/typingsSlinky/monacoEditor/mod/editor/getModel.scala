package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "editor.getModel")
@js.native
object getModel extends js.Object {
  def apply(uri: Uri): ITextModel | Null = js.native
}

