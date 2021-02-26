package typingsSlinky.reactNavigationStack.anon

import typingsSlinky.reactNavigation.anon.NavigationOptionsOptions
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigation.mod.NavigationScreenConfig
import typingsSlinky.reactNavigation.mod.NavigationScreenConfigProps
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackNavigationOptions
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackNavigationProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationOptions[Params, ScreenProps] extends StObject {
  
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      StackNavigationOptions, 
      StackNavigationProp[NavigationRoute[NavigationParams], Params], 
      ScreenProps
    ]
  ] = js.native
}
object NavigationOptions {
  
  @scala.inline
  def apply[Params, ScreenProps](): NavigationOptions[Params, ScreenProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationOptions[Params, ScreenProps]]
  }
  
  @scala.inline
  implicit class NavigationOptionsMutableBuilder[Self <: NavigationOptions[_, _], Params, ScreenProps] (val x: Self with (NavigationOptions[Params, ScreenProps])) extends AnyVal {
    
    @scala.inline
    def setNavigationOptions(
      value: NavigationScreenConfig[
          StackNavigationOptions, 
          StackNavigationProp[NavigationRoute[NavigationParams], Params], 
          ScreenProps
        ]
    ): Self = StObject.set(x, "navigationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[StackNavigationProp[NavigationRoute[NavigationParams], Params], ScreenProps]) with NavigationOptionsOptions[StackNavigationOptions] => StackNavigationOptions
    ): Self = StObject.set(x, "navigationOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNavigationOptionsUndefined: Self = StObject.set(x, "navigationOptions", js.undefined)
  }
}
