package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExchangeReviewStatus extends js.Object {
  
  /** The exchange reviewing the creative. */
  var exchange: js.UndefOr[String] = js.native
  
  /** Status of the exchange review. */
  var status: js.UndefOr[String] = js.native
}
object ExchangeReviewStatus {
  
  @scala.inline
  def apply(): ExchangeReviewStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExchangeReviewStatus]
  }
  
  @scala.inline
  implicit class ExchangeReviewStatusOps[Self <: ExchangeReviewStatus] (val x: Self) extends AnyVal {
    
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
    def setExchange(value: String): Self = this.set("exchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExchange: Self = this.set("exchange", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
