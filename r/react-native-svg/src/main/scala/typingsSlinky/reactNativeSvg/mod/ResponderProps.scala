package typingsSlinky.reactNativeSvg.mod

import typingsSlinky.reactNative.mod.GestureResponderHandlers
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.`box-none`
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.`box-only`
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.auto
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponderProps extends GestureResponderHandlers {
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.native
}

object ResponderProps {
  @scala.inline
  def apply(): ResponderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponderProps]
  }
  @scala.inline
  implicit class ResponderPropsOps[Self <: ResponderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPointerEvents(value: `box-none` | none | `box-only` | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerEvents")(js.undefined)
        ret
    }
  }
  
}

