package typingsSlinky.ionicAngular

import org.scalajs.dom.raw.UIEvent
import typingsSlinky.angularCommon.mod.LocationStrategy
import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularRouter.mod.Router
import typingsSlinky.angularRouter.mod.RouterLink
import typingsSlinky.ionicAngular.navControllerMod.NavController
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.interfaceMod.RouterDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerLinkDelegateMod {
  
  @JSImport("@ionic/angular/directives/navigation/router-link-delegate", "RouterLinkDelegate")
  @js.native
  class RouterLinkDelegate protected () extends StObject {
    def this(
      locationStrategy: LocationStrategy,
      navCtrl: NavController,
      elementRef: ElementRef[_],
      router: Router
    ) = this()
    def this(
      locationStrategy: LocationStrategy,
      navCtrl: NavController,
      elementRef: ElementRef[_],
      router: Router,
      routerLink: RouterLink
    ) = this()
    
    var elementRef: js.Any = js.native
    
    var locationStrategy: js.Any = js.native
    
    var navCtrl: js.Any = js.native
    
    def ngOnChanges(): js.Any = js.native
    
    def ngOnDestroy(): js.Any = js.native
    
    def ngOnInit(): Unit = js.native
    
    /**
      * @internal
      */
    def onClick(ev: UIEvent): Unit = js.native
    
    var router: js.Any = js.native
    
    var routerAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    var routerDirection: RouterDirection = js.native
    
    var routerLink: js.Any = js.native
    
    var subscription: js.Any = js.native
    
    var updateTargetUrlAndHref: js.Any = js.native
  }
}
