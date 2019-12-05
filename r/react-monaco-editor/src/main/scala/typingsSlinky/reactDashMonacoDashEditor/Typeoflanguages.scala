package typingsSlinky.reactDashMonacoDashEditor

import typingsSlinky.monacoDashEditor.monacoDashEditorMod.IDisposable
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.Thenable
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.CodeActionProvider
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.CodeLensProvider
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.CompletionItemProvider
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.DeclarationProvider
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.DefinitionProvider
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.DocumentColorProvider
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.DocumentFormattingEditProvider
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.DocumentHighlightProvider
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.DocumentRangeFormattingEditProvider
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.DocumentSymbolProvider
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.EncodedTokensProvider
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.FoldingRangeProvider
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.HoverProvider
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.ILanguageExtensionPoint
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.IMonarchLanguage
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.ImplementationProvider
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.LanguageConfiguration
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.LinkProvider
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.OnTypeFormattingEditProvider
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.ReferenceProvider
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.RenameProvider
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.SelectionRangeProvider
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.SignatureHelpProvider
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.TokensProvider
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages.TypeDefinitionProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoflanguages extends js.Object {
  var FoldingRangeKind: TypeofClassFoldingRangeKind = js.native
  val css: Typeofcss = js.native
  val html: Typeofhtml = js.native
  val json: Typeofjson = js.native
  val typescript: Typeoftypescript = js.native
  def getEncodedLanguageId(languageId: String): Double = js.native
  def getLanguages(): js.Array[ILanguageExtensionPoint] = js.native
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
  def registerDocumentSymbolProvider(languageId: String, provider: DocumentSymbolProvider): IDisposable = js.native
  def registerFoldingRangeProvider(languageId: String, provider: FoldingRangeProvider): IDisposable = js.native
  def registerHoverProvider(languageId: String, provider: HoverProvider): IDisposable = js.native
  def registerImplementationProvider(languageId: String, provider: ImplementationProvider): IDisposable = js.native
  def registerLinkProvider(languageId: String, provider: LinkProvider): IDisposable = js.native
  def registerOnTypeFormattingEditProvider(languageId: String, provider: OnTypeFormattingEditProvider): IDisposable = js.native
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
}

