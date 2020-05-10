package typingsSlinky.coreObject

import typingsSlinky.coreObject.utilsMod.Super
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSuper[Base] extends js.Object {
  var _super: Super[Base] = js.native
}

object AnonSuper {
  @scala.inline
  def apply[Base](_super: Super[Base]): AnonSuper[Base] = {
    val __obj = js.Dynamic.literal(_super = _super.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSuper[Base]]
  }
  @scala.inline
  implicit class AnonSuperOps[Self[base] <: AnonSuper[base], Base] (val x: Self[Base]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Base] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Base]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Base] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Base] with Other]
    @scala.inline
    def with_super(value: Super[Base]): Self[Base] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_super")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

