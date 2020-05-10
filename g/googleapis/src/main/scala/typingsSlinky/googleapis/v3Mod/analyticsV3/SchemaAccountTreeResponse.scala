package typingsSlinky.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an Analytics account tree response. The account tree
  * response is used in the provisioning api to return the result of creating
  * an account, property, and view (profile).
  */
@js.native
trait SchemaAccountTreeResponse extends js.Object {
  /**
    * The account created.
    */
  var account: js.UndefOr[SchemaAccount] = js.native
  /**
    * Resource type for account ticket.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * View (Profile) for the account.
    */
  var profile: js.UndefOr[SchemaProfile] = js.native
  /**
    * Web property for the account.
    */
  var webproperty: js.UndefOr[SchemaWebproperty] = js.native
}

object SchemaAccountTreeResponse {
  @scala.inline
  def apply(): SchemaAccountTreeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountTreeResponse]
  }
  @scala.inline
  implicit class SchemaAccountTreeResponseOps[Self <: SchemaAccountTreeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: SchemaAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: SchemaProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
    @scala.inline
    def withWebproperty(value: SchemaWebproperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webproperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebproperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webproperty")(js.undefined)
        ret
    }
  }
  
}

