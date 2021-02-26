package typingsSlinky.ionicCore.componentsMod.Components

import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.ionicCoreStrings.ios
import typingsSlinky.ionicCore.ionicCoreStrings.md
import typingsSlinky.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typingsSlinky.ionicCore.pickerInterfaceMod.PickerButton
import typingsSlinky.ionicCore.pickerInterfaceMod.PickerColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonPicker extends StObject {
  
  /**
    * If `true`, the picker will animate.
    */
  var animated: Boolean = js.native
  
  /**
    * If `true`, the picker will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: Boolean = js.native
  
  /**
    * Array of buttons to be displayed at the top of the picker.
    */
  var buttons: js.Array[PickerButton] = js.native
  
  /**
    * Array of columns to be displayed in the picker.
    */
  var columns: js.Array[PickerColumn] = js.native
  
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Dismiss the picker overlay after it has been presented.
    * @param data Any data to emit in the dismiss events.
    * @param role The role of the element that is dismissing the picker. This can be useful in a button handler for determining which button was clicked to dismiss the picker. Some examples include: ``"cancel"`, `"destructive"`, "selected"`, and `"backdrop"`.
    */
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  
  /**
    * Number of milliseconds to wait before dismissing the picker.
    */
  var duration: Double = js.native
  
  /**
    * Animation to use when the picker is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
  
  /**
    * Get the column that matches the specified name.
    * @param name The name of the column.
    */
  def getColumn(name: String): js.Promise[js.UndefOr[PickerColumn]] = js.native
  
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: Boolean = js.native
  
  /**
    * Animation to use when the picker is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  
  /**
    * Returns a promise that resolves when the picker did dismiss.
    */
  def onDidDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
  
  /**
    * Returns a promise that resolves when the picker will dismiss.
    */
  def onWillDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
  
  var overlayIndex: Double = js.native
  
  /**
    * Present the picker overlay after it has been created.
    */
  def present(): js.Promise[Unit] = js.native
  
  /**
    * If `true`, a backdrop will be displayed behind the picker.
    */
  var showBackdrop: Boolean = js.native
}
