package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An account being held in a particular hold. This structure is immutable.
  * This can be either a single user or a google group, depending on the
  * corpus.
  */
@js.native
trait SchemaHeldAccount extends js.Object {
  /**
    * The account&#39;s ID as provided by the &lt;a
    * href=&quot;https://developers.google.com/admin-sdk/&quot;&gt;Admin
    * SDK&lt;/a&gt;.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * When the account was put on hold.
    */
  var holdTime: js.UndefOr[String] = js.native
}

object SchemaHeldAccount {
  @scala.inline
  def apply(): SchemaHeldAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeldAccount]
  }
  @scala.inline
  implicit class SchemaHeldAccountOps[Self <: SchemaHeldAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withHoldTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holdTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoldTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holdTime")(js.undefined)
        ret
    }
  }
  
}

