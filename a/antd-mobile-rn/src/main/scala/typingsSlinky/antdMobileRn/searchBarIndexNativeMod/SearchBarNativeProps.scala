package typingsSlinky.antdMobileRn.searchBarIndexNativeMod

import typingsSlinky.antdMobileRn.anon.NativeEvent
import typingsSlinky.antdMobileRn.searchBarPropsTypeMod.SearchBarPropsType
import typingsSlinky.antdMobileRn.searchBarStyleIndexNativeMod.ISearchBarStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBarNativeProps extends SearchBarPropsType {
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.native
  var onSubmitEditing: js.UndefOr[js.Function1[/* event */ NativeEvent, Unit]] = js.native
  var style: js.UndefOr[StyleProp[TextStyle]] = js.native
  @JSName("styles")
  var styles_SearchBarNativeProps: ISearchBarStyle = js.native
}

object SearchBarNativeProps {
  @scala.inline
  def apply(styles: ISearchBarStyle): SearchBarNativeProps = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarNativeProps]
  }
  @scala.inline
  implicit class SearchBarNativePropsOps[Self <: SearchBarNativeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyles(value: ISearchBarStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
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

