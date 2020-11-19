package typingsSlinky.ionicAngular

import org.scalajs.dom.raw.Event
import typingsSlinky.ionicAngular.configMod.Config
import typingsSlinky.ionicAngular.ionRouterOutletMod.IonRouterOutlet
import typingsSlinky.ionicAngular.navControllerMod.NavController
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/navigation/ion-back-button", JSImport.Namespace)
@js.native
object ionBackButtonMod extends js.Object {
  
  @js.native
  class IonBackButtonDelegate protected () extends js.Object {
    def this(routerOutlet: IonRouterOutlet, navCtrl: NavController, config: Config) = this()
    
    var config: js.Any = js.native
    
    var defaultHref: js.UndefOr[String | Null] = js.native
    
    var navCtrl: js.Any = js.native
    
    /**
      * @internal
      */
    def onClick(ev: Event): Unit = js.native
    
    var routerAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    var routerOutlet: js.Any = js.native
  }
}
