package typingsSlinky.ionicCore.componentsMod.Components

import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.ionicCoreStrings.ios
import typingsSlinky.ionicCore.ionicCoreStrings.md
import typingsSlinky.ionicCore.mod.ComponentProps
import typingsSlinky.ionicCore.mod.ComponentRef
import typingsSlinky.ionicCore.mod.FrameworkDelegate
import typingsSlinky.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonPopover extends js.Object {
  
  /**
    * If `true`, the popover will animate.
    */
  var animated: Boolean = js.native
  
  /**
    * If `true`, the popover will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: Boolean = js.native
  
  /**
    * The component to display inside of the popover.
    */
  var component: ComponentRef = js.native
  
  /**
    * The data to pass to the popover component.
    */
  var componentProps: js.UndefOr[ComponentProps[Null]] = js.native
  
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  
  var delegate: js.UndefOr[FrameworkDelegate] = js.native
  
  /**
    * Dismiss the popover overlay after it has been presented.
    * @param data Any data to emit in the dismiss events.
    * @param role The role of the element that is dismissing the popover. For example, 'cancel' or 'backdrop'.
    */
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  
  /**
    * Animation to use when the popover is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
  
  /**
    * The event to pass to the popover animation.
    */
  var event: js.Any = js.native
  
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: Boolean = js.native
  
  /**
    * Animation to use when the popover is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  
  /**
    * Returns a promise that resolves when the popover did dismiss.
    */
  def onDidDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
  
  /**
    * Returns a promise that resolves when the popover will dismiss.
    */
  def onWillDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
  
  var overlayIndex: Double = js.native
  
  /**
    * Present the popover overlay after it has been created.
    */
  def present(): js.Promise[Unit] = js.native
  
  /**
    * If `true`, a backdrop will be displayed behind the popover.
    */
  var showBackdrop: Boolean = js.native
  
  /**
    * If `true`, the popover will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  var translucent: Boolean = js.native
}
