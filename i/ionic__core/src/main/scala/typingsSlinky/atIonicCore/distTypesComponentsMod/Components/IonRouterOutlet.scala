package typingsSlinky.atIonicCore.distTypesComponentsMod.Components

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atIonicCore.atIonicCoreMod.ComponentProps
import typingsSlinky.atIonicCore.atIonicCoreMod.FrameworkDelegate
import typingsSlinky.atIonicCore.atIonicCoreStrings.ios
import typingsSlinky.atIonicCore.atIonicCoreStrings.md
import typingsSlinky.atIonicCore.distTypesComponentsNavNavDashInterfaceMod.RouterOutletOptions
import typingsSlinky.atIonicCore.distTypesComponentsNavNavDashInterfaceMod.SwipeGestureHandler
import typingsSlinky.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod.RouteID
import typingsSlinky.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod.RouteWrite
import typingsSlinky.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import typingsSlinky.atIonicCore.distTypesUtilsAnimationOldDashAnimationAnimationDashInterfaceMod.AnimationBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonRouterOutlet extends js.Object {
  /**
    * If `true`, the router-outlet should animate the transition of components.
    */
  var animated: Boolean = js.native
  /**
    * By default `ion-nav` animates transition between pages based in the mode (ios or material design). However, this property allows to create custom transition using `AnimateBuilder` functions.
    */
  var animation: js.UndefOr[AnimationBuilder] = js.native
  var delegate: js.UndefOr[FrameworkDelegate] = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: ios | md = js.native
  var swipeHandler: js.UndefOr[SwipeGestureHandler] = js.native
  def commit(enteringEl: HTMLElement): js.Promise[Boolean] = js.native
  def commit(enteringEl: HTMLElement, leavingEl: js.UndefOr[scala.Nothing], opts: RouterOutletOptions): js.Promise[Boolean] = js.native
  def commit(enteringEl: HTMLElement, leavingEl: typingsSlinky.std.HTMLElement): js.Promise[Boolean] = js.native
  def commit(enteringEl: HTMLElement, leavingEl: typingsSlinky.std.HTMLElement, opts: RouterOutletOptions): js.Promise[Boolean] = js.native
  def getRouteId(): js.Promise[js.UndefOr[RouteID]] = js.native
  def setRouteId(id: String, params: js.UndefOr[scala.Nothing], direction: RouterDirection): js.Promise[RouteWrite] = js.native
  def setRouteId(id: String, params: ComponentProps[Null], direction: RouterDirection): js.Promise[RouteWrite] = js.native
}

