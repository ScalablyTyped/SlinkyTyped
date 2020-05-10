package typingsSlinky.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSLConfiguration extends js.Object {
  var certificatePath: js.UndefOr[String] = js.native
  var validate: js.UndefOr[Boolean] = js.native
  var validateCallback: js.UndefOr[SSLVerifyCallback] = js.native
}

object SSLConfiguration {
  @scala.inline
  def apply(): SSLConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSLConfiguration]
  }
  @scala.inline
  implicit class SSLConfigurationOps[Self <: SSLConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificatePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificatePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePath")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateCallback(value: /* sslVerifyObject */ SSLVerifyObject => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidateCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateCallback")(js.undefined)
        ret
    }
  }
  
}

