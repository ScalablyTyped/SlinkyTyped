package typingsSlinky.node.childProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForkOptions
  extends ProcessEnvOptions
     with MessagingOptions {
  var detached: js.UndefOr[Boolean] = js.native
  var execArgv: js.UndefOr[js.Array[String]] = js.native
  var execPath: js.UndefOr[String] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var stdio: js.UndefOr[StdioOptions] = js.native
  var windowsVerbatimArguments: js.UndefOr[Boolean] = js.native
}

object ForkOptions {
  @scala.inline
  def apply(): ForkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForkOptions]
  }
  @scala.inline
  implicit class ForkOptionsOps[Self <: ForkOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetached(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(js.undefined)
        ret
    }
    @scala.inline
    def withExecArgv(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execArgv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecArgv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execArgv")(js.undefined)
        ret
    }
    @scala.inline
    def withExecPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execPath")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withStdio(value: StdioOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdio")(js.undefined)
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

