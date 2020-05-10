package typingsSlinky.node.childProcessMod

import typingsSlinky.node.NodeJS.Signals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecFileOptions extends CommonOptions {
  var killSignal: js.UndefOr[Signals | Double] = js.native
  var maxBuffer: js.UndefOr[Double] = js.native
  var shell: js.UndefOr[Boolean | String] = js.native
  var windowsVerbatimArguments: js.UndefOr[Boolean] = js.native
}

object ExecFileOptions {
  @scala.inline
  def apply(): ExecFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecFileOptions]
  }
  @scala.inline
  implicit class ExecFileOptionsOps[Self <: ExecFileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKillSignal(value: Signals | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killSignal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKillSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killSignal")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBuffer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBuffer")(js.undefined)
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

