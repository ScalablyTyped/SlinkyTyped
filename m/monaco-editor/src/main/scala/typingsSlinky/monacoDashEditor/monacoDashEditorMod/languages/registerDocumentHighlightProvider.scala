package typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages

import typingsSlinky.monacoDashEditor.monacoDashEditorMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerDocumentHighlightProvider")
@js.native
object registerDocumentHighlightProvider extends js.Object {
  def apply(languageId: String, provider: DocumentHighlightProvider): IDisposable = js.native
}

