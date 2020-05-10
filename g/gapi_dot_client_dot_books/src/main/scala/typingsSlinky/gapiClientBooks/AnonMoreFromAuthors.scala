package typingsSlinky.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMoreFromAuthors extends js.Object {
  var moreFromAuthors: js.UndefOr[AnonOptedstate] = js.native
  var moreFromSeries: js.UndefOr[AnonOptedstate] = js.native
  var rewardExpirations: js.UndefOr[AnonOptedstate] = js.native
}

object AnonMoreFromAuthors {
  @scala.inline
  def apply(): AnonMoreFromAuthors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMoreFromAuthors]
  }
  @scala.inline
  implicit class AnonMoreFromAuthorsOps[Self <: AnonMoreFromAuthors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

