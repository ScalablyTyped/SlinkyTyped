package typingsSlinky.maximMazurokGapiClientAdsensehost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallbackUrl extends StObject {
  
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  
  /** The URL to redirect the user to once association is completed. It receives a token parameter that can then be used to retrieve the associated account. */
  var callbackUrl: js.UndefOr[String] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** Products to associate with the user. */
  var productCode: String | js.Array[String] = js.native
  
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.native
  
  /** The preferred locale of the user. */
  var userLocale: js.UndefOr[String] = js.native
  
  /** The locale of the user's hosted website. */
  var websiteLocale: js.UndefOr[String] = js.native
  
  /** The URL of the user's hosted website. */
  var websiteUrl: String = js.native
}
object CallbackUrl {
  
  @scala.inline
  def apply(productCode: String | js.Array[String], websiteUrl: String): CallbackUrl = {
    val __obj = js.Dynamic.literal(productCode = productCode.asInstanceOf[js.Any], websiteUrl = websiteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackUrl]
  }
  
  @scala.inline
  implicit class CallbackUrlMutableBuilder[Self <: CallbackUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
    
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
    def setProductCode(value: String | js.Array[String]): Self = StObject.set(x, "productCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductCodeVarargs(value: String*): Self = StObject.set(x, "productCode", js.Array(value :_*))
    
    @scala.inline
    def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    @scala.inline
    def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
    
    @scala.inline
    def setUserLocale(value: String): Self = StObject.set(x, "userLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserLocaleUndefined: Self = StObject.set(x, "userLocale", js.undefined)
    
    @scala.inline
    def setWebsiteLocale(value: String): Self = StObject.set(x, "websiteLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteLocaleUndefined: Self = StObject.set(x, "websiteLocale", js.undefined)
    
    @scala.inline
    def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
  }
}
