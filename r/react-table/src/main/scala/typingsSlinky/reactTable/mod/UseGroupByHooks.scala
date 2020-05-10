package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseGroupByHooks[D /* <: js.Object */] extends js.Object {
  var getGroupByToggleProps: js.Array[HeaderGroupPropGetter[D]] = js.native
}

object UseGroupByHooks {
  @scala.inline
  def apply[D](getGroupByToggleProps: js.Array[HeaderGroupPropGetter[D]]): UseGroupByHooks[D] = {
    val __obj = js.Dynamic.literal(getGroupByToggleProps = getGroupByToggleProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGroupByHooks[D]]
  }
  @scala.inline
  implicit class UseGroupByHooksOps[Self[d] <: UseGroupByHooks[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withGetGroupByToggleProps(value: js.Array[HeaderGroupPropGetter[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupByToggleProps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

