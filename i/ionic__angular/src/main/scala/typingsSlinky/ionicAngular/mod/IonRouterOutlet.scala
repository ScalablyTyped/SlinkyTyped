package typingsSlinky.ionicAngular.mod

import typingsSlinky.angularCommon.mod.Location
import typingsSlinky.angularCore.mod.ComponentFactoryResolver
import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.NgZone
import typingsSlinky.angularCore.mod.ViewContainerRef
import typingsSlinky.angularRouter.mod.ActivatedRoute
import typingsSlinky.angularRouter.mod.ChildrenOutletContexts
import typingsSlinky.angularRouter.mod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular", "IonRouterOutlet")
@js.native
class IonRouterOutlet protected ()
  extends typingsSlinky.ionicAngular.ionRouterOutletMod.IonRouterOutlet {
  def this(
    parentContexts: ChildrenOutletContexts,
    location: ViewContainerRef,
    resolver: ComponentFactoryResolver,
    name: String,
    tabs: String,
    config: typingsSlinky.ionicAngular.configMod.Config,
    navCtrl: typingsSlinky.ionicAngular.navControllerMod.NavController,
    commonLocation: Location,
    elementRef: ElementRef[_],
    router: Router,
    zone: NgZone,
    activatedRoute: ActivatedRoute
  ) = this()
  def this(
    parentContexts: ChildrenOutletContexts,
    location: ViewContainerRef,
    resolver: ComponentFactoryResolver,
    name: String,
    tabs: String,
    config: typingsSlinky.ionicAngular.configMod.Config,
    navCtrl: typingsSlinky.ionicAngular.navControllerMod.NavController,
    commonLocation: Location,
    elementRef: ElementRef[_],
    router: Router,
    zone: NgZone,
    activatedRoute: ActivatedRoute,
    parentOutlet: typingsSlinky.ionicAngular.ionRouterOutletMod.IonRouterOutlet
  ) = this()
}

