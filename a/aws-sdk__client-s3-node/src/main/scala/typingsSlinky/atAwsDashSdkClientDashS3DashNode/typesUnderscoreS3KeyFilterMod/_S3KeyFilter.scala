package typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreS3KeyFilterMod

import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreFilterRuleMod._FilterRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _S3KeyFilter extends js.Object {
  /**
    * <p>A list of containers for key value pair that defines the criteria for the filter rule.</p>
    */
  var FilterRules: js.UndefOr[js.Array[_FilterRule] | js.Iterable[_FilterRule]] = js.undefined
}

object _S3KeyFilter {
  @scala.inline
  def apply(FilterRules: js.Array[_FilterRule] | js.Iterable[_FilterRule] = null): _S3KeyFilter = {
    val __obj = js.Dynamic.literal()
    if (FilterRules != null) __obj.updateDynamic("FilterRules")(FilterRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[_S3KeyFilter]
  }
}

