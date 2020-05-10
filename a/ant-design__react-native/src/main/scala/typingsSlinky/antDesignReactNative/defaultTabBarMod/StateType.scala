package typingsSlinky.antDesignReactNative.defaultTabBarMod

import typingsSlinky.reactNative.mod.Animated.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateType extends js.Object {
  var _containerWidth: Double = js.native
  var _leftTabUnderline: Value = js.native
  var _tabContainerWidth: Double = js.native
  var _widthTabUnderline: Value = js.native
}

object StateType {
  @scala.inline
  def apply(
    _containerWidth: Double,
    _leftTabUnderline: Value,
    _tabContainerWidth: Double,
    _widthTabUnderline: Value
  ): StateType = {
    val __obj = js.Dynamic.literal(_containerWidth = _containerWidth.asInstanceOf[js.Any], _leftTabUnderline = _leftTabUnderline.asInstanceOf[js.Any], _tabContainerWidth = _tabContainerWidth.asInstanceOf[js.Any], _widthTabUnderline = _widthTabUnderline.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateType]
  }
  @scala.inline
  implicit class StateTypeOps[Self <: StateType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_containerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_containerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_leftTabUnderline(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_leftTabUnderline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_tabContainerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_tabContainerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_widthTabUnderline(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_widthTabUnderline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

