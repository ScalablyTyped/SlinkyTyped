package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The authentication and authorization settings for a BackendService.
  */
@js.native
trait SchemaSecuritySettings extends js.Object {
  /**
    * Authentication policy defines what authentication methods can be accepted
    * on backends, and if authenticated, which method/certificate will set the
    * request principal.
    */
  var authenticationPolicy: js.UndefOr[SchemaAuthenticationPolicy] = js.native
  /**
    * Authorization config defines the Role Based Access Control (RBAC) config.
    */
  var authorizationConfig: js.UndefOr[SchemaAuthorizationConfig] = js.native
  /**
    * TLS Settings for the backend service.
    */
  var clientTlsSettings: js.UndefOr[SchemaClientTlsSettings] = js.native
  /**
    * The listener config of the XDS client is generated if the selector
    * matches the client.
    */
  var serverSettingsSelector: js.UndefOr[SchemaServerSecuritySettingsSelector] = js.native
}

object SchemaSecuritySettings {
  @scala.inline
  def apply(): SchemaSecuritySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecuritySettings]
  }
  @scala.inline
  implicit class SchemaSecuritySettingsOps[Self <: SchemaSecuritySettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticationPolicy(value: SchemaAuthenticationPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizationConfig(value: SchemaAuthorizationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withClientTlsSettings(value: SchemaClientTlsSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientTlsSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientTlsSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientTlsSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withServerSettingsSelector(value: SchemaServerSecuritySettingsSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSettingsSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSettingsSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSettingsSelector")(js.undefined)
        ret
    }
  }
  
}

