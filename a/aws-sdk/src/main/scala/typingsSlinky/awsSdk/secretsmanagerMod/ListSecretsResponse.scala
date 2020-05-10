package typingsSlinky.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSecretsResponse extends js.Object {
  /**
    * If present in the response, this value indicates that there's more output available than what's included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a very long list. Use this value in the NextToken request parameter in a subsequent call to the operation to continue processing and get the next part of the output. You should repeat this until the NextToken response element comes back empty (as null).
    */
  var NextToken: js.UndefOr[NextTokenType] = js.native
  /**
    * A list of the secrets in the account.
    */
  var SecretList: js.UndefOr[SecretListType] = js.native
}

object ListSecretsResponse {
  @scala.inline
  def apply(): ListSecretsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecretsResponse]
  }
  @scala.inline
  implicit class ListSecretsResponseOps[Self <: ListSecretsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextTokenType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretList(value: SecretListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretList")(js.undefined)
        ret
    }
  }
  
}

