package typingsSlinky.antDesignReactNative.anon

import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BottomTabBarSplitLine extends js.Object {
  var bottomTabBarSplitLine: RegisteredStyle[ViewStyle] = js.native
  var container: RegisteredStyle[ViewStyle] = js.native
  var topTabBarSplitLine: RegisteredStyle[ViewStyle] = js.native
}

object BottomTabBarSplitLine {
  @scala.inline
  def apply(
    bottomTabBarSplitLine: RegisteredStyle[ViewStyle],
    container: RegisteredStyle[ViewStyle],
    topTabBarSplitLine: RegisteredStyle[ViewStyle]
  ): BottomTabBarSplitLine = {
    val __obj = js.Dynamic.literal(bottomTabBarSplitLine = bottomTabBarSplitLine.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], topTabBarSplitLine = topTabBarSplitLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomTabBarSplitLine]
  }
  @scala.inline
  implicit class BottomTabBarSplitLineOps[Self <: BottomTabBarSplitLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomTabBarSplitLine(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomTabBarSplitLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopTabBarSplitLine(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topTabBarSplitLine")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

