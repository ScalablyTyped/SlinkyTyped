package typingsSlinky.realm.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.realm.Realm.Sync.ClientResyncMode
import typingsSlinky.realm.Realm.Sync.ErrorCallback
import typingsSlinky.realm.Realm.Sync.OpenRealmBehaviorConfiguration
import typingsSlinky.realm.Realm.Sync.SSLConfiguration
import typingsSlinky.realm.Realm.Sync.SSLVerifyCallback
import typingsSlinky.realm.Realm.Sync.SSLVerifyObject
import typingsSlinky.realm.Realm.Sync.Session
import typingsSlinky.realm.Realm.Sync.SessionStopPolicy
import typingsSlinky.realm.Realm.Sync.SyncError
import typingsSlinky.realm.Realm.Sync.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<realm.Realm.Sync.SyncConfiguration> */
@js.native
trait PartialSyncConfiguration extends js.Object {
  
  var _disableQueryBasedSyncUrlChecks: js.UndefOr[Boolean] = js.native
  
  var _sessionStopPolicy: js.UndefOr[SessionStopPolicy] = js.native
  
  var clientResyncMode: js.UndefOr[ClientResyncMode] = js.native
  
  var customQueryBasedSyncIdentifier: js.UndefOr[String] = js.native
  
  var custom_http_headers: js.UndefOr[StringDictionary[String]] = js.native
  
  var error: js.UndefOr[ErrorCallback] = js.native
  
  var existingRealmFileBehavior: js.UndefOr[OpenRealmBehaviorConfiguration] = js.native
  
  var fullSynchronization: js.UndefOr[Boolean] = js.native
  
  var newRealmFileBehavior: js.UndefOr[OpenRealmBehaviorConfiguration] = js.native
  
  var open_ssl_verify_callback: js.UndefOr[SSLVerifyCallback] = js.native
  
  var partial: js.UndefOr[Boolean] = js.native
  
  var ssl: js.UndefOr[SSLConfiguration] = js.native
  
  var ssl_trust_certificate_path: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var user: js.UndefOr[User] = js.native
  
  var validate_ssl: js.UndefOr[Boolean] = js.native
}
object PartialSyncConfiguration {
  
  @scala.inline
  def apply(): PartialSyncConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSyncConfiguration]
  }
  
  @scala.inline
  implicit class PartialSyncConfigurationOps[Self <: PartialSyncConfiguration] (val x: Self) extends AnyVal {
    
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
    def set_disableQueryBasedSyncUrlChecks(value: Boolean): Self = this.set("_disableQueryBasedSyncUrlChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_disableQueryBasedSyncUrlChecks: Self = this.set("_disableQueryBasedSyncUrlChecks", js.undefined)
    
    @scala.inline
    def set_sessionStopPolicy(value: SessionStopPolicy): Self = this.set("_sessionStopPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_sessionStopPolicy: Self = this.set("_sessionStopPolicy", js.undefined)
    
    @scala.inline
    def setClientResyncMode(value: ClientResyncMode): Self = this.set("clientResyncMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientResyncMode: Self = this.set("clientResyncMode", js.undefined)
    
    @scala.inline
    def setCustomQueryBasedSyncIdentifier(value: String): Self = this.set("customQueryBasedSyncIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomQueryBasedSyncIdentifier: Self = this.set("customQueryBasedSyncIdentifier", js.undefined)
    
    @scala.inline
    def setCustom_http_headers(value: StringDictionary[String]): Self = this.set("custom_http_headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_http_headers: Self = this.set("custom_http_headers", js.undefined)
    
    @scala.inline
    def setError(value: (/* session */ Session, /* error */ SyncError) => Unit): Self = this.set("error", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setExistingRealmFileBehavior(value: OpenRealmBehaviorConfiguration): Self = this.set("existingRealmFileBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExistingRealmFileBehavior: Self = this.set("existingRealmFileBehavior", js.undefined)
    
    @scala.inline
    def setFullSynchronization(value: Boolean): Self = this.set("fullSynchronization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullSynchronization: Self = this.set("fullSynchronization", js.undefined)
    
    @scala.inline
    def setNewRealmFileBehavior(value: OpenRealmBehaviorConfiguration): Self = this.set("newRealmFileBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewRealmFileBehavior: Self = this.set("newRealmFileBehavior", js.undefined)
    
    @scala.inline
    def setOpen_ssl_verify_callback(value: /* sslVerifyObject */ SSLVerifyObject => Boolean): Self = this.set("open_ssl_verify_callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpen_ssl_verify_callback: Self = this.set("open_ssl_verify_callback", js.undefined)
    
    @scala.inline
    def setPartial(value: Boolean): Self = this.set("partial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartial: Self = this.set("partial", js.undefined)
    
    @scala.inline
    def setSsl(value: SSLConfiguration): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    
    @scala.inline
    def setSsl_trust_certificate_path(value: String): Self = this.set("ssl_trust_certificate_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl_trust_certificate_path: Self = this.set("ssl_trust_certificate_path", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    
    @scala.inline
    def setValidate_ssl(value: Boolean): Self = this.set("validate_ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidate_ssl: Self = this.set("validate_ssl", js.undefined)
  }
}
