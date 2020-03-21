package typingsSlinky.ionicReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CustomEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.ionicCore.componentsMod._Global_.HTMLIonToastElement
import typingsSlinky.ionicCore.mod.Color
import typingsSlinky.ionicCore.mod.Mode
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import typingsSlinky.ionicReact.ToastOptionsReactControll
import typingsSlinky.ionicReact.ionToastMod.ToastButton
import typingsSlinky.ionicReact.ionicReactStrings.bottom
import typingsSlinky.ionicReact.ionicReactStrings.middle
import typingsSlinky.ionicReact.ionicReactStrings.top
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IonToast
  extends ExternalComponentWithAttributesWithRefType[tag.type, Ref[js.Any] with js.Object] {
  @JSImport("@ionic/react", "IonToast")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id */
  def apply(
    isOpen: Boolean,
    animated: js.UndefOr[Boolean] = js.undefined,
    buttons: js.Array[ToastButton | String] = null,
    closeButtonText: String = null,
    color: Color = null,
    cssClass: String | js.Array[String] = null,
    duration: Int | Double = null,
    enterAnimation: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation] = null,
    forwardedRef: ReactRef[HTMLIonToastElement] = null,
    header: String = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    leaveAnimation: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation] = null,
    message: String = null,
    mode: Mode = null,
    onDidDismiss: /* event */ CustomEvent => Unit = null,
    onDidPresent: /* event */ CustomEvent => Unit = null,
    onWillDismiss: /* event */ CustomEvent => Unit = null,
    onWillPresent: /* event */ CustomEvent => Unit = null,
    position: top | bottom | middle = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    translucent: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, Ref[js.Any] with js.Object] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (closeButtonText != null) __obj.updateDynamic("closeButtonText")(closeButtonText.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(js.Any.fromFunction3(enterAnimation))
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose.asInstanceOf[js.Any])
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(js.Any.fromFunction3(leaveAnimation))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onDidDismiss != null) __obj.updateDynamic("onDidDismiss")(js.Any.fromFunction1(onDidDismiss))
    if (onDidPresent != null) __obj.updateDynamic("onDidPresent")(js.Any.fromFunction1(onDidPresent))
    if (onWillDismiss != null) __obj.updateDynamic("onWillDismiss")(js.Any.fromFunction1(onWillDismiss))
    if (onWillPresent != null) __obj.updateDynamic("onWillPresent")(js.Any.fromFunction1(onWillPresent))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ToastOptionsReactControll
}

