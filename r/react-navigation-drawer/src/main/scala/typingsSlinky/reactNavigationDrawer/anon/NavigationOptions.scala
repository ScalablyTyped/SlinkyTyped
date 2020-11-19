package typingsSlinky.reactNavigationDrawer.anon

import typingsSlinky.reactNavigation.anon.NavigationOptionsOptions
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigation.mod.NavigationScreenConfig
import typingsSlinky.reactNavigation.mod.NavigationScreenConfigProps
import typingsSlinky.reactNavigationDrawer.typesMod.NavigationDrawerOptions
import typingsSlinky.reactNavigationDrawer.typesMod.NavigationDrawerProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationOptions[Params, ScreenProps] extends js.Object {
  
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], Params], 
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
  implicit class NavigationOptionsOps[Self <: NavigationOptions[_, _], Params, ScreenProps] (val x: Self with (NavigationOptions[Params, ScreenProps])) extends AnyVal {
    
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
    def setNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationDrawerProp[NavigationRoute[NavigationParams], Params], ScreenProps]) with NavigationOptionsOptions[NavigationDrawerOptions] => NavigationDrawerOptions
    ): Self = this.set("navigationOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNavigationOptions(
      value: NavigationScreenConfig[
          NavigationDrawerOptions, 
          NavigationDrawerProp[NavigationRoute[NavigationParams], Params], 
          ScreenProps
        ]
    ): Self = this.set("navigationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigationOptions: Self = this.set("navigationOptions", js.undefined)
  }
}
