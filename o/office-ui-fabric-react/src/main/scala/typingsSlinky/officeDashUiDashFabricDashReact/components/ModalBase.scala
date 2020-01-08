package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typingsSlinky.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typingsSlinky.atUifabricUtilities.libCreateRefMod.IRefObject
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsLayerLayerDotTypesMod.ILayerProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsModalModalDotTypesMod.IDragOptions
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsModalModalDotTypesMod.IModal
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsModalModalDotTypesMod.IModalProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsModalModalDotTypesMod.IModalStyleProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsModalModalDotTypesMod.IModalStyles
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsOverlayOverlayDotTypesMod.IOverlayProps
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ModalBase
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.officeDashUiDashFabricDashReact.libModalMod.ModalBase] {
  @JSImport("office-ui-fabric-react/lib/Modal", "ModalBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    allowTouchBodyScroll: js.UndefOr[Boolean] = js.undefined,
    closeButtonAriaLabel: String = null,
    componentRef: IRefObject[IModal] = null,
    containerClassName: String = null,
    dragOptions: IDragOptions = null,
    elementToFocusOnDismiss: HTMLElement = null,
    firstFocusableSelector: String | js.Function0[String] = null,
    forceFocusInsideTrap: js.UndefOr[Boolean] = js.undefined,
    ignoreExternalFocusing: js.UndefOr[Boolean] = js.undefined,
    isBlocking: js.UndefOr[Boolean] = js.undefined,
    isClickableOutsideFocusTrap: js.UndefOr[Boolean] = js.undefined,
    isDarkOverlay: js.UndefOr[Boolean] = js.undefined,
    isModeless: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    layerProps: ILayerProps = null,
    onDismiss: /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLButtonElement]] => _ = null,
    onDismissed: () => _ = null,
    onLayerDidMount: () => Unit = null,
    overlay: IOverlayProps = null,
    responsiveMode: ResponsiveMode = null,
    scrollableContentClassName: String = null,
    styles: IStyleFunctionOrObject[IModalStyleProps, IModalStyles] = null,
    subtitleAriaId: String = null,
    theme: ITheme = null,
    titleAriaId: String = null,
    topOffsetFixed: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.officeDashUiDashFabricDashReact.libModalMod.ModalBase] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowTouchBodyScroll)) __obj.updateDynamic("allowTouchBodyScroll")(allowTouchBodyScroll.asInstanceOf[js.Any])
    if (closeButtonAriaLabel != null) __obj.updateDynamic("closeButtonAriaLabel")(closeButtonAriaLabel.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (dragOptions != null) __obj.updateDynamic("dragOptions")(dragOptions.asInstanceOf[js.Any])
    if (elementToFocusOnDismiss != null) __obj.updateDynamic("elementToFocusOnDismiss")(elementToFocusOnDismiss.asInstanceOf[js.Any])
    if (firstFocusableSelector != null) __obj.updateDynamic("firstFocusableSelector")(firstFocusableSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFocusInsideTrap)) __obj.updateDynamic("forceFocusInsideTrap")(forceFocusInsideTrap.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreExternalFocusing)) __obj.updateDynamic("ignoreExternalFocusing")(ignoreExternalFocusing.asInstanceOf[js.Any])
    if (!js.isUndefined(isBlocking)) __obj.updateDynamic("isBlocking")(isBlocking.asInstanceOf[js.Any])
    if (!js.isUndefined(isClickableOutsideFocusTrap)) __obj.updateDynamic("isClickableOutsideFocusTrap")(isClickableOutsideFocusTrap.asInstanceOf[js.Any])
    if (!js.isUndefined(isDarkOverlay)) __obj.updateDynamic("isDarkOverlay")(isDarkOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(isModeless)) __obj.updateDynamic("isModeless")(isModeless.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (layerProps != null) __obj.updateDynamic("layerProps")(layerProps.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1(onDismiss))
    if (onDismissed != null) __obj.updateDynamic("onDismissed")(js.Any.fromFunction0(onDismissed))
    if (onLayerDidMount != null) __obj.updateDynamic("onLayerDidMount")(js.Any.fromFunction0(onLayerDidMount))
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (responsiveMode != null) __obj.updateDynamic("responsiveMode")(responsiveMode.asInstanceOf[js.Any])
    if (scrollableContentClassName != null) __obj.updateDynamic("scrollableContentClassName")(scrollableContentClassName.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (subtitleAriaId != null) __obj.updateDynamic("subtitleAriaId")(subtitleAriaId.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (titleAriaId != null) __obj.updateDynamic("titleAriaId")(titleAriaId.asInstanceOf[js.Any])
    if (!js.isUndefined(topOffsetFixed)) __obj.updateDynamic("topOffsetFixed")(topOffsetFixed.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.officeDashUiDashFabricDashReact.libModalMod.ModalBase] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.officeDashUiDashFabricDashReact.libModalMod.ModalBase](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IModalProps
}

