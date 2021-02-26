package typingsSlinky.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.interfaceMod.NavOutlet
import typingsSlinky.ionicCore.mod.FrameworkDelegate
import typingsSlinky.ionicCore.mod.Mode
import typingsSlinky.ionicCore.navInterfaceMod.RouterOutletOptions
import typingsSlinky.ionicCore.navInterfaceMod.SwipeGestureHandler
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeOutletMod {
  
  @JSImport("@ionic/core/dist/types/components/router-outlet/route-outlet", "RouterOutlet")
  @js.native
  class RouterOutlet ()
    extends ComponentInterface
       with NavOutlet {
    
    var activeComponent: js.Any = js.native
    
    var activeEl: js.Any = js.native
    
    var ani: js.Any = js.native
    
    /**
      * If `true`, the router-outlet should animate the transition of components.
      */
    var animated: Boolean = js.native
    
    /**
      * By default `ion-nav` animates transition between pages based in the mode (ios or material design).
      * However, this property allows to create custom transition using `AnimateBuilder` functions.
      */
    var animation: js.UndefOr[AnimationBuilder] = js.native
    
    var animationEnabled: js.Any = js.native
    
    /** @internal */
    def commit(enteringEl: HTMLElement): js.Promise[Boolean] = js.native
    def commit(enteringEl: HTMLElement, leavingEl: js.UndefOr[scala.Nothing], opts: RouterOutletOptions): js.Promise[Boolean] = js.native
    def commit(enteringEl: HTMLElement, leavingEl: HTMLElement): js.Promise[Boolean] = js.native
    def commit(enteringEl: HTMLElement, leavingEl: HTMLElement, opts: RouterOutletOptions): js.Promise[Boolean] = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MRouterOutlet(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MRouterOutlet(): js.Promise[Unit] = js.native
    
    /** @internal */
    var delegate: js.UndefOr[FrameworkDelegate] = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MRouterOutlet(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    var gesture: js.Any = js.native
    
    /** @internal */
    var ionNavDidChange: EventEmitter[Unit] = js.native
    
    /** @internal */
    var ionNavWillChange: EventEmitter[Unit] = js.native
    
    /** @internal */
    var ionNavWillLoad: EventEmitter[Unit] = js.native
    
    var lock: js.Any = js.native
    
    /**
      * The mode determines which platform styles to use.
      */
    var mode: Mode = js.native
    
    @JSName("render")
    def render_MRouterOutlet(): js.Any = js.native
    
    var setRoot: js.Any = js.native
    
    /** @internal */
    var swipeHandler: js.UndefOr[SwipeGestureHandler] = js.native
    
    def swipeHandlerChanged(): Unit = js.native
    
    var transition: js.Any = js.native
    
    var waitPromise: js.Any = js.native
  }
}
