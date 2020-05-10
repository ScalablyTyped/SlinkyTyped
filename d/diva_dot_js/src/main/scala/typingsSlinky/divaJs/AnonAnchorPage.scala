package typingsSlinky.divaJs

import typingsSlinky.divaJs.interfacesMod.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnchorPage extends js.Object {
  var anchorPage: Double = js.native
  var offset: Offset = js.native
}

object AnonAnchorPage {
  @scala.inline
  def apply(anchorPage: Double, offset: Offset): AnonAnchorPage = {
    val __obj = js.Dynamic.literal(anchorPage = anchorPage.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnchorPage]
  }
  @scala.inline
  implicit class AnonAnchorPageOps[Self <: AnonAnchorPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Offset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

