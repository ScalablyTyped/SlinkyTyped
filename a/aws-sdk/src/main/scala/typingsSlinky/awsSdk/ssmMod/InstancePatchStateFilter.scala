package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancePatchStateFilter extends js.Object {
  /**
    * The key for the filter. Supported values are FailedCount, InstalledCount, InstalledOtherCount, MissingCount and NotApplicableCount.
    */
  var Key: InstancePatchStateFilterKey = js.native
  /**
    * The type of comparison that should be performed for the value: Equal, NotEqual, LessThan or GreaterThan.
    */
  var Type: InstancePatchStateOperatorType = js.native
  /**
    * The value for the filter, must be an integer greater than or equal to 0.
    */
  var Values: InstancePatchStateFilterValues = js.native
}

object InstancePatchStateFilter {
  @scala.inline
  def apply(
    Key: InstancePatchStateFilterKey,
    Type: InstancePatchStateOperatorType,
    Values: InstancePatchStateFilterValues
  ): InstancePatchStateFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancePatchStateFilter]
  }
  @scala.inline
  implicit class InstancePatchStateFilterOps[Self <: InstancePatchStateFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: InstancePatchStateFilterKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: InstancePatchStateOperatorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: InstancePatchStateFilterValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

