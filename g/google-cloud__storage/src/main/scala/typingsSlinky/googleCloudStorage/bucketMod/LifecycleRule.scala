package typingsSlinky.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudStorage.AnonStorageClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleRule extends js.Object {
  var action: AnonStorageClass | String = js.native
  var condition: StringDictionary[Boolean | js.Date | Double | String] = js.native
  var storageClass: js.UndefOr[String] = js.native
}

object LifecycleRule {
  @scala.inline
  def apply(
    action: AnonStorageClass | String,
    condition: StringDictionary[Boolean | js.Date | Double | String]
  ): LifecycleRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleRule]
  }
  @scala.inline
  implicit class LifecycleRuleOps[Self <: LifecycleRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: AnonStorageClass | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCondition(value: StringDictionary[Boolean | js.Date | Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageClass")(js.undefined)
        ret
    }
  }
  
}

