package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuiltinIntentSlot extends js.Object {
  /**
    * A list of the slots defined for the intent.
    */
  var name: js.UndefOr[String] = js.native
}

object BuiltinIntentSlot {
  @scala.inline
  def apply(): BuiltinIntentSlot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuiltinIntentSlot]
  }
  @scala.inline
  implicit class BuiltinIntentSlotOps[Self <: BuiltinIntentSlot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

