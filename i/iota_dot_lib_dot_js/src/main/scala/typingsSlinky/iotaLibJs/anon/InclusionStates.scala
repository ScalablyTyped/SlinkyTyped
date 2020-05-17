package typingsSlinky.iotaLibJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InclusionStates extends js.Object {
  var end: js.UndefOr[Double] = js.native
  var inclusionStates: js.UndefOr[Boolean] = js.native
  var security: js.UndefOr[typingsSlinky.iotaLibJs.mod.Security] = js.native
  var start: js.UndefOr[Double] = js.native
}

object InclusionStates {
  @scala.inline
  def apply(): InclusionStates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InclusionStates]
  }
  @scala.inline
  implicit class InclusionStatesOps[Self <: InclusionStates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withInclusionStates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusionStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclusionStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusionStates")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurity(value: typingsSlinky.iotaLibJs.mod.Security): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

