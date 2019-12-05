package typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor

import typingsSlinky.monacoDashEditor.monacoDashEditorMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "editor.tokenize")
@js.native
object tokenize extends js.Object {
  def apply(text: String, languageId: String): js.Array[js.Array[Token]] = js.native
}

