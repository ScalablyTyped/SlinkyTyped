package typingsSlinky.grpcGrpcJs.pickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Picker extends js.Object {
  def pick(pickArgs: PickArgs): PickResult = js.native
}

object Picker {
  @scala.inline
  def apply(pick: PickArgs => PickResult): Picker = {
    val __obj = js.Dynamic.literal(pick = js.Any.fromFunction1(pick))
    __obj.asInstanceOf[Picker]
  }
  @scala.inline
  implicit class PickerOps[Self <: Picker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPick(value: PickArgs => PickResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pick")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

