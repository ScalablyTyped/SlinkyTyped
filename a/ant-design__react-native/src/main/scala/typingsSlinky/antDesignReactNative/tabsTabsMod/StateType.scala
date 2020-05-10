package typingsSlinky.antDesignReactNative.tabsTabsMod

import typingsSlinky.reactNative.mod.Animated.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateType extends js.Object {
  var containerWidth: Double = js.native
  var currentTab: Double = js.native
  var scrollValue: Value = js.native
  var scrollX: Value = js.native
}

object StateType {
  @scala.inline
  def apply(containerWidth: Double, currentTab: Double, scrollValue: Value, scrollX: Value): StateType = {
    val __obj = js.Dynamic.literal(containerWidth = containerWidth.asInstanceOf[js.Any], currentTab = currentTab.asInstanceOf[js.Any], scrollValue = scrollValue.asInstanceOf[js.Any], scrollX = scrollX.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateType]
  }
  @scala.inline
  implicit class StateTypeOps[Self <: StateType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTab(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollValue(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollX(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollX")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

