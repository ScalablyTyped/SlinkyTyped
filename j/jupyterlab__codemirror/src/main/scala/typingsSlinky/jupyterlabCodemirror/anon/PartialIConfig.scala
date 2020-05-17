package typingsSlinky.jupyterlabCodemirror.anon

import typingsSlinky.codemirror.mod.StyleActiveLine
import typingsSlinky.jupyterlabCodemirror.jupyterlabCodemirrorStrings.bounded
import typingsSlinky.jupyterlabCodemirror.jupyterlabCodemirrorStrings.off
import typingsSlinky.jupyterlabCodemirror.jupyterlabCodemirrorStrings.on
import typingsSlinky.jupyterlabCodemirror.jupyterlabCodemirrorStrings.wordWrapColumn
import typingsSlinky.jupyterlabCodemirror.modeMod.Mode.IMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jupyterlab/codemirror.@jupyterlab/codemirror/lib/editor.CodeMirrorEditor.IConfig> */
@js.native
trait PartialIConfig extends js.Object {
  var autoClosingBrackets: js.UndefOr[Boolean] = js.native
  var codeFolding: js.UndefOr[Boolean] = js.native
  var coverGutterNextToScrollbar: js.UndefOr[Boolean] = js.native
  var dragDrop: js.UndefOr[Boolean] = js.native
  var electricChars: js.UndefOr[Boolean] = js.native
  var extraKeys: js.UndefOr[js.Any] = js.native
  var fixedGutter: js.UndefOr[Boolean] = js.native
  var foldGutter: js.UndefOr[Boolean] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var gutters: js.UndefOr[js.Array[String]] = js.native
  var insertSpaces: js.UndefOr[Boolean] = js.native
  var keyMap: js.UndefOr[String] = js.native
  var lineHeight: js.UndefOr[Double] = js.native
  var lineNumbers: js.UndefOr[Boolean] = js.native
  var lineSeparator: js.UndefOr[String] = js.native
  var lineWiseCopyCut: js.UndefOr[Boolean] = js.native
  var lineWrap: js.UndefOr[off | on | wordWrapColumn | bounded] = js.native
  var matchBrackets: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[String | IMode] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var rulers: js.UndefOr[js.Array[Double]] = js.native
  var scrollPastEnd: js.UndefOr[Boolean] = js.native
  var scrollbarStyle: js.UndefOr[String] = js.native
  var selectionPointer: js.UndefOr[Boolean | String] = js.native
  var showCursorWhenSelecting: js.UndefOr[Boolean] = js.native
  var smartIndent: js.UndefOr[Boolean] = js.native
  var styleActiveLine: js.UndefOr[Boolean | StyleActiveLine] = js.native
  var styleSelectedText: js.UndefOr[Boolean] = js.native
  var tabSize: js.UndefOr[Double] = js.native
  var theme: js.UndefOr[String] = js.native
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
    def withSelectionPointer(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionPointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionPointer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionPointer")(js.undefined)
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
    def withStyleActiveLine(value: Boolean | StyleActiveLine): Self = {
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
    def withStyleSelectedText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleSelectedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleSelectedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleSelectedText")(js.undefined)
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

