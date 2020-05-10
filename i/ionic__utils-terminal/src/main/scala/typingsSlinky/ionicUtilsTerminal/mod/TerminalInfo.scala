package typingsSlinky.ionicUtilsTerminal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminalInfo extends js.Object {
  /**
    * Whether this is in CI or not.
    */
  val ci: Boolean = js.native
  /**
    * Path to the user's shell program.
    */
  val shell: String = js.native
  /**
    * Whether the terminal is an interactive TTY or not.
    */
  val tty: Boolean = js.native
  /**
    * Whether this is a Windows shell or not.
    */
  val windows: Boolean = js.native
}

object TerminalInfo {
  @scala.inline
  def apply(ci: Boolean, shell: String, tty: Boolean, windows: Boolean): TerminalInfo = {
    val __obj = js.Dynamic.literal(ci = ci.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], tty = tty.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminalInfo]
  }
  @scala.inline
  implicit class TerminalInfoOps[Self <: TerminalInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ci")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

