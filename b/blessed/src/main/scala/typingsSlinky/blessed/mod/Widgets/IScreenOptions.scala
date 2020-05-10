package typingsSlinky.blessed.mod.Widgets

import typingsSlinky.blessed.mod.BlessedProgram
import typingsSlinky.blessed.mod.Widgets.Types.TCursor
import typingsSlinky.blessed.mod.Widgets.Types.TPosition
import typingsSlinky.blessed.mod.Widgets.Types.TTopLeft
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScreenOptions extends INodeOptions {
  /**
    * Absolute bottom offset, always zero.
    */
  var abottom: js.UndefOr[TPosition] = js.native
  /**
    * Absolute left offset, always zero.
    */
  var aleft: js.UndefOr[TTopLeft] = js.native
  /**
    * Absolute right offset, always zero.
    */
  var aright: js.UndefOr[TPosition] = js.native
  /**
    * Absolute top offset, always zero.
    */
  var atop: js.UndefOr[TTopLeft] = js.native
  /**
    * Automatically position child elements with border and padding in mind (NOTE: this is a recommended
    * option. It may become default in the future).
    */
  var autoPadding: js.UndefOr[Boolean] = js.native
  /**
    * Relative bottom offset, always zero.
    */
  var bottom: js.UndefOr[TPosition] = js.native
  /**
    * Same as screen.width.
    */
  var cols: js.UndefOr[Double] = js.native
  var cursor: js.UndefOr[TCursor] = js.native
  /**
    * Debug mode. Enables usage of the debug method. Also creates a debug console which will display when
    * pressing F12. It will display all log and debug messages.
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Automatically "dock" borders with other elements instead of overlapping, depending on position
    * (experimental). For example: These border-overlapped elements:
    */
  var dockBorders: js.UndefOr[Boolean] = js.native
  /**
    * Dump all output and input to desired file. Can be used together with log option if set as a boolean.
    */
  var dump: js.UndefOr[String | Boolean] = js.native
  /**
    * Do CSR on any element within 20 cols of the screen edge on either side. Faster than smartCSR,
    * but may cause flickering depending on what is on each side of the element.
    */
  var fastCSR: js.UndefOr[Boolean] = js.native
  /**
    * Top of the focus history stack.
    */
  var focused: js.UndefOr[BlessedElement] = js.native
  /**
    * Force blessed to use unicode even if it is not detected via terminfo, env variables, or windows code page.
    * If value is true unicode is forced. If value is false non-unicode is forced (default: null).
    */
  var forceUnicode: js.UndefOr[Boolean] = js.native
  /**
    * Allow for rendering of East Asian double-width characters, utf-16 surrogate pairs, and unicode
    * combining characters. This allows you to display text above the basic multilingual plane. This
    * is behind an option because it may affect performance slightly negatively. Without this option
    * enabled, all double-width, surrogate pair, and combining characters will be replaced by '??',
    * '?', '' respectively. (NOTE: iTerm2 cannot display combining characters properly. Blessed simply
    * removes them from an element's content if iTerm2 is detected).
    */
  var fullUnicode: js.UndefOr[Boolean] = js.native
  /**
    * Whether the focused element grabs all keypresses.
    */
  var grabKeys: js.UndefOr[Boolean] = js.native
  /**
    * Height of the screen (same as program.rows).
    */
  var height: js.UndefOr[TPosition] = js.native
  /**
    * The currently hovered element. Only set if mouse events are bound.
    */
  var hover: js.UndefOr[js.Any] = js.native
  /**
    * Normally, dockable borders will not dock if the colors or attributes are different. This option
    * will allow them to dock regardless. It may produce some odd looking multi-colored borders though.
    */
  var ignoreDockContrast: js.UndefOr[Boolean] = js.native
  /**
    * Array of keys in their full format (e.g. C-c) to ignore when keys are locked or grabbed. Useful
    * for creating a key that will always exit no matter whether the keys are locked.
    */
  var ignoreLocked: js.UndefOr[js.Array[String]] = js.native
  /**
    * Input and output streams. process.stdin/process.stdout by default, however, it could be a
    * net.Socket if you want to make a program that runs over telnet or something of that nature.
    */
  var input: js.UndefOr[Writable] = js.native
  /**
    * Relative left offset, always zero.
    */
  var left: js.UndefOr[TTopLeft] = js.native
  /**
    * Prevent keypresses from being received by any element.
    */
  var lockKeys: js.UndefOr[Boolean] = js.native
  /**
    * Create a log file. See log method.
    */
  var log: js.UndefOr[String] = js.native
  /**
    * Input and output streams. process.stdin/process.stdout by default, however, it could be a
    * net.Socket if you want to make a program that runs over telnet or something of that nature.
    */
  var output: js.UndefOr[Readable] = js.native
  /**
    * The blessed Program to be associated with. Will be automatically instantiated if none is provided.
    */
  var program: js.UndefOr[BlessedProgram] = js.native
  /**
    * Amount of time (in ms) to redraw the screen after the terminal is resized (Default: 300).
    */
  var resizeTimeout: js.UndefOr[Double] = js.native
  /**
    * Relative right offset, always zero.
    */
  var right: js.UndefOr[TPosition] = js.native
  /**
    * Same as screen.height.
    */
  var rows: js.UndefOr[Double] = js.native
  /**
    * Send focus events after mouse is enabled.
    */
  var sendFocus: js.UndefOr[Boolean] = js.native
  /**
    * Attempt to perform CSR optimization on all possible elements (not just full-width ones, elements with
    * uniform cells to their sides). This is known to cause flickering with elements that are not full-width,
    * however, it is more optimal for terminal rendering.
    */
  var smartCSR: js.UndefOr[Boolean] = js.native
  /**
    * The width of tabs within an element's content.
    */
  var tabSize: js.UndefOr[Double] = js.native
  /**
    * Set or get terminal name. Set calls screen.setTerminal() internally.
    */
  var terminal: js.UndefOr[String] = js.native
  /**
    * Set or get window title.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Relative top offset, always zero.
    */
  var top: js.UndefOr[TTopLeft] = js.native
  /**
    * The blessed Tput object (only available if you passed tput: true to the Program constructor.)
    */
  var tput: js.UndefOr[Tput] = js.native
  /**
    * Attempt to perform back_color_erase optimizations for terminals that support it. It will also work
    * with terminals that don't support it, but only on lines with the default background color. As it
    * stands with the current implementation, it's uncertain how much terminal performance this adds at
    * the cost of overhead within node.
    */
  var useBCE: js.UndefOr[Boolean] = js.native
  /**
    * Display warnings (such as the output not being a TTY, similar to ncurses).
    */
  var warnings: js.UndefOr[Boolean] = js.native
  /**
    * Width of the screen (same as program.cols).
    */
  var width: js.UndefOr[TPosition] = js.native
}

object IScreenOptions {
  @scala.inline
  def apply(): IScreenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScreenOptions]
  }
  @scala.inline
  implicit class IScreenOptionsOps[Self <: IScreenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbottom(value: TPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abottom")(js.undefined)
        ret
    }
    @scala.inline
    def withAleft(value: TTopLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aleft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAleft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aleft")(js.undefined)
        ret
    }
    @scala.inline
    def withAright(value: TPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aright")(js.undefined)
        ret
    }
    @scala.inline
    def withAtop(value: TTopLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atop")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPadding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withBottom(value: TPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: TCursor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDockBorders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockBorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDockBorders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockBorders")(js.undefined)
        ret
    }
    @scala.inline
    def withDump(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dump")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDump: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dump")(js.undefined)
        ret
    }
    @scala.inline
    def withFastCSR(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastCSR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFastCSR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastCSR")(js.undefined)
        ret
    }
    @scala.inline
    def withFocused(value: BlessedElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(js.undefined)
        ret
    }
    @scala.inline
    def withForceUnicode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceUnicode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceUnicode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceUnicode")(js.undefined)
        ret
    }
    @scala.inline
    def withFullUnicode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullUnicode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullUnicode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullUnicode")(js.undefined)
        ret
    }
    @scala.inline
    def withGrabKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grabKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrabKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grabKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: TPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHover(value: js.Any): Self = {
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
    def withIgnoreDockContrast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDockContrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDockContrast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDockContrast")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreLocked(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreLocked")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: Writable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: TTopLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withLockKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: Readable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withProgram(value: BlessedProgram): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgram: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: TPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withSendFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withSmartCSR(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartCSR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmartCSR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartCSR")(js.undefined)
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
    def withTerminal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminal")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: TTopLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withTput(value: Tput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tput")(js.undefined)
        ret
    }
    @scala.inline
    def withUseBCE(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBCE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseBCE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBCE")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: TPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

