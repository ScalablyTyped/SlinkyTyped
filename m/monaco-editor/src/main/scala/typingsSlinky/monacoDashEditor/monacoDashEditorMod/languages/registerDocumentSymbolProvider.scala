package typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages

import typingsSlinky.monacoDashEditor.monacoDashEditorMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerDocumentSymbolProvider")
@js.native
object registerDocumentSymbolProvider extends js.Object {
  def apply(languageId: String, provider: DocumentSymbolProvider): IDisposable = js.native
}

