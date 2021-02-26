package typingsSlinky.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.saucelabs.saucelabsStrings.marketing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User
  extends /* key */ StringDictionary[js.Any] {
  
  var access_key: js.UndefOr[String] = js.native
  
  var ancestor_allows_subaccounts: js.UndefOr[Boolean] = js.native
  
  var ancestor_concurrency_limit: js.UndefOr[ConcurrencyLimit] = js.native
  
  var can_run_manual: js.UndefOr[Boolean] = js.native
  
  var concurrency_limit: js.UndefOr[ConcurrencyLimit] = js.native
  
  var creation_time: js.UndefOr[String] = js.native
  
  var domain: js.UndefOr[String] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var entity_type: js.UndefOr[String] = js.native
  
  var first_name: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var is_admin: js.UndefOr[String] = js.native
  
  var is_sso: js.UndefOr[Boolean] = js.native
  
  var last_name: js.UndefOr[String] = js.native
  
  var manual_minutes: js.UndefOr[Double] = js.native
  
  var minutes: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var parent: js.UndefOr[String] = js.native
  
  var prevent_emails: js.UndefOr[js.Array[marketing]] = js.native
  
  var subscribed: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var user_type: js.UndefOr[String] = js.native
  
  var username: js.UndefOr[String] = js.native
  
  var verified: js.UndefOr[Boolean] = js.native
  
  var vm_lockdown: js.UndefOr[Boolean] = js.native
}
object User {
  
  @scala.inline
  def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_key(value: String): Self = StObject.set(x, "access_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccess_keyUndefined: Self = StObject.set(x, "access_key", js.undefined)
    
    @scala.inline
    def setAncestor_allows_subaccounts(value: Boolean): Self = StObject.set(x, "ancestor_allows_subaccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAncestor_allows_subaccountsUndefined: Self = StObject.set(x, "ancestor_allows_subaccounts", js.undefined)
    
    @scala.inline
    def setAncestor_concurrency_limit(value: ConcurrencyLimit): Self = StObject.set(x, "ancestor_concurrency_limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAncestor_concurrency_limitUndefined: Self = StObject.set(x, "ancestor_concurrency_limit", js.undefined)
    
    @scala.inline
    def setCan_run_manual(value: Boolean): Self = StObject.set(x, "can_run_manual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_run_manualUndefined: Self = StObject.set(x, "can_run_manual", js.undefined)
    
    @scala.inline
    def setConcurrency_limit(value: ConcurrencyLimit): Self = StObject.set(x, "concurrency_limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcurrency_limitUndefined: Self = StObject.set(x, "concurrency_limit", js.undefined)
    
    @scala.inline
    def setCreation_time(value: String): Self = StObject.set(x, "creation_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreation_timeUndefined: Self = StObject.set(x, "creation_time", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEntity_type(value: String): Self = StObject.set(x, "entity_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntity_typeUndefined: Self = StObject.set(x, "entity_type", js.undefined)
    
    @scala.inline
    def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIs_admin(value: String): Self = StObject.set(x, "is_admin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_adminUndefined: Self = StObject.set(x, "is_admin", js.undefined)
    
    @scala.inline
    def setIs_sso(value: Boolean): Self = StObject.set(x, "is_sso", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_ssoUndefined: Self = StObject.set(x, "is_sso", js.undefined)
    
    @scala.inline
    def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    @scala.inline
    def setManual_minutes(value: Double): Self = StObject.set(x, "manual_minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManual_minutesUndefined: Self = StObject.set(x, "manual_minutes", js.undefined)
    
    @scala.inline
    def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setPrevent_emails(value: js.Array[marketing]): Self = StObject.set(x, "prevent_emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevent_emailsUndefined: Self = StObject.set(x, "prevent_emails", js.undefined)
    
    @scala.inline
    def setPrevent_emailsVarargs(value: marketing*): Self = StObject.set(x, "prevent_emails", js.Array(value :_*))
    
    @scala.inline
    def setSubscribed(value: Boolean): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribedUndefined: Self = StObject.set(x, "subscribed", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUser_type(value: String): Self = StObject.set(x, "user_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_typeUndefined: Self = StObject.set(x, "user_type", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    @scala.inline
    def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
    
    @scala.inline
    def setVm_lockdown(value: Boolean): Self = StObject.set(x, "vm_lockdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVm_lockdownUndefined: Self = StObject.set(x, "vm_lockdown", js.undefined)
  }
}
