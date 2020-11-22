package typingsSlinky.awsSdkTypes.responseMod

import typingsSlinky.awsSdkTypes.httpMod.HeaderBag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseMetadata extends js.Object {
  
  /**
    * The number of times this operation was attempted.
    */
  var attempts: js.UndefOr[Double] = js.native
  
  /**
    * A tertiary identifier for the last request sent. Used for debugging.
    */
  var cfId: js.UndefOr[String] = js.native
  
  /**
    * A secondary identifier for the last request sent. Used for debugging.
    */
  var extendedRequestId: js.UndefOr[String] = js.native
  
  /**
    * The headers of the last HTTP response received for this operation.
    */
  var httpHeaders: js.UndefOr[HeaderBag] = js.native
  
  /**
    * The status code of the last HTTP response received for this operation.
    */
  var httpStatusCode: js.UndefOr[Double] = js.native
  
  /**
    * A unique identifier for the last request sent for this operation. Often
    * requested by AWS service teams to aid in debugging.
    */
  var requestId: js.UndefOr[String] = js.native
  
  /**
    * The total amount of time (in milliseconds) that was spent waiting between
    * retry attempts.
    */
  var totalRetryDelay: js.UndefOr[Double] = js.native
}
object ResponseMetadata {
  
  @scala.inline
  def apply(): ResponseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseMetadata]
  }
  
  @scala.inline
  implicit class ResponseMetadataOps[Self <: ResponseMetadata] (val x: Self) extends AnyVal {
    
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
    def setAttempts(value: Double): Self = this.set("attempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttempts: Self = this.set("attempts", js.undefined)
    
    @scala.inline
    def setCfId(value: String): Self = this.set("cfId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCfId: Self = this.set("cfId", js.undefined)
    
    @scala.inline
    def setExtendedRequestId(value: String): Self = this.set("extendedRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtendedRequestId: Self = this.set("extendedRequestId", js.undefined)
    
    @scala.inline
    def setHttpHeaders(value: HeaderBag): Self = this.set("httpHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpHeaders: Self = this.set("httpHeaders", js.undefined)
    
    @scala.inline
    def setHttpStatusCode(value: Double): Self = this.set("httpStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpStatusCode: Self = this.set("httpStatusCode", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
    
    @scala.inline
    def setTotalRetryDelay(value: Double): Self = this.set("totalRetryDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalRetryDelay: Self = this.set("totalRetryDelay", js.undefined)
  }
}
