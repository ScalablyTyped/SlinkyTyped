package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlignItemsFlexDirection extends js.Object {
  var alignItems: String = js.native
  var flexDirection: String = js.native
}

object AnonAlignItemsFlexDirection {
  @scala.inline
  def apply(alignItems: String, flexDirection: String): AnonAlignItemsFlexDirection = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlignItemsFlexDirection]
  }
  @scala.inline
  implicit class AnonAlignItemsFlexDirectionOps[Self <: AnonAlignItemsFlexDirection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignItems(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlexDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

