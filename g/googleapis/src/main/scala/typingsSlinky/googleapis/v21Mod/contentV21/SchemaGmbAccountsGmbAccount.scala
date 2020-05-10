package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGmbAccountsGmbAccount extends js.Object {
  /**
    * The email which identifies the GMB account.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Number of listings under this account.
    */
  var listingCount: js.UndefOr[String] = js.native
  /**
    * The name of the GMB account.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The type of the GMB account (User or Business).
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaGmbAccountsGmbAccount {
  @scala.inline
  def apply(): SchemaGmbAccountsGmbAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGmbAccountsGmbAccount]
  }
  @scala.inline
  implicit class SchemaGmbAccountsGmbAccountOps[Self <: SchemaGmbAccountsGmbAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withListingCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listingCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListingCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listingCount")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

