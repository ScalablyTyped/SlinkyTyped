package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import typingsSlinky.officeUiFabricReact.baseButtonClassNamesMod.IButtonClassNames
import typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButton
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsSlinky.officeUiFabricReact.splitButtonClassNamesMod.ISplitButtonClassNames
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.AnchorHTMLAttributes
import typingsSlinky.react.mod.ButtonHTMLAttributes
import typingsSlinky.std.HTMLAnchorElement
import typingsSlinky.std.HTMLButtonElement
import typingsSlinky.std.HTMLDivElement
import typingsSlinky.std.HTMLSpanElement
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.icomponentasMod.IComponentAs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IButtonProps_92720159[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | typingsSlinky.officeUiFabricReact.baseButtonMod.BaseButton | typingsSlinky.officeUiFabricReact.buttonButtonMod.Button | HTMLSpanElement
    ] = null,
    allowDisabledFocus: js.UndefOr[Boolean] = js.undefined,
    ariaDescription: String = null,
    ariaHidden: js.UndefOr[Boolean] = js.undefined,
    ariaLabel: String = null,
    buttonType: ButtonType = null,
    componentRef: IRefObject[IButton] = null,
    data: js.Any = null,
    defaultRender: js.Any = null,
    description: IStyle = null,
    getClassNames: (/* theme */ ITheme, /* className */ String, /* variantClassName */ String, /* iconClassName */ js.UndefOr[String], /* menuIconClassName */ js.UndefOr[String], /* disabled */ Boolean, /* checked */ Boolean, /* expanded */ Boolean, /* hasMenu */ Boolean, /* isSplit */ js.UndefOr[Boolean], /* allowDisabledFocus */ Boolean) => IButtonClassNames = null,
    getSplitButtonClassNames: (/* disabled */ Boolean, /* expanded */ Boolean, /* checked */ Boolean, /* allowDisabledFocus */ Boolean) => ISplitButtonClassNames = null,
    iconProps: IIconProps = null,
    keytipProps: IKeytipProps = null,
    menuAs: IComponentAs[IContextualMenuProps] = null,
    menuIconProps: IIconProps = null,
    menuProps: IContextualMenuProps = null,
    menuTriggerKeyCode: Int | Double = null,
    onAfterMenuDismiss: () => Unit = null,
    onMenuClick: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]], /* button */ js.UndefOr[IButtonProps]) => Unit = null,
    onRenderAriaDescription: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], ReactElement | Null]]) => ReactElement | Null = null,
    onRenderChildren: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], ReactElement | Null]]) => ReactElement | Null = null,
    onRenderDescription: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], ReactElement | Null]]) => ReactElement | Null = null,
    onRenderIcon: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], ReactElement | Null]]) => ReactElement | Null = null,
    onRenderMenu: (/* props */ js.UndefOr[IContextualMenuProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IContextualMenuProps], ReactElement | Null]]) => ReactElement | Null = null,
    onRenderMenuIcon: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], ReactElement | Null]]) => ReactElement | Null = null,
    onRenderText: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], ReactElement | Null]]) => ReactElement | Null = null,
    persistMenu: js.UndefOr[Boolean] = js.undefined,
    primary: js.UndefOr[Boolean] = js.undefined,
    primaryActionButtonProps: IButtonProps = null,
    primaryDisabled: js.UndefOr[Boolean] = js.undefined,
    renderPersistedMenuHiddenOnMount: js.UndefOr[Boolean] = js.undefined,
    rootProps: ButtonHTMLAttributes[org.scalajs.dom.raw.HTMLButtonElement] | AnchorHTMLAttributes[org.scalajs.dom.raw.HTMLAnchorElement] = null,
    secondaryText: String = null,
    split: js.UndefOr[Boolean] = js.undefined,
    splitButtonAriaLabel: String = null,
    splitButtonMenuProps: IButtonProps = null,
    styles: IButtonStyles = null,
    text: String = null,
    theme: ITheme = null,
    toggle: js.UndefOr[Boolean] = js.undefined,
    toggled: js.UndefOr[Boolean] = js.undefined,
    uniqueId: String | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (!js.isUndefined(allowDisabledFocus)) __obj.updateDynamic("allowDisabledFocus")(allowDisabledFocus.asInstanceOf[js.Any])
    if (ariaDescription != null) __obj.updateDynamic("ariaDescription")(ariaDescription.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaHidden)) __obj.updateDynamic("ariaHidden")(ariaHidden.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultRender != null) __obj.updateDynamic("defaultRender")(defaultRender.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (getClassNames != null) __obj.updateDynamic("getClassNames")(js.Any.fromFunction11(getClassNames))
    if (getSplitButtonClassNames != null) __obj.updateDynamic("getSplitButtonClassNames")(js.Any.fromFunction4(getSplitButtonClassNames))
    if (iconProps != null) __obj.updateDynamic("iconProps")(iconProps.asInstanceOf[js.Any])
    if (keytipProps != null) __obj.updateDynamic("keytipProps")(keytipProps.asInstanceOf[js.Any])
    if (menuAs != null) __obj.updateDynamic("menuAs")(menuAs.asInstanceOf[js.Any])
    if (menuIconProps != null) __obj.updateDynamic("menuIconProps")(menuIconProps.asInstanceOf[js.Any])
    if (menuProps != null) __obj.updateDynamic("menuProps")(menuProps.asInstanceOf[js.Any])
    if (menuTriggerKeyCode != null) __obj.updateDynamic("menuTriggerKeyCode")(menuTriggerKeyCode.asInstanceOf[js.Any])
    if (onAfterMenuDismiss != null) __obj.updateDynamic("onAfterMenuDismiss")(js.Any.fromFunction0(onAfterMenuDismiss))
    if (onMenuClick != null) __obj.updateDynamic("onMenuClick")(js.Any.fromFunction2(onMenuClick))
    if (onRenderAriaDescription != null) __obj.updateDynamic("onRenderAriaDescription")(js.Any.fromFunction2(onRenderAriaDescription))
    if (onRenderChildren != null) __obj.updateDynamic("onRenderChildren")(js.Any.fromFunction2(onRenderChildren))
    if (onRenderDescription != null) __obj.updateDynamic("onRenderDescription")(js.Any.fromFunction2(onRenderDescription))
    if (onRenderIcon != null) __obj.updateDynamic("onRenderIcon")(js.Any.fromFunction2(onRenderIcon))
    if (onRenderMenu != null) __obj.updateDynamic("onRenderMenu")(js.Any.fromFunction2(onRenderMenu))
    if (onRenderMenuIcon != null) __obj.updateDynamic("onRenderMenuIcon")(js.Any.fromFunction2(onRenderMenuIcon))
    if (onRenderText != null) __obj.updateDynamic("onRenderText")(js.Any.fromFunction2(onRenderText))
    if (!js.isUndefined(persistMenu)) __obj.updateDynamic("persistMenu")(persistMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (primaryActionButtonProps != null) __obj.updateDynamic("primaryActionButtonProps")(primaryActionButtonProps.asInstanceOf[js.Any])
    if (!js.isUndefined(primaryDisabled)) __obj.updateDynamic("primaryDisabled")(primaryDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(renderPersistedMenuHiddenOnMount)) __obj.updateDynamic("renderPersistedMenuHiddenOnMount")(renderPersistedMenuHiddenOnMount.asInstanceOf[js.Any])
    if (rootProps != null) __obj.updateDynamic("rootProps")(rootProps.asInstanceOf[js.Any])
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText.asInstanceOf[js.Any])
    if (!js.isUndefined(split)) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    if (splitButtonAriaLabel != null) __obj.updateDynamic("splitButtonAriaLabel")(splitButtonAriaLabel.asInstanceOf[js.Any])
    if (splitButtonMenuProps != null) __obj.updateDynamic("splitButtonMenuProps")(splitButtonMenuProps.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    if (!js.isUndefined(toggled)) __obj.updateDynamic("toggled")(toggled.asInstanceOf[js.Any])
    if (uniqueId != null) __obj.updateDynamic("uniqueId")(uniqueId.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.button.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IButtonProps
}

