package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerDocumentRangeFormattingEditProvider")
@js.native
object registerDocumentRangeFormattingEditProvider extends js.Object {
  def apply(languageId: String, provider: DocumentRangeFormattingEditProvider): IDisposable = js.native
}

