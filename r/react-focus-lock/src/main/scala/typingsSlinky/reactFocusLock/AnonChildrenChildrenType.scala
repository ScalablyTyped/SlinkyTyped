package typingsSlinky.reactFocusLock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChildrenChildrenType[ChildrenType] extends js.Object {
  var children: ChildrenType = js.native
}

object AnonChildrenChildrenType {
  @scala.inline
  def apply[ChildrenType](children: ChildrenType): AnonChildrenChildrenType[ChildrenType] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenChildrenType[ChildrenType]]
  }
  @scala.inline
  implicit class AnonChildrenChildrenTypeOps[Self[childrentype] <: AnonChildrenChildrenType[childrentype], ChildrenType] (val x: Self[ChildrenType]) extends AnyVal {
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

