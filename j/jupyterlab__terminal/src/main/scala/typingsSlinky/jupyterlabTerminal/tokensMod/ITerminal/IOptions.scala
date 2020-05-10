package typingsSlinky.jupyterlabTerminal.tokensMod.ITerminal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the terminal widget.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * Whether to blink the cursor.  Can only be set at startup.
    */
  var cursorBlink: Boolean = js.native
  /**
    * The font family used to render text.
    */
  var fontFamily: String | Null = js.native
  /**
    * The font size of the terminal in pixels.
    */
  var fontSize: Double = js.native
  /**
    * An optional command to run when the session starts.
    */
  var initialCommand: String = js.native
  /**
    * The line height used to render text.
    */
  var lineHeight: Double | Null = js.native
  /**
    * Whether to enable using Ctrl+V to paste.
    *
    * This setting has no effect on macOS, where Cmd+V is available.
    */
  var pasteWithCtrlV: Boolean = js.native
  /**
    * Whether to enable screen reader support.
    */
  var screenReaderMode: Boolean = js.native
  /**
    * The amount of buffer scrollback to be used
    * with the terminal
    */
  var scrollback: Double | Null = js.native
  /**
    * Whether to shut down the session when closing a terminal or not.
    */
  var shutdownOnClose: Boolean = js.native
  /**
    * The theme of the terminal.
    */
  var theme: Theme = js.native
}

object IOptions {
  @scala.inline
  def apply(
    cursorBlink: Boolean,
    fontSize: Double,
    initialCommand: String,
    pasteWithCtrlV: Boolean,
    screenReaderMode: Boolean,
    shutdownOnClose: Boolean,
    theme: Theme
  ): IOptions = {
    val __obj = js.Dynamic.literal(cursorBlink = cursorBlink.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], initialCommand = initialCommand.asInstanceOf[js.Any], pasteWithCtrlV = pasteWithCtrlV.asInstanceOf[js.Any], screenReaderMode = screenReaderMode.asInstanceOf[js.Any], shutdownOnClose = shutdownOnClose.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
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
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPasteWithCtrlV(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteWithCtrlV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenReaderMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShutdownOnClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdownOnClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheme(value: Theme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withScrollback(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbackNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollback")(null)
        ret
    }
  }
  
}

