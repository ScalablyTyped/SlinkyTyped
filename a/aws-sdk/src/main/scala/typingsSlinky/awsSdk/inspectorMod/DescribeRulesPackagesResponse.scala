package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRulesPackagesResponse extends js.Object {
  /**
    * Rules package details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems = js.native
  /**
    * Information about the rules package.
    */
  var rulesPackages: RulesPackageList = js.native
}

object DescribeRulesPackagesResponse {
  @scala.inline
  def apply(failedItems: FailedItems, rulesPackages: RulesPackageList): DescribeRulesPackagesResponse = {
    val __obj = js.Dynamic.literal(failedItems = failedItems.asInstanceOf[js.Any], rulesPackages = rulesPackages.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRulesPackagesResponse]
  }
  @scala.inline
  implicit class DescribeRulesPackagesResponseOps[Self <: DescribeRulesPackagesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedItems(value: FailedItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRulesPackages(value: RulesPackageList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesPackages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

