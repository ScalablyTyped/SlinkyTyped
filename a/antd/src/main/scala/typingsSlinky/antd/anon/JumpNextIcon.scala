package typingsSlinky.antd.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JumpNextIcon extends js.Object {
  var jumpNextIcon: ReactElement
  var jumpPrevIcon: ReactElement
  var nextIcon: ReactElement
  var prevIcon: ReactElement
}

object JumpNextIcon {
  @scala.inline
  def apply(
    jumpNextIcon: ReactElement,
    jumpPrevIcon: ReactElement,
    nextIcon: ReactElement,
    prevIcon: ReactElement
  ): JumpNextIcon = {
    val __obj = js.Dynamic.literal(jumpNextIcon = jumpNextIcon.asInstanceOf[js.Any], jumpPrevIcon = jumpPrevIcon.asInstanceOf[js.Any], nextIcon = nextIcon.asInstanceOf[js.Any], prevIcon = prevIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[JumpNextIcon]
  }
  @scala.inline
  implicit class JumpNextIconOps[Self <: JumpNextIcon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJumpNextIcon(value: ReactElement): Self = this.set("jumpNextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setJumpPrevIcon(value: ReactElement): Self = this.set("jumpPrevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextIcon(value: ReactElement): Self = this.set("nextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevIcon(value: ReactElement): Self = this.set("prevIcon", value.asInstanceOf[js.Any])
  }
  
}

