package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsAuthInfoResponse extends js.Object {
  /**
    * The account identifiers corresponding to the authenticated user.
    * - For an individual account: only the merchant ID is defined
    * - For an aggregator: only the aggregator ID is defined
    * - For a subaccount of an MCA: both the merchant ID and the aggregator ID are defined.
    */
  var accountIdentifiers: js.UndefOr[js.Array[AccountIdentifier]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "content#accountsAuthInfoResponse". */
  var kind: js.UndefOr[String] = js.native
}

object AccountsAuthInfoResponse {
  @scala.inline
  def apply(): AccountsAuthInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountsAuthInfoResponse]
  }
  @scala.inline
  implicit class AccountsAuthInfoResponseOps[Self <: AccountsAuthInfoResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountIdentifiers(value: js.Array[AccountIdentifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountIdentifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountIdentifiers")(js.undefined)
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
  }
  
}

