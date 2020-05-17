package typingsSlinky.jupyterlabTerminalExtension.anon

import typingsSlinky.jupyterlabTerminal.tokensMod.ITerminal.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jupyterlab/terminal.@jupyterlab/terminal.ITerminal.IOptions> */
@js.native
trait PartialIOptions extends js.Object {
  var cursorBlink: js.UndefOr[Boolean] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var initialCommand: js.UndefOr[String] = js.native
  var lineHeight: js.UndefOr[Double] = js.native
  var pasteWithCtrlV: js.UndefOr[Boolean] = js.native
  var screenReaderMode: js.UndefOr[Boolean] = js.native
  var scrollback: js.UndefOr[Double] = js.native
  var shutdownOnClose: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[Theme] = js.native
}

object PartialIOptions {
  @scala.inline
  def apply(): PartialIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIOptions]
  }
  @scala.inline
  implicit class PartialIOptionsOps[Self <: PartialIOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCursorBlink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorBlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorBlink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorBlink")(js.undefined)
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
    def withInitialCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialCommand")(js.undefined)
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
    def withPasteWithCtrlV(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteWithCtrlV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasteWithCtrlV: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteWithCtrlV")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenReaderMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenReaderMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderMode")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollback(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollback")(js.undefined)
        ret
    }
    @scala.inline
    def withShutdownOnClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdownOnClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShutdownOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdownOnClose")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: Theme): Self = {
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

