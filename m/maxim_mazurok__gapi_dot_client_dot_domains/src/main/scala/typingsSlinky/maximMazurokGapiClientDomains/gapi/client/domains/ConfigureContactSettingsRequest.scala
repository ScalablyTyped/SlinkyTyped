package typingsSlinky.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigureContactSettingsRequest extends StObject {
  
  /** The list of contact notices that the caller acknowledges. The notices required here depend on the values specified in `contact_settings`. */
  var contactNotices: js.UndefOr[js.Array[String]] = js.native
  
  /** Fields of the `ContactSettings` to update. */
  var contactSettings: js.UndefOr[ContactSettings] = js.native
  
  /**
    * Required. The field mask describing which fields to update as a comma-separated list. For example, if only the registrant contact is being updated, the `update_mask` would be
    * `"registrant_contact"`.
    */
  var updateMask: js.UndefOr[String] = js.native
  
  /** Validate the request without actually updating the contact settings. */
  var validateOnly: js.UndefOr[Boolean] = js.native
}
object ConfigureContactSettingsRequest {
  
  @scala.inline
  def apply(): ConfigureContactSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureContactSettingsRequest]
  }
  
  @scala.inline
  implicit class ConfigureContactSettingsRequestMutableBuilder[Self <: ConfigureContactSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactNotices(value: js.Array[String]): Self = StObject.set(x, "contactNotices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactNoticesUndefined: Self = StObject.set(x, "contactNotices", js.undefined)
    
    @scala.inline
    def setContactNoticesVarargs(value: String*): Self = StObject.set(x, "contactNotices", js.Array(value :_*))
    
    @scala.inline
    def setContactSettings(value: ContactSettings): Self = StObject.set(x, "contactSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactSettingsUndefined: Self = StObject.set(x, "contactSettings", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    @scala.inline
    def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
