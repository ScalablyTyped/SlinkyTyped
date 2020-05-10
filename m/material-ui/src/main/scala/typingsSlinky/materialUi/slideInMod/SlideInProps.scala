package typingsSlinky.materialUi.slideInMod

import typingsSlinky.materialUi.MaterialUI.propTypes.direction
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlideInProps extends Props[SlideIn] {
  var childStyle: js.UndefOr[CSSProperties] = js.native
  var direction: js.UndefOr[typingsSlinky.materialUi.MaterialUI.propTypes.direction] = js.native
  var enterDelay: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object SlideInProps {
  @scala.inline
  def apply(): SlideInProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideInProps]
  }
  @scala.inline
  implicit class SlideInPropsOps[Self <: SlideInProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: direction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

