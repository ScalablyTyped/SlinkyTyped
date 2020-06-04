package typingsSlinky.reactNavigationStack.typesMod

import typingsSlinky.reactNative.mod.Animated.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionerLayout extends js.Object {
  var height: Value
  var initHeight: Double
  var initWidth: Double
  var isMeasured: Boolean
  var width: Value
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeight(value: Value): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitHeight(value: Double): Self = this.set("initHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitWidth(value: Double): Self = this.set("initWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMeasured(value: Boolean): Self = this.set("isMeasured", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Value): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

