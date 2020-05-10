package typingsSlinky.realm.Realm.Sync

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncConfiguration extends js.Object {
  var _disableQueryBasedSyncUrlChecks: js.UndefOr[Boolean] = js.native
  var _sessionStopPolicy: js.UndefOr[SessionStopPolicy] = js.native
  var clientResyncMode: js.UndefOr[ClientResyncMode] = js.native
  var customQueryBasedSyncIdentifier: js.UndefOr[String] = js.native
  var custom_http_headers: js.UndefOr[StringDictionary[String]] = js.native
  var error: js.UndefOr[ErrorCallback] = js.native
  var existingRealmFileBehavior: js.UndefOr[OpenRealmBehaviorConfiguration] = js.native
  var fullSynchronization: js.UndefOr[Boolean] = js.native
  var newRealmFileBehavior: js.UndefOr[OpenRealmBehaviorConfiguration] = js.native
  /** @deprecated use `ssl` instead */
  var open_ssl_verify_callback: js.UndefOr[SSLVerifyCallback] = js.native
  var partial: js.UndefOr[Boolean] = js.native
  var ssl: js.UndefOr[SSLConfiguration] = js.native
  /** @deprecated use `ssl` instead */
  var ssl_trust_certificate_path: js.UndefOr[String] = js.native
  var url: String = js.native
  var user: User = js.native
  /** @deprecated use `ssl` instead */
  var validate_ssl: js.UndefOr[Boolean] = js.native
}

object SyncConfiguration {
  @scala.inline
  def apply(url: String, user: User): SyncConfiguration = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncConfiguration]
  }
  @scala.inline
  implicit class SyncConfigurationOps[Self <: SyncConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_disableQueryBasedSyncUrlChecks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_disableQueryBasedSyncUrlChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_disableQueryBasedSyncUrlChecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_disableQueryBasedSyncUrlChecks")(js.undefined)
        ret
    }
    @scala.inline
    def with_sessionStopPolicy(value: SessionStopPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sessionStopPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_sessionStopPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sessionStopPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withClientResyncMode(value: ClientResyncMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientResyncMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientResyncMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientResyncMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomQueryBasedSyncIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customQueryBasedSyncIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomQueryBasedSyncIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customQueryBasedSyncIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom_http_headers(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_http_headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_http_headers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_http_headers")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: (/* session */ Session, /* error */ SyncError) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withExistingRealmFileBehavior(value: OpenRealmBehaviorConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existingRealmFileBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExistingRealmFileBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existingRealmFileBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withFullSynchronization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullSynchronization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullSynchronization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullSynchronization")(js.undefined)
        ret
    }
    @scala.inline
    def withNewRealmFileBehavior(value: OpenRealmBehaviorConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRealmFileBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewRealmFileBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRealmFileBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen_ssl_verify_callback(value: /* sslVerifyObject */ SSLVerifyObject => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_ssl_verify_callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOpen_ssl_verify_callback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_ssl_verify_callback")(js.undefined)
        ret
    }
    @scala.inline
    def withPartial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partial")(js.undefined)
        ret
    }
    @scala.inline
    def withSsl(value: SSLConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(js.undefined)
        ret
    }
    @scala.inline
    def withSsl_trust_certificate_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl_trust_certificate_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsl_trust_certificate_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl_trust_certificate_path")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate_ssl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate_ssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidate_ssl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate_ssl")(js.undefined)
        ret
    }
  }
  
}

