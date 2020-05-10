package typingsSlinky.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Auto-forwarding settings for an account.
  */
@js.native
trait SchemaAutoForwarding extends js.Object {
  /**
    * The state that a message should be left in after it has been forwarded.
    */
  var disposition: js.UndefOr[String] = js.native
  /**
    * Email address to which all incoming messages are forwarded. This email
    * address must be a verified member of the forwarding addresses.
    */
  var emailAddress: js.UndefOr[String] = js.native
  /**
    * Whether all incoming mail is automatically forwarded to another address.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object SchemaAutoForwarding {
  @scala.inline
  def apply(): SchemaAutoForwarding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoForwarding]
  }
  @scala.inline
  implicit class SchemaAutoForwardingOps[Self <: SchemaAutoForwarding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisposition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposition")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
  }
  
}

