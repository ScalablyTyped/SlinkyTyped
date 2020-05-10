package typingsSlinky.reactInteractive

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactInteractive.mod.ActiveProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHoverActive extends ActiveProps {
  var hoverActive: js.UndefOr[CSSProperties] = js.native
  var keyActive: js.UndefOr[CSSProperties] = js.native
  var touchActive: js.UndefOr[CSSProperties] = js.native
}

object AnonHoverActive {
  @scala.inline
  def apply(): AnonHoverActive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonHoverActive]
  }
  @scala.inline
  implicit class AnonHoverActiveOps[Self <: AnonHoverActive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHoverActive(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverActive")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyActive(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyActive")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchActive(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchActive")(js.undefined)
        ret
    }
  }
  
}

