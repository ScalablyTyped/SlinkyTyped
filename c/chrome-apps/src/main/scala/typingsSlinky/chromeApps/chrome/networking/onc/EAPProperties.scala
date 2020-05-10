package typingsSlinky.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EAPProperties extends js.Object {
  var AnonymousIdentity: js.UndefOr[String] = js.native
  /** @since Chrome 60. */
  var ClientCertPKCS11Id: js.UndefOr[String] = js.native
  var ClientCertPattern: js.UndefOr[CertPattern] = js.native
  var ClientCertRef: js.UndefOr[String] = js.native
  var ClientCertType: js.UndefOr[typingsSlinky.chromeApps.chrome.networking.onc.ClientCertType] = js.native
  var Identity: js.UndefOr[String] = js.native
  var Inner: js.UndefOr[String] = js.native
  /** The outer EAP type. Required by ONC, but may not be provided when translating from Shill. */
  var Outer: js.UndefOr[String] = js.native
  var Password: js.UndefOr[String] = js.native
  var SaveCredentials: js.UndefOr[Boolean] = js.native
  var ServerCAPEMs: js.UndefOr[js.Array[String]] = js.native
  var ServerCARefs: js.UndefOr[js.Array[String]] = js.native
  /** @since Chrome 60. */
  var SubjectMatch: js.UndefOr[ManagedDOMString] = js.native
  var UseProactiveKeyCaching: js.UndefOr[Boolean] = js.native
  var UseSytemCAs: js.UndefOr[Boolean] = js.native
}

object EAPProperties {
  @scala.inline
  def apply(): EAPProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EAPProperties]
  }
  @scala.inline
  implicit class EAPPropertiesOps[Self <: EAPProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnonymousIdentity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnonymousIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnonymousIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnonymousIdentity")(js.undefined)
        ret
    }
    @scala.inline
    def withClientCertPKCS11Id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientCertPKCS11Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientCertPKCS11Id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientCertPKCS11Id")(js.undefined)
        ret
    }
    @scala.inline
    def withClientCertPattern(value: CertPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientCertPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientCertPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientCertPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withClientCertRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientCertRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientCertRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientCertRef")(js.undefined)
        ret
    }
    @scala.inline
    def withClientCertType(value: ClientCertType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientCertType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientCertType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientCertType")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identity")(js.undefined)
        ret
    }
    @scala.inline
    def withInner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inner")(js.undefined)
        ret
    }
    @scala.inline
    def withOuter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outer")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SaveCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SaveCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withServerCAPEMs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerCAPEMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerCAPEMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerCAPEMs")(js.undefined)
        ret
    }
    @scala.inline
    def withServerCARefs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerCARefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerCARefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerCARefs")(js.undefined)
        ret
    }
    @scala.inline
    def withSubjectMatch(value: ManagedDOMString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubjectMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubjectMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubjectMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withUseProactiveKeyCaching(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseProactiveKeyCaching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseProactiveKeyCaching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseProactiveKeyCaching")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSytemCAs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseSytemCAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSytemCAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseSytemCAs")(js.undefined)
        ret
    }
  }
  
}

