package typingsSlinky.jupyterlabCodemirror.editorMod.CodeMirrorEditor

import typingsSlinky.codemirror.mod.StyleActiveLine
import typingsSlinky.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.bounded
import typingsSlinky.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.off
import typingsSlinky.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.on
import typingsSlinky.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.wordWrapColumn
import typingsSlinky.jupyterlabCodemirror.modeMod.Mode.IMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration options for a codemirror editor.
  */
@js.native
trait IConfig
  extends typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IConfig {
  /**
    * When fixedGutter is on, and there is a horizontal scrollbar, by default
    * the gutter will be visible to the left of this scrollbar. If this
    * option is set to true, it will be covered by an element with class
    * CodeMirror-gutter-filler.
    */
  var coverGutterNextToScrollbar: js.UndefOr[Boolean] = js.native
  /**
    * Controls whether drag-and-drop is enabled.
    */
  var dragDrop: js.UndefOr[Boolean] = js.native
  /**
    * Configures whether the editor should re-indent the current line when a
    * character is typed that might change its proper indentation
    * (only works if the mode supports indentation).
    */
  var electricChars: js.UndefOr[Boolean] = js.native
  /**
    * Can be used to specify extra keybindings for the editor, alongside the
    * ones defined by keyMap. Should be either null, or a valid keymap value.
    */
  var extraKeys: js.UndefOr[js.Any] = js.native
  /**
    * Determines whether the gutter scrolls along with the content
    * horizontally (false)
    * or whether it stays fixed during horizontal scrolling (true,
    * the default).
    */
  var fixedGutter: js.UndefOr[Boolean] = js.native
  /**
    * Whether the folding gutter should be drawn
    */
  var foldGutter: js.UndefOr[Boolean] = js.native
  /**
    * Can be used to add extra gutters (beyond or instead of the line number
    * gutter).
    * Should be an array of CSS class names, each of which defines a width
    * (and optionally a background),
    * and which will be used to draw the background of the gutters.
    * May include the CodeMirror-linenumbers class, in order to explicitly
    * set the position of the line number gutter
    * (it will default to be to the right of all other gutters).
    * These class names are the keys passed to setGutterMarker.
    */
  var gutters: js.UndefOr[js.Array[String]] = js.native
  /**
    * Configures the keymap to use. The default is "default", which is the
    * only keymap defined in codemirror.js itself.
    * Extra keymaps are found in the CodeMirror keymap directory.
    */
  var keyMap: js.UndefOr[String] = js.native
  /**
    * Explicitly set the line separator for the editor.
    * By default (value null), the document will be split on CRLFs as well as
    * lone CRs and LFs, and a single LF will be used as line separator in all
    * output (such as getValue). When a specific string is given, lines will
    * only be split on that string, and output will, by default, use that
    * same separator.
    */
  var lineSeparator: js.UndefOr[String | Null] = js.native
  /**
    * When enabled, which is the default, doing copy or cut when there is no
    * selection will copy or cut the whole lines that have cursors on them.
    */
  var lineWiseCopyCut: js.UndefOr[Boolean] = js.native
  /**
    * The mode to use.
    */
  var mode: js.UndefOr[String | IMode] = js.native
  /**
    * Whether to scroll past the end of the buffer.
    */
  var scrollPastEnd: js.UndefOr[Boolean] = js.native
  /**
    * Chooses a scrollbar implementation. The default is "native", showing
    * native scrollbars. The core library also provides the "null" style,
    * which completely hides the scrollbars. Addons can implement additional
    * scrollbar models.
    */
  var scrollbarStyle: js.UndefOr[String] = js.native
  /**
    * Defines the mouse cursor appearance when hovering over the selection.
    * It can be set to a string, like "pointer", or to true,
    * in which case the "default" (arrow) cursor will be used.
    */
  var selectionPointer: Boolean | String = js.native
  /**
    * Whether the cursor should be drawn when a selection is active.
    */
  var showCursorWhenSelecting: js.UndefOr[Boolean] = js.native
  /**
    * Whether to use the context-sensitive indentation that the mode provides
    * (or just indent the same as the line before).
    */
  var smartIndent: js.UndefOr[Boolean] = js.native
  /**
    * Whether to give the wrapper of the line that contains the cursor the class
    * CodeMirror-activeline, adds a background with the class
    * CodeMirror-activeline-background, and adds the class
    * CodeMirror-activeline-gutter to the line's gutter space is enabled.
    */
  var styleActiveLine: Boolean | StyleActiveLine = js.native
  /**
    * Whether to causes the selected text to be marked with the CSS class
    * CodeMirror-selectedtext. Useful to change the colour of the selection
    * (in addition to the background).
    */
  var styleSelectedText: Boolean = js.native
  /**
    * The theme to style the editor with.
    * You must make sure the CSS file defining the corresponding
    * .cm-s-[name] styles is loaded.
    */
  var theme: js.UndefOr[String] = js.native
}

object IConfig {
  @scala.inline
  def apply(
    autoClosingBrackets: Boolean,
    codeFolding: Boolean,
    insertSpaces: Boolean,
    lineNumbers: Boolean,
    lineWrap: off | on | wordWrapColumn | bounded,
    matchBrackets: Boolean,
    readOnly: Boolean,
    rulers: js.Array[Double],
    selectionPointer: Boolean | String,
    styleActiveLine: Boolean | StyleActiveLine,
    styleSelectedText: Boolean,
    tabSize: Double,
    wordWrapColumn: Double
  ): IConfig = {
    val __obj = js.Dynamic.literal(autoClosingBrackets = autoClosingBrackets.asInstanceOf[js.Any], codeFolding = codeFolding.asInstanceOf[js.Any], insertSpaces = insertSpaces.asInstanceOf[js.Any], lineNumbers = lineNumbers.asInstanceOf[js.Any], lineWrap = lineWrap.asInstanceOf[js.Any], matchBrackets = matchBrackets.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], rulers = rulers.asInstanceOf[js.Any], selectionPointer = selectionPointer.asInstanceOf[js.Any], styleActiveLine = styleActiveLine.asInstanceOf[js.Any], styleSelectedText = styleSelectedText.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any], wordWrapColumn = wordWrapColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
  @scala.inline
  implicit class IConfigOps[Self <: IConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectionPointer(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionPointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleActiveLine(value: Boolean | StyleActiveLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleActiveLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleSelectedText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleSelectedText")(value.asInstanceOf[js.Any])
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
    def withExtraKeys(value: js.Any): Self = {
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
    def withLineSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withLineSeparatorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSeparator")(null)
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
    def withMode(value: String | IMode): Self = {
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
  }
  
}

