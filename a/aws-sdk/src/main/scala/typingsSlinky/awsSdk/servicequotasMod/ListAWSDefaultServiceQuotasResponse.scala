package typingsSlinky.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAWSDefaultServiceQuotasResponse extends js.Object {
  /**
    * (Optional) Use this parameter in a request if you receive a NextToken response in a previous request that indicates that there's more output available. In a subsequent call, set it to the value of the previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.NextToken] = js.native
  /**
    * A list of the quotas in the account with the AWS default values. 
    */
  var Quotas: js.UndefOr[ServiceQuotaListDefinition] = js.native
}

object ListAWSDefaultServiceQuotasResponse {
  @scala.inline
  def apply(): ListAWSDefaultServiceQuotasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAWSDefaultServiceQuotasResponse]
  }
  @scala.inline
  implicit class ListAWSDefaultServiceQuotasResponseOps[Self <: ListAWSDefaultServiceQuotasResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
    def withQuotas(value: ServiceQuotaListDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quotas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quotas")(js.undefined)
        ret
    }
  }
  
}

