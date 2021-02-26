package typingsSlinky.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object languages {
  
  type CharacterPair = js.Tuple2[java.lang.String, java.lang.String]
  
  type Definition = typingsSlinky.monacoEditor.mod.languages.Location | (js.Array[
    typingsSlinky.monacoEditor.mod.languages.Location | typingsSlinky.monacoEditor.mod.languages.LocationLink
  ])
  
  type IMonarchLanguageAction = typingsSlinky.monacoEditor.mod.languages.IShortMonarchLanguageAction | typingsSlinky.monacoEditor.mod.languages.IExpandedMonarchLanguageAction | (js.Array[
    typingsSlinky.monacoEditor.mod.languages.IExpandedMonarchLanguageAction | typingsSlinky.monacoEditor.mod.languages.IShortMonarchLanguageAction
  ])
  
  type IMonarchLanguageRule = typingsSlinky.monacoEditor.mod.languages.IShortMonarchLanguageRule1 | typingsSlinky.monacoEditor.mod.languages.IShortMonarchLanguageRule2 | typingsSlinky.monacoEditor.mod.languages.IExpandedMonarchLanguageRule
  
  type IShortMonarchLanguageAction = java.lang.String
  
  type IShortMonarchLanguageRule1 = js.Tuple2[
    java.lang.String | js.RegExp, 
    typingsSlinky.monacoEditor.mod.languages.IMonarchLanguageAction
  ]
  
  type IShortMonarchLanguageRule2 = js.Tuple3[
    java.lang.String | js.RegExp, 
    typingsSlinky.monacoEditor.mod.languages.IMonarchLanguageAction, 
    java.lang.String
  ]
  
  type ProviderResult[T] = js.UndefOr[
    T | scala.Null | (typingsSlinky.monacoEditor.mod.Thenable[js.UndefOr[T | scala.Null]])
  ]
  
  @scala.inline
  def getEncodedLanguageId(languageId: java.lang.String): scala.Double = typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("getEncodedLanguageId")(languageId.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  @scala.inline
  def getLanguages(): js.Array[typingsSlinky.monacoEditor.mod.languages.ILanguageExtensionPoint] = typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("getLanguages")().asInstanceOf[js.Array[typingsSlinky.monacoEditor.mod.languages.ILanguageExtensionPoint]]
  
  @scala.inline
  def onLanguage(languageId: java.lang.String, callback: js.Function0[scala.Unit]): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("onLanguage")(languageId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def register(language: typingsSlinky.monacoEditor.mod.languages.ILanguageExtensionPoint): scala.Unit = typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("register")(language.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def registerCodeActionProvider(
    languageId: java.lang.String,
    provider: typingsSlinky.monacoEditor.mod.languages.CodeActionProvider
  ): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerCodeActionProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerCodeLensProvider(languageId: java.lang.String, provider: typingsSlinky.monacoEditor.mod.languages.CodeLensProvider): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerCodeLensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerColorProvider(
    languageId: java.lang.String,
    provider: typingsSlinky.monacoEditor.mod.languages.DocumentColorProvider
  ): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerColorProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerCompletionItemProvider(
    languageId: java.lang.String,
    provider: typingsSlinky.monacoEditor.mod.languages.CompletionItemProvider
  ): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerCompletionItemProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerDeclarationProvider(
    languageId: java.lang.String,
    provider: typingsSlinky.monacoEditor.mod.languages.DeclarationProvider
  ): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDeclarationProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerDefinitionProvider(
    languageId: java.lang.String,
    provider: typingsSlinky.monacoEditor.mod.languages.DefinitionProvider
  ): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDefinitionProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerDocumentFormattingEditProvider(
    languageId: java.lang.String,
    provider: typingsSlinky.monacoEditor.mod.languages.DocumentFormattingEditProvider
  ): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentFormattingEditProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerDocumentHighlightProvider(
    languageId: java.lang.String,
    provider: typingsSlinky.monacoEditor.mod.languages.DocumentHighlightProvider
  ): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentHighlightProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerDocumentRangeFormattingEditProvider(
    languageId: java.lang.String,
    provider: typingsSlinky.monacoEditor.mod.languages.DocumentRangeFormattingEditProvider
  ): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentRangeFormattingEditProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerDocumentRangeSemanticTokensProvider(
    languageId: java.lang.String,
    provider: typingsSlinky.monacoEditor.mod.languages.DocumentRangeSemanticTokensProvider
  ): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentRangeSemanticTokensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerDocumentSemanticTokensProvider(
    languageId: java.lang.String,
    provider: typingsSlinky.monacoEditor.mod.languages.DocumentSemanticTokensProvider
  ): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentSemanticTokensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerDocumentSymbolProvider(
    languageId: java.lang.String,
    provider: typingsSlinky.monacoEditor.mod.languages.DocumentSymbolProvider
  ): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentSymbolProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerFoldingRangeProvider(
    languageId: java.lang.String,
    provider: typingsSlinky.monacoEditor.mod.languages.FoldingRangeProvider
  ): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerFoldingRangeProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerHoverProvider(languageId: java.lang.String, provider: typingsSlinky.monacoEditor.mod.languages.HoverProvider): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerHoverProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerImplementationProvider(
    languageId: java.lang.String,
    provider: typingsSlinky.monacoEditor.mod.languages.ImplementationProvider
  ): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerImplementationProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerLinkProvider(languageId: java.lang.String, provider: typingsSlinky.monacoEditor.mod.languages.LinkProvider): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerLinkProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerOnTypeFormattingEditProvider(
    languageId: java.lang.String,
    provider: typingsSlinky.monacoEditor.mod.languages.OnTypeFormattingEditProvider
  ): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerOnTypeFormattingEditProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerOnTypeRenameProvider(
    languageId: java.lang.String,
    provider: typingsSlinky.monacoEditor.mod.languages.OnTypeRenameProvider
  ): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerOnTypeRenameProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerReferenceProvider(languageId: java.lang.String, provider: typingsSlinky.monacoEditor.mod.languages.ReferenceProvider): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerReferenceProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerRenameProvider(languageId: java.lang.String, provider: typingsSlinky.monacoEditor.mod.languages.RenameProvider): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerRenameProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerSelectionRangeProvider(
    languageId: java.lang.String,
    provider: typingsSlinky.monacoEditor.mod.languages.SelectionRangeProvider
  ): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerSelectionRangeProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerSignatureHelpProvider(
    languageId: java.lang.String,
    provider: typingsSlinky.monacoEditor.mod.languages.SignatureHelpProvider
  ): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerSignatureHelpProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerTypeDefinitionProvider(
    languageId: java.lang.String,
    provider: typingsSlinky.monacoEditor.mod.languages.TypeDefinitionProvider
  ): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerTypeDefinitionProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def setLanguageConfiguration(
    languageId: java.lang.String,
    configuration: typingsSlinky.monacoEditor.mod.languages.LanguageConfiguration
  ): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("setLanguageConfiguration")(languageId.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def setMonarchTokensProvider(
    languageId: java.lang.String,
    languageDef: typingsSlinky.monacoEditor.mod.Thenable[typingsSlinky.monacoEditor.mod.languages.IMonarchLanguage]
  ): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("setMonarchTokensProvider")(languageId.asInstanceOf[js.Any], languageDef.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  @scala.inline
  def setMonarchTokensProvider(
    languageId: java.lang.String,
    languageDef: typingsSlinky.monacoEditor.mod.languages.IMonarchLanguage
  ): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("setMonarchTokensProvider")(languageId.asInstanceOf[js.Any], languageDef.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def setTokensProvider(
    languageId: java.lang.String,
    provider: typingsSlinky.monacoEditor.mod.Thenable[
      typingsSlinky.monacoEditor.mod.languages.TokensProvider | typingsSlinky.monacoEditor.mod.languages.EncodedTokensProvider
    ]
  ): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("setTokensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  @scala.inline
  def setTokensProvider(
    languageId: java.lang.String,
    provider: typingsSlinky.monacoEditor.mod.languages.EncodedTokensProvider
  ): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("setTokensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  @scala.inline
  def setTokensProvider(languageId: java.lang.String, provider: typingsSlinky.monacoEditor.mod.languages.TokensProvider): typingsSlinky.monacoEditor.mod.IDisposable = (typingsSlinky.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("setTokensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
}
