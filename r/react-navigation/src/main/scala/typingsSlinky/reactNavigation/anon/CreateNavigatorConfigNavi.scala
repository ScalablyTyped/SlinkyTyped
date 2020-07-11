package typingsSlinky.reactNavigation.anon

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
trait CreateNavigatorConfigNavi extends js.Object {
  var backBehavior: js.UndefOr[none | initialRoute | history | order] = js.undefined
  var defaultNavigationOptions: js.UndefOr[
    NavigationScreenConfig[
      js.Object, 
      NavigationSwitchProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ]
  ] = js.undefined
  var initialRouteName: js.UndefOr[String] = js.undefined
  var initialRouteParams: js.UndefOr[NavigationParams] = js.undefined
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      StringDictionary[_], 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ]
  ] = js.undefined
  var order: js.UndefOr[js.Array[String]] = js.undefined
  var paths: js.UndefOr[NavigationPathsConfig] = js.undefined
   // defaults to 'none'
  var resetOnBlur: js.UndefOr[Boolean] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackBehavior(value: none | initialRoute | history | order): Self = this.set("backBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackBehavior: Self = this.set("backBehavior", js.undefined)
    @scala.inline
    def setDefaultNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationSwitchProp[NavigationRoute[NavigationParams], NavigationParams], _]) with NavigationOptionsOptions[js.Object] => js.Object
    ): Self = this.set("defaultNavigationOptions", js.Any.fromFunction1(value))
    @scala.inline
    def setDefaultNavigationOptions(
      value: NavigationScreenConfig[
          js.Object, 
          NavigationSwitchProp[NavigationRoute[NavigationParams], NavigationParams], 
          _
        ]
    ): Self = this.set("defaultNavigationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultNavigationOptions: Self = this.set("defaultNavigationOptions", js.undefined)
    @scala.inline
    def setInitialRouteName(value: String): Self = this.set("initialRouteName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialRouteName: Self = this.set("initialRouteName", js.undefined)
    @scala.inline
    def setInitialRouteParams(value: NavigationParams): Self = this.set("initialRouteParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialRouteParams: Self = this.set("initialRouteParams", js.undefined)
    @scala.inline
    def setNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], _]) with NavigationOptionsOptions[StringDictionary[_]] => StringDictionary[_]
    ): Self = this.set("navigationOptions", js.Any.fromFunction1(value))
    @scala.inline
    def setNavigationOptions(
      value: NavigationScreenConfig[
          StringDictionary[_], 
          NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
          _
        ]
    ): Self = this.set("navigationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationOptions: Self = this.set("navigationOptions", js.undefined)
    @scala.inline
    def setOrderVarargs(value: String*): Self = this.set("order", js.Array(value :_*))
    @scala.inline
    def setOrder(value: js.Array[String]): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setPaths(value: NavigationPathsConfig): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    @scala.inline
    def setResetOnBlur(value: Boolean): Self = this.set("resetOnBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetOnBlur: Self = this.set("resetOnBlur", js.undefined)
  }
  
}

