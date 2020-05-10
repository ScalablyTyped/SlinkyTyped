package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeExpressionsRequest extends js.Object {
  /**
    * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.native
  /**
    * The name of the domain you want to describe.
    */
  var DomainName: typingsSlinky.awsSdk.cloudsearchMod.DomainName = js.native
  /**
    * Limits the DescribeExpressions response to the specified expressions. If not specified, all expressions are shown.
    */
  var ExpressionNames: js.UndefOr[StandardNameList] = js.native
}

object DescribeExpressionsRequest {
  @scala.inline
  def apply(DomainName: DomainName): DescribeExpressionsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExpressionsRequest]
  }
  @scala.inline
  implicit class DescribeExpressionsRequestOps[Self <: DescribeExpressionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeployed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deployed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeployed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deployed")(js.undefined)
        ret
    }
    @scala.inline
    def withExpressionNames(value: StandardNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpressionNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionNames")(js.undefined)
        ret
    }
  }
  
}

