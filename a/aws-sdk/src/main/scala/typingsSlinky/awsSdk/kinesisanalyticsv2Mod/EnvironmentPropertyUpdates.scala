package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentPropertyUpdates extends js.Object {
  /**
    * Describes updates to the execution property groups.
    */
  var PropertyGroups: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.PropertyGroups = js.native
}

object EnvironmentPropertyUpdates {
  @scala.inline
  def apply(PropertyGroups: PropertyGroups): EnvironmentPropertyUpdates = {
    val __obj = js.Dynamic.literal(PropertyGroups = PropertyGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentPropertyUpdates]
  }
  @scala.inline
  implicit class EnvironmentPropertyUpdatesOps[Self <: EnvironmentPropertyUpdates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPropertyGroups(value: PropertyGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyGroups")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

