package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.editor.EditorOption.fontLigatures
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "editor.EditorOptions")
@js.native
object EditorOptions extends js.Object {
  
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
