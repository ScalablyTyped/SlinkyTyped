package typingsSlinky.postmanCollection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disabled[TDefinition /* <: js.Object */] extends js.Object {
  var disabled: Boolean = js.native
  var info: TDefinition = js.native
}

object Disabled {
  @scala.inline
  def apply[TDefinition](disabled: Boolean, info: TDefinition): Disabled[TDefinition] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled[TDefinition]]
  }
  @scala.inline
  implicit class DisabledOps[Self[tdefinition] <: Disabled[tdefinition], TDefinition] (val x: Self[TDefinition]) extends AnyVal {
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

