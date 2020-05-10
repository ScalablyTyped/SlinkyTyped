package typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor

import typingsSlinky.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.bounded
import typingsSlinky.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.off
import typingsSlinky.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.on
import typingsSlinky.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.wordWrapColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration options for an editor.
  */
@js.native
trait IConfig extends js.Object {
  /**
    * Whether to automatically close brackets after opening them.
    */
  var autoClosingBrackets: Boolean = js.native
  /**
    * Wheter to allow code folding
    */
  var codeFolding: Boolean = js.native
  /**
    * User preferred font family for text editors.
    */
  var fontFamily: String | Null = js.native
  /**
    * User preferred size in pixel of the font used in text editors.
    */
  var fontSize: Double | Null = js.native
  /**
    * Whether to insert spaces when pressing Tab.
    */
  var insertSpaces: Boolean = js.native
  /**
    * User preferred text line height, as a multiplier of font size.
    */
  var lineHeight: Double | Null = js.native
  /**
    * Whether line numbers should be displayed.
    */
  var lineNumbers: Boolean = js.native
  /**
    * Control the line wrapping of the editor. Possible values are:
    * - "off", lines will never wrap.
    * - "on", lines will wrap at the viewport border.
    * - "wordWrapColumn", lines will wrap at `wordWrapColumn`.
    * - "bounded", lines will wrap at minimum between viewport width and wordWrapColumn.
    */
  var lineWrap: off | on | wordWrapColumn | bounded = js.native
  /**
    * Whether to highlight matching brackets when one of them is selected.
    */
  var matchBrackets: Boolean = js.native
  /**
    * Whether the editor is read-only.
    */
  var readOnly: Boolean = js.native
  /**
    * Column index at which rulers should be added.
    */
  var rulers: js.Array[Double] = js.native
  /**
    * The number of spaces a tab is equal to.
    */
  var tabSize: Double = js.native
  /**
    * The column where to break text line.
    */
  var wordWrapColumn: Double = js.native
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
    tabSize: Double,
    wordWrapColumn: Double
  ): IConfig = {
    val __obj = js.Dynamic.literal(autoClosingBrackets = autoClosingBrackets.asInstanceOf[js.Any], codeFolding = codeFolding.asInstanceOf[js.Any], insertSpaces = insertSpaces.asInstanceOf[js.Any], lineNumbers = lineNumbers.asInstanceOf[js.Any], lineWrap = lineWrap.asInstanceOf[js.Any], matchBrackets = matchBrackets.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], rulers = rulers.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any], wordWrapColumn = wordWrapColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
  @scala.inline
  implicit class IConfigOps[Self <: IConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoClosingBrackets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClosingBrackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeFolding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeFolding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertSpaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineWrap(value: off | on | wordWrapColumn | bounded): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchBrackets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchBrackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRulers(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordWrapColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontFamilyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(null)
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSizeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(null)
        ret
    }
    @scala.inline
    def withLineHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineHeightNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(null)
        ret
    }
  }
  
}

