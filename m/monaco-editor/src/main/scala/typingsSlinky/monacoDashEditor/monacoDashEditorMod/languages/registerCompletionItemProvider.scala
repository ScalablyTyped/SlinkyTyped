package typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages

import typingsSlinky.monacoDashEditor.monacoDashEditorMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerCompletionItemProvider")
@js.native
object registerCompletionItemProvider extends js.Object {
  def apply(languageId: String, provider: CompletionItemProvider): IDisposable = js.native
}

