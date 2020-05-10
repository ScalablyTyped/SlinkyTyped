package typingsSlinky.officeUiFabricReact.buttonTypesMod

import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.baseButtonClassNamesMod.IButtonClassNames
import typingsSlinky.officeUiFabricReact.baseButtonMod.BaseButton
import typingsSlinky.officeUiFabricReact.buttonButtonMod.Button
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsSlinky.officeUiFabricReact.splitButtonClassNamesMod.ISplitButtonClassNames
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.AnchorHTMLAttributes
import typingsSlinky.react.mod.ButtonHTMLAttributes
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.icomponentasMod.IComponentAs
import typingsSlinky.uifabricUtilities.icomponentasMod.IComponentAsProps
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import typingsSlinky.uifabricUtilities.keyCodesMod.KeyCodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IButtonProps extends AllHTMLAttributes[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ] {
  /**
    * Whether the button can have focus in disabled mode
    */
  var allowDisabledFocus: js.UndefOr[Boolean] = js.native
  /**
    * Detailed description of the button for the benefit of screen readers.
    *
    * Besides the compound button, other button types will need more information provided to screen reader.
    */
  var ariaDescription: js.UndefOr[String] = js.native
  /**
    * If provided and is true it adds an 'aria-hidden' attribute instructing screen readers to ignore the element.
    */
  var ariaHidden: js.UndefOr[Boolean] = js.native
  /**
    * The aria label of the button for the benefit of screen readers.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Deprecated at v1.2.3, to be removed at \>= v2.0.0. Use specific button component instead.
    * @defaultvalue ButtonType.default
    * @deprecated Use specific button component instead.
    */
  var buttonType: js.UndefOr[ButtonType] = js.native
  /**
    * Optional callback to access the IButton interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IButton]] = js.native
  /**
    * Any custom data the developer wishes to associate with the menu item.
    */
  @JSName("data")
  var data_IButtonProps: js.UndefOr[js.Any] = js.native
  /**
    * yet unknown docs
    */
  var defaultRender: js.UndefOr[js.Any] = js.native
  /**
    * Style for the description text if applicable (for compound buttons.)
    * Deprecated, use `secondaryText` instead.
    * @deprecated Use `secondaryText` instead.
    */
  var description: js.UndefOr[IStyle] = js.native
  /**
    * Method to provide the classnames to style a button.
    * The default value for this prop is the getClassnames func
    * defined in BaseButton.classnames.
    * @defaultvalue getBaseButtonClassNames
    */
  var getClassNames: js.UndefOr[
    js.Function11[
      /* theme */ ITheme, 
      /* className */ String, 
      /* variantClassName */ String, 
      /* iconClassName */ js.UndefOr[String], 
      /* menuIconClassName */ js.UndefOr[String], 
      /* disabled */ Boolean, 
      /* checked */ Boolean, 
      /* expanded */ Boolean, 
      /* hasMenu */ Boolean, 
      /* isSplit */ js.UndefOr[Boolean], 
      /* allowDisabledFocus */ Boolean, 
      IButtonClassNames
    ]
  ] = js.native
  /**
    * Method to provide the classnames to style a button.
    * The default value for this prop is the getClassnames func
    * defined in BaseButton.classnames.
    * @defaultvalue getBaseSplitButtonClassNames
    */
  var getSplitButtonClassNames: js.UndefOr[
    js.Function4[
      /* disabled */ Boolean, 
      /* expanded */ Boolean, 
      /* checked */ Boolean, 
      /* allowDisabledFocus */ Boolean, 
      ISplitButtonClassNames
    ]
  ] = js.native
  /**
    * The props for the icon shown in the button.
    */
  var iconProps: js.UndefOr[IIconProps] = js.native
  /**
    * Optional keytip for this button
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.native
  /**
    * Render a custom menu in place of the normal one.
    */
  var menuAs: js.UndefOr[IComponentAs[IContextualMenuProps]] = js.native
  /**
    * The props for the icon shown when providing a menu dropdown.
    */
  var menuIconProps: js.UndefOr[IIconProps] = js.native
  /**
    * Props for button menu. Providing this will default to showing the menu icon. See menuIconProps for overriding
    * how the default icon looks. Providing this in addition of onClick and setting the split property to true will
    * render a SplitButton.
    */
  var menuProps: js.UndefOr[IContextualMenuProps] = js.native
  /**
    * Provides a custom KeyCode that can be used to open the button menu.
    * The default KeyCode is the down arrow.
    * A value of null can be provided to disable the key codes for opening the button menu.
    */
  var menuTriggerKeyCode: js.UndefOr[KeyCodes | Null] = js.native
  /**
    * Callback that runs after Button's contextualmenu was closed (removed from the DOM)
    */
  var onAfterMenuDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Optional callback when menu is clicked.
    */
  var onMenuClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]], 
      /* button */ js.UndefOr[IButtonProps], 
      Unit
    ]
  ] = js.native
  /**
    * Custom render function for the aria description element.
    */
  var onRenderAriaDescription: js.UndefOr[IRenderFunction[IButtonProps]] = js.native
  /**
    * Custom render function for rendering the button children.
    */
  var onRenderChildren: js.UndefOr[IRenderFunction[IButtonProps]] = js.native
  /**
    * Custom render function for the desciption text.
    */
  var onRenderDescription: js.UndefOr[IRenderFunction[IButtonProps]] = js.native
  /**
    * Custom render function for the icon
    */
  var onRenderIcon: js.UndefOr[IRenderFunction[IButtonProps]] = js.native
  /**
    * Deprecated at v6.3.2, to be removed at \>= v7.0.0. Use `menuAs` instead.
    * @deprecated Use `menuAs` instead.
    */
  var onRenderMenu: js.UndefOr[IRenderFunction[IContextualMenuProps]] = js.native
  /**
    * Custom render function for button menu icon
    */
  var onRenderMenuIcon: js.UndefOr[IRenderFunction[IButtonProps]] = js.native
  /**
    * Custom render function for the label text.
    */
  var onRenderText: js.UndefOr[IRenderFunction[IButtonProps]] = js.native
  /**
    * Menu will not be created or destroyed when opened or closed, instead it
    * will be hidden. This will improve perf of the menu opening but could potentially
    * impact overall perf by having more elements in the dom. Should only be used
    * when perf is important.
    * Note: This may increase the amount of time it takes for the button itself to mount.
    */
  var persistMenu: js.UndefOr[Boolean] = js.native
  /**
    * Changes the visual presentation of the button to be emphasized (if defined)
    * @defaultvalue false
    */
  var primary: js.UndefOr[Boolean] = js.native
  /**
    * Optional props to be applied only to the primary action button of SplitButton and not to the
    * overall SplitButton container
    */
  var primaryActionButtonProps: js.UndefOr[IButtonProps] = js.native
  /**
    * If set to true and if this is a splitButton (split == true) then the primary action of a split button is disabled.
    */
  var primaryDisabled: js.UndefOr[Boolean] = js.native
  /**
    * If true, the persisted menu is rendered hidden when the button
    * initially mounts. Non-persisted menus will
    * not be in the component tree unless they are being shown
    *
    * Note: This increases the time the button will take to mount, but
    * can improve perceived menu open perf. when the user opens the menu.
    *
    * @defaultvalue undefined, equivalent to false
    *
    * @deprecated There is known bug in Edge when this prop is true where scrollbars
    * overlap with the content when a menu is first rendered hidden.
    * See: https://github.com/microsoft/fluentui/issues/9034
    * Please do not start using this. If you are already using this,
    * please make sure that you are doing so only in non-Edge browsers
    */
  var renderPersistedMenuHiddenOnMount: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated at v0.56.2, to be removed at \>= v1.0.0. Just pass in button props instead.
    * they will be mixed into the button/anchor element rendered by the component.
    * @deprecated Use button props instead.
    */
  var rootProps: js.UndefOr[
    ButtonHTMLAttributes[HTMLButtonElement] | AnchorHTMLAttributes[HTMLAnchorElement]
  ] = js.native
  /**
    * Description of the action this button takes.
    * Only used for compound buttons
    */
  var secondaryText: js.UndefOr[String] = js.native
  /**
    * If set to true, and if menuProps and onClick are provided, the button will render as a SplitButton.
    * @defaultvalue false
    */
  var split: js.UndefOr[Boolean] = js.native
  /**
    * Accessible label for the dropdown chevron button if this button is split.
    */
  var splitButtonAriaLabel: js.UndefOr[String] = js.native
  /**
    * Experimental prop that get passed into the menuButton that's rendered as part of
    * split button. Anything passed in will likely need to have accompanying
    * style changes.
    */
  var splitButtonMenuProps: js.UndefOr[IButtonProps] = js.native
  /**
    * Custom styling for individual elements within the button DOM.
    */
  var styles: js.UndefOr[IButtonStyles] = js.native
  /**
    * Text to render button label. If text is supplied, it will override any string in button children.
    * Other children components will be passed through after the text.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Whether button is a toggle button with distinct on and off states. This should be true for buttons that permanently
    * change state when a press event finishes, such as a volume mute button.
    */
  var toggle: js.UndefOr[Boolean] = js.native
  /**
    * Any custom data the developer wishes to associate with the menu item.
    * Deprecated, use `checked` if setting state.
    * @deprecated unused, use `checked` if setting state.
    */
  var toggled: js.UndefOr[Boolean] = js.native
  /**
    * Unique id to identify the item. Typically a duplicate of key value.
    */
  var uniqueId: js.UndefOr[String | Double] = js.native
}

object IButtonProps {
  @scala.inline
  def apply(): IButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButtonProps]
  }
  @scala.inline
  implicit class IButtonPropsOps[Self <: IButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDisabledFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDisabledFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDisabledFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDisabledFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonType(value: ButtonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonType")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IButton | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IButton]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IButton]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRender(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRender")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(null)
        ret
    }
    @scala.inline
    def withGetClassNames(
      value: (/* theme */ ITheme, /* className */ String, /* variantClassName */ String, /* iconClassName */ js.UndefOr[String], /* menuIconClassName */ js.UndefOr[String], /* disabled */ Boolean, /* checked */ Boolean, /* expanded */ Boolean, /* hasMenu */ Boolean, /* isSplit */ js.UndefOr[Boolean], /* allowDisabledFocus */ Boolean) => IButtonClassNames
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClassNames")(js.Any.fromFunction11(value))
        ret
    }
    @scala.inline
    def withoutGetClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClassNames")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSplitButtonClassNames(
      value: (/* disabled */ Boolean, /* expanded */ Boolean, /* checked */ Boolean, /* allowDisabledFocus */ Boolean) => ISplitButtonClassNames
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSplitButtonClassNames")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutGetSplitButtonClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSplitButtonClassNames")(js.undefined)
        ret
    }
    @scala.inline
    def withIconProps(value: IIconProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconProps")(js.undefined)
        ret
    }
    @scala.inline
    def withKeytipProps(value: IKeytipProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keytipProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeytipProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keytipProps")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuAsFunctionComponent(value: ReactComponentClass[IComponentAsProps[IContextualMenuProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuAsComponentClass(value: ReactComponentClass[IComponentAsProps[IContextualMenuProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuAs(value: IComponentAs[IContextualMenuProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuAs")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuIconProps(value: IIconProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuIconProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuIconProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuIconProps")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuProps(value: IContextualMenuProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuProps")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuTriggerKeyCode(value: KeyCodes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuTriggerKeyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuTriggerKeyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuTriggerKeyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuTriggerKeyCodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuTriggerKeyCode")(null)
        ret
    }
    @scala.inline
    def withOnAfterMenuDismiss(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterMenuDismiss")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAfterMenuDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterMenuDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMenuClick(
      value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]], /* button */ js.UndefOr[IButtonProps]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMenuClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderAriaDescription(
      value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderAriaDescription")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderAriaDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderAriaDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderChildren(
      value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderChildren")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderDescription(
      value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderDescription")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderIcon(
      value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderIcon")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderMenu(
      value: (/* props */ js.UndefOr[IContextualMenuProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IContextualMenuProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderMenu")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderMenuIcon(
      value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderMenuIcon")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderMenuIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderMenuIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderText(
      value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderText")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryActionButtonProps(value: IButtonProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryActionButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryActionButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryActionButtonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderPersistedMenuHiddenOnMount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPersistedMenuHiddenOnMount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderPersistedMenuHiddenOnMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPersistedMenuHiddenOnMount")(js.undefined)
        ret
    }
    @scala.inline
    def withRootProps(value: ButtonHTMLAttributes[HTMLButtonElement] | AnchorHTMLAttributes[HTMLAnchorElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootProps")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(js.undefined)
        ret
    }
    @scala.inline
    def withSplit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitButtonAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitButtonAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitButtonAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitButtonAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitButtonMenuProps(value: IButtonProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitButtonMenuProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitButtonMenuProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitButtonMenuProps")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: IButtonStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withToggle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.undefined)
        ret
    }
    @scala.inline
    def withToggled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggled")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueId(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueId")(js.undefined)
        ret
    }
  }
  
}

