package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerNodeDetails extends js.Object {
  /**
    * The information of the trigger represented by the trigger node.
    */
  var Trigger: js.UndefOr[typingsSlinky.awsSdk.glueMod.Trigger] = js.native
}

object TriggerNodeDetails {
  @scala.inline
  def apply(): TriggerNodeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerNodeDetails]
  }
  @scala.inline
  implicit class TriggerNodeDetailsOps[Self <: TriggerNodeDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrigger(value: Trigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Trigger")(js.undefined)
        ret
    }
  }
  
}

