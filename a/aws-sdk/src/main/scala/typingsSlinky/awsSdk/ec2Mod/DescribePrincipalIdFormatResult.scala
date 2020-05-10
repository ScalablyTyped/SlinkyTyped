package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePrincipalIdFormatResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the ID format settings for the ARN.
    */
  var Principals: js.UndefOr[PrincipalIdFormatList] = js.native
}

object DescribePrincipalIdFormatResult {
  @scala.inline
  def apply(): DescribePrincipalIdFormatResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePrincipalIdFormatResult]
  }
  @scala.inline
  implicit class DescribePrincipalIdFormatResultOps[Self <: DescribePrincipalIdFormatResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
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
    def withPrincipals(value: PrincipalIdFormatList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Principals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Principals")(js.undefined)
        ret
    }
  }
  
}

