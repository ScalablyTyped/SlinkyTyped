package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShipmentTrackingInfo extends js.Object {
  
  /**
    * The shipping carrier that handles the package. Acceptable values are: - "`boxtal`" - "`bpost`" - "`chronopost`" - "`colisPrive`" - "`colissimo`" - "`cxt`" - "`deliv`" - "`dhl`" -
    * "`dpd`" - "`dynamex`" - "`eCourier`" - "`easypost`" - "`efw`" - "`fedex`" - "`fedexSmartpost`" - "`geodis`" - "`gls`" - "`googleCourier`" - "`gsx`" - "`jdLogistics`" - "`laPoste`" -
    * "`lasership`" - "`manual`" - "`mpx`" - "`onTrac`" - "`other`" - "`tnt`" - "`uds`" - "`ups`" - "`usps`"
    */
  var carrier: js.UndefOr[String] = js.native
  
  /** The tracking number for the package. */
  var trackingNumber: js.UndefOr[String] = js.native
}
object ShipmentTrackingInfo {
  
  @scala.inline
  def apply(): ShipmentTrackingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShipmentTrackingInfo]
  }
  
  @scala.inline
  implicit class ShipmentTrackingInfoOps[Self <: ShipmentTrackingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCarrier(value: String): Self = this.set("carrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrier: Self = this.set("carrier", js.undefined)
    
    @scala.inline
    def setTrackingNumber(value: String): Self = this.set("trackingNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackingNumber: Self = this.set("trackingNumber", js.undefined)
  }
}
