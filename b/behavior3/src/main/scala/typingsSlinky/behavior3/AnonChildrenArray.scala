package typingsSlinky.behavior3

import typingsSlinky.behavior3.b3.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChildrenArray extends js.Object {
  var children: js.UndefOr[js.Array[BaseNode]] = js.native
}

object AnonChildrenArray {
  @scala.inline
  def apply(): AnonChildrenArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonChildrenArray]
  }
  @scala.inline
  implicit class AnonChildrenArrayOps[Self <: AnonChildrenArray] (val x: Self) extends AnyVal {
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

