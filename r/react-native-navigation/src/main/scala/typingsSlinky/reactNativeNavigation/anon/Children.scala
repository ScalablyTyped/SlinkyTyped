package typingsSlinky.reactNativeNavigation.anon

import typingsSlinky.propTypes.mod.ReactNodeLike
import typingsSlinky.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Children extends js.Object {
  var children: Requireable[ReactNodeLike] = js.native
  var onPeekIn: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onPeekOut: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onPress: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onPressIn: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var touchableComponent: Requireable[js.Function1[/* repeated */ _, _]] = js.native
}

object Children {
  @scala.inline
  def apply(
    children: Requireable[ReactNodeLike],
    onPeekIn: Requireable[js.Function1[/* repeated */ _, _]],
    onPeekOut: Requireable[js.Function1[/* repeated */ _, _]],
    onPress: Requireable[js.Function1[/* repeated */ _, _]],
    onPressIn: Requireable[js.Function1[/* repeated */ _, _]],
    touchableComponent: Requireable[js.Function1[/* repeated */ _, _]]
  ): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], onPeekIn = onPeekIn.asInstanceOf[js.Any], onPeekOut = onPeekOut.asInstanceOf[js.Any], onPress = onPress.asInstanceOf[js.Any], onPressIn = onPressIn.asInstanceOf[js.Any], touchableComponent = touchableComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: Requireable[ReactNodeLike]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnPeekIn(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPeekIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnPeekOut(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPeekOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnPress(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnPressIn(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchableComponent(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchableComponent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

