package typingsSlinky.reactNavigation

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationPathsConfig
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigation.mod.NavigationScreenConfig
import typingsSlinky.reactNavigation.mod.NavigationScreenConfigProps
import typingsSlinky.reactNavigation.mod.NavigationScreenProp
import typingsSlinky.reactNavigation.mod.NavigationSwitchProp
import typingsSlinky.reactNavigation.reactNavigationStrings.history
import typingsSlinky.reactNavigation.reactNavigationStrings.initialRoute
import typingsSlinky.reactNavigation.reactNavigationStrings.none
import typingsSlinky.reactNavigation.reactNavigationStrings.order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation.react-navigation.CreateNavigatorConfig<{}, react-navigation.react-navigation.NavigationSwitchRouterConfig, {}, react-navigation.react-navigation.NavigationSwitchProp<react-navigation.react-navigation.NavigationRoute<react-navigation.react-navigation.NavigationParams>, react-navigation.react-navigation.NavigationParams>> */
@js.native
trait CreateNavigatorConfigNavi extends js.Object {
  var backBehavior: js.UndefOr[none | initialRoute | history | order] = js.native
  var defaultNavigationOptions: js.UndefOr[
    NavigationScreenConfig[
      js.Object, 
      NavigationSwitchProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ]
  ] = js.native
  var initialRouteName: js.UndefOr[String] = js.native
  var initialRouteParams: js.UndefOr[NavigationParams] = js.native
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      StringDictionary[_], 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ]
  ] = js.native
  var order: js.UndefOr[js.Array[String]] = js.native
  var paths: js.UndefOr[NavigationPathsConfig] = js.native
   // defaults to 'none'
  var resetOnBlur: js.UndefOr[Boolean] = js.native
}

object CreateNavigatorConfigNavi {
  @scala.inline
  def apply(): CreateNavigatorConfigNavi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNavigatorConfigNavi]
  }
  @scala.inline
  implicit class CreateNavigatorConfigNaviOps[Self <: CreateNavigatorConfigNavi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackBehavior(value: none | initialRoute | history | order): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationSwitchProp[NavigationRoute[NavigationParams], NavigationParams], _]) with AnonNavigationOptionsOptions[js.Object] => js.Object
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNavigationOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDefaultNavigationOptions(
      value: NavigationScreenConfig[
          js.Object, 
          NavigationSwitchProp[NavigationRoute[NavigationParams], NavigationParams], 
          _
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNavigationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultNavigationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNavigationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialRouteName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRouteName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialRouteName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRouteName")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialRouteParams(value: NavigationParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRouteParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialRouteParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRouteParams")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], _]) with AnonNavigationOptionsOptions[StringDictionary[_]] => StringDictionary[_]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNavigationOptions(
      value: NavigationScreenConfig[
          StringDictionary[_], 
          NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
          _
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withPaths(value: NavigationPathsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
    @scala.inline
    def withResetOnBlur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnBlur")(js.undefined)
        ret
    }
  }
  
}

