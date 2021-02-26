package typingsSlinky.monacoEditor.mod.editor

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
import typingsSlinky.monacoEditor.monacoEditorStrings.`inline`
import typingsSlinky.monacoEditor.monacoEditorStrings.advanced
import typingsSlinky.monacoEditor.monacoEditorStrings.all
import typingsSlinky.monacoEditor.monacoEditorStrings.altKey
import typingsSlinky.monacoEditor.monacoEditorStrings.always
import typingsSlinky.monacoEditor.monacoEditorStrings.auto
import typingsSlinky.monacoEditor.monacoEditorStrings.bottom
import typingsSlinky.monacoEditor.monacoEditorStrings.boundary
import typingsSlinky.monacoEditor.monacoEditorStrings.bounded
import typingsSlinky.monacoEditor.monacoEditorStrings.copy
import typingsSlinky.monacoEditor.monacoEditorStrings.ctrlKey
import typingsSlinky.monacoEditor.monacoEditorStrings.default
import typingsSlinky.monacoEditor.monacoEditorStrings.editable
import typingsSlinky.monacoEditor.monacoEditorStrings.first
import typingsSlinky.monacoEditor.monacoEditorStrings.full
import typingsSlinky.monacoEditor.monacoEditorStrings.gutter
import typingsSlinky.monacoEditor.monacoEditorStrings.indentation
import typingsSlinky.monacoEditor.monacoEditorStrings.line
import typingsSlinky.monacoEditor.monacoEditorStrings.metaKey
import typingsSlinky.monacoEditor.monacoEditorStrings.mouseover
import typingsSlinky.monacoEditor.monacoEditorStrings.near
import typingsSlinky.monacoEditor.monacoEditorStrings.never
import typingsSlinky.monacoEditor.monacoEditorStrings.none
import typingsSlinky.monacoEditor.monacoEditorStrings.off
import typingsSlinky.monacoEditor.monacoEditorStrings.on
import typingsSlinky.monacoEditor.monacoEditorStrings.onlySnippets
import typingsSlinky.monacoEditor.monacoEditorStrings.prompt
import typingsSlinky.monacoEditor.monacoEditorStrings.recentlyUsed
import typingsSlinky.monacoEditor.monacoEditorStrings.recentlyUsedByPrefix
import typingsSlinky.monacoEditor.monacoEditorStrings.selection
import typingsSlinky.monacoEditor.monacoEditorStrings.simple
import typingsSlinky.monacoEditor.monacoEditorStrings.smart
import typingsSlinky.monacoEditor.monacoEditorStrings.spread
import typingsSlinky.monacoEditor.monacoEditorStrings.text
import typingsSlinky.monacoEditor.monacoEditorStrings.top
import typingsSlinky.monacoEditor.monacoEditorStrings.trailing
import typingsSlinky.monacoEditor.monacoEditorStrings.tree
import typingsSlinky.monacoEditor.monacoEditorStrings.wordWrapColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorOptionsType extends StObject {
  
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
    tree | typingsSlinky.monacoEditor.monacoEditorStrings.editor
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
object EditorOptionsType {
  
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
    peekWidgetDefaultFocus: IEditorOption[
      peekWidgetDefaultFocus, 
      tree | typingsSlinky.monacoEditor.monacoEditorStrings.editor
    ],
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
  ): EditorOptionsType = {
    val __obj = js.Dynamic.literal(acceptSuggestionOnCommitCharacter = acceptSuggestionOnCommitCharacter.asInstanceOf[js.Any], acceptSuggestionOnEnter = acceptSuggestionOnEnter.asInstanceOf[js.Any], accessibilityPageSize = accessibilityPageSize.asInstanceOf[js.Any], accessibilitySupport = accessibilitySupport.asInstanceOf[js.Any], ariaLabel = ariaLabel.asInstanceOf[js.Any], autoClosingBrackets = autoClosingBrackets.asInstanceOf[js.Any], autoClosingOvertype = autoClosingOvertype.asInstanceOf[js.Any], autoClosingQuotes = autoClosingQuotes.asInstanceOf[js.Any], autoIndent = autoIndent.asInstanceOf[js.Any], autoSurround = autoSurround.asInstanceOf[js.Any], automaticLayout = automaticLayout.asInstanceOf[js.Any], codeLens = codeLens.asInstanceOf[js.Any], colorDecorators = colorDecorators.asInstanceOf[js.Any], columnSelection = columnSelection.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copyWithSyntaxHighlighting = copyWithSyntaxHighlighting.asInstanceOf[js.Any], cursorBlinking = cursorBlinking.asInstanceOf[js.Any], cursorSmoothCaretAnimation = cursorSmoothCaretAnimation.asInstanceOf[js.Any], cursorStyle = cursorStyle.asInstanceOf[js.Any], cursorSurroundingLines = cursorSurroundingLines.asInstanceOf[js.Any], cursorSurroundingLinesStyle = cursorSurroundingLinesStyle.asInstanceOf[js.Any], cursorWidth = cursorWidth.asInstanceOf[js.Any], definitionLinkOpensInPeek = definitionLinkOpensInPeek.asInstanceOf[js.Any], disableLayerHinting = disableLayerHinting.asInstanceOf[js.Any], disableMonospaceOptimizations = disableMonospaceOptimizations.asInstanceOf[js.Any], dragAndDrop = dragAndDrop.asInstanceOf[js.Any], editorClassName = editorClassName.asInstanceOf[js.Any], emptySelectionClipboard = emptySelectionClipboard.asInstanceOf[js.Any], extraEditorClassName = extraEditorClassName.asInstanceOf[js.Any], fastScrollSensitivity = fastScrollSensitivity.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], fixedOverflowWidgets = fixedOverflowWidgets.asInstanceOf[js.Any], folding = folding.asInstanceOf[js.Any], foldingHighlight = foldingHighlight.asInstanceOf[js.Any], foldingStrategy = foldingStrategy.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontInfo = fontInfo.asInstanceOf[js.Any], fontLigatures2 = fontLigatures2.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], formatOnPaste = formatOnPaste.asInstanceOf[js.Any], formatOnType = formatOnType.asInstanceOf[js.Any], glyphMargin = glyphMargin.asInstanceOf[js.Any], gotoLocation = gotoLocation.asInstanceOf[js.Any], hideCursorInOverviewRuler = hideCursorInOverviewRuler.asInstanceOf[js.Any], highlightActiveIndentGuide = highlightActiveIndentGuide.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], inDiffEditor = inDiffEditor.asInstanceOf[js.Any], layoutInfo = layoutInfo.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lightbulb = lightbulb.asInstanceOf[js.Any], lineDecorationsWidth = lineDecorationsWidth.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], lineNumbers = lineNumbers.asInstanceOf[js.Any], lineNumbersMinChars = lineNumbersMinChars.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], matchBrackets = matchBrackets.asInstanceOf[js.Any], minimap = minimap.asInstanceOf[js.Any], mouseStyle = mouseStyle.asInstanceOf[js.Any], mouseWheelScrollSensitivity = mouseWheelScrollSensitivity.asInstanceOf[js.Any], mouseWheelZoom = mouseWheelZoom.asInstanceOf[js.Any], multiCursorMergeOverlapping = multiCursorMergeOverlapping.asInstanceOf[js.Any], multiCursorModifier = multiCursorModifier.asInstanceOf[js.Any], multiCursorPaste = multiCursorPaste.asInstanceOf[js.Any], occurrencesHighlight = occurrencesHighlight.asInstanceOf[js.Any], overviewRulerBorder = overviewRulerBorder.asInstanceOf[js.Any], overviewRulerLanes = overviewRulerLanes.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], parameterHints = parameterHints.asInstanceOf[js.Any], peekWidgetDefaultFocus = peekWidgetDefaultFocus.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], quickSuggestions = quickSuggestions.asInstanceOf[js.Any], quickSuggestionsDelay = quickSuggestionsDelay.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], renameOnType = renameOnType.asInstanceOf[js.Any], renderControlCharacters = renderControlCharacters.asInstanceOf[js.Any], renderFinalNewline = renderFinalNewline.asInstanceOf[js.Any], renderIndentGuides = renderIndentGuides.asInstanceOf[js.Any], renderLineHighlight = renderLineHighlight.asInstanceOf[js.Any], renderLineHighlightOnlyWhenFocus = renderLineHighlightOnlyWhenFocus.asInstanceOf[js.Any], renderValidationDecorations = renderValidationDecorations.asInstanceOf[js.Any], renderWhitespace = renderWhitespace.asInstanceOf[js.Any], revealHorizontalRightPadding = revealHorizontalRightPadding.asInstanceOf[js.Any], roundedSelection = roundedSelection.asInstanceOf[js.Any], rulers = rulers.asInstanceOf[js.Any], scrollBeyondLastColumn = scrollBeyondLastColumn.asInstanceOf[js.Any], scrollBeyondLastLine = scrollBeyondLastLine.asInstanceOf[js.Any], scrollPredominantAxis = scrollPredominantAxis.asInstanceOf[js.Any], scrollbar = scrollbar.asInstanceOf[js.Any], selectOnLineNumbers = selectOnLineNumbers.asInstanceOf[js.Any], selectionClipboard = selectionClipboard.asInstanceOf[js.Any], selectionHighlight = selectionHighlight.asInstanceOf[js.Any], showDeprecated = showDeprecated.asInstanceOf[js.Any], showFoldingControls = showFoldingControls.asInstanceOf[js.Any], showUnused = showUnused.asInstanceOf[js.Any], smoothScrolling = smoothScrolling.asInstanceOf[js.Any], snippetSuggestions = snippetSuggestions.asInstanceOf[js.Any], stopRenderingLineAfter = stopRenderingLineAfter.asInstanceOf[js.Any], suggest = suggest.asInstanceOf[js.Any], suggestFontSize = suggestFontSize.asInstanceOf[js.Any], suggestLineHeight = suggestLineHeight.asInstanceOf[js.Any], suggestOnTriggerCharacters = suggestOnTriggerCharacters.asInstanceOf[js.Any], suggestSelection = suggestSelection.asInstanceOf[js.Any], tabCompletion = tabCompletion.asInstanceOf[js.Any], tabFocusMode = tabFocusMode.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], unfoldOnClickAfterEndOfLine = unfoldOnClickAfterEndOfLine.asInstanceOf[js.Any], unusualLineTerminators = unusualLineTerminators.asInstanceOf[js.Any], useTabStops = useTabStops.asInstanceOf[js.Any], wordSeparators = wordSeparators.asInstanceOf[js.Any], wordWrap = wordWrap.asInstanceOf[js.Any], wordWrapBreakAfterCharacters = wordWrapBreakAfterCharacters.asInstanceOf[js.Any], wordWrapBreakBeforeCharacters = wordWrapBreakBeforeCharacters.asInstanceOf[js.Any], wordWrapColumn = wordWrapColumn.asInstanceOf[js.Any], wordWrapMinified = wordWrapMinified.asInstanceOf[js.Any], wrappingIndent = wrappingIndent.asInstanceOf[js.Any], wrappingInfo = wrappingInfo.asInstanceOf[js.Any], wrappingStrategy = wrappingStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorOptionsType]
  }
  
  @scala.inline
  implicit class EditorOptionsTypeMutableBuilder[Self <: EditorOptionsType] (val x: Self) extends AnyVal {
    
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
    def setPeekWidgetDefaultFocus(
      value: IEditorOption[
          peekWidgetDefaultFocus, 
          tree | typingsSlinky.monacoEditor.monacoEditorStrings.editor
        ]
    ): Self = StObject.set(x, "peekWidgetDefaultFocus", value.asInstanceOf[js.Any])
    
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
