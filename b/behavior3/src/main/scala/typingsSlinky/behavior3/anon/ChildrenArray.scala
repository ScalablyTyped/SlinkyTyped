package typingsSlinky.behavior3.anon

import typingsSlinky.behavior3.b3.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildrenArray extends js.Object {
  var children: js.UndefOr[js.Array[BaseNode]] = js.native
}

object ChildrenArray {
  @scala.inline
  def apply(): ChildrenArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildrenArray]
  }
  @scala.inline
  implicit class ChildrenArrayOps[Self <: ChildrenArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Array[BaseNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
  }
  
}

