package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The contentOwnerDetails object encapsulates channel data that is relevant
  * for YouTube Partners linked with the channel.
  */
@js.native
trait SchemaChannelContentOwnerDetails extends js.Object {
  /**
    * The ID of the content owner linked to the channel.
    */
  var contentOwner: js.UndefOr[String] = js.native
  /**
    * The date and time of when the channel was linked to the content owner.
    * The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var timeLinked: js.UndefOr[String] = js.native
}

object SchemaChannelContentOwnerDetails {
  @scala.inline
  def apply(): SchemaChannelContentOwnerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelContentOwnerDetails]
  }
  @scala.inline
  implicit class SchemaChannelContentOwnerDetailsOps[Self <: SchemaChannelContentOwnerDetails] (val x: Self) extends AnyVal {
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

