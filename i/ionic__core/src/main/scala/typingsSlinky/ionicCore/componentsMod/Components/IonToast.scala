package typingsSlinky.ionicCore.componentsMod.Components

import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.ionicCoreStrings.bottom
import typingsSlinky.ionicCore.ionicCoreStrings.ios
import typingsSlinky.ionicCore.ionicCoreStrings.md
import typingsSlinky.ionicCore.ionicCoreStrings.middle
import typingsSlinky.ionicCore.ionicCoreStrings.top
import typingsSlinky.ionicCore.mod.Color
import typingsSlinky.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typingsSlinky.ionicCore.sanitizationMod.IonicSafeString
import typingsSlinky.ionicCore.toastInterfaceMod.ToastButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonToast extends js.Object {
  
  /**
    * If `true`, the toast will animate.
    */
  var animated: Boolean = js.native
  
  /**
    * An array of buttons for the toast.
    */
  var buttons: js.UndefOr[js.Array[ToastButton | String]] = js.native
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.native
  
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Dismiss the toast overlay after it has been presented.
    * @param data Any data to emit in the dismiss events.
    * @param role The role of the element that is dismissing the toast. This can be useful in a button handler for determining which button was clicked to dismiss the toast. Some examples include: ``"cancel"`, `"destructive"`, "selected"`, and `"backdrop"`.
    */
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  
  /**
    * How many milliseconds to wait before hiding the toast. By default, it will show until `dismiss()` is called.
    */
  var duration: Double = js.native
  
  /**
    * Animation to use when the toast is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
  
  /**
    * Header to be shown in the toast.
    */
  var header: js.UndefOr[String] = js.native
  
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: Boolean = js.native
  
  /**
    * Animation to use when the toast is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
  
  /**
    * Message to be shown in the toast.
    */
  var message: js.UndefOr[String | IonicSafeString] = js.native
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  
  /**
    * Returns a promise that resolves when the toast did dismiss.
    */
  def onDidDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
  
  /**
    * Returns a promise that resolves when the toast will dismiss.
    */
  def onWillDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
  
  var overlayIndex: Double = js.native
  
  /**
    * The position of the toast on the screen.
    */
  var position: top | bottom | middle = js.native
  
  /**
    * Present the toast overlay after it has been created.
    */
  def present(): js.Promise[Unit] = js.native
  
  /**
    * If `true`, the toast will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  var translucent: Boolean = js.native
}
