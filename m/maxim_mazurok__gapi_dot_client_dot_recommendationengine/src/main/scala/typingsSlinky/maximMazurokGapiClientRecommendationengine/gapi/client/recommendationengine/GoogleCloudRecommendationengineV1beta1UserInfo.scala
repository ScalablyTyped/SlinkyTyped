package typingsSlinky.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1UserInfo extends StObject {
  
  /**
    * Optional. Indicates if the request is made directly from the end user in which case the user_agent and ip_address fields can be populated from the HTTP request. This should *not* be
    * set when using the javascript pixel. This flag should be set only if the API request is made directly from the end user such as a mobile app (and not if a gateway or a server is
    * processing and pushing the user events).
    */
  var directUserRequest: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. IP address of the user. This could be either IPv4 (e.g. 104.133.9.80) or IPv6 (e.g. 2001:0db8:85a3:0000:0000:8a2e:0370:7334). This should *not* be set when using the
    * javascript pixel or if `direct_user_request` is set. Used to extract location information for personalization.
    */
  var ipAddress: js.UndefOr[String] = js.native
  
  /**
    * Optional. User agent as included in the HTTP header. UTF-8 encoded string with a length limit of 1 KiB. This should *not* be set when using the JavaScript pixel or if
    * `directUserRequest` is set.
    */
  var userAgent: js.UndefOr[String] = js.native
  
  /** Optional. Unique identifier for logged-in user with a length limit of 128 bytes. Required only for logged-in users. */
  var userId: js.UndefOr[String] = js.native
  
  /**
    * Required. A unique identifier for tracking visitors with a length limit of 128 bytes. For example, this could be implemented with a http cookie, which should be able to uniquely
    * identify a visitor on a single device. This unique identifier should not change if the visitor log in/out of the website. Maximum length 128 bytes. Cannot be empty.
    */
  var visitorId: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1UserInfo {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1UserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1UserInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1UserInfoMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1UserInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectUserRequest(value: Boolean): Self = StObject.set(x, "directUserRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectUserRequestUndefined: Self = StObject.set(x, "directUserRequest", js.undefined)
    
    @scala.inline
    def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    @scala.inline
    def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
  }
}
