package typingsSlinky.blueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsCore.alertMod.IAlertProps
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Alert
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsCore.mod.Alert] {
  @JSImport("@blueprintjs/core", "Alert")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    isOpen: Boolean,
    canEscapeKeyCancel: js.UndefOr[Boolean] = js.undefined,
    canOutsideClickCancel: js.UndefOr[Boolean] = js.undefined,
    cancelButtonText: String = null,
    confirmButtonText: String = null,
    icon: IconName | MaybeElement = null,
    intent: Intent = null,
    onCancel: /* evt */ js.UndefOr[SyntheticEvent[Event_, HTMLElement]] => Unit = null,
    onClose: (/* confirmed */ Boolean, /* evt */ js.UndefOr[SyntheticEvent[Event_, HTMLElement]]) => Unit = null,
    onClosed: /* node */ HTMLElement => Unit = null,
    onClosing: /* node */ HTMLElement => Unit = null,
    onConfirm: /* evt */ js.UndefOr[SyntheticEvent[Event_, HTMLElement]] => Unit = null,
    onOpened: /* node */ HTMLElement => Unit = null,
    onOpening: /* node */ HTMLElement => Unit = null,
    portalContainer: HTMLElement = null,
    transitionDuration: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.Alert] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(canEscapeKeyCancel)) __obj.updateDynamic("canEscapeKeyCancel")(canEscapeKeyCancel.asInstanceOf[js.Any])
    if (!js.isUndefined(canOutsideClickCancel)) __obj.updateDynamic("canOutsideClickCancel")(canOutsideClickCancel.asInstanceOf[js.Any])
    if (cancelButtonText != null) __obj.updateDynamic("cancelButtonText")(cancelButtonText.asInstanceOf[js.Any])
    if (confirmButtonText != null) __obj.updateDynamic("confirmButtonText")(confirmButtonText.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2(onClose))
    if (onClosed != null) __obj.updateDynamic("onClosed")(js.Any.fromFunction1(onClosed))
    if (onClosing != null) __obj.updateDynamic("onClosing")(js.Any.fromFunction1(onClosing))
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(js.Any.fromFunction1(onConfirm))
    if (onOpened != null) __obj.updateDynamic("onOpened")(js.Any.fromFunction1(onOpened))
    if (onOpening != null) __obj.updateDynamic("onOpening")(js.Any.fromFunction1(onOpening))
    if (portalContainer != null) __obj.updateDynamic("portalContainer")(portalContainer.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IAlertProps
}

