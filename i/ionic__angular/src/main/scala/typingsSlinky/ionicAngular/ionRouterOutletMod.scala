package typingsSlinky.ionicAngular

import typingsSlinky.angularCommon.mod.Location
import typingsSlinky.angularCore.mod.ComponentFactoryResolver
import typingsSlinky.angularCore.mod.ComponentRef
import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.EventEmitter
import typingsSlinky.angularCore.mod.NgZone
import typingsSlinky.angularCore.mod.OnDestroy
import typingsSlinky.angularCore.mod.OnInit
import typingsSlinky.angularCore.mod.ViewContainerRef
import typingsSlinky.angularRouter.mod.ActivatedRoute
import typingsSlinky.angularRouter.mod.ChildrenOutletContexts
import typingsSlinky.angularRouter.mod.OutletContext
import typingsSlinky.angularRouter.mod.Router
import typingsSlinky.ionicAngular.configMod.Config
import typingsSlinky.ionicAngular.navControllerMod.NavController
import typingsSlinky.ionicAngular.stackUtilsMod.RouteView
import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonRouterOutletElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionRouterOutletMod {
  
  @JSImport("@ionic/angular/directives/navigation/ion-router-outlet", "IonRouterOutlet")
  @js.native
  class IonRouterOutlet protected ()
    extends OnDestroy
       with OnInit {
    def this(
      parentContexts: ChildrenOutletContexts,
      location: ViewContainerRef,
      resolver: ComponentFactoryResolver,
      name: String,
      tabs: String,
      config: Config,
      navCtrl: NavController,
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
      config: Config,
      navCtrl: NavController,
      commonLocation: Location,
      elementRef: ElementRef[_],
      router: Router,
      zone: NgZone,
      activatedRoute: ActivatedRoute,
      parentOutlet: IonRouterOutlet
    ) = this()
    
    var _activatedRoute: js.Any = js.native
    
    var _swipeGesture: js.Any = js.native
    
    var activateEvents: EventEmitter[_] = js.native
    
    def activateWith(activatedRoute: ActivatedRoute): Unit = js.native
    def activateWith(activatedRoute: ActivatedRoute, resolver: ComponentFactoryResolver): Unit = js.native
    
    var activated: js.Any = js.native
    
    val activatedRoute: ActivatedRoute = js.native
    
    val activatedRouteData: js.Any = js.native
    
    var activatedView: RouteView | Null = js.native
    
    var animated: Boolean = js.native
    
    def animation(baseEl: js.Any): Animation = js.native
    def animation(baseEl: js.Any, opts: js.Any): Animation = js.native
    @JSName("animation")
    var animation_Original: AnimationBuilder = js.native
    
    /**
      * Called when the `RouteReuseStrategy` instructs to re-attach a previously detached subtree
      */
    def attach(_ref: ComponentRef[_], _activatedRoute: ActivatedRoute): Unit = js.native
    
    /**
      * Returns `true` if there are pages in the stack to go back.
      */
    def canGoBack(): Boolean = js.native
    def canGoBack(deep: js.UndefOr[scala.Nothing], stackId: String): Boolean = js.native
    def canGoBack(deep: Double): Boolean = js.native
    def canGoBack(deep: Double, stackId: String): Boolean = js.native
    
    val component: js.Object = js.native
    
    var config: js.Any = js.native
    
    /**
      * Since the activated route can change over the life time of a component in an ion router outlet, we create
      * a proxy so that we can update the values over time as a user navigates back to components already in the stack.
      */
    var createActivatedRouteProxy: js.Any = js.native
    
    @JSName("currentActivatedRoute$")
    var currentActivatedRoute$: js.Any = js.native
    
    def deactivate(): Unit = js.native
    
    var deactivateEvents: EventEmitter[_] = js.native
    
    /**
      * Called when the `RouteReuseStrategy` instructs to detach the subtree
      */
    def detach(): ComponentRef[_] = js.native
    
    /**
      * Returns the active stack ID. In the context of ion-tabs, it means the active tab.
      */
    def getActiveStackId(): js.UndefOr[String] = js.native
    
    def getContext(): OutletContext | Null = js.native
    
    /**
      * Returns the RouteView of the active page of each stack.
      * @internal
      */
    def getLastRouteView(): js.UndefOr[RouteView] = js.native
    def getLastRouteView(stackId: String): js.UndefOr[RouteView] = js.native
    
    /**
      * Returns the URL of the active page of each stack.
      */
    def getLastUrl(): js.UndefOr[String] = js.native
    def getLastUrl(stackId: String): js.UndefOr[String] = js.native
    
    /**
      * Returns the root view in the tab stack.
      * @internal
      */
    def getRootView(): js.UndefOr[RouteView] = js.native
    def getRootView(stackId: String): js.UndefOr[RouteView] = js.native
    
    val isActivated: Boolean = js.native
    
    var location: js.Any = js.native
    
    var name: js.Any = js.native
    
    var nativeEl: HTMLIonRouterOutletElement = js.native
    
    var navCtrl: js.Any = js.native
    
    var parentContexts: js.Any = js.native
    
    val parentOutlet: js.UndefOr[IonRouterOutlet] = js.native
    
    /**
      * Resolves to `true` if it the outlet was able to sucessfully pop the last N pages.
      */
    def pop(): js.Promise[Boolean] = js.native
    def pop(deep: js.UndefOr[scala.Nothing], stackId: String): js.Promise[Boolean] = js.native
    def pop(deep: Double): js.Promise[Boolean] = js.native
    def pop(deep: Double, stackId: String): js.Promise[Boolean] = js.native
    
    var proxyMap: js.Any = js.native
    
    /**
      * Create a wrapped observable that will switch to the latest activated route matched by the given component
      */
    var proxyObservable: js.Any = js.native
    
    var resolver: js.Any = js.native
    
    var stackCtrl: js.Any = js.native
    
    var stackEvents: EventEmitter[_] = js.native
    
    var swipeGesture: Boolean = js.native
    
    var tabsPrefix: js.UndefOr[String] = js.native
    
    /**
      * Updates the activated route proxy for the given component to the new incoming router state
      */
    var updateActivatedRouteProxy: js.Any = js.native
  }
}
