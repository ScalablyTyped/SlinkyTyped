package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricMergeDashStyles.libIRawStyleBaseMod.ICSSPixelUnitRule
import typingsSlinky.atUifabricMergeDashStyles.libIRawStyleBaseMod.ICSSRule
import typingsSlinky.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typingsSlinky.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typingsSlinky.atUifabricUtilities.libCreateRefMod.IRefObject
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.IButtonProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod.DialogType
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod.IDialogContentProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDialogDialogDotTypesMod.IDialog
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDialogDialogDotTypesMod.IDialogProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDialogDialogDotTypesMod.IDialogStyleProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDialogDialogDotTypesMod.IDialogStyles
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsModalModalDotTypesMod.IModalProps
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DialogBase
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.officeDashUiDashFabricDashReact.libDialogMod.DialogBase] {
  @JSImport("office-ui-fabric-react/lib/Dialog", "DialogBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, hidden */
  def apply(
    ariaDescribedById: String = null,
    ariaLabelledById: String = null,
    closeButtonAriaLabel: String = null,
    componentRef: IRefObject[IDialog] = null,
    containerClassName: String = null,
    contentClassName: String = null,
    dialogContentProps: IDialogContentProps = null,
    elementToFocusOnDismiss: HTMLElement = null,
    firstFocusableSelector: String | js.Function0[String] = null,
    forceFocusInsideTrap: js.UndefOr[Boolean] = js.undefined,
    ignoreExternalFocusing: js.UndefOr[Boolean] = js.undefined,
    isBlocking: js.UndefOr[Boolean] = js.undefined,
    isClickableOutsideFocusTrap: js.UndefOr[Boolean] = js.undefined,
    isDarkOverlay: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    maxWidth: ICSSRule | ICSSPixelUnitRule = null,
    minWidth: ICSSRule | ICSSPixelUnitRule = null,
    modalProps: IModalProps = null,
    onDismiss: /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLButtonElement]] => _ = null,
    onDismissed: () => _ = null,
    onLayerDidMount: () => Unit = null,
    onLayerMounted: () => Unit = null,
    responsiveMode: ResponsiveMode = null,
    styles: IStyleFunctionOrObject[IDialogStyleProps, IDialogStyles] = null,
    subText: String = null,
    theme: ITheme = null,
    title: String | typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    topButtonsProps: js.Array[IButtonProps] = null,
    `type`: DialogType = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.officeDashUiDashFabricDashReact.libDialogMod.DialogBase] = {
    val __obj = js.Dynamic.literal()
    if (ariaDescribedById != null) __obj.updateDynamic("ariaDescribedById")(ariaDescribedById.asInstanceOf[js.Any])
    if (ariaLabelledById != null) __obj.updateDynamic("ariaLabelledById")(ariaLabelledById.asInstanceOf[js.Any])
    if (closeButtonAriaLabel != null) __obj.updateDynamic("closeButtonAriaLabel")(closeButtonAriaLabel.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (dialogContentProps != null) __obj.updateDynamic("dialogContentProps")(dialogContentProps.asInstanceOf[js.Any])
    if (elementToFocusOnDismiss != null) __obj.updateDynamic("elementToFocusOnDismiss")(elementToFocusOnDismiss.asInstanceOf[js.Any])
    if (firstFocusableSelector != null) __obj.updateDynamic("firstFocusableSelector")(firstFocusableSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFocusInsideTrap)) __obj.updateDynamic("forceFocusInsideTrap")(forceFocusInsideTrap.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreExternalFocusing)) __obj.updateDynamic("ignoreExternalFocusing")(ignoreExternalFocusing.asInstanceOf[js.Any])
    if (!js.isUndefined(isBlocking)) __obj.updateDynamic("isBlocking")(isBlocking.asInstanceOf[js.Any])
    if (!js.isUndefined(isClickableOutsideFocusTrap)) __obj.updateDynamic("isClickableOutsideFocusTrap")(isClickableOutsideFocusTrap.asInstanceOf[js.Any])
    if (!js.isUndefined(isDarkOverlay)) __obj.updateDynamic("isDarkOverlay")(isDarkOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (modalProps != null) __obj.updateDynamic("modalProps")(modalProps.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1(onDismiss))
    if (onDismissed != null) __obj.updateDynamic("onDismissed")(js.Any.fromFunction0(onDismissed))
    if (onLayerDidMount != null) __obj.updateDynamic("onLayerDidMount")(js.Any.fromFunction0(onLayerDidMount))
    if (onLayerMounted != null) __obj.updateDynamic("onLayerMounted")(js.Any.fromFunction0(onLayerMounted))
    if (responsiveMode != null) __obj.updateDynamic("responsiveMode")(responsiveMode.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (subText != null) __obj.updateDynamic("subText")(subText.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (topButtonsProps != null) __obj.updateDynamic("topButtonsProps")(topButtonsProps.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.officeDashUiDashFabricDashReact.libDialogMod.DialogBase] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.officeDashUiDashFabricDashReact.libDialogMod.DialogBase](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IDialogProps
}

