package typingsSlinky.ionicAngular

import typingsSlinky.angularCore.mod.EventEmitter
import typingsSlinky.ionicAngular.anon.Tab
import typingsSlinky.ionicAngular.ionRouterOutletMod.IonRouterOutlet
import typingsSlinky.ionicAngular.navControllerMod.NavController
import typingsSlinky.ionicAngular.proxiesMod.IonTabBar
import typingsSlinky.ionicAngular.stackUtilsMod.StackEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/navigation/ion-tabs", JSImport.Namespace)
@js.native
object ionTabsMod extends js.Object {
  @js.native
  class IonTabs protected () extends js.Object {
    def this(navCtrl: NavController) = this()
    var ionTabsDidChange: EventEmitter[Tab] = js.native
    var ionTabsWillChange: EventEmitter[Tab] = js.native
    var navCtrl: js.Any = js.native
    var outlet: IonRouterOutlet = js.native
    var tabBar: js.UndefOr[IonTabBar] = js.native
    def getSelected(): js.UndefOr[String] = js.native
    /**
      * @internal
      */
    def onPageSelected(detail: StackEvent): Unit = js.native
    def select(tab: String): js.Promise[Boolean] = js.native
  }
  
}

