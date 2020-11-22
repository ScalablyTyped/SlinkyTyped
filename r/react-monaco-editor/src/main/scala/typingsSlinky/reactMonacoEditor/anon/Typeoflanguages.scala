package typingsSlinky.reactMonacoEditor.anon

import typingsSlinky.monacoEditor.mod.IDisposable
import typingsSlinky.monacoEditor.mod.Thenable
import typingsSlinky.monacoEditor.mod.languages.CodeActionProvider
import typingsSlinky.monacoEditor.mod.languages.CodeLensProvider
import typingsSlinky.monacoEditor.mod.languages.CompletionItemProvider
import typingsSlinky.monacoEditor.mod.languages.DeclarationProvider
import typingsSlinky.monacoEditor.mod.languages.DefinitionProvider
import typingsSlinky.monacoEditor.mod.languages.DocumentColorProvider
import typingsSlinky.monacoEditor.mod.languages.DocumentFormattingEditProvider
import typingsSlinky.monacoEditor.mod.languages.DocumentHighlightProvider
import typingsSlinky.monacoEditor.mod.languages.DocumentRangeFormattingEditProvider
import typingsSlinky.monacoEditor.mod.languages.DocumentRangeSemanticTokensProvider
import typingsSlinky.monacoEditor.mod.languages.DocumentSemanticTokensProvider
import typingsSlinky.monacoEditor.mod.languages.DocumentSymbolProvider
import typingsSlinky.monacoEditor.mod.languages.EncodedTokensProvider
import typingsSlinky.monacoEditor.mod.languages.FoldingRangeProvider
import typingsSlinky.monacoEditor.mod.languages.HoverProvider
import typingsSlinky.monacoEditor.mod.languages.ILanguageExtensionPoint
import typingsSlinky.monacoEditor.mod.languages.IMonarchLanguage
import typingsSlinky.monacoEditor.mod.languages.ImplementationProvider
import typingsSlinky.monacoEditor.mod.languages.LanguageConfiguration
import typingsSlinky.monacoEditor.mod.languages.LinkProvider
import typingsSlinky.monacoEditor.mod.languages.OnTypeFormattingEditProvider
import typingsSlinky.monacoEditor.mod.languages.OnTypeRenameProvider
import typingsSlinky.monacoEditor.mod.languages.ReferenceProvider
import typingsSlinky.monacoEditor.mod.languages.RenameProvider
import typingsSlinky.monacoEditor.mod.languages.SelectionRangeProvider
import typingsSlinky.monacoEditor.mod.languages.SignatureHelpProvider
import typingsSlinky.monacoEditor.mod.languages.TokensProvider
import typingsSlinky.monacoEditor.mod.languages.TypeDefinitionProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoflanguages extends js.Object {
  
  var FoldingRangeKind: TypeofFoldingRangeKind = js.native
  
  val css: Typeofcss = js.native
  
  def getEncodedLanguageId(languageId: String): Double = js.native
  
  def getLanguages(): js.Array[ILanguageExtensionPoint] = js.native
  
  val html: Typeofhtml = js.native
  
  val json: Typeofjson = js.native
  
  def onLanguage(languageId: String, callback: js.Function0[Unit]): IDisposable = js.native
  
  def register(language: ILanguageExtensionPoint): Unit = js.native
  
  def registerCodeActionProvider(languageId: String, provider: CodeActionProvider): IDisposable = js.native
  
  def registerCodeLensProvider(languageId: String, provider: CodeLensProvider): IDisposable = js.native
  
  def registerColorProvider(languageId: String, provider: DocumentColorProvider): IDisposable = js.native
  
  def registerCompletionItemProvider(languageId: String, provider: CompletionItemProvider): IDisposable = js.native
  
  def registerDeclarationProvider(languageId: String, provider: DeclarationProvider): IDisposable = js.native
  
  def registerDefinitionProvider(languageId: String, provider: DefinitionProvider): IDisposable = js.native
  
  def registerDocumentFormattingEditProvider(languageId: String, provider: DocumentFormattingEditProvider): IDisposable = js.native
  
  def registerDocumentHighlightProvider(languageId: String, provider: DocumentHighlightProvider): IDisposable = js.native
  
  def registerDocumentRangeFormattingEditProvider(languageId: String, provider: DocumentRangeFormattingEditProvider): IDisposable = js.native
  
  def registerDocumentRangeSemanticTokensProvider(languageId: String, provider: DocumentRangeSemanticTokensProvider): IDisposable = js.native
  
  def registerDocumentSemanticTokensProvider(languageId: String, provider: DocumentSemanticTokensProvider): IDisposable = js.native
  
  def registerDocumentSymbolProvider(languageId: String, provider: DocumentSymbolProvider): IDisposable = js.native
  
  def registerFoldingRangeProvider(languageId: String, provider: FoldingRangeProvider): IDisposable = js.native
  
  def registerHoverProvider(languageId: String, provider: HoverProvider): IDisposable = js.native
  
  def registerImplementationProvider(languageId: String, provider: ImplementationProvider): IDisposable = js.native
  
  def registerLinkProvider(languageId: String, provider: LinkProvider): IDisposable = js.native
  
  def registerOnTypeFormattingEditProvider(languageId: String, provider: OnTypeFormattingEditProvider): IDisposable = js.native
  
  def registerOnTypeRenameProvider(languageId: String, provider: OnTypeRenameProvider): IDisposable = js.native
  
  def registerReferenceProvider(languageId: String, provider: ReferenceProvider): IDisposable = js.native
  
  def registerRenameProvider(languageId: String, provider: RenameProvider): IDisposable = js.native
  
  def registerSelectionRangeProvider(languageId: String, provider: SelectionRangeProvider): IDisposable = js.native
  
  def registerSignatureHelpProvider(languageId: String, provider: SignatureHelpProvider): IDisposable = js.native
  
  def registerTypeDefinitionProvider(languageId: String, provider: TypeDefinitionProvider): IDisposable = js.native
  
  def setLanguageConfiguration(languageId: String, configuration: LanguageConfiguration): IDisposable = js.native
  
  def setMonarchTokensProvider(languageId: String, languageDef: Thenable[IMonarchLanguage]): IDisposable = js.native
  def setMonarchTokensProvider(languageId: String, languageDef: IMonarchLanguage): IDisposable = js.native
  
  def setTokensProvider(languageId: String, provider: Thenable[TokensProvider | EncodedTokensProvider]): IDisposable = js.native
  def setTokensProvider(languageId: String, provider: EncodedTokensProvider): IDisposable = js.native
  def setTokensProvider(languageId: String, provider: TokensProvider): IDisposable = js.native
  
  val typescript: Typeoftypescript = js.native
}
