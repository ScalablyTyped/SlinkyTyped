package typingsSlinky.codemirror.mod

import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.codemirror.anon.Delay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorConfiguration extends js.Object {
  /** When enabled (off by default), an extra CSS class will be added to each token, indicating the (inner) mode that produced it, prefixed with "cm-m-".
    For example, tokens from the XML mode will get the cm-m-xml class. */
  var addModeClass: js.UndefOr[Boolean] = js.native
  /** When set (default is null) only files whose type is in the array can be dropped into the editor.
    The strings should be MIME types, and will be checked against the type of the File object as reported by the browser. */
  var allowDropFileTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Will auto-close brackets and quotes when typed.
    * By default, it'll auto-close ()[]{}''"", but you can pass it a string similar to that (containing pairs of matching characters),
    * or an object with pairs and optionally explode properties to customize it.
    */
  var autoCloseBrackets: js.UndefOr[AutoCloseBrackets | Boolean | String] = js.native
  /**
    * Will auto-close XML tags when '>' or '/' is typed.
    * Depends on the fold/xml-fold.js addon.
    */
  var autoCloseTags: js.UndefOr[AutoCloseTags | Boolean] = js.native
  // if true, it will be refreshed the first time the editor becomes visible.
  // you can pass delay (msec) time as polling duration
  var autoRefresh: js.UndefOr[Boolean | Delay] = js.native
  /** Specifies whether or not autocapitalization will be enabled on the input. */
  var autocapitalize: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not autocorrect will be enabled on the input. */
  var autocorrect: js.UndefOr[Boolean] = js.native
  /** Can be used to make CodeMirror focus itself on initialization. Defaults to off.
    When fromTextArea is used, and no explicit value is given for this option, it will be set to true when either the source textarea is focused,
    or it has an autofocus attribute and no other element is focused. */
  var autofocus: js.UndefOr[Boolean] = js.native
  /**
    * When fixedGutter is on, and there is a horizontal scrollbar, by default the gutter will be visible to the left of this scrollbar.
    * If this option is set to true, it will be covered by an element with class CodeMirror-gutter-filler.
    */
  var coverGutterNextToScrollbar: js.UndefOr[Boolean] = js.native
  /** Half - period in milliseconds used for cursor blinking. The default blink rate is 530ms. */
  var cursorBlinkRate: js.UndefOr[Double] = js.native
  /** Determines the height of the cursor. Default is 1 , meaning it spans the whole height of the line.
    For some fonts (and by some tastes) a smaller height (for example 0.85),
    which causes the cursor to not reach all the way to the bottom of the line, looks better */
  var cursorHeight: js.UndefOr[Double] = js.native
  /**
    * How much extra space to always keep above and below the cursor when
    * approaching the top or bottom of the visible view in a scrollable document. Default is 0.
    */
  var cursorScrollMargin: js.UndefOr[Double] = js.native
  /** Controls whether drag-and - drop is enabled. On by default. */
  var dragDrop: js.UndefOr[Boolean] = js.native
  /** Configures whether the editor should re-indent the current line when a character is typed
    that might change its proper indentation (only works if the mode supports indentation). Default is true. */
  var electricChars: js.UndefOr[Boolean] = js.native
  /** Can be used to specify extra keybindings for the editor, alongside the ones defined by keyMap. Should be either null, or a valid keymap value. */
  var extraKeys: js.UndefOr[String | KeyMap] = js.native
  /** At which number to start counting lines. Default is 1. */
  var firstLineNumber: js.UndefOr[Double] = js.native
  /** Determines whether the gutter scrolls along with the content horizontally (false)
    or whether it stays fixed during horizontal scrolling (true, the default). */
  var fixedGutter: js.UndefOr[Boolean] = js.native
  /** By default, CodeMirror will combine adjacent tokens into a single span if they have the same class.
    This will result in a simpler DOM tree, and thus perform better. With some kinds of styling(such as rounded corners),
    this will change the way the document looks. You can set this option to false to disable this behavior. */
  var flattenSpans: js.UndefOr[Boolean] = js.native
  /** Provides an option foldGutter, which can be used to create a gutter with markers indicating the blocks that can be folded. */
  var foldGutter: js.UndefOr[Boolean] = js.native
  /** Can be used to add extra gutters (beyond or instead of the line number gutter).
    Should be an array of CSS class names, each of which defines a width (and optionally a background),
    and which will be used to draw the background of the gutters.
    May include the CodeMirror-linenumbers class, in order to explicitly set the position of the line number gutter
    (it will default to be to the right of all other gutters). These class names are the keys passed to setGutterMarker. */
  var gutters: js.UndefOr[js.Array[String]] = js.native
  /**
    * Adds a highlightSelectionMatches option that can be enabled to highlight all instances of a currently selected word.
    * When enabled, it causes the current word to be highlighted when nothing is selected (defaults to off).
    */
  var highlightSelectionMatches: js.UndefOr[HighlightSelectionMatches | Boolean] = js.native
  var hintOptions: js.UndefOr[ShowHintOptions] = js.native
  /** The period of inactivity (in milliseconds) that will cause a new history event to be started when typing or deleting. Defaults to 500. */
  var historyEventDelay: js.UndefOr[Double] = js.native
  /** How many spaces a block (whatever that means in the edited language) should be indented. The default is 2. */
  var indentUnit: js.UndefOr[Double] = js.native
  /** Whether, when indenting, the first N*tabSize spaces should be replaced by N tabs. Default is false. */
  var indentWithTabs: js.UndefOr[Boolean] = js.native
  /**
    * Selects the way CodeMirror handles input and focus.
    * The core library defines the "textarea" and "contenteditable" input models.
    * On mobile browsers, the default is "contenteditable". On desktop browsers, the default is "textarea".
    * Support for IME and screen readers is better in the "contenteditable" model.
    */
  var inputStyle: js.UndefOr[InputStyle] = js.native
  /** Configures the keymap to use. The default is "default", which is the only keymap defined in codemirror.js itself.
    Extra keymaps are found in the keymap directory. See the section on keymaps for more information. */
  var keyMap: js.UndefOr[String] = js.native
  /** A function used to format line numbers. The function is passed the line number, and should return a string that will be shown in the gutter. */
  var lineNumberFormatter: js.UndefOr[js.Function1[/* line */ Double, String]] = js.native
  /** Whether to show line numbers to the left of the editor. */
  var lineNumbers: js.UndefOr[Boolean] = js.native
  /** When enabled, which is the default, doing copy or cut when there is no selection will copy or cut the whole lines that have cursors on them. */
  var lineWiseCopyCut: js.UndefOr[Boolean] = js.native
  /** Whether CodeMirror should scroll or wrap for long lines. Defaults to false (scroll). */
  var lineWrapping: js.UndefOr[Boolean] = js.native
  /** Optional lint configuration to be used in conjunction with CodeMirror's linter addon. */
  var lint: js.UndefOr[Boolean | LintOptions] = js.native
  //  When set to true or an options object, causes matching brackets to be highlighted whenever the cursor is next to them.
  var matchBrackets: js.UndefOr[MatchBrackets | Boolean] = js.native
  /**
    * When enabled will cause the tags around the cursor to be highlighted (using the CodeMirror-matchingtag class).
    * Depends on the addon/fold/xml-fold.js addon.
    */
  var matchTags: js.UndefOr[MatchTags | Boolean] = js.native
  /** When highlighting long lines, in order to stay responsive, the editor will give up and simply style
    the rest of the line as plain text when it reaches a certain position. The default is 10000.
    You can set this to Infinity to turn off this behavior. */
  var maxHighlightLength: js.UndefOr[Double] = js.native
  /** string|object. The mode to use. When not given, this will default to the first mode that was loaded.
    It may be a string, which either simply names the mode or is a MIME type associated with the mode.
    Alternatively, it may be an object containing configuration options for the mode,
    with a name property that names the mode (for example {name: "javascript", json: true}). */
  var mode: js.UndefOr[js.Any] = js.native
  /** When given , this will be called when the editor is handling a dragenter , dragover , or drop event.
    It will be passed the editor instance and the event object as arguments.
    The callback can choose to handle the event itself , in which case it should return true to indicate that CodeMirror should not do anything further. */
  var onDragEvent: js.UndefOr[js.Function2[/* instance */ Editor, /* event */ DragEvent, Boolean]] = js.native
  /** This provides a rather low - level hook into CodeMirror's key handling.
    If provided, this function will be called on every keydown, keyup, and keypress event that CodeMirror captures.
    It will be passed two arguments, the editor instance and the key event.
    This key event is pretty much the raw key event, except that a stop() method is always added to it.
    You could feed it to, for example, jQuery.Event to further normalize it.
    This function can inspect the key event, and handle it if it wants to.
    It may return true to tell CodeMirror to ignore the event.
    Be wary that, on some browsers, stopping a keydown does not stop the keypress from firing, whereas on others it does.
    If you respond to an event, you should probably inspect its type property and only do something when it is keydown
    (or keypress for actions that need character data). */
  var onKeyEvent: js.UndefOr[js.Function2[/* instance */ Editor, /* event */ KeyboardEvent, Boolean]] = js.native
  /**
    * Adds a placeholder option that can be used to make content appear in the editor when it is empty and not focused.
    * It can hold either a string or a DOM node. Also gives the editor a CodeMirror-empty CSS class whenever it doesn't contain any text.
    */
  var placeholder: js.UndefOr[String] = js.native
  /** Indicates how quickly CodeMirror should poll its input textarea for changes(when focused).
    Most input is captured by events, but some things, like IME input on some browsers, don't generate events that allow CodeMirror to properly detect it.
    Thus, it polls. Default is 100 milliseconds. */
  var pollInterval: js.UndefOr[Double] = js.native
  /** boolean|string. This disables editing of the editor content by the user. If the special value "nocursor" is given (instead of simply true), focusing of the editor is also disallowed. */
  var readOnly: js.UndefOr[js.Any] = js.native
  /** Controls whether, when the context menu is opened with a click outside of the current selection,
    the cursor is moved to the point of the click. Defaults to true. */
  var resetSelectionOnContextMenu: js.UndefOr[Boolean] = js.native
  /** Determines whether horizontal cursor movement through right-to-left (Arabic, Hebrew) text
    is visual (pressing the left arrow moves the cursor left)
    or logical (pressing the left arrow moves to the next lower index in the string, which is visually right in right-to-left text).
    The default is false on Windows, and true on other platforms. */
  var rtlMoveVisually: js.UndefOr[Boolean] = js.native
  /**
    * When the end of the file is reached it allows you to keep scrolling so that your last few lines of code are not stuck at the bottom of the editor.
    */
  var scrollPastEnd: js.UndefOr[Boolean] = js.native
  /**
    * Chooses a scrollbar implementation. The default is "native", showing native scrollbars. The core library also
    * provides the "null" style, which completely hides the scrollbars. Addons can implement additional scrollbar models.
    */
  var scrollbarStyle: js.UndefOr[String] = js.native
  /**Whether the cursor should be drawn when a selection is active. Defaults to false. */
  var showCursorWhenSelecting: js.UndefOr[Boolean] = js.native
  var showHint: js.UndefOr[Boolean] = js.native
  /** Whether to use the context-sensitive indentation that the mode provides (or just indent the same as the line before). Defaults to true. */
  var smartIndent: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not spellcheck will be enabled on the input. */
  var spellcheck: js.UndefOr[Boolean] = js.native
  /**
    * When enabled gives the wrapper of the line that contains the cursor the class CodeMirror-activeline,
    * adds a background with the class CodeMirror-activeline-background, and adds the class CodeMirror-activeline-gutter to the line's gutter space is enabled.
    */
  var styleActiveLine: js.UndefOr[StyleActiveLine | Boolean] = js.native
  /** The width of a tab character. Defaults to 4. */
  var tabSize: js.UndefOr[Double] = js.native
  /** The tab index to assign to the editor. If not given, no tab index will be assigned. */
  var tabindex: js.UndefOr[Double] = js.native
  /** The theme to style the editor with. You must make sure the CSS file defining the corresponding .cm-s-[name] styles is loaded.
    The default is "default". */
  var theme: js.UndefOr[String] = js.native
  /** The maximum number of undo levels that the editor stores. Defaults to 40. */
  var undoDepth: js.UndefOr[Double] = js.native
  /** string| The starting value of the editor. Can be a string, or a document object. */
  var value: js.UndefOr[js.Any] = js.native
  /** Specifies the amount of lines that are rendered above and below the part of the document that's currently scrolled into view.
    This affects the amount of updates needed when scrolling, and the amount of work that such an update does.
    You should usually leave it at its default, 10. Can be set to Infinity to make sure the whole document is always rendered,
    and thus the browser's text search works on it. This will have bad effects on performance of big documents. */
  var viewportMargin: js.UndefOr[Double] = js.native
  /** See workTime. */
  var workDelay: js.UndefOr[Double] = js.native
  /** Highlighting is done by a pseudo background - thread that will work for workTime milliseconds,
    and then use timeout to sleep for workDelay milliseconds.
    The defaults are 200 and 300, you can change these options to make the highlighting more or less aggressive. */
  var workTime: js.UndefOr[Double] = js.native
}

object EditorConfiguration {
  @scala.inline
  def apply(): EditorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorConfiguration]
  }
  @scala.inline
  implicit class EditorConfigurationOps[Self <: EditorConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddModeClass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addModeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddModeClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addModeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDropFileTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDropFileTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDropFileTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDropFileTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCloseBrackets(value: AutoCloseBrackets | Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCloseBrackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCloseBrackets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCloseBrackets")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCloseTags(value: AutoCloseTags | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCloseTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCloseTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCloseTags")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoRefresh(value: Boolean | Delay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withAutocapitalize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocapitalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutocapitalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocapitalize")(js.undefined)
        ret
    }
    @scala.inline
    def withAutocorrect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocorrect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutocorrect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocorrect")(js.undefined)
        ret
    }
    @scala.inline
    def withAutofocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutofocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofocus")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverGutterNextToScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverGutterNextToScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverGutterNextToScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverGutterNextToScrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorBlinkRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorBlinkRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorBlinkRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorBlinkRate")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorScrollMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorScrollMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorScrollMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorScrollMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withDragDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withElectricChars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electricChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectricChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electricChars")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraKeys(value: String | KeyMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstLineNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLineNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstLineNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLineNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedGutter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedGutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedGutter")(js.undefined)
        ret
    }
    @scala.inline
    def withFlattenSpans(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flattenSpans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlattenSpans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flattenSpans")(js.undefined)
        ret
    }
    @scala.inline
    def withFoldGutter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foldGutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFoldGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foldGutter")(js.undefined)
        ret
    }
    @scala.inline
    def withGutters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGutters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutters")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightSelectionMatches(value: HighlightSelectionMatches | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSelectionMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightSelectionMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSelectionMatches")(js.undefined)
        ret
    }
    @scala.inline
    def withHintOptions(value: ShowHintOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHintOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHistoryEventDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyEventDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistoryEventDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyEventDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentUnit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentWithTabs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentWithTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentWithTabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentWithTabs")(js.undefined)
        ret
    }
    @scala.inline
    def withInputStyle(value: InputStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyMap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyMap")(js.undefined)
        ret
    }
    @scala.inline
    def withLineNumberFormatter(value: /* line */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumberFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLineNumberFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumberFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withLineNumbers(value: Boolean): Self = {
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
    def withLineWiseCopyCut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWiseCopyCut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWiseCopyCut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWiseCopyCut")(js.undefined)
        ret
    }
    @scala.inline
    def withLineWrapping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWrapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWrapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWrapping")(js.undefined)
        ret
    }
    @scala.inline
    def withLint(value: Boolean | LintOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lint")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchBrackets(value: MatchBrackets | Boolean): Self = {
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
    def withMatchTags(value: MatchTags | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchTags")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHighlightLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHighlightLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHighlightLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHighlightLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEvent(value: (/* instance */ Editor, /* event */ DragEvent) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDragEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyEvent(value: (/* instance */ Editor, /* event */ KeyboardEvent) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnKeyEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPollInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: js.Any): Self = {
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
    def withResetSelectionOnContextMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetSelectionOnContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetSelectionOnContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetSelectionOnContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withRtlMoveVisually(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtlMoveVisually")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtlMoveVisually: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtlMoveVisually")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollPastEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPastEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollPastEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPastEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollbarStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollbarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCursorWhenSelecting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCursorWhenSelecting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCursorWhenSelecting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCursorWhenSelecting")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHint")(js.undefined)
        ret
    }
    @scala.inline
    def withSmartIndent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmartIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellcheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellcheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellcheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellcheck")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleActiveLine(value: StyleActiveLine | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleActiveLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleActiveLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleActiveLine")(js.undefined)
        ret
    }
    @scala.inline
    def withTabSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTabindex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabindex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabindex")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withUndoDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undoDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUndoDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undoDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withViewportMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewportMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workTime")(js.undefined)
        ret
    }
  }
  
}

