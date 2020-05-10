package typingsSlinky.nodePowershell.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShellOptions extends js.Object {
  /**
    * Determines whether to log verbose to the console.
    */
  var debugMsg: js.UndefOr[Boolean] = js.native
  /**
    * Sets the default execution policy for the current shell session
    */
  var executionPolicy: js.UndefOr[String] = js.native
  /**
    * Sets the input encoding for the current shell.
    */
  var inputEncoding: js.UndefOr[String] = js.native
  /**
    * Determines whether to load the Windows PS profile
    */
  var noProfile: js.UndefOr[Boolean] = js.native
  /**
    * Sets the output encoding for the current shell.
    */
  var outputEncoding: js.UndefOr[String] = js.native
  /**
    * Instructs the Shell the use pwsh as the PowerShell runspace
    */
  var pwsh: js.UndefOr[Boolean] = js.native
  /**
    * Instruct the Shell to use pwsh-preview as the PowerShell runspace.
    */
  var pwshPrev: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether to log verbose to the console.
    */
  var verbose: js.UndefOr[Boolean] = js.native
}

object ShellOptions {
  @scala.inline
  def apply(): ShellOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShellOptions]
  }
  @scala.inline
  implicit class ShellOptionsOps[Self <: ShellOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebugMsg(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMsg")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withInputEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withNoProfile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withPwsh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pwsh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPwsh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pwsh")(js.undefined)
        ret
    }
    @scala.inline
    def withPwshPrev(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pwshPrev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPwshPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pwshPrev")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

