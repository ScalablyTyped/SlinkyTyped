package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexWrap extends js.Object {
  var flexDirection: String = js.native
  var flexWrap: String = js.native
}

object FlexWrap {
  @scala.inline
  def apply(flexDirection: String, flexWrap: String): FlexWrap = {
    val __obj = js.Dynamic.literal(flexDirection = flexDirection.asInstanceOf[js.Any], flexWrap = flexWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexWrap]
  }
  @scala.inline
  implicit class FlexWrapOps[Self <: FlexWrap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlexDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlexWrap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexWrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

