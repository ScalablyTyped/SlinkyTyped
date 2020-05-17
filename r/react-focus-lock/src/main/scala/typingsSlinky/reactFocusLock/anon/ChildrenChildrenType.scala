package typingsSlinky.reactFocusLock.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildrenChildrenType[ChildrenType] extends js.Object {
  var children: ChildrenType = js.native
}

object ChildrenChildrenType {
  @scala.inline
  def apply[ChildrenType](children: ChildrenType): ChildrenChildrenType[ChildrenType] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenChildrenType[ChildrenType]]
  }
  @scala.inline
  implicit class ChildrenChildrenTypeOps[Self[childrentype] <: ChildrenChildrenType[childrentype], ChildrenType] (val x: Self[ChildrenType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ChildrenType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ChildrenType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ChildrenType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ChildrenType] with Other]
    @scala.inline
    def withChildren(value: ChildrenType): Self[ChildrenType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

