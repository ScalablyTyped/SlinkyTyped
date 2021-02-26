package typingsSlinky.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAccountSettingsRequest extends StObject {
  
  /**
    * Specifies whether to return the effective settings. If true, the account settings for the root user or the default setting for the principalArn are returned. If false, the account settings for the principalArn are returned if they are set. Otherwise, no account settings are returned.
    */
  var effectiveSettings: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of account setting results returned by ListAccountSettings in paginated output. When this parameter is used, ListAccountSettings only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListAccountSettings request with the returned nextToken value. This value can be between 1 and 10. If this parameter is not used, then ListAccountSettings returns up to 10 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  
  /**
    * The name of the account setting you want to list the settings for.
    */
  var name: js.UndefOr[SettingName] = js.native
  
  /**
    * The nextToken value returned from a ListAccountSettings request indicating that more results are available to fulfill the request and further calls will be needed. If maxResults was provided, it is possible the number of results to be fewer than maxResults.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The ARN of the principal, which can be an IAM user, IAM role, or the root user. If this field is omitted, the account settings are listed only for the authenticated user.
    */
  var principalArn: js.UndefOr[String] = js.native
  
  /**
    * The value of the account settings with which to filter results. You must also specify an account setting name to use this parameter.
    */
  var value: js.UndefOr[String] = js.native
}
object ListAccountSettingsRequest {
  
  @scala.inline
  def apply(): ListAccountSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountSettingsRequest]
  }
  
  @scala.inline
  implicit class ListAccountSettingsRequestMutableBuilder[Self <: ListAccountSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffectiveSettings(value: Boolean): Self = StObject.set(x, "effectiveSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveSettingsUndefined: Self = StObject.set(x, "effectiveSettings", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setName(value: SettingName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setPrincipalArn(value: String): Self = StObject.set(x, "principalArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalArnUndefined: Self = StObject.set(x, "principalArn", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
