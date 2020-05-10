package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description-tagged IP ranges for the router to advertise.
  */
@js.native
trait SchemaRouterAdvertisedIpRange extends js.Object {
  /**
    * User-specified description for the IP range.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The IP range to advertise. The value must be a CIDR-formatted string.
    */
  var range: js.UndefOr[String] = js.native
}

object SchemaRouterAdvertisedIpRange {
  @scala.inline
  def apply(): SchemaRouterAdvertisedIpRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterAdvertisedIpRange]
  }
  @scala.inline
  implicit class SchemaRouterAdvertisedIpRangeOps[Self <: SchemaRouterAdvertisedIpRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
  }
  
}

