package typingsSlinky.ionicCore.componentsMod.LocalJSX

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.ionicCore.ionicCoreStrings.ios
import typingsSlinky.ionicCore.ionicCoreStrings.md
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.pickerInterfaceMod.PickerButton
import typingsSlinky.ionicCore.pickerInterfaceMod.PickerColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonPicker extends js.Object {
  /**
    * If `true`, the picker will animate.
    */
  var animated: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the picker will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: js.UndefOr[Boolean] = js.native
  /**
    * Array of buttons to be displayed at the top of the picker.
    */
  var buttons: js.UndefOr[js.Array[PickerButton]] = js.native
  /**
    * Array of columns to be displayed in the picker.
    */
  var columns: js.UndefOr[js.Array[PickerColumn]] = js.native
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Number of milliseconds to wait before dismissing the picker.
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Animation to use when the picker is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: js.UndefOr[Boolean] = js.native
  /**
    * Animation to use when the picker is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  /**
    * Emitted after the picker has dismissed.
    */
  var onIonPickerDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted after the picker has presented.
    */
  var onIonPickerDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted before the picker has dismissed.
    */
  var onIonPickerWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted before the picker has presented.
    */
  var onIonPickerWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * If `true`, a backdrop will be displayed behind the picker.
    */
  var showBackdrop: js.UndefOr[Boolean] = js.native
}

object IonPicker {
  @scala.inline
  def apply(): IonPicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonPicker]
  }
  @scala.inline
  implicit class IonPickerOps[Self <: IonPicker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdropDismiss(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropDismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withButtons(value: js.Array[PickerButton]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[PickerColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterAnimation(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterAnimation")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutEnterAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardClose")(js.undefined)
        ret
    }
    @scala.inline
    def withLeaveAnimation(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveAnimation")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutLeaveAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: ios | md): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonPickerDidDismiss(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonPickerDidDismiss")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonPickerDidDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonPickerDidDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonPickerDidPresent(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonPickerDidPresent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonPickerDidPresent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonPickerDidPresent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonPickerWillDismiss(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonPickerWillDismiss")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonPickerWillDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonPickerWillDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonPickerWillPresent(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonPickerWillPresent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonPickerWillPresent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonPickerWillPresent")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBackdrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBackdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBackdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBackdrop")(js.undefined)
        ret
    }
  }
  
}

