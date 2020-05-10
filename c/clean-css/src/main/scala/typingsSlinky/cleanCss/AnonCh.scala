package typingsSlinky.cleanCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCh extends js.Object {
  /**
    * Controls treating `ch` as a supported unit; defaults to `true`
    */
  var ch: js.UndefOr[Boolean] = js.native
  /**
    * Controls treating `in` as a supported unit; defaults to `true`
    */
  var in: js.UndefOr[Boolean] = js.native
  /**
    * Controls treating `pc` as a supported unit; defaults to `true`
    */
  var pc: js.UndefOr[Boolean] = js.native
  /**
    * Controls treating `pt` as a supported unit; defaults to `true`
    */
  var pt: js.UndefOr[Boolean] = js.native
  /**
    * Controls treating `rem` as a supported unit; defaults to `true`
    */
  var rem: js.UndefOr[Boolean] = js.native
  /**
    * Controls treating `vh` as a supported unit; defaults to `true`
    */
  var vh: js.UndefOr[Boolean] = js.native
  /**
    * Controls treating `vm` as a supported unit; defaults to `true`
    */
  var vm: js.UndefOr[Boolean] = js.native
  /**
    * Controls treating `vmax` as a supported unit; defaults to `true`
    */
  var vmax: js.UndefOr[Boolean] = js.native
  /**
    * Controls treating `vmin` as a supported unit; defaults to `true`
    */
  var vmin: js.UndefOr[Boolean] = js.native
}

object AnonCh {
  @scala.inline
  def apply(): AnonCh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCh]
  }
  @scala.inline
  implicit class AnonChOps[Self <: AnonCh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ch")(js.undefined)
        ret
    }
    @scala.inline
    def withIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(js.undefined)
        ret
    }
    @scala.inline
    def withPc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pc")(js.undefined)
        ret
    }
    @scala.inline
    def withPt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pt")(js.undefined)
        ret
    }
    @scala.inline
    def withRem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rem")(js.undefined)
        ret
    }
    @scala.inline
    def withVh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vh")(js.undefined)
        ret
    }
    @scala.inline
    def withVm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vm")(js.undefined)
        ret
    }
    @scala.inline
    def withVmax(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmax")(js.undefined)
        ret
    }
    @scala.inline
    def withVmin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmin")(js.undefined)
        ret
    }
  }
  
}

