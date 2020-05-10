package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMatchMyInterests extends js.Object {
  var matchMyInterests: js.UndefOr[AnonOptedstate] = js.native
  var moreFromAuthors: js.UndefOr[AnonOptedstate] = js.native
  var moreFromSeries: js.UndefOr[AnonOptedstate] = js.native
  var priceDrop: js.UndefOr[AnonOptedstate] = js.native
  var rewardExpirations: js.UndefOr[AnonOptedstate] = js.native
}

object AnonMatchMyInterests {
  @scala.inline
  def apply(): AnonMatchMyInterests = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMatchMyInterests]
  }
  @scala.inline
  implicit class AnonMatchMyInterestsOps[Self <: AnonMatchMyInterests] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatchMyInterests(value: AnonOptedstate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchMyInterests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchMyInterests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchMyInterests")(js.undefined)
        ret
    }
    @scala.inline
    def withMoreFromAuthors(value: AnonOptedstate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreFromAuthors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoreFromAuthors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreFromAuthors")(js.undefined)
        ret
    }
    @scala.inline
    def withMoreFromSeries(value: AnonOptedstate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreFromSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoreFromSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreFromSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withPriceDrop(value: AnonOptedstate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriceDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withRewardExpirations(value: AnonOptedstate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewardExpirations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRewardExpirations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewardExpirations")(js.undefined)
        ret
    }
  }
  
}

