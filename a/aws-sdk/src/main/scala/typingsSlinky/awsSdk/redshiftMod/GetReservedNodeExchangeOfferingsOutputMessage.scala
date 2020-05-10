package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReservedNodeExchangeOfferingsOutputMessage extends js.Object {
  /**
    * An optional parameter that specifies the starting point for returning a set of response records. When the results of a GetReservedNodeExchangeOfferings request exceed the value specified in MaxRecords, Amazon Redshift returns a value in the marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * Returns an array of ReservedNodeOffering objects.
    */
  var ReservedNodeOfferings: js.UndefOr[ReservedNodeOfferingList] = js.native
}

object GetReservedNodeExchangeOfferingsOutputMessage {
  @scala.inline
  def apply(): GetReservedNodeExchangeOfferingsOutputMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReservedNodeExchangeOfferingsOutputMessage]
  }
  @scala.inline
  implicit class GetReservedNodeExchangeOfferingsOutputMessageOps[Self <: GetReservedNodeExchangeOfferingsOutputMessage] (val x: Self) extends AnyVal {
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

