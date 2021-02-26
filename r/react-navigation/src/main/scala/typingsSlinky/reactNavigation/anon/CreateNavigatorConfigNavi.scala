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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-navigation.react-navigation.CreateNavigatorConfig<{}, react-navigation.react-navigation.NavigationSwitchRouterConfig, {}, react-navigation.react-navigation.NavigationSwitchProp<react-navigation.react-navigation.NavigationRoute<react-navigation.react-navigation.NavigationParams>, react-navigation.react-navigation.NavigationParams>> */
@js.native
trait CreateNavigatorConfigNavi extends StObject {
  
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
  implicit class CreateNavigatorConfigNaviMutableBuilder[Self <: CreateNavigatorConfigNavi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackBehavior(value: none | initialRoute | history | order): Self = StObject.set(x, "backBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackBehaviorUndefined: Self = StObject.set(x, "backBehavior", js.undefined)
    
    @scala.inline
    def setDefaultNavigationOptions(
      value: NavigationScreenConfig[
          js.Object, 
          NavigationSwitchProp[NavigationRoute[NavigationParams], NavigationParams], 
          _
        ]
    ): Self = StObject.set(x, "defaultNavigationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationSwitchProp[NavigationRoute[NavigationParams], NavigationParams], _]) with NavigationOptionsOptions[js.Object] => js.Object
    ): Self = StObject.set(x, "defaultNavigationOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDefaultNavigationOptionsUndefined: Self = StObject.set(x, "defaultNavigationOptions", js.undefined)
    
    @scala.inline
    def setInitialRouteName(value: String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
    
    @scala.inline
    def setInitialRouteParams(value: NavigationParams): Self = StObject.set(x, "initialRouteParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialRouteParamsUndefined: Self = StObject.set(x, "initialRouteParams", js.undefined)
    
    @scala.inline
    def setNavigationOptions(
      value: NavigationScreenConfig[
          StringDictionary[_], 
          NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
          _
        ]
    ): Self = StObject.set(x, "navigationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], _]) with NavigationOptionsOptions[StringDictionary[_]] => StringDictionary[_]
    ): Self = StObject.set(x, "navigationOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNavigationOptionsUndefined: Self = StObject.set(x, "navigationOptions", js.undefined)
    
    @scala.inline
    def setOrder(value: js.Array[String]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setOrderVarargs(value: String*): Self = StObject.set(x, "order", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: NavigationPathsConfig): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    @scala.inline
    def setResetOnBlur(value: Boolean): Self = StObject.set(x, "resetOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetOnBlurUndefined: Self = StObject.set(x, "resetOnBlur", js.undefined)
  }
}
