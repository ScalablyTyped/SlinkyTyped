package typingsSlinky.gapiClientAdmin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerId extends js.Object {
  /** Obfuscated customer id for the record. */
  var customerId: js.UndefOr[String] = js.native
  /** Obfuscated user id for the record. */
  var profileId: js.UndefOr[String] = js.native
  /** The type of item, can be a customer or user. */
  var `type`: js.UndefOr[String] = js.native
  /** user's email. */
  var userEmail: js.UndefOr[String] = js.native
}

object CustomerId {
  @scala.inline
  def apply(): CustomerId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerId]
  }
  @scala.inline
  implicit class CustomerIdOps[Self <: CustomerId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerId")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileId")(js.undefined)
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
    @scala.inline
    def withUserEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userEmail")(js.undefined)
        ret
    }
  }
  
}

