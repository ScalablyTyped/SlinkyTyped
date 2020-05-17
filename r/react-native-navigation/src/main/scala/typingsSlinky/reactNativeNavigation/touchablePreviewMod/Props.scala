package typingsSlinky.reactNativeNavigation.touchablePreviewMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.TouchableHighlight
import typingsSlinky.reactNative.mod.TouchableNativeFeedback
import typingsSlinky.reactNative.mod.TouchableOpacity
import typingsSlinky.reactNative.mod.TouchableWithoutFeedback
import typingsSlinky.reactNativeNavigation.anon.ReactTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var children: TagMod[Any] = js.native
  var onPeekIn: js.UndefOr[js.Function0[Unit]] = js.native
  var onPeekOut: js.UndefOr[js.Function0[Unit]] = js.native
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  var onPressIn: js.UndefOr[js.Function1[/* payload */ ReactTag, Unit]] = js.native
  var touchableComponent: js.UndefOr[
    TouchableHighlight | TouchableOpacity | TouchableNativeFeedback | TouchableWithoutFeedback | TagMod[Any]
  ] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPeekIn(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPeekIn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPeekIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPeekIn")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPeekOut(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPeekOut")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPeekOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPeekOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPressIn(value: /* payload */ ReactTag => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPressIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressIn")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchableComponentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchableComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchableComponent(
      value: TouchableHighlight | TouchableOpacity | TouchableNativeFeedback | TouchableWithoutFeedback | TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchableComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchableComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchableComponent")(js.undefined)
        ret
    }
  }
  
}

