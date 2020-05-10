package typingsSlinky.jake.mod._Global_.jake

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////////////////////
// Running shell-commands ////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
@js.native
trait ExecOptions extends js.Object {
  /**
  		 * stop execution on error, default true
  		 */
  var breakOnError: js.UndefOr[Boolean] = js.native
  /**
  		 * print to stderr, default false
  		 */
  var printStderr: js.UndefOr[Boolean] = js.native
  /**
  		 * print to stdout, default false
  		 */
  var printStdout: js.UndefOr[Boolean] = js.native
  /**
  		*
  		*/
  var windowsVerbatimArguments: js.UndefOr[Boolean] = js.native
}

object ExecOptions {
  @scala.inline
  def apply(): ExecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecOptions]
  }
  @scala.inline
  implicit class ExecOptionsOps[Self <: ExecOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintStderr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printStderr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintStderr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printStderr")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintStdout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printStdout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintStdout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printStdout")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsVerbatimArguments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsVerbatimArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsVerbatimArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsVerbatimArguments")(js.undefined)
        ret
    }
  }
  
}

