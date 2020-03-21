package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupTimeline extends js.Object {
  /**
    * The creation date and time of the instance group.
    */
  var CreationDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The date and time when the instance group terminated.
    */
  var EndDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The date and time when the instance group became ready to perform tasks.
    */
  var ReadyDateTime: js.UndefOr[js.Date] = js.native
}

object InstanceGroupTimeline {
  @scala.inline
  def apply(CreationDateTime: js.Date = null, EndDateTime: js.Date = null, ReadyDateTime: js.Date = null): InstanceGroupTimeline = {
    val __obj = js.Dynamic.literal()
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime.asInstanceOf[js.Any])
    if (EndDateTime != null) __obj.updateDynamic("EndDateTime")(EndDateTime.asInstanceOf[js.Any])
    if (ReadyDateTime != null) __obj.updateDynamic("ReadyDateTime")(ReadyDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupTimeline]
  }
}

