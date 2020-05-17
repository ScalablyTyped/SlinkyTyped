package typingsSlinky.antd.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JumpNextIcon extends js.Object {
  var jumpNextIcon: ReactElement = js.native
  var jumpPrevIcon: ReactElement = js.native
  var nextIcon: ReactElement = js.native
  var prevIcon: ReactElement = js.native
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
    def withJumpNextIcon(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpNextIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJumpPrevIcon(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpPrevIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextIcon(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevIcon(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevIcon")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

