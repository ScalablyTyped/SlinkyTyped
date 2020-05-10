package typingsSlinky.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps] extends js.Object {
  var navigation: NavigationScreenPropType = js.native
  var screenProps: ScreenProps = js.native
  var theme: SupportedThemes = js.native
}

object NavigationScreenConfigProps {
  @scala.inline
  def apply[NavigationScreenPropType, ScreenProps](navigation: NavigationScreenPropType, screenProps: ScreenProps, theme: SupportedThemes): NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps]]
  }
  @scala.inline
  implicit class NavigationScreenConfigPropsOps[Self[navigationscreenproptype, screenprops] <: NavigationScreenConfigProps[navigationscreenproptype, screenprops], NavigationScreenPropType, ScreenProps] (val x: Self[NavigationScreenPropType, ScreenProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[NavigationScreenPropType, ScreenProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[NavigationScreenPropType, ScreenProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[NavigationScreenPropType, ScreenProps]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[NavigationScreenPropType, ScreenProps]) with Other]
    @scala.inline
    def withNavigation(value: NavigationScreenPropType): Self[NavigationScreenPropType, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenProps(value: ScreenProps): Self[NavigationScreenPropType, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheme(value: SupportedThemes): Self[NavigationScreenPropType, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

