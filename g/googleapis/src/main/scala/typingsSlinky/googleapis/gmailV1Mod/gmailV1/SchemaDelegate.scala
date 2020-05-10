package typingsSlinky.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Settings for a delegate. Delegates can read, send, and delete messages, as
  * well as view and add contacts, for the delegator&#39;s account. See
  * &quot;Set up mail delegation&quot; for more information about delegates.
  */
@js.native
trait SchemaDelegate extends js.Object {
  /**
    * The email address of the delegate.
    */
  var delegateEmail: js.UndefOr[String] = js.native
  /**
    * Indicates whether this address has been verified and can act as a
    * delegate for the account. Read-only.
    */
  var verificationStatus: js.UndefOr[String] = js.native
}

object SchemaDelegate {
  @scala.inline
  def apply(): SchemaDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDelegate]
  }
  @scala.inline
  implicit class SchemaDelegateOps[Self <: SchemaDelegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelegateEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegateEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegateEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegateEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withVerificationStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerificationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationStatus")(js.undefined)
        ret
    }
  }
  
}

