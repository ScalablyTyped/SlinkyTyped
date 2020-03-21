package typingsSlinky.blueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.web.html.div.tag
import typingsSlinky.blueprintjsCore.overlayMod.IOverlayProps
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Overlay
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsCore.mod.Overlay] {
  @JSImport("@blueprintjs/core", "Overlay")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    isOpen: Boolean,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    backdropClassName: String = null,
    backdropProps: HTMLProps[HTMLDivElement] = null,
    canEscapeKeyClose: js.UndefOr[Boolean] = js.undefined,
    canOutsideClickClose: js.UndefOr[Boolean] = js.undefined,
    enforceFocus: js.UndefOr[Boolean] = js.undefined,
    hasBackdrop: js.UndefOr[Boolean] = js.undefined,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    onClose: /* event */ js.UndefOr[SyntheticEvent[Event_, HTMLElement]] => Unit = null,
    onClosed: /* node */ HTMLElement => Unit = null,
    onClosing: /* node */ HTMLElement => Unit = null,
    onOpened: /* node */ HTMLElement => Unit = null,
    onOpening: /* node */ HTMLElement => Unit = null,
    portalClassName: String = null,
    portalContainer: HTMLElement = null,
    transitionDuration: Int | Double = null,
    transitionName: String = null,
    usePortal: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.Overlay] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (backdropClassName != null) __obj.updateDynamic("backdropClassName")(backdropClassName.asInstanceOf[js.Any])
    if (backdropProps != null) __obj.updateDynamic("backdropProps")(backdropProps.asInstanceOf[js.Any])
    if (!js.isUndefined(canEscapeKeyClose)) __obj.updateDynamic("canEscapeKeyClose")(canEscapeKeyClose.asInstanceOf[js.Any])
    if (!js.isUndefined(canOutsideClickClose)) __obj.updateDynamic("canOutsideClickClose")(canOutsideClickClose.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceFocus)) __obj.updateDynamic("enforceFocus")(enforceFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBackdrop)) __obj.updateDynamic("hasBackdrop")(hasBackdrop.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onClosed != null) __obj.updateDynamic("onClosed")(js.Any.fromFunction1(onClosed))
    if (onClosing != null) __obj.updateDynamic("onClosing")(js.Any.fromFunction1(onClosing))
    if (onOpened != null) __obj.updateDynamic("onOpened")(js.Any.fromFunction1(onOpened))
    if (onOpening != null) __obj.updateDynamic("onOpening")(js.Any.fromFunction1(onOpening))
    if (portalClassName != null) __obj.updateDynamic("portalClassName")(portalClassName.asInstanceOf[js.Any])
    if (portalContainer != null) __obj.updateDynamic("portalContainer")(portalContainer.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(usePortal)) __obj.updateDynamic("usePortal")(usePortal.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IOverlayProps
}

