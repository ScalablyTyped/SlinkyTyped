package typingsSlinky.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveAnalyticsRequest extends StObject {
  
  /**
    * Optional. The ID of the Google Analytics property associated with the specified `FirebaseProject`. - If not set, then the Google Analytics property that is currently associated with
    * the specified `FirebaseProject` is removed. - If set, and the specified `FirebaseProject` is currently associated with a *different* Google Analytics property, then the response is
    * a `412 Precondition Failed` error.
    */
  var analyticsPropertyId: js.UndefOr[String] = js.native
}
object RemoveAnalyticsRequest {
  
  @scala.inline
  def apply(): RemoveAnalyticsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveAnalyticsRequest]
  }
  
  @scala.inline
  implicit class RemoveAnalyticsRequestMutableBuilder[Self <: RemoveAnalyticsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyticsPropertyId(value: String): Self = StObject.set(x, "analyticsPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyticsPropertyIdUndefined: Self = StObject.set(x, "analyticsPropertyId", js.undefined)
  }
}
