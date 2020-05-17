package typingsSlinky.ionicAngular

import typingsSlinky.angularCommon.mod.Location
import typingsSlinky.angularCore.mod.ComponentRef
import typingsSlinky.angularCore.mod.NgZone
import typingsSlinky.angularRouter.mod.ActivatedRoute
import typingsSlinky.angularRouter.mod.Router
import typingsSlinky.ionicAngular.navControllerMod.NavController
import typingsSlinky.ionicAngular.stackUtilsMod.RouteView
import typingsSlinky.ionicAngular.stackUtilsMod.StackEvent
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonRouterOutletElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/navigation/stack-controller", JSImport.Namespace)
@js.native
object stackControllerMod extends js.Object {
  @js.native
  class StackController protected () extends js.Object {
    def this(
      tabsPrefix: js.UndefOr[String],
      containerEl: HTMLIonRouterOutletElement,
      router: Router,
      navCtrl: NavController,
      zone: NgZone,
      location: Location
    ) = this()
    var activeView: js.Any = js.native
    var containerEl: js.Any = js.native
    var getStack: js.Any = js.native
    var insertView: js.Any = js.native
    var location: js.Any = js.native
    var navCtrl: js.Any = js.native
    var nextId: js.Any = js.native
    var router: js.Any = js.native
    var runningTask: js.UndefOr[js.Any] = js.native
    var skipTransition: js.Any = js.native
    var tabsPrefix: js.Any = js.native
    var transition: js.Any = js.native
    var views: js.Any = js.native
    @JSName("wait")
    var wait_FStackController: js.Any = js.native
    var zone: js.Any = js.native
    def canGoBack(deep: Double): Boolean = js.native
    def canGoBack(deep: Double, stackId: String): Boolean = js.native
    def createView(ref: ComponentRef[_], activatedRoute: ActivatedRoute): RouteView = js.native
    def destroy(): Unit = js.native
    def endBackTransition(shouldComplete: Boolean): Unit = js.native
    def getActiveStackId(): js.UndefOr[String] = js.native
    def getExistingView(activatedRoute: ActivatedRoute): js.UndefOr[RouteView] = js.native
    def getLastUrl(): js.UndefOr[RouteView] = js.native
    def getLastUrl(stackId: String): js.UndefOr[RouteView] = js.native
    def pop(deep: Double): js.Promise[Boolean] = js.native
    def pop(deep: Double, stackId: String): js.Promise[Boolean] = js.native
    def setActive(enteringView: RouteView): js.Promise[StackEvent] = js.native
    def startBackTransition(): js.Promise[Boolean | Unit] = js.native
  }
  
}

