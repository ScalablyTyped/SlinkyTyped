package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.AnonComments
import typingsSlinky.monacoEditor.monacoEditorStrings.`100`
import typingsSlinky.monacoEditor.monacoEditorStrings.`200`
import typingsSlinky.monacoEditor.monacoEditorStrings.`300`
import typingsSlinky.monacoEditor.monacoEditorStrings.`400`
import typingsSlinky.monacoEditor.monacoEditorStrings.`500`
import typingsSlinky.monacoEditor.monacoEditorStrings.`600`
import typingsSlinky.monacoEditor.monacoEditorStrings.`700`
import typingsSlinky.monacoEditor.monacoEditorStrings.`800`
import typingsSlinky.monacoEditor.monacoEditorStrings.`900`
import typingsSlinky.monacoEditor.monacoEditorStrings.`inline`
import typingsSlinky.monacoEditor.monacoEditorStrings.all
import typingsSlinky.monacoEditor.monacoEditorStrings.alt
import typingsSlinky.monacoEditor.monacoEditorStrings.always
import typingsSlinky.monacoEditor.monacoEditorStrings.auto
import typingsSlinky.monacoEditor.monacoEditorStrings.bold
import typingsSlinky.monacoEditor.monacoEditorStrings.bolder
import typingsSlinky.monacoEditor.monacoEditorStrings.bottom
import typingsSlinky.monacoEditor.monacoEditorStrings.boundary
import typingsSlinky.monacoEditor.monacoEditorStrings.bounded
import typingsSlinky.monacoEditor.monacoEditorStrings.ctrlCmd
import typingsSlinky.monacoEditor.monacoEditorStrings.first
import typingsSlinky.monacoEditor.monacoEditorStrings.gutter
import typingsSlinky.monacoEditor.monacoEditorStrings.indentation
import typingsSlinky.monacoEditor.monacoEditorStrings.inherit
import typingsSlinky.monacoEditor.monacoEditorStrings.initial
import typingsSlinky.monacoEditor.monacoEditorStrings.interval
import typingsSlinky.monacoEditor.monacoEditorStrings.lighter
import typingsSlinky.monacoEditor.monacoEditorStrings.line
import typingsSlinky.monacoEditor.monacoEditorStrings.mouseover
import typingsSlinky.monacoEditor.monacoEditorStrings.none
import typingsSlinky.monacoEditor.monacoEditorStrings.normal
import typingsSlinky.monacoEditor.monacoEditorStrings.off
import typingsSlinky.monacoEditor.monacoEditorStrings.on
import typingsSlinky.monacoEditor.monacoEditorStrings.onlySnippets
import typingsSlinky.monacoEditor.monacoEditorStrings.recentlyUsed
import typingsSlinky.monacoEditor.monacoEditorStrings.recentlyUsedByPrefix
import typingsSlinky.monacoEditor.monacoEditorStrings.relative
import typingsSlinky.monacoEditor.monacoEditorStrings.selection
import typingsSlinky.monacoEditor.monacoEditorStrings.smart
import typingsSlinky.monacoEditor.monacoEditorStrings.top
import typingsSlinky.monacoEditor.monacoEditorStrings.wordWrapColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditorOptions extends js.Object {
  /**
    * Accept suggestions on provider defined characters.
    * Defaults to true.
    */
  var acceptSuggestionOnCommitCharacter: js.UndefOr[Boolean] = js.native
  /**
    * Accept suggestions on ENTER.
    * Defaults to 'on'.
    */
  var acceptSuggestionOnEnter: js.UndefOr[Boolean | on | smart | off] = js.native
  /**
    * Configure the editor's accessibility support.
    * Defaults to 'auto'. It is best to leave this to 'auto'.
    */
  var accessibilitySupport: js.UndefOr[auto | off | on] = js.native
  /**
    * The aria label for the editor's textarea (when it is focused).
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Options for auto closing brackets.
    * Defaults to language defined behavior.
    */
  var autoClosingBrackets: js.UndefOr[EditorAutoClosingStrategy] = js.native
  /**
    * Options for typing over closing quotes or brackets.
    */
  var autoClosingOvertype: js.UndefOr[EditorAutoClosingOvertypeStrategy] = js.native
  /**
    * Options for auto closing quotes.
    * Defaults to language defined behavior.
    */
  var autoClosingQuotes: js.UndefOr[EditorAutoClosingStrategy] = js.native
  /**
    * Enable auto indentation adjustment.
    * Defaults to false.
    */
  var autoIndent: js.UndefOr[Boolean] = js.native
  /**
    * Options for auto surrounding.
    * Defaults to always allowing auto surrounding.
    */
  var autoSurround: js.UndefOr[EditorAutoSurroundStrategy] = js.native
  /**
    * Enable that the editor will install an interval to check if its container dom node size has changed.
    * Enabling this might have a severe performance impact.
    * Defaults to false.
    */
  var automaticLayout: js.UndefOr[Boolean] = js.native
  /**
    * Code action kinds to be run on save.
    */
  var codeActionsOnSave: js.UndefOr[ICodeActionsOnSaveOptions] = js.native
  /**
    * Timeout for running code actions on save.
    */
  var codeActionsOnSaveTimeout: js.UndefOr[Double] = js.native
  /**
    * Show code lens
    * Defaults to true.
    */
  var codeLens: js.UndefOr[Boolean] = js.native
  /**
    * Enable inline color decorators and color picker rendering.
    */
  var colorDecorators: js.UndefOr[Boolean] = js.native
  /**
    * Enable custom contextmenu.
    * Defaults to true.
    */
  var contextmenu: js.UndefOr[Boolean] = js.native
  /**
    * Syntax highlighting is copied.
    */
  var copyWithSyntaxHighlighting: js.UndefOr[Boolean] = js.native
  /**
    * Control the cursor animation style, possible values are 'blink', 'smooth', 'phase', 'expand' and 'solid'.
    * Defaults to 'blink'.
    */
  var cursorBlinking: js.UndefOr[String] = js.native
  /**
    * Enable smooth caret animation.
    * Defaults to false.
    */
  var cursorSmoothCaretAnimation: js.UndefOr[Boolean] = js.native
  /**
    * Control the cursor style, either 'block' or 'line'.
    * Defaults to 'line'.
    */
  var cursorStyle: js.UndefOr[String] = js.native
  /**
    * Controls the minimal number of visible leading and trailing lines surrounding the cursor.
    * Defaults to 0.
    */
  var cursorSurroundingLines: js.UndefOr[Double] = js.native
  /**
    * Control the width of the cursor when cursorStyle is set to 'line'
    */
  var cursorWidth: js.UndefOr[Double] = js.native
  /**
    * Disable the use of `will-change` for the editor margin and lines layers.
    * The usage of `will-change` acts as a hint for browsers to create an extra layer.
    * Defaults to false.
    */
  var disableLayerHinting: js.UndefOr[Boolean] = js.native
  /**
    * Disable the optimizations for monospace fonts.
    * Defaults to false.
    */
  var disableMonospaceOptimizations: js.UndefOr[Boolean] = js.native
  /**
    * Controls if the editor should allow to move selections via drag and drop.
    * Defaults to false.
    */
  var dragAndDrop: js.UndefOr[Boolean] = js.native
  /**
    * Copying without a selection copies the current line.
    */
  var emptySelectionClipboard: js.UndefOr[Boolean] = js.native
  /**
    * Class name to be added to the editor.
    */
  var extraEditorClassName: js.UndefOr[String] = js.native
  /**
    * FastScrolling mulitplier speed when pressing `Alt`
    * Defaults to 5.
    */
  var fastScrollSensitivity: js.UndefOr[Double] = js.native
  /**
    * Control the behavior of the find widget.
    */
  var find: js.UndefOr[IEditorFindOptions] = js.native
  /**
    * Display overflow widgets as `fixed`.
    * Defaults to `false`.
    */
  var fixedOverflowWidgets: js.UndefOr[Boolean] = js.native
  /**
    * Enable code folding
    * Defaults to true.
    */
  var folding: js.UndefOr[Boolean] = js.native
  /**
    * Selects the folding strategy. 'auto' uses the strategies contributed for the current document, 'indentation' uses the indentation based folding strategy.
    * Defaults to 'auto'.
    */
  var foldingStrategy: js.UndefOr[auto | indentation] = js.native
  /**
    * The font family
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * Enable font ligatures.
    * Defaults to false.
    */
  var fontLigatures: js.UndefOr[Boolean] = js.native
  /**
    * The font size
    */
  var fontSize: js.UndefOr[Double] = js.native
  /**
    * The font weight
    */
  var fontWeight: js.UndefOr[
    normal | bold | bolder | lighter | initial | inherit | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
  ] = js.native
  /**
    * Enable format on paste.
    * Defaults to false.
    */
  var formatOnPaste: js.UndefOr[Boolean] = js.native
  /**
    * Enable format on type.
    * Defaults to false.
    */
  var formatOnType: js.UndefOr[Boolean] = js.native
  /**
    * Enable the rendering of the glyph margin.
    * Defaults to true in vscode and to false in monaco-editor.
    */
  var glyphMargin: js.UndefOr[Boolean] = js.native
  /**
    *
    */
  var gotoLocation: js.UndefOr[IGotoLocationOptions] = js.native
  /**
    * Should the cursor be hidden in the overview ruler.
    * Defaults to false.
    */
  var hideCursorInOverviewRuler: js.UndefOr[Boolean] = js.native
  /**
    * Enable highlighting of the active indent guide.
    * Defaults to true.
    */
  var highlightActiveIndentGuide: js.UndefOr[Boolean] = js.native
  /**
    * Configure the editor's hover.
    */
  var hover: js.UndefOr[IEditorHoverOptions] = js.native
  /**
    * The letter spacing
    */
  var letterSpacing: js.UndefOr[Double] = js.native
  /**
    * Control the behavior and rendering of the code action lightbulb.
    */
  var lightbulb: js.UndefOr[IEditorLightbulbOptions] = js.native
  /**
    * The width reserved for line decorations (in px).
    * Line decorations are placed between line numbers and the editor content.
    * You can pass in a string in the format floating point followed by "ch". e.g. 1.3ch.
    * Defaults to 10.
    */
  var lineDecorationsWidth: js.UndefOr[Double | String] = js.native
  /**
    * The line height
    */
  var lineHeight: js.UndefOr[Double] = js.native
  /**
    * Control the rendering of line numbers.
    * If it is a function, it will be invoked when rendering a line number and the return value will be rendered.
    * Otherwise, if it is a truey, line numbers will be rendered normally (equivalent of using an identity function).
    * Otherwise, line numbers will not be rendered.
    * Defaults to true.
    */
  var lineNumbers: js.UndefOr[on | off | relative | interval | (js.Function1[/* lineNumber */ Double, String])] = js.native
  /**
    * Control the width of line numbers, by reserving horizontal space for rendering at least an amount of digits.
    * Defaults to 5.
    */
  var lineNumbersMinChars: js.UndefOr[Double] = js.native
  /**
    * Enable detecting links and making them clickable.
    * Defaults to true.
    */
  var links: js.UndefOr[Boolean] = js.native
  /**
    * Enable highlighting of matching brackets.
    * Defaults to true.
    */
  var matchBrackets: js.UndefOr[Boolean] = js.native
  /**
    * Control the behavior and rendering of the minimap.
    */
  var minimap: js.UndefOr[IEditorMinimapOptions] = js.native
  /**
    * A multiplier to be used on the `deltaX` and `deltaY` of mouse wheel scroll events.
    * Defaults to 1.
    */
  var mouseWheelScrollSensitivity: js.UndefOr[Double] = js.native
  /**
    * Zoom the font in the editor when using the mouse wheel in combination with holding Ctrl.
    * Defaults to false.
    */
  var mouseWheelZoom: js.UndefOr[Boolean] = js.native
  /**
    * Merge overlapping selections.
    * Defaults to true
    */
  var multiCursorMergeOverlapping: js.UndefOr[Boolean] = js.native
  /**
    * The modifier to be used to add multiple cursors with the mouse.
    * Defaults to 'alt'
    */
  var multiCursorModifier: js.UndefOr[ctrlCmd | alt] = js.native
  /**
    * Enable semantic occurrences highlight.
    * Defaults to true.
    */
  var occurrencesHighlight: js.UndefOr[Boolean] = js.native
  /**
    * Controls if a border should be drawn around the overview ruler.
    * Defaults to `true`.
    */
  var overviewRulerBorder: js.UndefOr[Boolean] = js.native
  /**
    * The number of vertical lanes the overview ruler should render.
    * Defaults to 2.
    */
  var overviewRulerLanes: js.UndefOr[Double] = js.native
  /**
    * Parameter hint options.
    */
  var parameterHints: js.UndefOr[IEditorParameterHintOptions] = js.native
  /**
    * Enable quick suggestions (shadow suggestions)
    * Defaults to true.
    */
  var quickSuggestions: js.UndefOr[Boolean | AnonComments] = js.native
  /**
    * Quick suggestions show delay (in ms)
    * Defaults to 500 (ms)
    */
  var quickSuggestionsDelay: js.UndefOr[Double] = js.native
  /**
    * Should the editor be read only.
    * Defaults to false.
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /**
    * Enable rendering of control characters.
    * Defaults to false.
    */
  var renderControlCharacters: js.UndefOr[Boolean] = js.native
  /**
    * Render last line number when the file ends with a newline.
    * Defaults to true.
    */
  var renderFinalNewline: js.UndefOr[Boolean] = js.native
  /**
    * Enable rendering of indent guides.
    * Defaults to true.
    */
  var renderIndentGuides: js.UndefOr[Boolean] = js.native
  /**
    * Enable rendering of current line highlight.
    * Defaults to all.
    */
  var renderLineHighlight: js.UndefOr[none | gutter | line | all] = js.native
  /**
    * Enable rendering of whitespace.
    * Defaults to none.
    */
  var renderWhitespace: js.UndefOr[none | boundary | selection | all] = js.native
  /**
    * When revealing the cursor, a virtual padding (px) is added to the cursor, turning it into a rectangle.
    * This virtual padding ensures that the cursor gets revealed before hitting the edge of the viewport.
    * Defaults to 30 (px).
    */
  var revealHorizontalRightPadding: js.UndefOr[Double] = js.native
  /**
    * Render the editor selection with rounded borders.
    * Defaults to true.
    */
  var roundedSelection: js.UndefOr[Boolean] = js.native
  /**
    * Render vertical lines at the specified columns.
    * Defaults to empty array.
    */
  var rulers: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Enable that scrolling can go beyond the last column by a number of columns.
    * Defaults to 5.
    */
  var scrollBeyondLastColumn: js.UndefOr[Double] = js.native
  /**
    * Enable that scrolling can go one screen size after the last line.
    * Defaults to true.
    */
  var scrollBeyondLastLine: js.UndefOr[Boolean] = js.native
  /**
    * Control the behavior and rendering of the scrollbars.
    */
  var scrollbar: js.UndefOr[IEditorScrollbarOptions] = js.native
  /**
    * Should the corresponding line be selected when clicking on the line number?
    * Defaults to true.
    */
  var selectOnLineNumbers: js.UndefOr[Boolean] = js.native
  /**
    * Enable Linux primary clipboard.
    * Defaults to true.
    */
  var selectionClipboard: js.UndefOr[Boolean] = js.native
  /**
    * Enable selection highlight.
    * Defaults to true.
    */
  var selectionHighlight: js.UndefOr[Boolean] = js.native
  /**
    * Controls whether the fold actions in the gutter stay always visible or hide unless the mouse is over the gutter.
    * Defaults to 'mouseover'.
    */
  var showFoldingControls: js.UndefOr[always | mouseover] = js.native
  /**
    * Controls fading out of unused variables.
    */
  var showUnused: js.UndefOr[Boolean] = js.native
  /**
    * Enable that the editor animates scrolling to a position.
    * Defaults to false.
    */
  var smoothScrolling: js.UndefOr[Boolean] = js.native
  /**
    * Enable snippet suggestions. Default to 'true'.
    */
  var snippetSuggestions: js.UndefOr[top | bottom | `inline` | none] = js.native
  /**
    * Performance guard: Stop rendering a line after x characters.
    * Defaults to 10000.
    * Use -1 to never stop rendering
    */
  var stopRenderingLineAfter: js.UndefOr[Double] = js.native
  /**
    * Suggest options.
    */
  var suggest: js.UndefOr[ISuggestOptions] = js.native
  /**
    * The font size for the suggest widget.
    * Defaults to the editor font size.
    */
  var suggestFontSize: js.UndefOr[Double] = js.native
  /**
    * The line height for the suggest widget.
    * Defaults to the editor line height.
    */
  var suggestLineHeight: js.UndefOr[Double] = js.native
  /**
    * Enable the suggestion box to pop-up on trigger characters.
    * Defaults to true.
    */
  var suggestOnTriggerCharacters: js.UndefOr[Boolean] = js.native
  /**
    * The history mode for suggestions.
    */
  var suggestSelection: js.UndefOr[first | recentlyUsed | recentlyUsedByPrefix] = js.native
  /**
    * Enable tab completion.
    */
  var tabCompletion: js.UndefOr[Boolean | on | off | onlySnippets] = js.native
  /**
    * Inserting and deleting whitespace follows tab stops.
    */
  var useTabStops: js.UndefOr[Boolean] = js.native
  /**
    * Enable word based suggestions. Defaults to 'true'
    */
  var wordBasedSuggestions: js.UndefOr[Boolean] = js.native
  /**
    * A string containing the word separators used when doing word navigation.
    * Defaults to `~!@#$%^&*()-=+[{]}\\|;:\'",.<>/?
    */
  var wordSeparators: js.UndefOr[String] = js.native
  /**
    * Control the wrapping of the editor.
    * When `wordWrap` = "off", the lines will never wrap.
    * When `wordWrap` = "on", the lines will wrap at the viewport width.
    * When `wordWrap` = "wordWrapColumn", the lines will wrap at `wordWrapColumn`.
    * When `wordWrap` = "bounded", the lines will wrap at min(viewport width, wordWrapColumn).
    * Defaults to "off".
    */
  var wordWrap: js.UndefOr[off | on | wordWrapColumn | bounded] = js.native
  /**
    * Configure word wrapping characters. A break will be introduced after these characters.
    * Defaults to ' \t})]?|&,;'.
    */
  var wordWrapBreakAfterCharacters: js.UndefOr[String] = js.native
  /**
    * Configure word wrapping characters. A break will be introduced before these characters.
    * Defaults to '{([+'.
    */
  var wordWrapBreakBeforeCharacters: js.UndefOr[String] = js.native
  /**
    * Configure word wrapping characters. A break will be introduced after these characters only if no `wordWrapBreakBeforeCharacters` or `wordWrapBreakAfterCharacters` were found.
    * Defaults to '.'.
    */
  var wordWrapBreakObtrusiveCharacters: js.UndefOr[String] = js.native
  /**
    * Control the wrapping of the editor.
    * When `wordWrap` = "off", the lines will never wrap.
    * When `wordWrap` = "on", the lines will wrap at the viewport width.
    * When `wordWrap` = "wordWrapColumn", the lines will wrap at `wordWrapColumn`.
    * When `wordWrap` = "bounded", the lines will wrap at min(viewport width, wordWrapColumn).
    * Defaults to 80.
    */
  var wordWrapColumn: js.UndefOr[Double] = js.native
  /**
    * Force word wrapping when the text appears to be of a minified/generated file.
    * Defaults to true.
    */
  var wordWrapMinified: js.UndefOr[Boolean] = js.native
  /**
    * Control indentation of wrapped lines. Can be: 'none', 'same', 'indent' or 'deepIndent'.
    * Defaults to 'same' in vscode and to 'none' in monaco-editor.
    */
  var wrappingIndent: js.UndefOr[String] = js.native
}

object IEditorOptions {
  @scala.inline
  def apply(): IEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorOptions]
  }
  @scala.inline
  implicit class IEditorOptionsOps[Self <: IEditorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptSuggestionOnCommitCharacter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptSuggestionOnCommitCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptSuggestionOnCommitCharacter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptSuggestionOnCommitCharacter")(js.undefined)
        ret
    }
    @scala.inline
    def withAcceptSuggestionOnEnter(value: Boolean | on | smart | off): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptSuggestionOnEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptSuggestionOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptSuggestionOnEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilitySupport(value: auto | off | on): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilitySupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilitySupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilitySupport")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoClosingBrackets(value: EditorAutoClosingStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClosingBrackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoClosingBrackets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClosingBrackets")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoClosingOvertype(value: EditorAutoClosingOvertypeStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClosingOvertype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoClosingOvertype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClosingOvertype")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoClosingQuotes(value: EditorAutoClosingStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClosingQuotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoClosingQuotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClosingQuotes")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoIndent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSurround(value: EditorAutoSurroundStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSurround")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSurround: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSurround")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomaticLayout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeActionsOnSave(value: ICodeActionsOnSaveOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeActionsOnSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeActionsOnSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeActionsOnSave")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeActionsOnSaveTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeActionsOnSaveTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeActionsOnSaveTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeActionsOnSaveTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeLens(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeLens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeLens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeLens")(js.undefined)
        ret
    }
    @scala.inline
    def withColorDecorators(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorDecorators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorDecorators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorDecorators")(js.undefined)
        ret
    }
    @scala.inline
    def withContextmenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextmenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextmenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextmenu")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyWithSyntaxHighlighting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyWithSyntaxHighlighting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyWithSyntaxHighlighting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyWithSyntaxHighlighting")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorBlinking(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorBlinking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorBlinking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorBlinking")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorSmoothCaretAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorSmoothCaretAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorSmoothCaretAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorSmoothCaretAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorSurroundingLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorSurroundingLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorSurroundingLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorSurroundingLines")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableLayerHinting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableLayerHinting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableLayerHinting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableLayerHinting")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableMonospaceOptimizations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMonospaceOptimizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableMonospaceOptimizations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMonospaceOptimizations")(js.undefined)
        ret
    }
    @scala.inline
    def withDragAndDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAndDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragAndDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAndDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptySelectionClipboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptySelectionClipboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptySelectionClipboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptySelectionClipboard")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraEditorClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraEditorClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraEditorClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraEditorClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withFastScrollSensitivity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastScrollSensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFastScrollSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastScrollSensitivity")(js.undefined)
        ret
    }
    @scala.inline
    def withFind(value: IEditorFindOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedOverflowWidgets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedOverflowWidgets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedOverflowWidgets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedOverflowWidgets")(js.undefined)
        ret
    }
    @scala.inline
    def withFolding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFolding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folding")(js.undefined)
        ret
    }
    @scala.inline
    def withFoldingStrategy(value: auto | indentation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foldingStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFoldingStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foldingStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontLigatures(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontLigatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontLigatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontLigatures")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(
      value: normal | bold | bolder | lighter | initial | inherit | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatOnPaste(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatOnPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatOnPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatOnPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatOnType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatOnType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatOnType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatOnType")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyphMargin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyphMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withGotoLocation(value: IGotoLocationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGotoLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withHideCursorInOverviewRuler(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCursorInOverviewRuler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideCursorInOverviewRuler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCursorInOverviewRuler")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightActiveIndentGuide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightActiveIndentGuide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightActiveIndentGuide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightActiveIndentGuide")(js.undefined)
        ret
    }
    @scala.inline
    def withHover(value: IEditorHoverOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(js.undefined)
        ret
    }
    @scala.inline
    def withLetterSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLetterSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withLightbulb(value: IEditorLightbulbOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightbulb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightbulb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightbulb")(js.undefined)
        ret
    }
    @scala.inline
    def withLineDecorationsWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDecorationsWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineDecorationsWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDecorationsWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLineHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withLineNumbersFunction1(value: /* lineNumber */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumbers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLineNumbers(value: on | off | relative | interval | (js.Function1[/* lineNumber */ Double, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withLineNumbersMinChars(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumbersMinChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineNumbersMinChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumbersMinChars")(js.undefined)
        ret
    }
    @scala.inline
    def withLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchBrackets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchBrackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchBrackets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchBrackets")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimap(value: IEditorMinimapOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimap")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseWheelScrollSensitivity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelScrollSensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseWheelScrollSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelScrollSensitivity")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseWheelZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseWheelZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiCursorMergeOverlapping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiCursorMergeOverlapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiCursorMergeOverlapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiCursorMergeOverlapping")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiCursorModifier(value: ctrlCmd | alt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiCursorModifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiCursorModifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiCursorModifier")(js.undefined)
        ret
    }
    @scala.inline
    def withOccurrencesHighlight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrencesHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccurrencesHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrencesHighlight")(js.undefined)
        ret
    }
    @scala.inline
    def withOverviewRulerBorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overviewRulerBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverviewRulerBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overviewRulerBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withOverviewRulerLanes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overviewRulerLanes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverviewRulerLanes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overviewRulerLanes")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterHints(value: IEditorParameterHintOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterHints")(js.undefined)
        ret
    }
    @scala.inline
    def withQuickSuggestions(value: Boolean | AnonComments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuickSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withQuickSuggestionsDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickSuggestionsDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuickSuggestionsDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickSuggestionsDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderControlCharacters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderControlCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderControlCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderControlCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderFinalNewline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFinalNewline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderFinalNewline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFinalNewline")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderIndentGuides(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderIndentGuides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderIndentGuides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderIndentGuides")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderLineHighlight(value: none | gutter | line | all): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLineHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderLineHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLineHighlight")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderWhitespace(value: none | boundary | selection | all): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderWhitespace")(js.undefined)
        ret
    }
    @scala.inline
    def withRevealHorizontalRightPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revealHorizontalRightPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevealHorizontalRightPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revealHorizontalRightPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundedSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundedSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundedSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundedSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withRulers(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRulers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulers")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollBeyondLastColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBeyondLastColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollBeyondLastColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBeyondLastColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollBeyondLastLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBeyondLastLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollBeyondLastLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBeyondLastLine")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollbar(value: IEditorScrollbarOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectOnLineNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnLineNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectOnLineNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnLineNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionClipboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionClipboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionClipboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionClipboard")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionHighlight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionHighlight")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFoldingControls(value: always | mouseover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFoldingControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFoldingControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFoldingControls")(js.undefined)
        ret
    }
    @scala.inline
    def withShowUnused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showUnused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowUnused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showUnused")(js.undefined)
        ret
    }
    @scala.inline
    def withSmoothScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmoothScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withSnippetSuggestions(value: top | bottom | `inline` | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippetSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnippetSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippetSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withStopRenderingLineAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopRenderingLineAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopRenderingLineAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopRenderingLineAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggest(value: ISuggestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggest")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestLineHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestLineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestLineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestOnTriggerCharacters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestOnTriggerCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestOnTriggerCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestOnTriggerCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestSelection(value: first | recentlyUsed | recentlyUsedByPrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withTabCompletion(value: Boolean | on | off | onlySnippets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabCompletion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabCompletion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabCompletion")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTabStops(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTabStops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTabStops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTabStops")(js.undefined)
        ret
    }
    @scala.inline
    def withWordBasedSuggestions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordBasedSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordBasedSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordBasedSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withWordSeparators(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordSeparators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordSeparators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordSeparators")(js.undefined)
        ret
    }
    @scala.inline
    def withWordWrap(value: off | on | wordWrapColumn | bounded): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withWordWrapBreakAfterCharacters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapBreakAfterCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordWrapBreakAfterCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapBreakAfterCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withWordWrapBreakBeforeCharacters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapBreakBeforeCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordWrapBreakBeforeCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapBreakBeforeCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withWordWrapBreakObtrusiveCharacters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapBreakObtrusiveCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordWrapBreakObtrusiveCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapBreakObtrusiveCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withWordWrapColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordWrapColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withWordWrapMinified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapMinified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordWrapMinified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapMinified")(js.undefined)
        ret
    }
    @scala.inline
    def withWrappingIndent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappingIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrappingIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappingIndent")(js.undefined)
        ret
    }
  }
  
}

