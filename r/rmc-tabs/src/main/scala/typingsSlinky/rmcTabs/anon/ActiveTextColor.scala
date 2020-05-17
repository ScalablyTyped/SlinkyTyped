package typingsSlinky.rmcTabs.anon

import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveTextColor extends js.Object {
  var activeTextColor: String = js.native
  var container: Height = js.native
  var inactiveTextColor: String = js.native
  var tab: ViewStyle = js.native
  var tabs: ViewStyle = js.native
  var textStyle: ViewStyle = js.native
  var underline: ViewStyle = js.native
}

object ActiveTextColor {
  @scala.inline
  def apply(
    activeTextColor: String,
    container: Height,
    inactiveTextColor: String,
    tab: ViewStyle,
    tabs: ViewStyle,
    textStyle: ViewStyle,
    underline: ViewStyle
  ): ActiveTextColor = {
    val __obj = js.Dynamic.literal(activeTextColor = activeTextColor.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], inactiveTextColor = inactiveTextColor.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTextColor]
  }
  @scala.inline
  implicit class ActiveTextColorOps[Self <: ActiveTextColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInactiveTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTab(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabs(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnderline(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

