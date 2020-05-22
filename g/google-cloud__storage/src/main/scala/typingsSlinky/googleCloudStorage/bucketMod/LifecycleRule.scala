package typingsSlinky.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudStorage.anon.StorageClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleRule extends js.Object {
  var action: StorageClass | String
  var condition: StringDictionary[Boolean | js.Date | Double | String]
  var storageClass: js.UndefOr[String] = js.undefined
}

object LifecycleRule {
  @scala.inline
  def apply(
    action: StorageClass | String,
    condition: StringDictionary[Boolean | js.Date | Double | String],
    storageClass: String = null
  ): LifecycleRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleRule]
  }
}

