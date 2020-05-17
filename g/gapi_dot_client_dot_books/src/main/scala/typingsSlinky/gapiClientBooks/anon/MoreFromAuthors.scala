package typingsSlinky.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoreFromAuthors extends js.Object {
  var moreFromAuthors: js.UndefOr[Optedstate] = js.native
  var moreFromSeries: js.UndefOr[Optedstate] = js.native
  var rewardExpirations: js.UndefOr[Optedstate] = js.native
}

object MoreFromAuthors {
  @scala.inline
  def apply(): MoreFromAuthors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoreFromAuthors]
  }
  @scala.inline
  implicit class MoreFromAuthorsOps[Self <: MoreFromAuthors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMoreFromAuthors(value: Optedstate): Self = {
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
    def withMoreFromSeries(value: Optedstate): Self = {
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
    def withRewardExpirations(value: Optedstate): Self = {
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

