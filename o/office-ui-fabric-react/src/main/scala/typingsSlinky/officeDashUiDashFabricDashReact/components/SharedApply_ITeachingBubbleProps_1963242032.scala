package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typingsSlinky.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typingsSlinky.atUifabricUtilities.libCreateRefMod.IRefObject
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.IButtonProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCalloutCalloutDotTypesMod.ICalloutProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCalloutCalloutDotTypesMod.Target
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.IImageProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsTeachingBubbleTeachingBubbleDotTypesMod.ITeachingBubble
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsTeachingBubbleTeachingBubbleDotTypesMod.ITeachingBubbleProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsTeachingBubbleTeachingBubbleDotTypesMod.ITeachingBubbleStyleProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsTeachingBubbleTeachingBubbleDotTypesMod.ITeachingBubbleStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ITeachingBubbleProps_1963242032[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply(
    ariaDescribedBy: String = null,
    ariaLabelledBy: String = null,
    calloutProps: ICalloutProps = null,
    closeButtonAriaLabel: String = null,
    componentRef: IRefObject[ITeachingBubble] = null,
    elementToFocusOnDismiss: HTMLElement = null,
    firstFocusableSelector: String | js.Function0[String] = null,
    footerContent: String | typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    forceFocusInsideTrap: js.UndefOr[Boolean] = js.undefined,
    hasCloseIcon: js.UndefOr[Boolean] = js.undefined,
    hasCondensedHeadline: js.UndefOr[Boolean] = js.undefined,
    hasSmallHeadline: js.UndefOr[Boolean] = js.undefined,
    headline: String = null,
    ignoreExternalFocusing: js.UndefOr[Boolean] = js.undefined,
    illustrationImage: IImageProps = null,
    isClickableOutsideFocusTrap: js.UndefOr[Boolean] = js.undefined,
    isWide: js.UndefOr[Boolean] = js.undefined,
    onDismiss: /* ev */ js.UndefOr[js.Any] => Unit = null,
    primaryButtonProps: IButtonProps = null,
    secondaryButtonProps: IButtonProps = null,
    styles: IStyleFunctionOrObject[ITeachingBubbleStyleProps, ITeachingBubbleStyles] = null,
    target: Target = null,
    targetElement: HTMLElement = null,
    theme: ITheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy.asInstanceOf[js.Any])
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (calloutProps != null) __obj.updateDynamic("calloutProps")(calloutProps.asInstanceOf[js.Any])
    if (closeButtonAriaLabel != null) __obj.updateDynamic("closeButtonAriaLabel")(closeButtonAriaLabel.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (elementToFocusOnDismiss != null) __obj.updateDynamic("elementToFocusOnDismiss")(elementToFocusOnDismiss.asInstanceOf[js.Any])
    if (firstFocusableSelector != null) __obj.updateDynamic("firstFocusableSelector")(firstFocusableSelector.asInstanceOf[js.Any])
    if (footerContent != null) __obj.updateDynamic("footerContent")(footerContent.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFocusInsideTrap)) __obj.updateDynamic("forceFocusInsideTrap")(forceFocusInsideTrap.asInstanceOf[js.Any])
    if (!js.isUndefined(hasCloseIcon)) __obj.updateDynamic("hasCloseIcon")(hasCloseIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(hasCondensedHeadline)) __obj.updateDynamic("hasCondensedHeadline")(hasCondensedHeadline.asInstanceOf[js.Any])
    if (!js.isUndefined(hasSmallHeadline)) __obj.updateDynamic("hasSmallHeadline")(hasSmallHeadline.asInstanceOf[js.Any])
    if (headline != null) __obj.updateDynamic("headline")(headline.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreExternalFocusing)) __obj.updateDynamic("ignoreExternalFocusing")(ignoreExternalFocusing.asInstanceOf[js.Any])
    if (illustrationImage != null) __obj.updateDynamic("illustrationImage")(illustrationImage.asInstanceOf[js.Any])
    if (!js.isUndefined(isClickableOutsideFocusTrap)) __obj.updateDynamic("isClickableOutsideFocusTrap")(isClickableOutsideFocusTrap.asInstanceOf[js.Any])
    if (!js.isUndefined(isWide)) __obj.updateDynamic("isWide")(isWide.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1(onDismiss))
    if (primaryButtonProps != null) __obj.updateDynamic("primaryButtonProps")(primaryButtonProps.asInstanceOf[js.Any])
    if (secondaryButtonProps != null) __obj.updateDynamic("secondaryButtonProps")(secondaryButtonProps.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetElement != null) __obj.updateDynamic("targetElement")(targetElement.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ITeachingBubbleProps
}

