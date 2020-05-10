package typingsSlinky.postmanCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisabled[TDefinition /* <: js.Object */] extends js.Object {
  var disabled: Boolean = js.native
  var info: TDefinition = js.native
}

object AnonDisabled {
  @scala.inline
  def apply[TDefinition](disabled: Boolean, info: TDefinition): AnonDisabled[TDefinition] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisabled[TDefinition]]
  }
  @scala.inline
  implicit class AnonDisabledOps[Self[tdefinition] <: AnonDisabled[tdefinition], TDefinition] (val x: Self[TDefinition]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TDefinition] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TDefinition]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TDefinition] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TDefinition] with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self[TDefinition] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: TDefinition): Self[TDefinition] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

