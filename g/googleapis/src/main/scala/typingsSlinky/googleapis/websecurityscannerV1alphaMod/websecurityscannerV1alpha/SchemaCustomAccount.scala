package typingsSlinky.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes authentication configuration that uses a custom account.
  */
@js.native
trait SchemaCustomAccount extends js.Object {
  /**
    * Required. The login form URL of the website.
    */
  var loginUrl: js.UndefOr[String] = js.native
  /**
    * Input only. Required. The password of the custom account. The credential
    * is stored encrypted and not returned in any response nor included in
    * audit logs.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * Required. The user name of the custom account.
    */
  var username: js.UndefOr[String] = js.native
}

object SchemaCustomAccount {
  @scala.inline
  def apply(): SchemaCustomAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomAccount]
  }
  @scala.inline
  implicit class SchemaCustomAccountOps[Self <: SchemaCustomAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoginUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoginUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

