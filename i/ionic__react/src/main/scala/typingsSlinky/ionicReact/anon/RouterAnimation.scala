package typingsSlinky.ionicReact.anon

import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicReact.routerDirectionMod.RouterDirection
import typingsSlinky.ionicReact.routerOptionsMod.RouterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterAnimation extends StObject {
  
  var routerAnimation: js.UndefOr[AnimationBuilder] = js.native
  
  var routerDirection: js.UndefOr[RouterDirection] = js.native
  
  var routerLink: js.UndefOr[String] = js.native
  
  var routerOptions: js.UndefOr[RouterOptions] = js.native
}
object RouterAnimation {
  
  @scala.inline
  def apply(): RouterAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterAnimation]
  }
  
  @scala.inline
  implicit class RouterAnimationMutableBuilder[Self <: RouterAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRouterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "routerAnimation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRouterAnimationUndefined: Self = StObject.set(x, "routerAnimation", js.undefined)
    
    @scala.inline
    def setRouterDirection(value: RouterDirection): Self = StObject.set(x, "routerDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouterDirectionUndefined: Self = StObject.set(x, "routerDirection", js.undefined)
    
    @scala.inline
    def setRouterLink(value: String): Self = StObject.set(x, "routerLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouterLinkUndefined: Self = StObject.set(x, "routerLink", js.undefined)
    
    @scala.inline
    def setRouterOptions(value: RouterOptions): Self = StObject.set(x, "routerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouterOptionsUndefined: Self = StObject.set(x, "routerOptions", js.undefined)
  }
}
