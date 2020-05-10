package typingsSlinky.jupyterlabCells

import typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.bounded
import typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.off
import typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.on
import typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.wordWrapColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jupyterlab/codeeditor.@jupyterlab/codeeditor.CodeEditor.IConfig> */
@js.native
trait PartialIConfig extends js.Object {
  var autoClosingBrackets: js.UndefOr[Boolean] = js.native
  var codeFolding: js.UndefOr[Boolean] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var insertSpaces: js.UndefOr[Boolean] = js.native
  var lineHeight: js.UndefOr[Double] = js.native
  var lineNumbers: js.UndefOr[Boolean] = js.native
  var lineWrap: js.UndefOr[off | on | wordWrapColumn | bounded] = js.native
  var matchBrackets: js.UndefOr[Boolean] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var rulers: js.UndefOr[js.Array[Double]] = js.native
  var tabSize: js.UndefOr[Double] = js.native
  var wordWrapColumn: js.UndefOr[Double] = js.native
}

object PartialIConfig {
  @scala.inline
  def apply(): PartialIConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIConfig]
  }
  @scala.inline
  implicit class PartialIConfigOps[Self <: PartialIConfig] (val x: Self) extends AnyVal {
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
    def withoutAutoClosingBrackets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClosingBrackets")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeFolding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeFolding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeFolding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeFolding")(js.undefined)
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
    def withInsertSpaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSpaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaces")(js.undefined)
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
    def withLineWrap(value: off | on | wordWrapColumn | bounded): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWrap")(js.undefined)
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
  }
  
}

