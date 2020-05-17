package typingsSlinky.coreObject.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Super[Base] extends js.Object {
  var _super: typingsSlinky.coreObject.utilsMod.Super[Base] = js.native
}

object Super {
  @scala.inline
  def apply[Base](_super: typingsSlinky.coreObject.utilsMod.Super[Base]): Super[Base] = {
    val __obj = js.Dynamic.literal(_super = _super.asInstanceOf[js.Any])
    __obj.asInstanceOf[Super[Base]]
  }
  @scala.inline
  implicit class SuperOps[Self[base] <: Super[base], Base] (val x: Self[Base]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Base] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Base]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Base] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Base] with Other]
    @scala.inline
    def with_super(value: typingsSlinky.coreObject.utilsMod.Super[Base]): Self[Base] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_super")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

