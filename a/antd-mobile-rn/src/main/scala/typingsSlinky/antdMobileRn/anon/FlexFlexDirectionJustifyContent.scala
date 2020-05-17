package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexFlexDirectionJustifyContent extends js.Object {
  var flex: Double = js.native
  var flexDirection: String = js.native
  var justifyContent: String = js.native
}

object FlexFlexDirectionJustifyContent {
  @scala.inline
  def apply(flex: Double, flexDirection: String, justifyContent: String): FlexFlexDirectionJustifyContent = {
    val __obj = js.Dynamic.literal(flex = flex.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexFlexDirectionJustifyContent]
  }
  @scala.inline
  implicit class FlexFlexDirectionJustifyContentOps[Self <: FlexFlexDirectionJustifyContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlexDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJustifyContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyContent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

