package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "languages.registerDocumentSemanticTokensProvider")
@js.native
object registerDocumentSemanticTokensProvider extends js.Object {
  
  def apply(languageId: String, provider: DocumentSemanticTokensProvider): IDisposable = js.native
}
