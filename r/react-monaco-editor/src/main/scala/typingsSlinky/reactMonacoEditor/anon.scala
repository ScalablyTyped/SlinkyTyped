package typingsSlinky.reactMonacoEditor

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.monacoEditor.anon.Fragment
import typingsSlinky.monacoEditor.anon.Model
import typingsSlinky.monacoEditor.anon.Owner
import typingsSlinky.monacoEditor.mod.CancellationTokenSource
import typingsSlinky.monacoEditor.mod.Emitter
import typingsSlinky.monacoEditor.mod.IDisposable
import typingsSlinky.monacoEditor.mod.IPosition
import typingsSlinky.monacoEditor.mod.IRange
import typingsSlinky.monacoEditor.mod.ISelection
import typingsSlinky.monacoEditor.mod.KeyMod
import typingsSlinky.monacoEditor.mod.Position
import typingsSlinky.monacoEditor.mod.Range
import typingsSlinky.monacoEditor.mod.Selection
import typingsSlinky.monacoEditor.mod.SelectionDirection
import typingsSlinky.monacoEditor.mod.Thenable
import typingsSlinky.monacoEditor.mod.Token
import typingsSlinky.monacoEditor.mod.Uri
import typingsSlinky.monacoEditor.mod.UriComponents
import typingsSlinky.monacoEditor.mod.editor.AccessibilitySupport
import typingsSlinky.monacoEditor.mod.editor.EditorAutoClosingOvertypeStrategy
import typingsSlinky.monacoEditor.mod.editor.EditorAutoClosingStrategy
import typingsSlinky.monacoEditor.mod.editor.EditorAutoIndentStrategy
import typingsSlinky.monacoEditor.mod.editor.EditorAutoSurroundStrategy
import typingsSlinky.monacoEditor.mod.editor.EditorCommentsOptions
import typingsSlinky.monacoEditor.mod.editor.EditorFindOptions
import typingsSlinky.monacoEditor.mod.editor.EditorHoverOptions
import typingsSlinky.monacoEditor.mod.editor.EditorLayoutInfo
import typingsSlinky.monacoEditor.mod.editor.EditorLightbulbOptions
import typingsSlinky.monacoEditor.mod.editor.EditorMinimapOptions
import typingsSlinky.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnCommitCharacter
import typingsSlinky.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnEnter
import typingsSlinky.monacoEditor.mod.editor.EditorOption.accessibilityPageSize
import typingsSlinky.monacoEditor.mod.editor.EditorOption.accessibilitySupport
import typingsSlinky.monacoEditor.mod.editor.EditorOption.ariaLabel
import typingsSlinky.monacoEditor.mod.editor.EditorOption.autoClosingBrackets
import typingsSlinky.monacoEditor.mod.editor.EditorOption.autoClosingOvertype
import typingsSlinky.monacoEditor.mod.editor.EditorOption.autoClosingQuotes
import typingsSlinky.monacoEditor.mod.editor.EditorOption.autoIndent
import typingsSlinky.monacoEditor.mod.editor.EditorOption.autoSurround
import typingsSlinky.monacoEditor.mod.editor.EditorOption.automaticLayout
import typingsSlinky.monacoEditor.mod.editor.EditorOption.codeLens
import typingsSlinky.monacoEditor.mod.editor.EditorOption.colorDecorators
import typingsSlinky.monacoEditor.mod.editor.EditorOption.columnSelection
import typingsSlinky.monacoEditor.mod.editor.EditorOption.comments
import typingsSlinky.monacoEditor.mod.editor.EditorOption.contextmenu
import typingsSlinky.monacoEditor.mod.editor.EditorOption.copyWithSyntaxHighlighting
import typingsSlinky.monacoEditor.mod.editor.EditorOption.cursorBlinking
import typingsSlinky.monacoEditor.mod.editor.EditorOption.cursorSmoothCaretAnimation
import typingsSlinky.monacoEditor.mod.editor.EditorOption.cursorStyle
import typingsSlinky.monacoEditor.mod.editor.EditorOption.cursorSurroundingLines
import typingsSlinky.monacoEditor.mod.editor.EditorOption.cursorSurroundingLinesStyle
import typingsSlinky.monacoEditor.mod.editor.EditorOption.cursorWidth
import typingsSlinky.monacoEditor.mod.editor.EditorOption.definitionLinkOpensInPeek
import typingsSlinky.monacoEditor.mod.editor.EditorOption.disableLayerHinting
import typingsSlinky.monacoEditor.mod.editor.EditorOption.disableMonospaceOptimizations
import typingsSlinky.monacoEditor.mod.editor.EditorOption.dragAndDrop
import typingsSlinky.monacoEditor.mod.editor.EditorOption.editorClassName
import typingsSlinky.monacoEditor.mod.editor.EditorOption.emptySelectionClipboard
import typingsSlinky.monacoEditor.mod.editor.EditorOption.extraEditorClassName
import typingsSlinky.monacoEditor.mod.editor.EditorOption.fastScrollSensitivity
import typingsSlinky.monacoEditor.mod.editor.EditorOption.find
import typingsSlinky.monacoEditor.mod.editor.EditorOption.fixedOverflowWidgets
import typingsSlinky.monacoEditor.mod.editor.EditorOption.folding
import typingsSlinky.monacoEditor.mod.editor.EditorOption.foldingHighlight
import typingsSlinky.monacoEditor.mod.editor.EditorOption.foldingStrategy
import typingsSlinky.monacoEditor.mod.editor.EditorOption.fontFamily
import typingsSlinky.monacoEditor.mod.editor.EditorOption.fontInfo
import typingsSlinky.monacoEditor.mod.editor.EditorOption.fontLigatures
import typingsSlinky.monacoEditor.mod.editor.EditorOption.fontSize
import typingsSlinky.monacoEditor.mod.editor.EditorOption.fontWeight
import typingsSlinky.monacoEditor.mod.editor.EditorOption.formatOnPaste
import typingsSlinky.monacoEditor.mod.editor.EditorOption.formatOnType
import typingsSlinky.monacoEditor.mod.editor.EditorOption.glyphMargin
import typingsSlinky.monacoEditor.mod.editor.EditorOption.gotoLocation
import typingsSlinky.monacoEditor.mod.editor.EditorOption.hideCursorInOverviewRuler
import typingsSlinky.monacoEditor.mod.editor.EditorOption.highlightActiveIndentGuide
import typingsSlinky.monacoEditor.mod.editor.EditorOption.hover
import typingsSlinky.monacoEditor.mod.editor.EditorOption.inDiffEditor
import typingsSlinky.monacoEditor.mod.editor.EditorOption.layoutInfo
import typingsSlinky.monacoEditor.mod.editor.EditorOption.letterSpacing
import typingsSlinky.monacoEditor.mod.editor.EditorOption.lightbulb
import typingsSlinky.monacoEditor.mod.editor.EditorOption.lineDecorationsWidth
import typingsSlinky.monacoEditor.mod.editor.EditorOption.lineHeight
import typingsSlinky.monacoEditor.mod.editor.EditorOption.lineNumbers
import typingsSlinky.monacoEditor.mod.editor.EditorOption.lineNumbersMinChars
import typingsSlinky.monacoEditor.mod.editor.EditorOption.links
import typingsSlinky.monacoEditor.mod.editor.EditorOption.matchBrackets
import typingsSlinky.monacoEditor.mod.editor.EditorOption.minimap
import typingsSlinky.monacoEditor.mod.editor.EditorOption.mouseStyle
import typingsSlinky.monacoEditor.mod.editor.EditorOption.mouseWheelScrollSensitivity
import typingsSlinky.monacoEditor.mod.editor.EditorOption.mouseWheelZoom
import typingsSlinky.monacoEditor.mod.editor.EditorOption.multiCursorMergeOverlapping
import typingsSlinky.monacoEditor.mod.editor.EditorOption.multiCursorModifier
import typingsSlinky.monacoEditor.mod.editor.EditorOption.multiCursorPaste
import typingsSlinky.monacoEditor.mod.editor.EditorOption.occurrencesHighlight
import typingsSlinky.monacoEditor.mod.editor.EditorOption.overviewRulerBorder
import typingsSlinky.monacoEditor.mod.editor.EditorOption.overviewRulerLanes
import typingsSlinky.monacoEditor.mod.editor.EditorOption.padding
import typingsSlinky.monacoEditor.mod.editor.EditorOption.parameterHints
import typingsSlinky.monacoEditor.mod.editor.EditorOption.peekWidgetDefaultFocus
import typingsSlinky.monacoEditor.mod.editor.EditorOption.pixelRatio
import typingsSlinky.monacoEditor.mod.editor.EditorOption.quickSuggestions
import typingsSlinky.monacoEditor.mod.editor.EditorOption.quickSuggestionsDelay
import typingsSlinky.monacoEditor.mod.editor.EditorOption.readOnly
import typingsSlinky.monacoEditor.mod.editor.EditorOption.renameOnType
import typingsSlinky.monacoEditor.mod.editor.EditorOption.renderControlCharacters
import typingsSlinky.monacoEditor.mod.editor.EditorOption.renderFinalNewline
import typingsSlinky.monacoEditor.mod.editor.EditorOption.renderIndentGuides
import typingsSlinky.monacoEditor.mod.editor.EditorOption.renderLineHighlight
import typingsSlinky.monacoEditor.mod.editor.EditorOption.renderLineHighlightOnlyWhenFocus
import typingsSlinky.monacoEditor.mod.editor.EditorOption.renderValidationDecorations
import typingsSlinky.monacoEditor.mod.editor.EditorOption.renderWhitespace
import typingsSlinky.monacoEditor.mod.editor.EditorOption.revealHorizontalRightPadding
import typingsSlinky.monacoEditor.mod.editor.EditorOption.roundedSelection
import typingsSlinky.monacoEditor.mod.editor.EditorOption.rulers
import typingsSlinky.monacoEditor.mod.editor.EditorOption.scrollBeyondLastColumn
import typingsSlinky.monacoEditor.mod.editor.EditorOption.scrollBeyondLastLine
import typingsSlinky.monacoEditor.mod.editor.EditorOption.scrollPredominantAxis
import typingsSlinky.monacoEditor.mod.editor.EditorOption.scrollbar
import typingsSlinky.monacoEditor.mod.editor.EditorOption.selectOnLineNumbers
import typingsSlinky.monacoEditor.mod.editor.EditorOption.selectionClipboard
import typingsSlinky.monacoEditor.mod.editor.EditorOption.selectionHighlight
import typingsSlinky.monacoEditor.mod.editor.EditorOption.showDeprecated
import typingsSlinky.monacoEditor.mod.editor.EditorOption.showFoldingControls
import typingsSlinky.monacoEditor.mod.editor.EditorOption.showUnused
import typingsSlinky.monacoEditor.mod.editor.EditorOption.smoothScrolling
import typingsSlinky.monacoEditor.mod.editor.EditorOption.snippetSuggestions
import typingsSlinky.monacoEditor.mod.editor.EditorOption.stopRenderingLineAfter
import typingsSlinky.monacoEditor.mod.editor.EditorOption.suggest
import typingsSlinky.monacoEditor.mod.editor.EditorOption.suggestFontSize
import typingsSlinky.monacoEditor.mod.editor.EditorOption.suggestLineHeight
import typingsSlinky.monacoEditor.mod.editor.EditorOption.suggestOnTriggerCharacters
import typingsSlinky.monacoEditor.mod.editor.EditorOption.suggestSelection
import typingsSlinky.monacoEditor.mod.editor.EditorOption.tabCompletion
import typingsSlinky.monacoEditor.mod.editor.EditorOption.tabFocusMode
import typingsSlinky.monacoEditor.mod.editor.EditorOption.tabIndex
import typingsSlinky.monacoEditor.mod.editor.EditorOption.unfoldOnClickAfterEndOfLine
import typingsSlinky.monacoEditor.mod.editor.EditorOption.unusualLineTerminators
import typingsSlinky.monacoEditor.mod.editor.EditorOption.useTabStops
import typingsSlinky.monacoEditor.mod.editor.EditorOption.wordSeparators
import typingsSlinky.monacoEditor.mod.editor.EditorOption.wordWrap
import typingsSlinky.monacoEditor.mod.editor.EditorOption.wordWrapBreakAfterCharacters
import typingsSlinky.monacoEditor.mod.editor.EditorOption.wordWrapBreakBeforeCharacters
import typingsSlinky.monacoEditor.mod.editor.EditorOption.wordWrapMinified
import typingsSlinky.monacoEditor.mod.editor.EditorOption.wrappingIndent
import typingsSlinky.monacoEditor.mod.editor.EditorOption.wrappingInfo
import typingsSlinky.monacoEditor.mod.editor.EditorOption.wrappingStrategy
import typingsSlinky.monacoEditor.mod.editor.EditorWrappingInfo
import typingsSlinky.monacoEditor.mod.editor.FontInfo
import typingsSlinky.monacoEditor.mod.editor.GoToLocationOptions
import typingsSlinky.monacoEditor.mod.editor.ICodeEditor
import typingsSlinky.monacoEditor.mod.editor.IColorizerElementOptions
import typingsSlinky.monacoEditor.mod.editor.IColorizerOptions
import typingsSlinky.monacoEditor.mod.editor.IDiffEditorConstructionOptions
import typingsSlinky.monacoEditor.mod.editor.IDiffNavigator
import typingsSlinky.monacoEditor.mod.editor.IDiffNavigatorOptions
import typingsSlinky.monacoEditor.mod.editor.IEditorOption
import typingsSlinky.monacoEditor.mod.editor.IEditorOverrideServices
import typingsSlinky.monacoEditor.mod.editor.IMarker
import typingsSlinky.monacoEditor.mod.editor.IMarkerData
import typingsSlinky.monacoEditor.mod.editor.IStandaloneCodeEditor
import typingsSlinky.monacoEditor.mod.editor.IStandaloneDiffEditor
import typingsSlinky.monacoEditor.mod.editor.IStandaloneEditorConstructionOptions
import typingsSlinky.monacoEditor.mod.editor.IStandaloneThemeData
import typingsSlinky.monacoEditor.mod.editor.ITextModel
import typingsSlinky.monacoEditor.mod.editor.IWebWorkerOptions
import typingsSlinky.monacoEditor.mod.editor.InternalEditorPaddingOptions
import typingsSlinky.monacoEditor.mod.editor.InternalEditorRenderLineNumbersOptions
import typingsSlinky.monacoEditor.mod.editor.InternalEditorScrollbarOptions
import typingsSlinky.monacoEditor.mod.editor.InternalParameterHintOptions
import typingsSlinky.monacoEditor.mod.editor.InternalSuggestOptions
import typingsSlinky.monacoEditor.mod.editor.MonacoWebWorker
import typingsSlinky.monacoEditor.mod.editor.TextEditorCursorBlinkingStyle
import typingsSlinky.monacoEditor.mod.editor.TextEditorCursorStyle
import typingsSlinky.monacoEditor.mod.editor.ValidQuickSuggestionsOptions
import typingsSlinky.monacoEditor.mod.editor.WrappingIndent
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
import typingsSlinky.monacoEditor.mod.languages.FoldingRangeKind
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
import typingsSlinky.monacoEditor.mod.languages.css.LanguageServiceDefaults
import typingsSlinky.monacoEditor.mod.languages.typescript.TypeScriptWorker
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.`inline`
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.advanced
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.all
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.altKey
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.always
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.auto
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.bottom
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.boundary
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.bounded
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.copy
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.ctrlKey
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.default
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.editable
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.editor
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.first
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.full
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.gutter
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.indentation
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.line
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.metaKey
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.mouseover
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.near
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.never
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.none
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.off
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.on
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.onlySnippets
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.prompt
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.recentlyUsed
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.recentlyUsedByPrefix
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.selection
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.simple
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.smart
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.spread
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.text
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.top
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.trailing
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.tree
import typingsSlinky.reactMonacoEditor.reactMonacoEditorStrings.wordWrapColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(domElement: HTMLElement): IStandaloneCodeEditor = js.native
    def apply(domElement: HTMLElement, options: js.UndefOr[scala.Nothing], `override`: IEditorOverrideServices): IStandaloneCodeEditor = js.native
    def apply(domElement: HTMLElement, options: IStandaloneEditorConstructionOptions): IStandaloneCodeEditor = js.native
    def apply(
      domElement: HTMLElement,
      options: IStandaloneEditorConstructionOptions,
      `override`: IEditorOverrideServices
    ): IStandaloneCodeEditor = js.native
  }
  
  @js.native
  trait TypeofEditorOptions extends StObject {
    
    var acceptSuggestionOnCommitCharacter: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnCommitCharacter, 
        Boolean
      ] = js.native
    
    var acceptSuggestionOnEnter: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnEnter, 
        on | off | smart
      ] = js.native
    
    var accessibilityPageSize: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.accessibilityPageSize, Double] = js.native
    
    var accessibilitySupport: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.accessibilitySupport, 
        AccessibilitySupport
      ] = js.native
    
    var ariaLabel: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.ariaLabel, String] = js.native
    
    var autoClosingBrackets: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.autoClosingBrackets, 
        EditorAutoClosingStrategy
      ] = js.native
    
    var autoClosingOvertype: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.autoClosingOvertype, 
        EditorAutoClosingOvertypeStrategy
      ] = js.native
    
    var autoClosingQuotes: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.autoClosingQuotes, 
        EditorAutoClosingStrategy
      ] = js.native
    
    var autoIndent: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.autoIndent, 
        EditorAutoIndentStrategy
      ] = js.native
    
    var autoSurround: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.autoSurround, 
        EditorAutoSurroundStrategy
      ] = js.native
    
    var automaticLayout: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.automaticLayout, Boolean] = js.native
    
    var codeLens: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.codeLens, Boolean] = js.native
    
    var colorDecorators: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.colorDecorators, Boolean] = js.native
    
    var columnSelection: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.columnSelection, Boolean] = js.native
    
    var comments: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.comments, EditorCommentsOptions] = js.native
    
    var contextmenu: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.contextmenu, Boolean] = js.native
    
    var copyWithSyntaxHighlighting: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.copyWithSyntaxHighlighting, 
        Boolean
      ] = js.native
    
    var cursorBlinking: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.cursorBlinking, 
        TextEditorCursorBlinkingStyle
      ] = js.native
    
    var cursorSmoothCaretAnimation: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.cursorSmoothCaretAnimation, 
        Boolean
      ] = js.native
    
    var cursorStyle: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.cursorStyle, 
        TextEditorCursorStyle
      ] = js.native
    
    var cursorSurroundingLines: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.cursorSurroundingLines, Double] = js.native
    
    var cursorSurroundingLinesStyle: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.cursorSurroundingLinesStyle, 
        default | all
      ] = js.native
    
    var cursorWidth: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.cursorWidth, Double] = js.native
    
    var definitionLinkOpensInPeek: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.definitionLinkOpensInPeek, 
        Boolean
      ] = js.native
    
    var disableLayerHinting: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.disableLayerHinting, Boolean] = js.native
    
    var disableMonospaceOptimizations: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.disableMonospaceOptimizations, 
        Boolean
      ] = js.native
    
    var dragAndDrop: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.dragAndDrop, Boolean] = js.native
    
    var editorClassName: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.editorClassName, String] = js.native
    
    var emptySelectionClipboard: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.emptySelectionClipboard, 
        Boolean
      ] = js.native
    
    var extraEditorClassName: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.extraEditorClassName, String] = js.native
    
    var fastScrollSensitivity: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.fastScrollSensitivity, Double] = js.native
    
    var find: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.find, EditorFindOptions] = js.native
    
    var fixedOverflowWidgets: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.fixedOverflowWidgets, Boolean] = js.native
    
    var folding: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.folding, Boolean] = js.native
    
    var foldingHighlight: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.foldingHighlight, Boolean] = js.native
    
    var foldingStrategy: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.foldingStrategy, 
        auto | indentation
      ] = js.native
    
    var fontFamily: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.fontFamily, String] = js.native
    
    var fontInfo: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.fontInfo, FontInfo] = js.native
    
    var fontLigatures2: IEditorOption[fontLigatures, String] = js.native
    
    var fontSize: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.fontSize, Double] = js.native
    
    var fontWeight: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.fontWeight, String] = js.native
    
    var formatOnPaste: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.formatOnPaste, Boolean] = js.native
    
    var formatOnType: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.formatOnType, Boolean] = js.native
    
    var glyphMargin: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.glyphMargin, Boolean] = js.native
    
    var gotoLocation: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.gotoLocation, 
        GoToLocationOptions
      ] = js.native
    
    var hideCursorInOverviewRuler: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.hideCursorInOverviewRuler, 
        Boolean
      ] = js.native
    
    var highlightActiveIndentGuide: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.highlightActiveIndentGuide, 
        Boolean
      ] = js.native
    
    var hover: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.hover, EditorHoverOptions] = js.native
    
    var inDiffEditor: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.inDiffEditor, Boolean] = js.native
    
    var layoutInfo: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.layoutInfo, EditorLayoutInfo] = js.native
    
    var letterSpacing: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.letterSpacing, Double] = js.native
    
    var lightbulb: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.lightbulb, 
        EditorLightbulbOptions
      ] = js.native
    
    var lineDecorationsWidth: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.lineDecorationsWidth, 
        String | Double
      ] = js.native
    
    var lineHeight: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.lineHeight, Double] = js.native
    
    var lineNumbers: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.lineNumbers, 
        InternalEditorRenderLineNumbersOptions
      ] = js.native
    
    var lineNumbersMinChars: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.lineNumbersMinChars, Double] = js.native
    
    var links: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.links, Boolean] = js.native
    
    var matchBrackets: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.matchBrackets, 
        always | never | near
      ] = js.native
    
    var minimap: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.minimap, EditorMinimapOptions] = js.native
    
    var mouseStyle: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.mouseStyle, 
        default | text | copy
      ] = js.native
    
    var mouseWheelScrollSensitivity: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.mouseWheelScrollSensitivity, 
        Double
      ] = js.native
    
    var mouseWheelZoom: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.mouseWheelZoom, Boolean] = js.native
    
    var multiCursorMergeOverlapping: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.multiCursorMergeOverlapping, 
        Boolean
      ] = js.native
    
    var multiCursorModifier: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.multiCursorModifier, 
        altKey | metaKey | ctrlKey
      ] = js.native
    
    var multiCursorPaste: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.multiCursorPaste, spread | full] = js.native
    
    var occurrencesHighlight: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.occurrencesHighlight, Boolean] = js.native
    
    var overviewRulerBorder: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.overviewRulerBorder, Boolean] = js.native
    
    var overviewRulerLanes: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.overviewRulerLanes, Double] = js.native
    
    var padding: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.padding, 
        InternalEditorPaddingOptions
      ] = js.native
    
    var parameterHints: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.parameterHints, 
        InternalParameterHintOptions
      ] = js.native
    
    var peekWidgetDefaultFocus: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.peekWidgetDefaultFocus, 
        tree | editor
      ] = js.native
    
    var pixelRatio: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.pixelRatio, Double] = js.native
    
    var quickSuggestions: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.quickSuggestions, 
        ValidQuickSuggestionsOptions
      ] = js.native
    
    var quickSuggestionsDelay: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.quickSuggestionsDelay, Double] = js.native
    
    var readOnly: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.readOnly, Boolean] = js.native
    
    var renameOnType: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.renameOnType, Boolean] = js.native
    
    var renderControlCharacters: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.renderControlCharacters, 
        Boolean
      ] = js.native
    
    var renderFinalNewline: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.renderFinalNewline, Boolean] = js.native
    
    var renderIndentGuides: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.renderIndentGuides, Boolean] = js.native
    
    var renderLineHighlight: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.renderLineHighlight, 
        all | line | none | gutter
      ] = js.native
    
    var renderLineHighlightOnlyWhenFocus: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.renderLineHighlightOnlyWhenFocus, 
        Boolean
      ] = js.native
    
    var renderValidationDecorations: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.renderValidationDecorations, 
        on | off | editable
      ] = js.native
    
    var renderWhitespace: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.renderWhitespace, 
        all | none | boundary | selection | trailing
      ] = js.native
    
    var revealHorizontalRightPadding: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.revealHorizontalRightPadding, 
        Double
      ] = js.native
    
    var roundedSelection: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.roundedSelection, Boolean] = js.native
    
    var rulers: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.rulers, js.Object] = js.native
    
    var scrollBeyondLastColumn: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.scrollBeyondLastColumn, Double] = js.native
    
    var scrollBeyondLastLine: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.scrollBeyondLastLine, Boolean] = js.native
    
    var scrollPredominantAxis: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.scrollPredominantAxis, Boolean] = js.native
    
    var scrollbar: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.scrollbar, 
        InternalEditorScrollbarOptions
      ] = js.native
    
    var selectOnLineNumbers: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.selectOnLineNumbers, Boolean] = js.native
    
    var selectionClipboard: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.selectionClipboard, Boolean] = js.native
    
    var selectionHighlight: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.selectionHighlight, Boolean] = js.native
    
    var showDeprecated: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.showDeprecated, Boolean] = js.native
    
    var showFoldingControls: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.showFoldingControls, 
        always | mouseover
      ] = js.native
    
    var showUnused: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.showUnused, Boolean] = js.native
    
    var smoothScrolling: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.smoothScrolling, Boolean] = js.native
    
    var snippetSuggestions: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.snippetSuggestions, 
        none | top | bottom | `inline`
      ] = js.native
    
    var stopRenderingLineAfter: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.stopRenderingLineAfter, Double] = js.native
    
    var suggest: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.suggest, InternalSuggestOptions] = js.native
    
    var suggestFontSize: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.suggestFontSize, Double] = js.native
    
    var suggestLineHeight: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.suggestLineHeight, Double] = js.native
    
    var suggestOnTriggerCharacters: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.suggestOnTriggerCharacters, 
        Boolean
      ] = js.native
    
    var suggestSelection: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.suggestSelection, 
        first | recentlyUsed | recentlyUsedByPrefix
      ] = js.native
    
    var tabCompletion: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.tabCompletion, 
        on | off | onlySnippets
      ] = js.native
    
    var tabFocusMode: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.tabFocusMode, Boolean] = js.native
    
    var tabIndex: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.tabIndex, Double] = js.native
    
    var unfoldOnClickAfterEndOfLine: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.unfoldOnClickAfterEndOfLine, 
        Boolean
      ] = js.native
    
    var unusualLineTerminators: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.unusualLineTerminators, 
        off | prompt | auto
      ] = js.native
    
    var useTabStops: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.useTabStops, Boolean] = js.native
    
    var wordSeparators: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.wordSeparators, String] = js.native
    
    var wordWrap: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.wordWrap, 
        on | off | wordWrapColumn | bounded
      ] = js.native
    
    var wordWrapBreakAfterCharacters: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.wordWrapBreakAfterCharacters, 
        String
      ] = js.native
    
    var wordWrapBreakBeforeCharacters: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.wordWrapBreakBeforeCharacters, 
        String
      ] = js.native
    
    var wordWrapColumn: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.wordWrapColumn, Double] = js.native
    
    var wordWrapMinified: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.wordWrapMinified, Boolean] = js.native
    
    var wrappingIndent: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.wrappingIndent, WrappingIndent] = js.native
    
    var wrappingInfo: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.wrappingInfo, 
        EditorWrappingInfo
      ] = js.native
    
    var wrappingStrategy: IEditorOption[
        typingsSlinky.monacoEditor.mod.editor.EditorOption.wrappingStrategy, 
        simple | advanced
      ] = js.native
  }
  object TypeofEditorOptions {
    
    @scala.inline
    def apply(
      acceptSuggestionOnCommitCharacter: IEditorOption[acceptSuggestionOnCommitCharacter, Boolean],
      acceptSuggestionOnEnter: IEditorOption[acceptSuggestionOnEnter, on | off | smart],
      accessibilityPageSize: IEditorOption[accessibilityPageSize, Double],
      accessibilitySupport: IEditorOption[accessibilitySupport, AccessibilitySupport],
      ariaLabel: IEditorOption[ariaLabel, String],
      autoClosingBrackets: IEditorOption[autoClosingBrackets, EditorAutoClosingStrategy],
      autoClosingOvertype: IEditorOption[autoClosingOvertype, EditorAutoClosingOvertypeStrategy],
      autoClosingQuotes: IEditorOption[autoClosingQuotes, EditorAutoClosingStrategy],
      autoIndent: IEditorOption[autoIndent, EditorAutoIndentStrategy],
      autoSurround: IEditorOption[autoSurround, EditorAutoSurroundStrategy],
      automaticLayout: IEditorOption[automaticLayout, Boolean],
      codeLens: IEditorOption[codeLens, Boolean],
      colorDecorators: IEditorOption[colorDecorators, Boolean],
      columnSelection: IEditorOption[columnSelection, Boolean],
      comments: IEditorOption[comments, EditorCommentsOptions],
      contextmenu: IEditorOption[contextmenu, Boolean],
      copyWithSyntaxHighlighting: IEditorOption[copyWithSyntaxHighlighting, Boolean],
      cursorBlinking: IEditorOption[cursorBlinking, TextEditorCursorBlinkingStyle],
      cursorSmoothCaretAnimation: IEditorOption[cursorSmoothCaretAnimation, Boolean],
      cursorStyle: IEditorOption[cursorStyle, TextEditorCursorStyle],
      cursorSurroundingLines: IEditorOption[cursorSurroundingLines, Double],
      cursorSurroundingLinesStyle: IEditorOption[cursorSurroundingLinesStyle, default | all],
      cursorWidth: IEditorOption[cursorWidth, Double],
      definitionLinkOpensInPeek: IEditorOption[definitionLinkOpensInPeek, Boolean],
      disableLayerHinting: IEditorOption[disableLayerHinting, Boolean],
      disableMonospaceOptimizations: IEditorOption[disableMonospaceOptimizations, Boolean],
      dragAndDrop: IEditorOption[dragAndDrop, Boolean],
      editorClassName: IEditorOption[editorClassName, String],
      emptySelectionClipboard: IEditorOption[emptySelectionClipboard, Boolean],
      extraEditorClassName: IEditorOption[extraEditorClassName, String],
      fastScrollSensitivity: IEditorOption[fastScrollSensitivity, Double],
      find: IEditorOption[find, EditorFindOptions],
      fixedOverflowWidgets: IEditorOption[fixedOverflowWidgets, Boolean],
      folding: IEditorOption[folding, Boolean],
      foldingHighlight: IEditorOption[foldingHighlight, Boolean],
      foldingStrategy: IEditorOption[foldingStrategy, auto | indentation],
      fontFamily: IEditorOption[fontFamily, String],
      fontInfo: IEditorOption[fontInfo, FontInfo],
      fontLigatures2: IEditorOption[fontLigatures, String],
      fontSize: IEditorOption[fontSize, Double],
      fontWeight: IEditorOption[fontWeight, String],
      formatOnPaste: IEditorOption[formatOnPaste, Boolean],
      formatOnType: IEditorOption[formatOnType, Boolean],
      glyphMargin: IEditorOption[glyphMargin, Boolean],
      gotoLocation: IEditorOption[gotoLocation, GoToLocationOptions],
      hideCursorInOverviewRuler: IEditorOption[hideCursorInOverviewRuler, Boolean],
      highlightActiveIndentGuide: IEditorOption[highlightActiveIndentGuide, Boolean],
      hover: IEditorOption[hover, EditorHoverOptions],
      inDiffEditor: IEditorOption[inDiffEditor, Boolean],
      layoutInfo: IEditorOption[layoutInfo, EditorLayoutInfo],
      letterSpacing: IEditorOption[letterSpacing, Double],
      lightbulb: IEditorOption[lightbulb, EditorLightbulbOptions],
      lineDecorationsWidth: IEditorOption[lineDecorationsWidth, String | Double],
      lineHeight: IEditorOption[lineHeight, Double],
      lineNumbers: IEditorOption[lineNumbers, InternalEditorRenderLineNumbersOptions],
      lineNumbersMinChars: IEditorOption[lineNumbersMinChars, Double],
      links: IEditorOption[links, Boolean],
      matchBrackets: IEditorOption[matchBrackets, always | never | near],
      minimap: IEditorOption[minimap, EditorMinimapOptions],
      mouseStyle: IEditorOption[mouseStyle, default | text | copy],
      mouseWheelScrollSensitivity: IEditorOption[mouseWheelScrollSensitivity, Double],
      mouseWheelZoom: IEditorOption[mouseWheelZoom, Boolean],
      multiCursorMergeOverlapping: IEditorOption[multiCursorMergeOverlapping, Boolean],
      multiCursorModifier: IEditorOption[multiCursorModifier, altKey | metaKey | ctrlKey],
      multiCursorPaste: IEditorOption[multiCursorPaste, spread | full],
      occurrencesHighlight: IEditorOption[occurrencesHighlight, Boolean],
      overviewRulerBorder: IEditorOption[overviewRulerBorder, Boolean],
      overviewRulerLanes: IEditorOption[overviewRulerLanes, Double],
      padding: IEditorOption[padding, InternalEditorPaddingOptions],
      parameterHints: IEditorOption[parameterHints, InternalParameterHintOptions],
      peekWidgetDefaultFocus: IEditorOption[peekWidgetDefaultFocus, tree | editor],
      pixelRatio: IEditorOption[pixelRatio, Double],
      quickSuggestions: IEditorOption[quickSuggestions, ValidQuickSuggestionsOptions],
      quickSuggestionsDelay: IEditorOption[quickSuggestionsDelay, Double],
      readOnly: IEditorOption[readOnly, Boolean],
      renameOnType: IEditorOption[renameOnType, Boolean],
      renderControlCharacters: IEditorOption[renderControlCharacters, Boolean],
      renderFinalNewline: IEditorOption[renderFinalNewline, Boolean],
      renderIndentGuides: IEditorOption[renderIndentGuides, Boolean],
      renderLineHighlight: IEditorOption[renderLineHighlight, all | line | none | gutter],
      renderLineHighlightOnlyWhenFocus: IEditorOption[renderLineHighlightOnlyWhenFocus, Boolean],
      renderValidationDecorations: IEditorOption[renderValidationDecorations, on | off | editable],
      renderWhitespace: IEditorOption[renderWhitespace, all | none | boundary | selection | trailing],
      revealHorizontalRightPadding: IEditorOption[revealHorizontalRightPadding, Double],
      roundedSelection: IEditorOption[roundedSelection, Boolean],
      rulers: IEditorOption[rulers, js.Object],
      scrollBeyondLastColumn: IEditorOption[scrollBeyondLastColumn, Double],
      scrollBeyondLastLine: IEditorOption[scrollBeyondLastLine, Boolean],
      scrollPredominantAxis: IEditorOption[scrollPredominantAxis, Boolean],
      scrollbar: IEditorOption[scrollbar, InternalEditorScrollbarOptions],
      selectOnLineNumbers: IEditorOption[selectOnLineNumbers, Boolean],
      selectionClipboard: IEditorOption[selectionClipboard, Boolean],
      selectionHighlight: IEditorOption[selectionHighlight, Boolean],
      showDeprecated: IEditorOption[showDeprecated, Boolean],
      showFoldingControls: IEditorOption[showFoldingControls, always | mouseover],
      showUnused: IEditorOption[showUnused, Boolean],
      smoothScrolling: IEditorOption[smoothScrolling, Boolean],
      snippetSuggestions: IEditorOption[snippetSuggestions, none | top | bottom | `inline`],
      stopRenderingLineAfter: IEditorOption[stopRenderingLineAfter, Double],
      suggest: IEditorOption[suggest, InternalSuggestOptions],
      suggestFontSize: IEditorOption[suggestFontSize, Double],
      suggestLineHeight: IEditorOption[suggestLineHeight, Double],
      suggestOnTriggerCharacters: IEditorOption[suggestOnTriggerCharacters, Boolean],
      suggestSelection: IEditorOption[suggestSelection, first | recentlyUsed | recentlyUsedByPrefix],
      tabCompletion: IEditorOption[tabCompletion, on | off | onlySnippets],
      tabFocusMode: IEditorOption[tabFocusMode, Boolean],
      tabIndex: IEditorOption[tabIndex, Double],
      unfoldOnClickAfterEndOfLine: IEditorOption[unfoldOnClickAfterEndOfLine, Boolean],
      unusualLineTerminators: IEditorOption[unusualLineTerminators, off | prompt | auto],
      useTabStops: IEditorOption[useTabStops, Boolean],
      wordSeparators: IEditorOption[wordSeparators, String],
      wordWrap: IEditorOption[wordWrap, on | off | wordWrapColumn | bounded],
      wordWrapBreakAfterCharacters: IEditorOption[wordWrapBreakAfterCharacters, String],
      wordWrapBreakBeforeCharacters: IEditorOption[wordWrapBreakBeforeCharacters, String],
      wordWrapColumn: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.wordWrapColumn, Double],
      wordWrapMinified: IEditorOption[wordWrapMinified, Boolean],
      wrappingIndent: IEditorOption[wrappingIndent, WrappingIndent],
      wrappingInfo: IEditorOption[wrappingInfo, EditorWrappingInfo],
      wrappingStrategy: IEditorOption[wrappingStrategy, simple | advanced]
    ): TypeofEditorOptions = {
      val __obj = js.Dynamic.literal(acceptSuggestionOnCommitCharacter = acceptSuggestionOnCommitCharacter.asInstanceOf[js.Any], acceptSuggestionOnEnter = acceptSuggestionOnEnter.asInstanceOf[js.Any], accessibilityPageSize = accessibilityPageSize.asInstanceOf[js.Any], accessibilitySupport = accessibilitySupport.asInstanceOf[js.Any], ariaLabel = ariaLabel.asInstanceOf[js.Any], autoClosingBrackets = autoClosingBrackets.asInstanceOf[js.Any], autoClosingOvertype = autoClosingOvertype.asInstanceOf[js.Any], autoClosingQuotes = autoClosingQuotes.asInstanceOf[js.Any], autoIndent = autoIndent.asInstanceOf[js.Any], autoSurround = autoSurround.asInstanceOf[js.Any], automaticLayout = automaticLayout.asInstanceOf[js.Any], codeLens = codeLens.asInstanceOf[js.Any], colorDecorators = colorDecorators.asInstanceOf[js.Any], columnSelection = columnSelection.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copyWithSyntaxHighlighting = copyWithSyntaxHighlighting.asInstanceOf[js.Any], cursorBlinking = cursorBlinking.asInstanceOf[js.Any], cursorSmoothCaretAnimation = cursorSmoothCaretAnimation.asInstanceOf[js.Any], cursorStyle = cursorStyle.asInstanceOf[js.Any], cursorSurroundingLines = cursorSurroundingLines.asInstanceOf[js.Any], cursorSurroundingLinesStyle = cursorSurroundingLinesStyle.asInstanceOf[js.Any], cursorWidth = cursorWidth.asInstanceOf[js.Any], definitionLinkOpensInPeek = definitionLinkOpensInPeek.asInstanceOf[js.Any], disableLayerHinting = disableLayerHinting.asInstanceOf[js.Any], disableMonospaceOptimizations = disableMonospaceOptimizations.asInstanceOf[js.Any], dragAndDrop = dragAndDrop.asInstanceOf[js.Any], editorClassName = editorClassName.asInstanceOf[js.Any], emptySelectionClipboard = emptySelectionClipboard.asInstanceOf[js.Any], extraEditorClassName = extraEditorClassName.asInstanceOf[js.Any], fastScrollSensitivity = fastScrollSensitivity.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], fixedOverflowWidgets = fixedOverflowWidgets.asInstanceOf[js.Any], folding = folding.asInstanceOf[js.Any], foldingHighlight = foldingHighlight.asInstanceOf[js.Any], foldingStrategy = foldingStrategy.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontInfo = fontInfo.asInstanceOf[js.Any], fontLigatures2 = fontLigatures2.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], formatOnPaste = formatOnPaste.asInstanceOf[js.Any], formatOnType = formatOnType.asInstanceOf[js.Any], glyphMargin = glyphMargin.asInstanceOf[js.Any], gotoLocation = gotoLocation.asInstanceOf[js.Any], hideCursorInOverviewRuler = hideCursorInOverviewRuler.asInstanceOf[js.Any], highlightActiveIndentGuide = highlightActiveIndentGuide.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], inDiffEditor = inDiffEditor.asInstanceOf[js.Any], layoutInfo = layoutInfo.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lightbulb = lightbulb.asInstanceOf[js.Any], lineDecorationsWidth = lineDecorationsWidth.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], lineNumbers = lineNumbers.asInstanceOf[js.Any], lineNumbersMinChars = lineNumbersMinChars.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], matchBrackets = matchBrackets.asInstanceOf[js.Any], minimap = minimap.asInstanceOf[js.Any], mouseStyle = mouseStyle.asInstanceOf[js.Any], mouseWheelScrollSensitivity = mouseWheelScrollSensitivity.asInstanceOf[js.Any], mouseWheelZoom = mouseWheelZoom.asInstanceOf[js.Any], multiCursorMergeOverlapping = multiCursorMergeOverlapping.asInstanceOf[js.Any], multiCursorModifier = multiCursorModifier.asInstanceOf[js.Any], multiCursorPaste = multiCursorPaste.asInstanceOf[js.Any], occurrencesHighlight = occurrencesHighlight.asInstanceOf[js.Any], overviewRulerBorder = overviewRulerBorder.asInstanceOf[js.Any], overviewRulerLanes = overviewRulerLanes.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], parameterHints = parameterHints.asInstanceOf[js.Any], peekWidgetDefaultFocus = peekWidgetDefaultFocus.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], quickSuggestions = quickSuggestions.asInstanceOf[js.Any], quickSuggestionsDelay = quickSuggestionsDelay.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], renameOnType = renameOnType.asInstanceOf[js.Any], renderControlCharacters = renderControlCharacters.asInstanceOf[js.Any], renderFinalNewline = renderFinalNewline.asInstanceOf[js.Any], renderIndentGuides = renderIndentGuides.asInstanceOf[js.Any], renderLineHighlight = renderLineHighlight.asInstanceOf[js.Any], renderLineHighlightOnlyWhenFocus = renderLineHighlightOnlyWhenFocus.asInstanceOf[js.Any], renderValidationDecorations = renderValidationDecorations.asInstanceOf[js.Any], renderWhitespace = renderWhitespace.asInstanceOf[js.Any], revealHorizontalRightPadding = revealHorizontalRightPadding.asInstanceOf[js.Any], roundedSelection = roundedSelection.asInstanceOf[js.Any], rulers = rulers.asInstanceOf[js.Any], scrollBeyondLastColumn = scrollBeyondLastColumn.asInstanceOf[js.Any], scrollBeyondLastLine = scrollBeyondLastLine.asInstanceOf[js.Any], scrollPredominantAxis = scrollPredominantAxis.asInstanceOf[js.Any], scrollbar = scrollbar.asInstanceOf[js.Any], selectOnLineNumbers = selectOnLineNumbers.asInstanceOf[js.Any], selectionClipboard = selectionClipboard.asInstanceOf[js.Any], selectionHighlight = selectionHighlight.asInstanceOf[js.Any], showDeprecated = showDeprecated.asInstanceOf[js.Any], showFoldingControls = showFoldingControls.asInstanceOf[js.Any], showUnused = showUnused.asInstanceOf[js.Any], smoothScrolling = smoothScrolling.asInstanceOf[js.Any], snippetSuggestions = snippetSuggestions.asInstanceOf[js.Any], stopRenderingLineAfter = stopRenderingLineAfter.asInstanceOf[js.Any], suggest = suggest.asInstanceOf[js.Any], suggestFontSize = suggestFontSize.asInstanceOf[js.Any], suggestLineHeight = suggestLineHeight.asInstanceOf[js.Any], suggestOnTriggerCharacters = suggestOnTriggerCharacters.asInstanceOf[js.Any], suggestSelection = suggestSelection.asInstanceOf[js.Any], tabCompletion = tabCompletion.asInstanceOf[js.Any], tabFocusMode = tabFocusMode.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], unfoldOnClickAfterEndOfLine = unfoldOnClickAfterEndOfLine.asInstanceOf[js.Any], unusualLineTerminators = unusualLineTerminators.asInstanceOf[js.Any], useTabStops = useTabStops.asInstanceOf[js.Any], wordSeparators = wordSeparators.asInstanceOf[js.Any], wordWrap = wordWrap.asInstanceOf[js.Any], wordWrapBreakAfterCharacters = wordWrapBreakAfterCharacters.asInstanceOf[js.Any], wordWrapBreakBeforeCharacters = wordWrapBreakBeforeCharacters.asInstanceOf[js.Any], wordWrapColumn = wordWrapColumn.asInstanceOf[js.Any], wordWrapMinified = wordWrapMinified.asInstanceOf[js.Any], wrappingIndent = wrappingIndent.asInstanceOf[js.Any], wrappingInfo = wrappingInfo.asInstanceOf[js.Any], wrappingStrategy = wrappingStrategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofEditorOptions]
    }
    
    @scala.inline
    implicit class TypeofEditorOptionsMutableBuilder[Self <: TypeofEditorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptSuggestionOnCommitCharacter(value: IEditorOption[acceptSuggestionOnCommitCharacter, Boolean]): Self = StObject.set(x, "acceptSuggestionOnCommitCharacter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptSuggestionOnEnter(value: IEditorOption[acceptSuggestionOnEnter, on | off | smart]): Self = StObject.set(x, "acceptSuggestionOnEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityPageSize(value: IEditorOption[accessibilityPageSize, Double]): Self = StObject.set(x, "accessibilityPageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilitySupport(value: IEditorOption[accessibilitySupport, AccessibilitySupport]): Self = StObject.set(x, "accessibilitySupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabel(value: IEditorOption[ariaLabel, String]): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoClosingBrackets(value: IEditorOption[autoClosingBrackets, EditorAutoClosingStrategy]): Self = StObject.set(x, "autoClosingBrackets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoClosingOvertype(value: IEditorOption[autoClosingOvertype, EditorAutoClosingOvertypeStrategy]): Self = StObject.set(x, "autoClosingOvertype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoClosingQuotes(value: IEditorOption[autoClosingQuotes, EditorAutoClosingStrategy]): Self = StObject.set(x, "autoClosingQuotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoIndent(value: IEditorOption[autoIndent, EditorAutoIndentStrategy]): Self = StObject.set(x, "autoIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSurround(value: IEditorOption[autoSurround, EditorAutoSurroundStrategy]): Self = StObject.set(x, "autoSurround", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomaticLayout(value: IEditorOption[automaticLayout, Boolean]): Self = StObject.set(x, "automaticLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeLens(value: IEditorOption[codeLens, Boolean]): Self = StObject.set(x, "codeLens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorDecorators(value: IEditorOption[colorDecorators, Boolean]): Self = StObject.set(x, "colorDecorators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnSelection(value: IEditorOption[columnSelection, Boolean]): Self = StObject.set(x, "columnSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComments(value: IEditorOption[comments, EditorCommentsOptions]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextmenu(value: IEditorOption[contextmenu, Boolean]): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyWithSyntaxHighlighting(value: IEditorOption[copyWithSyntaxHighlighting, Boolean]): Self = StObject.set(x, "copyWithSyntaxHighlighting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorBlinking(value: IEditorOption[cursorBlinking, TextEditorCursorBlinkingStyle]): Self = StObject.set(x, "cursorBlinking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorSmoothCaretAnimation(value: IEditorOption[cursorSmoothCaretAnimation, Boolean]): Self = StObject.set(x, "cursorSmoothCaretAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorStyle(value: IEditorOption[cursorStyle, TextEditorCursorStyle]): Self = StObject.set(x, "cursorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorSurroundingLines(value: IEditorOption[cursorSurroundingLines, Double]): Self = StObject.set(x, "cursorSurroundingLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorSurroundingLinesStyle(value: IEditorOption[cursorSurroundingLinesStyle, default | all]): Self = StObject.set(x, "cursorSurroundingLinesStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorWidth(value: IEditorOption[cursorWidth, Double]): Self = StObject.set(x, "cursorWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionLinkOpensInPeek(value: IEditorOption[definitionLinkOpensInPeek, Boolean]): Self = StObject.set(x, "definitionLinkOpensInPeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableLayerHinting(value: IEditorOption[disableLayerHinting, Boolean]): Self = StObject.set(x, "disableLayerHinting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableMonospaceOptimizations(value: IEditorOption[disableMonospaceOptimizations, Boolean]): Self = StObject.set(x, "disableMonospaceOptimizations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragAndDrop(value: IEditorOption[dragAndDrop, Boolean]): Self = StObject.set(x, "dragAndDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorClassName(value: IEditorOption[editorClassName, String]): Self = StObject.set(x, "editorClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptySelectionClipboard(value: IEditorOption[emptySelectionClipboard, Boolean]): Self = StObject.set(x, "emptySelectionClipboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraEditorClassName(value: IEditorOption[extraEditorClassName, String]): Self = StObject.set(x, "extraEditorClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFastScrollSensitivity(value: IEditorOption[fastScrollSensitivity, Double]): Self = StObject.set(x, "fastScrollSensitivity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFind(value: IEditorOption[find, EditorFindOptions]): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedOverflowWidgets(value: IEditorOption[fixedOverflowWidgets, Boolean]): Self = StObject.set(x, "fixedOverflowWidgets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolding(value: IEditorOption[folding, Boolean]): Self = StObject.set(x, "folding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFoldingHighlight(value: IEditorOption[foldingHighlight, Boolean]): Self = StObject.set(x, "foldingHighlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFoldingStrategy(value: IEditorOption[foldingStrategy, auto | indentation]): Self = StObject.set(x, "foldingStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamily(value: IEditorOption[fontFamily, String]): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontInfo(value: IEditorOption[fontInfo, FontInfo]): Self = StObject.set(x, "fontInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontLigatures2(value: IEditorOption[fontLigatures, String]): Self = StObject.set(x, "fontLigatures2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: IEditorOption[fontSize, Double]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeight(value: IEditorOption[fontWeight, String]): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatOnPaste(value: IEditorOption[formatOnPaste, Boolean]): Self = StObject.set(x, "formatOnPaste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatOnType(value: IEditorOption[formatOnType, Boolean]): Self = StObject.set(x, "formatOnType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphMargin(value: IEditorOption[glyphMargin, Boolean]): Self = StObject.set(x, "glyphMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGotoLocation(value: IEditorOption[gotoLocation, GoToLocationOptions]): Self = StObject.set(x, "gotoLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideCursorInOverviewRuler(value: IEditorOption[hideCursorInOverviewRuler, Boolean]): Self = StObject.set(x, "hideCursorInOverviewRuler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightActiveIndentGuide(value: IEditorOption[highlightActiveIndentGuide, Boolean]): Self = StObject.set(x, "highlightActiveIndentGuide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHover(value: IEditorOption[hover, EditorHoverOptions]): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInDiffEditor(value: IEditorOption[inDiffEditor, Boolean]): Self = StObject.set(x, "inDiffEditor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutInfo(value: IEditorOption[layoutInfo, EditorLayoutInfo]): Self = StObject.set(x, "layoutInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacing(value: IEditorOption[letterSpacing, Double]): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightbulb(value: IEditorOption[lightbulb, EditorLightbulbOptions]): Self = StObject.set(x, "lightbulb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineDecorationsWidth(value: IEditorOption[lineDecorationsWidth, String | Double]): Self = StObject.set(x, "lineDecorationsWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeight(value: IEditorOption[lineHeight, Double]): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumbers(value: IEditorOption[lineNumbers, InternalEditorRenderLineNumbersOptions]): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumbersMinChars(value: IEditorOption[lineNumbersMinChars, Double]): Self = StObject.set(x, "lineNumbersMinChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinks(value: IEditorOption[links, Boolean]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchBrackets(value: IEditorOption[matchBrackets, always | never | near]): Self = StObject.set(x, "matchBrackets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimap(value: IEditorOption[minimap, EditorMinimapOptions]): Self = StObject.set(x, "minimap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseStyle(value: IEditorOption[mouseStyle, default | text | copy]): Self = StObject.set(x, "mouseStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseWheelScrollSensitivity(value: IEditorOption[mouseWheelScrollSensitivity, Double]): Self = StObject.set(x, "mouseWheelScrollSensitivity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseWheelZoom(value: IEditorOption[mouseWheelZoom, Boolean]): Self = StObject.set(x, "mouseWheelZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiCursorMergeOverlapping(value: IEditorOption[multiCursorMergeOverlapping, Boolean]): Self = StObject.set(x, "multiCursorMergeOverlapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiCursorModifier(value: IEditorOption[multiCursorModifier, altKey | metaKey | ctrlKey]): Self = StObject.set(x, "multiCursorModifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiCursorPaste(value: IEditorOption[multiCursorPaste, spread | full]): Self = StObject.set(x, "multiCursorPaste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOccurrencesHighlight(value: IEditorOption[occurrencesHighlight, Boolean]): Self = StObject.set(x, "occurrencesHighlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverviewRulerBorder(value: IEditorOption[overviewRulerBorder, Boolean]): Self = StObject.set(x, "overviewRulerBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverviewRulerLanes(value: IEditorOption[overviewRulerLanes, Double]): Self = StObject.set(x, "overviewRulerLanes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadding(value: IEditorOption[padding, InternalEditorPaddingOptions]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterHints(value: IEditorOption[parameterHints, InternalParameterHintOptions]): Self = StObject.set(x, "parameterHints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeekWidgetDefaultFocus(value: IEditorOption[peekWidgetDefaultFocus, tree | editor]): Self = StObject.set(x, "peekWidgetDefaultFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatio(value: IEditorOption[pixelRatio, Double]): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuickSuggestions(value: IEditorOption[quickSuggestions, ValidQuickSuggestionsOptions]): Self = StObject.set(x, "quickSuggestions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuickSuggestionsDelay(value: IEditorOption[quickSuggestionsDelay, Double]): Self = StObject.set(x, "quickSuggestionsDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnly(value: IEditorOption[readOnly, Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenameOnType(value: IEditorOption[renameOnType, Boolean]): Self = StObject.set(x, "renameOnType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderControlCharacters(value: IEditorOption[renderControlCharacters, Boolean]): Self = StObject.set(x, "renderControlCharacters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderFinalNewline(value: IEditorOption[renderFinalNewline, Boolean]): Self = StObject.set(x, "renderFinalNewline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderIndentGuides(value: IEditorOption[renderIndentGuides, Boolean]): Self = StObject.set(x, "renderIndentGuides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderLineHighlight(value: IEditorOption[renderLineHighlight, all | line | none | gutter]): Self = StObject.set(x, "renderLineHighlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderLineHighlightOnlyWhenFocus(value: IEditorOption[renderLineHighlightOnlyWhenFocus, Boolean]): Self = StObject.set(x, "renderLineHighlightOnlyWhenFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderValidationDecorations(value: IEditorOption[renderValidationDecorations, on | off | editable]): Self = StObject.set(x, "renderValidationDecorations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderWhitespace(value: IEditorOption[renderWhitespace, all | none | boundary | selection | trailing]): Self = StObject.set(x, "renderWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevealHorizontalRightPadding(value: IEditorOption[revealHorizontalRightPadding, Double]): Self = StObject.set(x, "revealHorizontalRightPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundedSelection(value: IEditorOption[roundedSelection, Boolean]): Self = StObject.set(x, "roundedSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulers(value: IEditorOption[rulers, js.Object]): Self = StObject.set(x, "rulers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollBeyondLastColumn(value: IEditorOption[scrollBeyondLastColumn, Double]): Self = StObject.set(x, "scrollBeyondLastColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollBeyondLastLine(value: IEditorOption[scrollBeyondLastLine, Boolean]): Self = StObject.set(x, "scrollBeyondLastLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPredominantAxis(value: IEditorOption[scrollPredominantAxis, Boolean]): Self = StObject.set(x, "scrollPredominantAxis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbar(value: IEditorOption[scrollbar, InternalEditorScrollbarOptions]): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectOnLineNumbers(value: IEditorOption[selectOnLineNumbers, Boolean]): Self = StObject.set(x, "selectOnLineNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionClipboard(value: IEditorOption[selectionClipboard, Boolean]): Self = StObject.set(x, "selectionClipboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionHighlight(value: IEditorOption[selectionHighlight, Boolean]): Self = StObject.set(x, "selectionHighlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDeprecated(value: IEditorOption[showDeprecated, Boolean]): Self = StObject.set(x, "showDeprecated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFoldingControls(value: IEditorOption[showFoldingControls, always | mouseover]): Self = StObject.set(x, "showFoldingControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUnused(value: IEditorOption[showUnused, Boolean]): Self = StObject.set(x, "showUnused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmoothScrolling(value: IEditorOption[smoothScrolling, Boolean]): Self = StObject.set(x, "smoothScrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnippetSuggestions(value: IEditorOption[snippetSuggestions, none | top | bottom | `inline`]): Self = StObject.set(x, "snippetSuggestions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopRenderingLineAfter(value: IEditorOption[stopRenderingLineAfter, Double]): Self = StObject.set(x, "stopRenderingLineAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggest(value: IEditorOption[suggest, InternalSuggestOptions]): Self = StObject.set(x, "suggest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestFontSize(value: IEditorOption[suggestFontSize, Double]): Self = StObject.set(x, "suggestFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestLineHeight(value: IEditorOption[suggestLineHeight, Double]): Self = StObject.set(x, "suggestLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestOnTriggerCharacters(value: IEditorOption[suggestOnTriggerCharacters, Boolean]): Self = StObject.set(x, "suggestOnTriggerCharacters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestSelection(value: IEditorOption[suggestSelection, first | recentlyUsed | recentlyUsedByPrefix]): Self = StObject.set(x, "suggestSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabCompletion(value: IEditorOption[tabCompletion, on | off | onlySnippets]): Self = StObject.set(x, "tabCompletion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabFocusMode(value: IEditorOption[tabFocusMode, Boolean]): Self = StObject.set(x, "tabFocusMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndex(value: IEditorOption[tabIndex, Double]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnfoldOnClickAfterEndOfLine(value: IEditorOption[unfoldOnClickAfterEndOfLine, Boolean]): Self = StObject.set(x, "unfoldOnClickAfterEndOfLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnusualLineTerminators(value: IEditorOption[unusualLineTerminators, off | prompt | auto]): Self = StObject.set(x, "unusualLineTerminators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTabStops(value: IEditorOption[useTabStops, Boolean]): Self = StObject.set(x, "useTabStops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordSeparators(value: IEditorOption[wordSeparators, String]): Self = StObject.set(x, "wordSeparators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordWrap(value: IEditorOption[wordWrap, on | off | wordWrapColumn | bounded]): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordWrapBreakAfterCharacters(value: IEditorOption[wordWrapBreakAfterCharacters, String]): Self = StObject.set(x, "wordWrapBreakAfterCharacters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordWrapBreakBeforeCharacters(value: IEditorOption[wordWrapBreakBeforeCharacters, String]): Self = StObject.set(x, "wordWrapBreakBeforeCharacters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordWrapColumn(value: IEditorOption[typingsSlinky.monacoEditor.mod.editor.EditorOption.wordWrapColumn, Double]): Self = StObject.set(x, "wordWrapColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordWrapMinified(value: IEditorOption[wordWrapMinified, Boolean]): Self = StObject.set(x, "wordWrapMinified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrappingIndent(value: IEditorOption[wrappingIndent, WrappingIndent]): Self = StObject.set(x, "wrappingIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrappingInfo(value: IEditorOption[wrappingInfo, EditorWrappingInfo]): Self = StObject.set(x, "wrappingInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrappingStrategy(value: IEditorOption[wrappingStrategy, simple | advanced]): Self = StObject.set(x, "wrappingStrategy", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofEditorType extends StObject {
    
    var ICodeEditor: String = js.native
    
    var IDiffEditor: String = js.native
  }
  object TypeofEditorType {
    
    @scala.inline
    def apply(ICodeEditor: String, IDiffEditor: String): TypeofEditorType = {
      val __obj = js.Dynamic.literal(ICodeEditor = ICodeEditor.asInstanceOf[js.Any], IDiffEditor = IDiffEditor.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofEditorType]
    }
    
    @scala.inline
    implicit class TypeofEditorTypeMutableBuilder[Self <: TypeofEditorType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setICodeEditor(value: String): Self = StObject.set(x, "ICodeEditor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIDiffEditor(value: String): Self = StObject.set(x, "IDiffEditor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofFoldingRangeKind extends Instantiable1[/* value */ String, FoldingRangeKind] {
    
    /**
      * Kind for folding range representing a comment. The value of the kind is 'comment'.
      */
    val Comment: FoldingRangeKind = js.native
    
    /**
      * Kind for folding range representing a import. The value of the kind is 'imports'.
      */
    val Imports: FoldingRangeKind = js.native
    
    /**
      * Kind for folding range representing regions (for example marked by `#region`, `#endregion`).
      * The value of the kind is 'region'.
      */
    val Region: FoldingRangeKind = js.native
  }
  
  @js.native
  trait TypeofKeyMod extends Instantiable0[KeyMod] {
    
    val Alt: Double = js.native
    
    val CtrlCmd: Double = js.native
    
    val Shift: Double = js.native
    
    val WinCtrl: Double = js.native
    
    def chord(firstPart: Double, secondPart: Double): Double = js.native
  }
  
  @js.native
  trait TypeofPosition extends Instantiable2[/* lineNumber */ Double, /* column */ Double, Position] {
    
    /**
      * A function that compares positions, useful for sorting
      */
    def compare(a: IPosition, b: IPosition): Double = js.native
    
    /**
      * Test if position `a` equals position `b`
      */
    def equals(): Boolean = js.native
    def equals(a: Null, b: IPosition): Boolean = js.native
    def equals(a: IPosition): Boolean = js.native
    def equals(a: IPosition, b: IPosition): Boolean = js.native
    
    /**
      * Test if position `a` is before position `b`.
      * If the two positions are equal, the result will be false.
      */
    def isBefore(a: IPosition, b: IPosition): Boolean = js.native
    
    /**
      * Test if position `a` is before position `b`.
      * If the two positions are equal, the result will be true.
      */
    def isBeforeOrEqual(a: IPosition, b: IPosition): Boolean = js.native
    
    /**
      * Test if `obj` is an `IPosition`.
      */
    def isIPosition(obj: js.Any): /* is monaco-editor.monaco-editor.IPosition */ Boolean = js.native
    
    /**
      * Create a `Position` from an `IPosition`.
      */
    def lift(pos: IPosition): Position = js.native
  }
  
  @js.native
  trait TypeofRange extends Instantiable4[
          /* startLineNumber */ Double, 
          /* startColumn */ Double, 
          /* endLineNumber */ Double, 
          /* endColumn */ Double, 
          Range
        ] {
    
    /**
      * Test if the two ranges are intersecting. If the ranges are touching it returns true.
      */
    def areIntersecting(a: IRange, b: IRange): Boolean = js.native
    
    /**
      * Test if the two ranges are touching in any way.
      */
    def areIntersectingOrTouching(a: IRange, b: IRange): Boolean = js.native
    
    /**
      * Create a new empty range using this range's start position.
      */
    def collapseToStart(range: IRange): Range = js.native
    
    /**
      * A function that compares ranges, useful for sorting ranges
      * It will first compare ranges on the endPosition and then on the startPosition
      */
    def compareRangesUsingEnds(a: IRange, b: IRange): Double = js.native
    
    /**
      * A function that compares ranges, useful for sorting ranges
      * It will first compare ranges on the startPosition and then on the endPosition
      */
    def compareRangesUsingStarts(): Double = js.native
    def compareRangesUsingStarts(a: js.UndefOr[scala.Nothing], b: IRange): Double = js.native
    def compareRangesUsingStarts(a: Null, b: IRange): Double = js.native
    def compareRangesUsingStarts(a: IRange): Double = js.native
    def compareRangesUsingStarts(a: IRange, b: IRange): Double = js.native
    
    /**
      * Test if `position` is in `range`. If the position is at the edges, will return true.
      */
    def containsPosition(range: IRange, position: IPosition): Boolean = js.native
    
    /**
      * Test if `otherRange` is in `range`. If the ranges are equal, will return true.
      */
    def containsRange(range: IRange, otherRange: IRange): Boolean = js.native
    
    /**
      * Test if range `a` equals `b`.
      */
    def equalsRange(): Boolean = js.native
    def equalsRange(a: Null, b: IRange): Boolean = js.native
    def equalsRange(a: IRange): Boolean = js.native
    def equalsRange(a: IRange, b: IRange): Boolean = js.native
    
    def fromPositions(start: IPosition): Range = js.native
    def fromPositions(start: IPosition, end: IPosition): Range = js.native
    
    /**
      * Return the end position (which will be after or equal to the start position)
      */
    def getEndPosition(range: IRange): Position = js.native
    
    /**
      * Return the start position (which will be before or equal to the end position)
      */
    def getStartPosition(range: IRange): Position = js.native
    
    /**
      * A intersection of the two ranges.
      */
    def intersectRanges(a: IRange, b: IRange): Range | Null = js.native
    
    /**
      * Test if `range` is empty.
      */
    def isEmpty(range: IRange): Boolean = js.native
    
    /**
      * Test if `obj` is an `IRange`.
      */
    def isIRange(obj: js.Any): /* is monaco-editor.monaco-editor.IRange */ Boolean = js.native
    
    /**
      * Create a `Range` from an `IRange`.
      */
    def lift(): Null = js.native
    def lift(range: IRange): Range = js.native
    
    /**
      * A reunion of the two ranges.
      * The smallest position will be used as the start point, and the largest one as the end point.
      */
    def plusRange(a: IRange, b: IRange): Range = js.native
    
    /**
      * Test if the range spans multiple lines.
      */
    def spansMultipleLines(range: IRange): Boolean = js.native
    
    /**
      * Test if `otherRange` is strinctly in `range` (must start after, and end before). If the ranges are equal, will return false.
      */
    def strictContainsRange(range: IRange, otherRange: IRange): Boolean = js.native
  }
  
  @js.native
  trait TypeofSelection extends Instantiable4[
          /* selectionStartLineNumber */ Double, 
          /* selectionStartColumn */ Double, 
          /* positionLineNumber */ Double, 
          /* positionColumn */ Double, 
          Selection
        ] {
    
    /**
      * Create with a direction.
      */
    def createWithDirection(
      startLineNumber: Double,
      startColumn: Double,
      endLineNumber: Double,
      endColumn: Double,
      direction: SelectionDirection
    ): Selection = js.native
    
    /**
      * Create a `Selection` from one or two positions
      */
    def fromPositions(start: IPosition): Selection = js.native
    def fromPositions(start: IPosition, end: IPosition): Selection = js.native
    
    /**
      * Test if `obj` is an `ISelection`.
      */
    def isISelection(obj: js.Any): /* is monaco-editor.monaco-editor.ISelection */ Boolean = js.native
    
    /**
      * Create a `Selection` from an `ISelection`.
      */
    def liftSelection(sel: ISelection): Selection = js.native
    
    /**
      * `a` equals `b`.
      */
    def selectionsArrEqual(a: js.Array[ISelection], b: js.Array[ISelection]): Boolean = js.native
    
    /**
      * Test if the two selections are equal.
      */
    def selectionsEqual(a: ISelection, b: ISelection): Boolean = js.native
  }
  
  @js.native
  trait TypeofUri extends Instantiable0[Uri] {
    
    /**
      * Creates a new Uri from a file system path, e.g. `c:\my\files`,
      * `/usr/home`, or `\\server\share\some\path`.
      *
      * The *difference* between `Uri#parse` and `Uri#file` is that the latter treats the argument
      * as path, not as stringified-uri. E.g. `Uri.file(path)` is **not the same as**
      * `Uri.parse('file://' + path)` because the path might contain characters that are
      * interpreted (# and ?). See the following sample:
      * ```ts
      const good = Uri.file('/coding/c#/project1');
      good.scheme === 'file';
      good.path === '/coding/c#/project1';
      good.fragment === '';
      const bad = Uri.parse('file://' + '/coding/c#/project1');
      bad.scheme === 'file';
      bad.path === '/coding/c'; // path is now broken
      bad.fragment === '/project1';
      ```
      *
      * @param path A file system path (see `Uri#fsPath`)
      */
    def file(path: String): Uri = js.native
    
    def from(components: Fragment): Uri = js.native
    
    def isUri(thing: js.Any): /* is monaco-editor.monaco-editor.Uri */ Boolean = js.native
    
    /**
      * Join a Uri path with path fragments and normalizes the resulting path.
      *
      * @param uri The input Uri.
      * @param pathFragment The path fragment to add to the Uri path.
      * @returns The resulting Uri.
      */
    def joinPath(uri: Uri, pathFragment: String*): Uri = js.native
    
    /**
      * Creates a new Uri from a string, e.g. `http://www.msft.com/some/path`,
      * `file:///usr/home`, or `scheme:with/path`.
      *
      * @param value A string which represents an Uri (see `Uri#toString`).
      */
    def parse(value: String): Uri = js.native
    def parse(value: String, _strict: Boolean): Uri = js.native
    
    def revive(): js.UndefOr[Uri] = js.native
    def revive(data: Uri): js.UndefOr[Uri] = js.native
    def revive(data: UriComponents): js.UndefOr[Uri] = js.native
    @JSName("revive")
    def revive_Uri(data: Uri): Uri = js.native
    @JSName("revive")
    def revive_Uri(data: UriComponents): Uri = js.native
  }
  
  @js.native
  trait Typeofcss extends StObject {
    
    val cssDefaults: LanguageServiceDefaults = js.native
    
    val lessDefaults: LanguageServiceDefaults = js.native
    
    val scssDefaults: LanguageServiceDefaults = js.native
  }
  object Typeofcss {
    
    @scala.inline
    def apply(
      cssDefaults: LanguageServiceDefaults,
      lessDefaults: LanguageServiceDefaults,
      scssDefaults: LanguageServiceDefaults
    ): Typeofcss = {
      val __obj = js.Dynamic.literal(cssDefaults = cssDefaults.asInstanceOf[js.Any], lessDefaults = lessDefaults.asInstanceOf[js.Any], scssDefaults = scssDefaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofcss]
    }
    
    @scala.inline
    implicit class TypeofcssMutableBuilder[Self <: Typeofcss] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssDefaults(value: LanguageServiceDefaults): Self = StObject.set(x, "cssDefaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLessDefaults(value: LanguageServiceDefaults): Self = StObject.set(x, "lessDefaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScssDefaults(value: LanguageServiceDefaults): Self = StObject.set(x, "scssDefaults", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeofeditor extends StObject {
    
    var BareFontInfo: Instantiable0[typingsSlinky.monacoEditor.mod.editor.BareFontInfo] = js.native
    
    var ConfigurationChangedEvent: Instantiable0[typingsSlinky.monacoEditor.mod.editor.ConfigurationChangedEvent] = js.native
    
    val EditorOptions: TypeofEditorOptions = js.native
    
    val EditorType: TypeofEditorType = js.native
    
    var FindMatch: Instantiable0[typingsSlinky.monacoEditor.mod.editor.FindMatch] = js.native
    
    var FontInfo: Instantiable0[typingsSlinky.monacoEditor.mod.editor.FontInfo] = js.native
    
    var TextModelResolvedOptions: Instantiable0[typingsSlinky.monacoEditor.mod.editor.TextModelResolvedOptions] = js.native
    
    def colorize(text: String, languageId: String, options: IColorizerOptions): js.Promise[String] = js.native
    
    def colorizeElement(domNode: HTMLElement, options: IColorizerElementOptions): js.Promise[Unit] = js.native
    
    def colorizeModelLine(model: ITextModel, lineNumber: Double): String = js.native
    def colorizeModelLine(model: ITextModel, lineNumber: Double, tabSize: Double): String = js.native
    
    def create(domElement: HTMLElement): IStandaloneCodeEditor = js.native
    def create(domElement: HTMLElement, options: js.UndefOr[scala.Nothing], `override`: IEditorOverrideServices): IStandaloneCodeEditor = js.native
    def create(domElement: HTMLElement, options: IStandaloneEditorConstructionOptions): IStandaloneCodeEditor = js.native
    def create(
      domElement: HTMLElement,
      options: IStandaloneEditorConstructionOptions,
      `override`: IEditorOverrideServices
    ): IStandaloneCodeEditor = js.native
    
    def createDiffEditor(domElement: HTMLElement): IStandaloneDiffEditor = js.native
    def createDiffEditor(domElement: HTMLElement, options: js.UndefOr[scala.Nothing], `override`: IEditorOverrideServices): IStandaloneDiffEditor = js.native
    def createDiffEditor(domElement: HTMLElement, options: IDiffEditorConstructionOptions): IStandaloneDiffEditor = js.native
    def createDiffEditor(
      domElement: HTMLElement,
      options: IDiffEditorConstructionOptions,
      `override`: IEditorOverrideServices
    ): IStandaloneDiffEditor = js.native
    
    def createDiffNavigator(diffEditor: IStandaloneDiffEditor): IDiffNavigator = js.native
    def createDiffNavigator(diffEditor: IStandaloneDiffEditor, opts: IDiffNavigatorOptions): IDiffNavigator = js.native
    
    def createModel(value: String): ITextModel = js.native
    def createModel(value: String, language: js.UndefOr[scala.Nothing], uri: Uri): ITextModel = js.native
    def createModel(value: String, language: String): ITextModel = js.native
    def createModel(value: String, language: String, uri: Uri): ITextModel = js.native
    
    def createWebWorker[T](opts: IWebWorkerOptions): MonacoWebWorker[T] = js.native
    
    def defineTheme(themeName: String, themeData: IStandaloneThemeData): Unit = js.native
    
    def getModel(uri: Uri): ITextModel | Null = js.native
    
    def getModelMarkers(filter: Owner): js.Array[IMarker] = js.native
    
    def getModels(): js.Array[ITextModel] = js.native
    
    def onDidChangeModelLanguage(listener: js.Function1[/* e */ Model, Unit]): IDisposable = js.native
    
    def onDidCreateEditor(listener: js.Function1[/* codeEditor */ ICodeEditor, Unit]): IDisposable = js.native
    
    def onDidCreateModel(listener: js.Function1[/* model */ ITextModel, Unit]): IDisposable = js.native
    
    def onWillDisposeModel(listener: js.Function1[/* model */ ITextModel, Unit]): IDisposable = js.native
    
    def remeasureFonts(): Unit = js.native
    
    def setModelLanguage(model: ITextModel, languageId: String): Unit = js.native
    
    def setModelMarkers(model: ITextModel, owner: String, markers: js.Array[IMarkerData]): Unit = js.native
    
    def setTheme(themeName: String): Unit = js.native
    
    def tokenize(text: String, languageId: String): js.Array[js.Array[Token]] = js.native
  }
  
  @js.native
  trait Typeofhtml extends StObject {
    
    val handlebarDefaults: typingsSlinky.monacoEditor.mod.languages.html.LanguageServiceDefaults = js.native
    
    val htmlDefaults: typingsSlinky.monacoEditor.mod.languages.html.LanguageServiceDefaults = js.native
    
    val razorDefaults: typingsSlinky.monacoEditor.mod.languages.html.LanguageServiceDefaults = js.native
  }
  object Typeofhtml {
    
    @scala.inline
    def apply(
      handlebarDefaults: typingsSlinky.monacoEditor.mod.languages.html.LanguageServiceDefaults,
      htmlDefaults: typingsSlinky.monacoEditor.mod.languages.html.LanguageServiceDefaults,
      razorDefaults: typingsSlinky.monacoEditor.mod.languages.html.LanguageServiceDefaults
    ): Typeofhtml = {
      val __obj = js.Dynamic.literal(handlebarDefaults = handlebarDefaults.asInstanceOf[js.Any], htmlDefaults = htmlDefaults.asInstanceOf[js.Any], razorDefaults = razorDefaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofhtml]
    }
    
    @scala.inline
    implicit class TypeofhtmlMutableBuilder[Self <: Typeofhtml] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandlebarDefaults(value: typingsSlinky.monacoEditor.mod.languages.html.LanguageServiceDefaults): Self = StObject.set(x, "handlebarDefaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlDefaults(value: typingsSlinky.monacoEditor.mod.languages.html.LanguageServiceDefaults): Self = StObject.set(x, "htmlDefaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRazorDefaults(value: typingsSlinky.monacoEditor.mod.languages.html.LanguageServiceDefaults): Self = StObject.set(x, "razorDefaults", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeofjson extends StObject {
    
    val jsonDefaults: typingsSlinky.monacoEditor.mod.languages.json.LanguageServiceDefaults = js.native
  }
  object Typeofjson {
    
    @scala.inline
    def apply(jsonDefaults: typingsSlinky.monacoEditor.mod.languages.json.LanguageServiceDefaults): Typeofjson = {
      val __obj = js.Dynamic.literal(jsonDefaults = jsonDefaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofjson]
    }
    
    @scala.inline
    implicit class TypeofjsonMutableBuilder[Self <: Typeofjson] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJsonDefaults(value: typingsSlinky.monacoEditor.mod.languages.json.LanguageServiceDefaults): Self = StObject.set(x, "jsonDefaults", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeoflanguages extends StObject {
    
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
  
  @js.native
  trait TypeofmonacoEditor extends StObject {
    
    var CancellationTokenSource: Instantiable0[typingsSlinky.monacoEditor.mod.CancellationTokenSource] = js.native
    
    var Emitter: Instantiable0[typingsSlinky.monacoEditor.mod.Emitter[js.Object]] = js.native
    
    var KeyMod: TypeofKeyMod = js.native
    
    var Position: TypeofPosition = js.native
    
    var Range: TypeofRange = js.native
    
    var Selection: TypeofSelection = js.native
    
    var Token: Instantiable3[
        /* offset */ Double, 
        /* type */ String, 
        /* language */ String, 
        typingsSlinky.monacoEditor.mod.Token
      ] = js.native
    
    var Uri: TypeofUri = js.native
    
    val editor: Typeofeditor = js.native
    
    val languages: Typeoflanguages = js.native
    
    val worker: js.Any = js.native
  }
  object TypeofmonacoEditor {
    
    @scala.inline
    def apply(
      CancellationTokenSource: Instantiable0[CancellationTokenSource],
      Emitter: Instantiable0[Emitter[js.Object]],
      KeyMod: TypeofKeyMod,
      Position: TypeofPosition,
      Range: TypeofRange,
      Selection: TypeofSelection,
      Token: Instantiable3[/* offset */ Double, /* type */ String, /* language */ String, Token],
      Uri: TypeofUri,
      editor: Typeofeditor,
      languages: Typeoflanguages,
      worker: js.Any
    ): TypeofmonacoEditor = {
      val __obj = js.Dynamic.literal(CancellationTokenSource = CancellationTokenSource.asInstanceOf[js.Any], Emitter = Emitter.asInstanceOf[js.Any], KeyMod = KeyMod.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], Token = Token.asInstanceOf[js.Any], Uri = Uri.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofmonacoEditor]
    }
    
    @scala.inline
    implicit class TypeofmonacoEditorMutableBuilder[Self <: TypeofmonacoEditor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancellationTokenSource(value: Instantiable0[CancellationTokenSource]): Self = StObject.set(x, "CancellationTokenSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditor(value: Typeofeditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitter(value: Instantiable0[Emitter[js.Object]]): Self = StObject.set(x, "Emitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyMod(value: TypeofKeyMod): Self = StObject.set(x, "KeyMod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguages(value: Typeoflanguages): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: TypeofPosition): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRange(value: TypeofRange): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelection(value: TypeofSelection): Self = StObject.set(x, "Selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: Instantiable3[/* offset */ Double, /* type */ String, /* language */ String, Token]): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: TypeofUri): Self = StObject.set(x, "Uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorker(value: js.Any): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeoftypescript extends StObject {
    
    def getJavaScriptWorker(): js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]] = js.native
    
    def getTypeScriptWorker(): js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]] = js.native
    
    val javascriptDefaults: typingsSlinky.monacoEditor.mod.languages.typescript.LanguageServiceDefaults = js.native
    
    val typescriptDefaults: typingsSlinky.monacoEditor.mod.languages.typescript.LanguageServiceDefaults = js.native
    
    val typescriptVersion: String = js.native
  }
  object Typeoftypescript {
    
    @scala.inline
    def apply(
      getJavaScriptWorker: () => js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]],
      getTypeScriptWorker: () => js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]],
      javascriptDefaults: typingsSlinky.monacoEditor.mod.languages.typescript.LanguageServiceDefaults,
      typescriptDefaults: typingsSlinky.monacoEditor.mod.languages.typescript.LanguageServiceDefaults,
      typescriptVersion: String
    ): Typeoftypescript = {
      val __obj = js.Dynamic.literal(getJavaScriptWorker = js.Any.fromFunction0(getJavaScriptWorker), getTypeScriptWorker = js.Any.fromFunction0(getTypeScriptWorker), javascriptDefaults = javascriptDefaults.asInstanceOf[js.Any], typescriptDefaults = typescriptDefaults.asInstanceOf[js.Any], typescriptVersion = typescriptVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeoftypescript]
    }
    
    @scala.inline
    implicit class TypeoftypescriptMutableBuilder[Self <: Typeoftypescript] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetJavaScriptWorker(value: () => js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]]): Self = StObject.set(x, "getJavaScriptWorker", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTypeScriptWorker(value: () => js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]]): Self = StObject.set(x, "getTypeScriptWorker", js.Any.fromFunction0(value))
      
      @scala.inline
      def setJavascriptDefaults(value: typingsSlinky.monacoEditor.mod.languages.typescript.LanguageServiceDefaults): Self = StObject.set(x, "javascriptDefaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypescriptDefaults(value: typingsSlinky.monacoEditor.mod.languages.typescript.LanguageServiceDefaults): Self = StObject.set(x, "typescriptDefaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypescriptVersion(value: String): Self = StObject.set(x, "typescriptVersion", value.asInstanceOf[js.Any])
    }
  }
}
