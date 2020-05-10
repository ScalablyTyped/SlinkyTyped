package typingsSlinky.reactNavigationStack.typesMod

import typingsSlinky.reactNative.mod.Animated.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionerLayout extends js.Object {
  var height: Value = js.native
  var initHeight: Double = js.native
  var initWidth: Double = js.native
  var isMeasured: Boolean = js.native
  var width: Value = js.native
}

object TransitionerLayout {
  @scala.inline
  def apply(height: Value, initHeight: Double, initWidth: Double, isMeasured: Boolean, width: Value): TransitionerLayout = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], initHeight = initHeight.asInstanceOf[js.Any], initWidth = initWidth.asInstanceOf[js.Any], isMeasured = isMeasured.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionerLayout]
  }
  @scala.inline
  implicit class TransitionerLayoutOps[Self <: TransitionerLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMeasured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMeasured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

