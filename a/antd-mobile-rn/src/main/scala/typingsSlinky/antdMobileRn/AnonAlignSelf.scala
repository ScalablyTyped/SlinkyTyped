package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlignSelf extends js.Object {
  var alignSelf: String = js.native
  var marginRight: Double = js.native
}

object AnonAlignSelf {
  @scala.inline
  def apply(alignSelf: String, marginRight: Double): AnonAlignSelf = {
    val __obj = js.Dynamic.literal(alignSelf = alignSelf.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlignSelf]
  }
  @scala.inline
  implicit class AnonAlignSelfOps[Self <: AnonAlignSelf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignSelf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignSelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

