package typingsSlinky.googleapis.androidpublisherV3Mod.androidpublisherV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourcePurchasesVoidedpurchasesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The time, in milliseconds since the Epoch, of the newest voided in-app
    * product purchase that you want to see in the response. The value of this
    * parameter cannot be greater than the current time and is ignored if a
    * pagination token is set. Default value is current time. Note: This filter
    * is applied on the time at which the record is seen as voided by our
    * systems and not the actual voided time returned in the response.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    *
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * The package name of the application for which voided purchases need to be
    * returned (for example, 'com.some.thing').
    */
  var packageName: js.UndefOr[String] = js.native
  
  /**
    *
    */
  var startIndex: js.UndefOr[Double] = js.native
  
  /**
    * The time, in milliseconds since the Epoch, of the oldest voided in-app
    * product purchase that you want to see in the response. The value of this
    * parameter cannot be older than 30 days and is ignored if a pagination
    * token is set. Default value is current time minus 30 days. Note: This
    * filter is applied on the time at which the record is seen as voided by
    * our systems and not the actual voided time returned in the response.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    *
    */
  var token: js.UndefOr[String] = js.native
}
object ParamsResourcePurchasesVoidedpurchasesList {
  
  @scala.inline
  def apply(): ParamsResourcePurchasesVoidedpurchasesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePurchasesVoidedpurchasesList]
  }
  
  @scala.inline
  implicit class ParamsResourcePurchasesVoidedpurchasesListMutableBuilder[Self <: ParamsResourcePurchasesVoidedpurchasesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
