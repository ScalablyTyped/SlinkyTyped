package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventorySchedule extends js.Object {
  /**
    * Specifies how frequently inventory results are produced.
    */
  var Frequency: InventoryFrequency = js.native
}

object InventorySchedule {
  @scala.inline
  def apply(Frequency: InventoryFrequency): InventorySchedule = {
    val __obj = js.Dynamic.literal(Frequency = Frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventorySchedule]
  }
  @scala.inline
  implicit class InventoryScheduleOps[Self <: InventorySchedule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrequency(value: InventoryFrequency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Frequency")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

