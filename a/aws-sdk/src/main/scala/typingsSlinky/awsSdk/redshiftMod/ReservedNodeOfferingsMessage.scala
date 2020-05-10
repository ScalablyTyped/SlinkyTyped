package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedNodeOfferingsMessage extends js.Object {
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A list of ReservedNodeOffering objects.
    */
  var ReservedNodeOfferings: js.UndefOr[ReservedNodeOfferingList] = js.native
}

object ReservedNodeOfferingsMessage {
  @scala.inline
  def apply(): ReservedNodeOfferingsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedNodeOfferingsMessage]
  }
  @scala.inline
  implicit class ReservedNodeOfferingsMessageOps[Self <: ReservedNodeOfferingsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedNodeOfferings(value: ReservedNodeOfferingList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedNodeOfferings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedNodeOfferings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedNodeOfferings")(js.undefined)
        ret
    }
  }
  
}

