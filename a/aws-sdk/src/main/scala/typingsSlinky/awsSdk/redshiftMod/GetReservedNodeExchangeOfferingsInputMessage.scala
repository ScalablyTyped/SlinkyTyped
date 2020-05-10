package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReservedNodeExchangeOfferingsInputMessage extends js.Object {
  /**
    * A value that indicates the starting point for the next set of ReservedNodeOfferings.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * An integer setting the maximum number of ReservedNodeOfferings to retrieve.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * A string representing the node identifier for the DC1 Reserved Node to be exchanged.
    */
  var ReservedNodeId: String = js.native
}

object GetReservedNodeExchangeOfferingsInputMessage {
  @scala.inline
  def apply(ReservedNodeId: String): GetReservedNodeExchangeOfferingsInputMessage = {
    val __obj = js.Dynamic.literal(ReservedNodeId = ReservedNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReservedNodeExchangeOfferingsInputMessage]
  }
  @scala.inline
  implicit class GetReservedNodeExchangeOfferingsInputMessageOps[Self <: GetReservedNodeExchangeOfferingsInputMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReservedNodeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedNodeId")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withMaxRecords(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRecords")(js.undefined)
        ret
    }
  }
  
}

