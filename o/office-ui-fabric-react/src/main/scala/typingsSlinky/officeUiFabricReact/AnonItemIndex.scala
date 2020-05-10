package typingsSlinky.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemIndex extends js.Object {
  var itemIndex: Double = js.native
}

object AnonItemIndex {
  @scala.inline
  def apply(itemIndex: Double): AnonItemIndex = {
    val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemIndex]
  }
  @scala.inline
  implicit class AnonItemIndexOps[Self <: AnonItemIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

