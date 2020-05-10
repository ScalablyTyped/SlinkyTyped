package typingsSlinky.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TputsOptions extends IOptions {
  var debug: js.UndefOr[Boolean] = js.native
  var extended: js.UndefOr[Boolean] = js.native
  var termcap: js.UndefOr[String] = js.native
  var termcapFile: js.UndefOr[String] = js.native
  var terminal: js.UndefOr[String] = js.native
  var terminfoFile: js.UndefOr[String] = js.native
  var terminfoPrefix: js.UndefOr[String] = js.native
}

object TputsOptions {
  @scala.inline
  def apply(): TputsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TputsOptions]
  }
  @scala.inline
  implicit class TputsOptionsOps[Self <: TputsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withExtended(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtended: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extended")(js.undefined)
        ret
    }
    @scala.inline
    def withTermcap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termcap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTermcap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termcap")(js.undefined)
        ret
    }
    @scala.inline
    def withTermcapFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termcapFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTermcapFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termcapFile")(js.undefined)
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
    def withTerminfoFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminfoFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminfoFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminfoFile")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminfoPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminfoPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminfoPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminfoPrefix")(js.undefined)
        ret
    }
  }
  
}

