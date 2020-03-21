package typingsSlinky.ionicReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CustomEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.ionicCore.componentsMod._Global_.HTMLIonModalElement
import typingsSlinky.ionicCore.mod.FrameworkDelegate
import typingsSlinky.ionicCore.mod.Mode
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import typingsSlinky.ionicReact.childrenReactNodeforwarde
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IonModal
  extends ExternalComponentWithAttributesWithRefType[tag.type, Ref[js.Any] with js.Object] {
  @JSImport("@ionic/react", "IonModal")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id */
  def apply(
    isOpen: Boolean,
    animated: js.UndefOr[Boolean] = js.undefined,
    backdropDismiss: js.UndefOr[Boolean] = js.undefined,
    cssClass: String | js.Array[String] = null,
    delegate: FrameworkDelegate = null,
    enterAnimation: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation] = null,
    forwardedRef: ReactRef[HTMLIonModalElement] = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    leaveAnimation: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation] = null,
    mode: Mode = null,
    onDidDismiss: /* event */ CustomEvent => Unit = null,
    onDidPresent: /* event */ CustomEvent => Unit = null,
    onWillDismiss: /* event */ CustomEvent => Unit = null,
    onWillPresent: /* event */ CustomEvent => Unit = null,
    showBackdrop: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, Ref[js.Any] with js.Object] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (!js.isUndefined(backdropDismiss)) __obj.updateDynamic("backdropDismiss")(backdropDismiss.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (delegate != null) __obj.updateDynamic("delegate")(delegate.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(js.Any.fromFunction3(enterAnimation))
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose.asInstanceOf[js.Any])
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(js.Any.fromFunction3(leaveAnimation))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onDidDismiss != null) __obj.updateDynamic("onDidDismiss")(js.Any.fromFunction1(onDidDismiss))
    if (onDidPresent != null) __obj.updateDynamic("onDidPresent")(js.Any.fromFunction1(onDidPresent))
    if (onWillDismiss != null) __obj.updateDynamic("onWillDismiss")(js.Any.fromFunction1(onWillDismiss))
    if (onWillPresent != null) __obj.updateDynamic("onWillPresent")(js.Any.fromFunction1(onWillPresent))
    if (!js.isUndefined(showBackdrop)) __obj.updateDynamic("showBackdrop")(showBackdrop.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = childrenReactNodeforwarde
}

