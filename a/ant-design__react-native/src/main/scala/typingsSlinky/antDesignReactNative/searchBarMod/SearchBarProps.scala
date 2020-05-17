package typingsSlinky.antDesignReactNative.searchBarMod

import typingsSlinky.antDesignReactNative.anon.NativeEvent
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.antDesignReactNative.searchBarPropsTypeMod.SearchBarPropsType
import typingsSlinky.antDesignReactNative.searchBarStyleMod.SearchBarStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBarProps
  extends SearchBarPropsType
     with WithThemeStyles[SearchBarStyle] {
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.native
  var onSubmitEditing: js.UndefOr[js.Function1[/* event */ NativeEvent, Unit]] = js.native
  var style: js.UndefOr[StyleProp[TextStyle]] = js.native
}

object SearchBarProps {
  @scala.inline
  def apply(): SearchBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBarProps]
  }
  @scala.inline
  implicit class SearchBarPropsOps[Self <: SearchBarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnChangeText(value: /* text */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChangeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmitEditing(value: /* event */ NativeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitEditing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSubmitEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[TextStyle]): Self = {
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
    @scala.inline
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
  }
  
}

