package typingsSlinky.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOverflow extends js.Object {
  var overflow: String = js.native
}

object AnonOverflow {
  @scala.inline
  def apply(overflow: String): AnonOverflow = {
    val __obj = js.Dynamic.literal(overflow = overflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOverflow]
  }
  @scala.inline
  implicit class AnonOverflowOps[Self <: AnonOverflow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverflow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

