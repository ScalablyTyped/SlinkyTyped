package typingsSlinky.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReelMediaViewerFeedResponseDonations extends js.Object {
  var donations: js.Array[_] = js.native
  var max_id: Null = js.native
  var more_available: Boolean = js.native
}

object ListReelMediaViewerFeedResponseDonations {
  @scala.inline
  def apply(donations: js.Array[_], max_id: Null, more_available: Boolean): ListReelMediaViewerFeedResponseDonations = {
    val __obj = js.Dynamic.literal(donations = donations.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseDonations]
  }
  @scala.inline
  implicit class ListReelMediaViewerFeedResponseDonationsOps[Self <: ListReelMediaViewerFeedResponseDonations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDonations(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_id(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMore_available(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("more_available")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

