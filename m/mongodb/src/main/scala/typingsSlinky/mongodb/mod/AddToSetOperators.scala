package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddToSetOperators[Type] extends js.Object {
  @JSName("$each")
  var $each: Type = js.native
}

object AddToSetOperators {
  @scala.inline
  def apply[Type]($each: Type): AddToSetOperators[Type] = {
    val __obj = js.Dynamic.literal($each = $each.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddToSetOperators[Type]]
  }
  @scala.inline
  implicit class AddToSetOperatorsOps[Self[`type`] <: AddToSetOperators[`type`], Type] (val x: Self[Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Type] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Type] with Other]
    @scala.inline
    def with$each(value: Type): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$each")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

