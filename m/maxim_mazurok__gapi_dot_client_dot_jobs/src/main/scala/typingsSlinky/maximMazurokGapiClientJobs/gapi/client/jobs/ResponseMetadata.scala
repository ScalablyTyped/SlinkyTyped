package typingsSlinky.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseMetadata extends StObject {
  
  /** A unique id associated with this call. This id is logged for tracking purposes. */
  var requestId: js.UndefOr[String] = js.native
}
object ResponseMetadata {
  
  @scala.inline
  def apply(): ResponseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseMetadata]
  }
  
  @scala.inline
  implicit class ResponseMetadataMutableBuilder[Self <: ResponseMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
