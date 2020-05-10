package typingsSlinky.antDesignReactNative.searchBarStyleMod

import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBarStyle extends js.Object {
  var cancelText: TextStyle = js.native
  var cancelTextContainer: ViewStyle = js.native
  var input: TextStyle = js.native
  var inputWrapper: ViewStyle = js.native
  var search: TextStyle = js.native
  var wrapper: ViewStyle = js.native
}

object SearchBarStyle {
  @scala.inline
  def apply(
    cancelText: TextStyle,
    cancelTextContainer: ViewStyle,
    input: TextStyle,
    inputWrapper: ViewStyle,
    search: TextStyle,
    wrapper: ViewStyle
  ): SearchBarStyle = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], cancelTextContainer = cancelTextContainer.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inputWrapper = inputWrapper.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarStyle]
  }
  @scala.inline
  implicit class SearchBarStyleOps[Self <: SearchBarStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelTextContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelTextContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputWrapper(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapper(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

