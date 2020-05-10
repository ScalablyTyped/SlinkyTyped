package typingsSlinky.node.childProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonSpawnOptions
  extends CommonOptions
     with MessagingOptions {
  var argv0: js.UndefOr[String] = js.native
  var shell: js.UndefOr[Boolean | String] = js.native
  var stdio: js.UndefOr[StdioOptions] = js.native
  var windowsVerbatimArguments: js.UndefOr[Boolean] = js.native
}

object CommonSpawnOptions {
  @scala.inline
  def apply(): CommonSpawnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonSpawnOptions]
  }
  @scala.inline
  implicit class CommonSpawnOptionsOps[Self <: CommonSpawnOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgv0(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argv0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgv0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argv0")(js.undefined)
        ret
    }
    @scala.inline
    def withShell(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shell")(js.undefined)
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

