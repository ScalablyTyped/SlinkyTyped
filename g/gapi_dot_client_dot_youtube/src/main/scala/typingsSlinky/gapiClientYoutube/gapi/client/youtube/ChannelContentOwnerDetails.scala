package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelContentOwnerDetails extends js.Object {
  /** The ID of the content owner linked to the channel. */
  var contentOwner: js.UndefOr[String] = js.native
  /** The date and time of when the channel was linked to the content owner. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var timeLinked: js.UndefOr[String] = js.native
}

object ChannelContentOwnerDetails {
  @scala.inline
  def apply(): ChannelContentOwnerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelContentOwnerDetails]
  }
  @scala.inline
  implicit class ChannelContentOwnerDetailsOps[Self <: ChannelContentOwnerDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentOwner")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeLinked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLinked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeLinked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLinked")(js.undefined)
        ret
    }
  }
  
}

