package typingsSlinky.maximMazurokGapiClientAnalytics.anon

import typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics.EntityAdWordsLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserIpWebPropertyAdWordsLinkId extends StObject {
  
  /** ID of the account which the given web property belongs to. */
  var accountId: String = js.native
  
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** Request body */
  var resource: EntityAdWordsLink = js.native
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.native
  
  /** Web property-Google Ads link ID. */
  var webPropertyAdWordsLinkId: String = js.native
  
  /** Web property ID to retrieve the Google Ads link for. */
  var webPropertyId: String = js.native
}
object UserIpWebPropertyAdWordsLinkId {
  
  @scala.inline
  def apply(
    accountId: String,
    resource: EntityAdWordsLink,
    webPropertyAdWordsLinkId: String,
    webPropertyId: String
  ): UserIpWebPropertyAdWordsLinkId = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], webPropertyAdWordsLinkId = webPropertyAdWordsLinkId.asInstanceOf[js.Any], webPropertyId = webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIpWebPropertyAdWordsLinkId]
  }
  
  @scala.inline
  implicit class UserIpWebPropertyAdWordsLinkIdMutableBuilder[Self <: UserIpWebPropertyAdWordsLinkId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    @scala.inline
    def setResource(value: EntityAdWordsLink): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
    
    @scala.inline
    def setWebPropertyAdWordsLinkId(value: String): Self = StObject.set(x, "webPropertyAdWordsLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
  }
}
