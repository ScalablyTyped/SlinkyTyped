package typingsSlinky.firebaseAdmin

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Provider-specific identity details corresponding
    * to the provider used to sign in the user.
    */
  var identities: StringDictionary[js.Any] = js.native
  /**
    * The `uid` of the second factor used to sign in, provided the
    * ID token was obtained from a multi-factor authenticated user.
    */
  var second_factor_identifier: js.UndefOr[String] = js.native
  /**
    * The ID of the provider used to sign in the user.
    * One of `"anonymous"`, `"password"`, `"facebook.com"`, `"github.com"`,
    * `"google.com"`, `"twitter.com"`, or `"custom"`.
    */
  var sign_in_provider: String = js.native
  /**
    * The type identifier or `factorId` of the second factor, provided the
    * ID token was obtained from a multi-factor authenticated user.
    * For phone, this is `"phone"`.
    */
  var sign_in_second_factor: js.UndefOr[String] = js.native
  /**
    * The ID of the tenant the user belongs to, if available.
    */
  var tenant: js.UndefOr[String] = js.native
}

object AnonDictkey {
  @scala.inline
  def apply(identities: StringDictionary[js.Any], sign_in_provider: String): AnonDictkey = {
    val __obj = js.Dynamic.literal(identities = identities.asInstanceOf[js.Any], sign_in_provider = sign_in_provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkey]
  }
  @scala.inline
  implicit class AnonDictkeyOps[Self <: AnonDictkey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentities(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSign_in_provider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign_in_provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecond_factor_identifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second_factor_identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecond_factor_identifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second_factor_identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSign_in_second_factor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign_in_second_factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSign_in_second_factor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign_in_second_factor")(js.undefined)
        ret
    }
    @scala.inline
    def withTenant(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenant")(js.undefined)
        ret
    }
  }
  
}

