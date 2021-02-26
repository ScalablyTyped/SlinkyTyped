package typingsSlinky.officeUiFabricReact

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
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
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
import typingsSlinky.react.mod.Ref
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.icomponentasMod.IComponentAs
import typingsSlinky.uifabricUtilities.icomponentasMod.IComponentAsProps
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import typingsSlinky.uifabricUtilities.keyCodesMod.KeyCodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonTypesMod {
  
  @js.native
  sealed trait ButtonType extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Button/Button.types", "ButtonType")
  @js.native
  object ButtonType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ButtonType with Double] = js.native
    
    @js.native
    sealed trait default extends ButtonType
    /* 6 */ val default: typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType.default with Double = js.native
    
    @js.native
    sealed trait command extends ButtonType
    /* 4 */ val command: typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType.command with Double = js.native
    
    @js.native
    sealed trait compound extends ButtonType
    /* 3 */ val compound: typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType.compound with Double = js.native
    
    @js.native
    sealed trait hero extends ButtonType
    /* 2 */ val hero: typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType.hero with Double = js.native
    
    @js.native
    sealed trait icon extends ButtonType
    /* 5 */ val icon: typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType.icon with Double = js.native
    
    @js.native
    sealed trait normal extends ButtonType
    /* 0 */ val normal: typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType.normal with Double = js.native
    
    @js.native
    sealed trait primary extends ButtonType
    /* 1 */ val primary: typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType.primary with Double = js.native
  }
  
  @js.native
  sealed trait ElementType extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Button/Button.types", "ElementType")
  @js.native
  object ElementType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ElementType with Double] = js.native
    
    /** <a> element. */
    @js.native
    sealed trait anchor extends ElementType
    /* 1 */ val anchor: typingsSlinky.officeUiFabricReact.buttonTypesMod.ElementType.anchor with Double = js.native
    
    /** <button> element. */
    @js.native
    sealed trait button extends ElementType
    /* 0 */ val button: typingsSlinky.officeUiFabricReact.buttonTypesMod.ElementType.button with Double = js.native
  }
  
  @js.native
  trait IButton extends StObject {
    
    /**
      * If there is a menu associated with this button and it is visible, this will dismiss the menu
      */
    def dismissMenu(): Unit = js.native
    
    /**
      * Sets focus to the button.
      */
    def focus(): Unit = js.native
    
    /**
      * If there is a menu associated with this button and it is visible, this will open the menu.
      * Params are optional overrides to the ones defined in `menuProps` to apply to just this instance of
      * opening the menu.
      *
      * @param shouldFocusOnContainer - override to the ContextualMenu shouldFocusOnContainer prop.
      * BaseButton implementation defaults to 'undefined'.
      * @param shouldFocusOnMount - override to the ContextualMenu shouldFocusOnMount prop. BaseButton implementation
      * defaults to `true`.
      */
    def openMenu(): Unit = js.native
    def openMenu(shouldFocusOnContainer: js.UndefOr[scala.Nothing], shouldFocusOnMount: Boolean): Unit = js.native
    def openMenu(shouldFocusOnContainer: Boolean): Unit = js.native
    def openMenu(shouldFocusOnContainer: Boolean, shouldFocusOnMount: Boolean): Unit = js.native
  }
  
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
      * Optional callback to access the root DOM element.
      * @deprecated Temporary solution which will be replaced with ref in the V8 release.
      */
    var elementRef: js.UndefOr[Ref[HTMLElement]] = js.native
    
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
      * Callback that runs after Button's contextual menu was closed (removed from the DOM)
      */
    var onAfterMenuDismiss: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Optional callback when menu is clicked.
      */
    var onMenuClick: js.UndefOr[
        js.Function2[
          /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]], 
          /* button */ js.UndefOr[this.type], 
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
    implicit class IButtonPropsMutableBuilder[Self <: IButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDisabledFocus(value: Boolean): Self = StObject.set(x, "allowDisabledFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDisabledFocusUndefined: Self = StObject.set(x, "allowDisabledFocus", js.undefined)
      
      @scala.inline
      def setAriaDescription(value: String): Self = StObject.set(x, "ariaDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaDescriptionUndefined: Self = StObject.set(x, "ariaDescription", js.undefined)
      
      @scala.inline
      def setAriaHidden(value: Boolean): Self = StObject.set(x, "ariaHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaHiddenUndefined: Self = StObject.set(x, "ariaHidden", js.undefined)
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setButtonType(value: ButtonType): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IButton]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IButton | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefRefObject(value: ReactRef[IButton]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDefaultRender(value: js.Any): Self = StObject.set(x, "defaultRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRenderUndefined: Self = StObject.set(x, "defaultRender", js.undefined)
      
      @scala.inline
      def setDescription(value: IStyle): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setElementRef(value: Ref[HTMLElement]): Self = StObject.set(x, "elementRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "elementRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setElementRefNull: Self = StObject.set(x, "elementRef", null)
      
      @scala.inline
      def setElementRefRefObject(value: ReactRef[HTMLElement]): Self = StObject.set(x, "elementRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementRefUndefined: Self = StObject.set(x, "elementRef", js.undefined)
      
      @scala.inline
      def setGetClassNames(
        value: (/* theme */ ITheme, /* className */ String, /* variantClassName */ String, /* iconClassName */ js.UndefOr[String], /* menuIconClassName */ js.UndefOr[String], /* disabled */ Boolean, /* checked */ Boolean, /* expanded */ Boolean, /* hasMenu */ Boolean, /* isSplit */ js.UndefOr[Boolean], /* allowDisabledFocus */ Boolean) => IButtonClassNames
      ): Self = StObject.set(x, "getClassNames", js.Any.fromFunction11(value))
      
      @scala.inline
      def setGetClassNamesUndefined: Self = StObject.set(x, "getClassNames", js.undefined)
      
      @scala.inline
      def setGetSplitButtonClassNames(
        value: (/* disabled */ Boolean, /* expanded */ Boolean, /* checked */ Boolean, /* allowDisabledFocus */ Boolean) => ISplitButtonClassNames
      ): Self = StObject.set(x, "getSplitButtonClassNames", js.Any.fromFunction4(value))
      
      @scala.inline
      def setGetSplitButtonClassNamesUndefined: Self = StObject.set(x, "getSplitButtonClassNames", js.undefined)
      
      @scala.inline
      def setIconProps(value: IIconProps): Self = StObject.set(x, "iconProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPropsUndefined: Self = StObject.set(x, "iconProps", js.undefined)
      
      @scala.inline
      def setKeytipProps(value: IKeytipProps): Self = StObject.set(x, "keytipProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeytipPropsUndefined: Self = StObject.set(x, "keytipProps", js.undefined)
      
      @scala.inline
      def setMenuAs(value: IComponentAs[IContextualMenuProps]): Self = StObject.set(x, "menuAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuAsComponentClass(value: ReactComponentClass[IComponentAsProps[IContextualMenuProps]]): Self = StObject.set(x, "menuAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuAsFunctionComponent(value: ReactComponentClass[IComponentAsProps[IContextualMenuProps]]): Self = StObject.set(x, "menuAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuAsUndefined: Self = StObject.set(x, "menuAs", js.undefined)
      
      @scala.inline
      def setMenuIconProps(value: IIconProps): Self = StObject.set(x, "menuIconProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuIconPropsUndefined: Self = StObject.set(x, "menuIconProps", js.undefined)
      
      @scala.inline
      def setMenuProps(value: IContextualMenuProps): Self = StObject.set(x, "menuProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuPropsUndefined: Self = StObject.set(x, "menuProps", js.undefined)
      
      @scala.inline
      def setMenuTriggerKeyCode(value: KeyCodes): Self = StObject.set(x, "menuTriggerKeyCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuTriggerKeyCodeNull: Self = StObject.set(x, "menuTriggerKeyCode", null)
      
      @scala.inline
      def setMenuTriggerKeyCodeUndefined: Self = StObject.set(x, "menuTriggerKeyCode", js.undefined)
      
      @scala.inline
      def setOnAfterMenuDismiss(value: () => Unit): Self = StObject.set(x, "onAfterMenuDismiss", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAfterMenuDismissUndefined: Self = StObject.set(x, "onAfterMenuDismiss", js.undefined)
      
      @scala.inline
      def setOnMenuClick(
        value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]], /* button */ js.UndefOr[IButtonProps]) => Unit
      ): Self = StObject.set(x, "onMenuClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMenuClickUndefined: Self = StObject.set(x, "onMenuClick", js.undefined)
      
      @scala.inline
      def setOnRenderAriaDescription(
        value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], ReactElement | Null]]) => ReactElement | Null
      ): Self = StObject.set(x, "onRenderAriaDescription", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderAriaDescriptionUndefined: Self = StObject.set(x, "onRenderAriaDescription", js.undefined)
      
      @scala.inline
      def setOnRenderChildren(
        value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], ReactElement | Null]]) => ReactElement | Null
      ): Self = StObject.set(x, "onRenderChildren", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderChildrenUndefined: Self = StObject.set(x, "onRenderChildren", js.undefined)
      
      @scala.inline
      def setOnRenderDescription(
        value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], ReactElement | Null]]) => ReactElement | Null
      ): Self = StObject.set(x, "onRenderDescription", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderDescriptionUndefined: Self = StObject.set(x, "onRenderDescription", js.undefined)
      
      @scala.inline
      def setOnRenderIcon(
        value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], ReactElement | Null]]) => ReactElement | Null
      ): Self = StObject.set(x, "onRenderIcon", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderIconUndefined: Self = StObject.set(x, "onRenderIcon", js.undefined)
      
      @scala.inline
      def setOnRenderMenu(
        value: (/* props */ js.UndefOr[IContextualMenuProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IContextualMenuProps], ReactElement | Null]]) => ReactElement | Null
      ): Self = StObject.set(x, "onRenderMenu", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderMenuIcon(
        value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], ReactElement | Null]]) => ReactElement | Null
      ): Self = StObject.set(x, "onRenderMenuIcon", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderMenuIconUndefined: Self = StObject.set(x, "onRenderMenuIcon", js.undefined)
      
      @scala.inline
      def setOnRenderMenuUndefined: Self = StObject.set(x, "onRenderMenu", js.undefined)
      
      @scala.inline
      def setOnRenderText(
        value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], ReactElement | Null]]) => ReactElement | Null
      ): Self = StObject.set(x, "onRenderText", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderTextUndefined: Self = StObject.set(x, "onRenderText", js.undefined)
      
      @scala.inline
      def setPersistMenu(value: Boolean): Self = StObject.set(x, "persistMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistMenuUndefined: Self = StObject.set(x, "persistMenu", js.undefined)
      
      @scala.inline
      def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryActionButtonProps(value: IButtonProps): Self = StObject.set(x, "primaryActionButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryActionButtonPropsUndefined: Self = StObject.set(x, "primaryActionButtonProps", js.undefined)
      
      @scala.inline
      def setPrimaryDisabled(value: Boolean): Self = StObject.set(x, "primaryDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryDisabledUndefined: Self = StObject.set(x, "primaryDisabled", js.undefined)
      
      @scala.inline
      def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      @scala.inline
      def setRenderPersistedMenuHiddenOnMount(value: Boolean): Self = StObject.set(x, "renderPersistedMenuHiddenOnMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderPersistedMenuHiddenOnMountUndefined: Self = StObject.set(x, "renderPersistedMenuHiddenOnMount", js.undefined)
      
      @scala.inline
      def setRootProps(value: ButtonHTMLAttributes[HTMLButtonElement] | AnchorHTMLAttributes[HTMLAnchorElement]): Self = StObject.set(x, "rootProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootPropsUndefined: Self = StObject.set(x, "rootProps", js.undefined)
      
      @scala.inline
      def setSecondaryText(value: String): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
      
      @scala.inline
      def setSplit(value: Boolean): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitButtonAriaLabel(value: String): Self = StObject.set(x, "splitButtonAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitButtonAriaLabelUndefined: Self = StObject.set(x, "splitButtonAriaLabel", js.undefined)
      
      @scala.inline
      def setSplitButtonMenuProps(value: IButtonProps): Self = StObject.set(x, "splitButtonMenuProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitButtonMenuPropsUndefined: Self = StObject.set(x, "splitButtonMenuProps", js.undefined)
      
      @scala.inline
      def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      @scala.inline
      def setStyles(value: IButtonStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      @scala.inline
      def setToggled(value: Boolean): Self = StObject.set(x, "toggled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggledUndefined: Self = StObject.set(x, "toggled", js.undefined)
      
      @scala.inline
      def setUniqueId(value: String | Double): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueIdUndefined: Self = StObject.set(x, "uniqueId", js.undefined)
    }
  }
  
  @js.native
  trait IButtonStyles extends StObject {
    
    /**
      * Style for the description text if applicable (for compound buttons.)
      */
    var description: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the description text when the button is checked.
      */
    var descriptionChecked: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the description text when the button is disabled.
      */
    var descriptionDisabled: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the description text when the button is hovered.
      */
    var descriptionHovered: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the description text when the button is pressed.
      */
    var descriptionPressed: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the flexbox container within the root element.
      */
    var flexContainer: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the icon on the near side of the label.
      */
    var icon: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the icon when the button is checked.
      */
    var iconChecked: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the icon when the button is disabled.
      */
    var iconDisabled: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the icon on the near side of the label when expanded.
      */
    var iconExpanded: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the icon on the near side of the label when expanded and hovered.
      */
    var iconExpandedHovered: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the icon on the near side of the label on hover.
      */
    var iconHovered: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the icon on the near side of the label when pressed.
      */
    var iconPressed: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the text content of the button.
      */
    var label: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the text content when the button is checked.
      */
    var labelChecked: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the text content when the button is disabled.
      */
    var labelDisabled: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the text content when the button is hovered.
      */
    var labelHovered: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the menu chevron.
      */
    var menuIcon: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the menu chevron when the button is checked.
      */
    var menuIconChecked: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the menu chevron when the button is disabled.
      */
    var menuIconDisabled: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the menu chevron when expanded.
      */
    var menuIconExpanded: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the menu chevron when expanded and hovered.
      */
    var menuIconExpandedHovered: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the menu chevron on hover.
      */
    var menuIconHovered: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the menu chevron when pressed.
      */
    var menuIconPressed: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the root element in the default enabled, non-toggled state.
      */
    var root: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the root element in a checked state, layered on top of the root style.
      */
    var rootChecked: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override applied to the root on hover in a checked, disabled state
      */
    var rootCheckedDisabled: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override applied to the root on hover in a checked, enabled state
      */
    var rootCheckedHovered: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override applied to the root on pressed in a checked, enabled state
      */
    var rootCheckedPressed: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the root element in a disabled state, layered on top of the root style.
      */
    var rootDisabled: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override applied to the root on when menu is expanded in the default, enabled, non-toggled state.
      */
    var rootExpanded: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override applied to the root on hover in a expanded state on hover
      */
    var rootExpandedHovered: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override applied to the root on focus in the default, enabled, non-toggled state.
      */
    var rootFocused: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the root element when it has a menu button, layered on top of the root style.
      */
    var rootHasMenu: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override applied to the root on hover in the default, enabled, non-toggled state.
      */
    var rootHovered: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override applied to the root on pressed in the default, enabled, non-toggled state.
      */
    var rootPressed: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the screen reader text.
      */
    var screenReaderText: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the description text if applicable (for compound buttons.)
      */
    var secondaryText: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the container div around a SplitButton element
      */
    var splitButtonContainer: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for container div around a SplitButton element when the button is checked.
      */
    var splitButtonContainerChecked: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for container div around a SplitButton element when the button is checked and hovered.
      */
    var splitButtonContainerCheckedHovered: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the container div around a SplitButton element in a disabled state
      */
    var splitButtonContainerDisabled: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for container div around a SplitButton element when the button is focused.
      */
    var splitButtonContainerFocused: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for container div around a SplitButton element when the button is hovered.
      */
    var splitButtonContainerHovered: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the divider element that appears between the button and menu button
      * for a split button.
      */
    var splitButtonDivider: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the divider element that appears between the button and menu button
      * for a split button in a disabled state.
      */
    var splitButtonDividerDisabled: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the SplitButton FlexContainer.
      */
    var splitButtonFlexContainer: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the SplitButton menu button
      */
    var splitButtonMenuButton: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the SplitButton menu button element in a checked state
      */
    var splitButtonMenuButtonChecked: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the SplitButton menu button element in a disabled state.
      */
    var splitButtonMenuButtonDisabled: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the SplitButton menu button element in an expanded state
      */
    var splitButtonMenuButtonExpanded: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the SplitButton menu icon element
      */
    var splitButtonMenuIcon: js.UndefOr[IStyle] = js.native
    
    /**
      * Style override for the SplitButton menu icon element in a disabled state
      */
    var splitButtonMenuIconDisabled: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the text container within the flexbox container element (and contains the text and description).
      */
    var textContainer: js.UndefOr[IStyle] = js.native
  }
  object IButtonStyles {
    
    @scala.inline
    def apply(): IButtonStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IButtonStyles]
    }
    
    @scala.inline
    implicit class IButtonStylesMutableBuilder[Self <: IButtonStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: IStyle): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionChecked(value: IStyle): Self = StObject.set(x, "descriptionChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionCheckedNull: Self = StObject.set(x, "descriptionChecked", null)
      
      @scala.inline
      def setDescriptionCheckedUndefined: Self = StObject.set(x, "descriptionChecked", js.undefined)
      
      @scala.inline
      def setDescriptionDisabled(value: IStyle): Self = StObject.set(x, "descriptionDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionDisabledNull: Self = StObject.set(x, "descriptionDisabled", null)
      
      @scala.inline
      def setDescriptionDisabledUndefined: Self = StObject.set(x, "descriptionDisabled", js.undefined)
      
      @scala.inline
      def setDescriptionHovered(value: IStyle): Self = StObject.set(x, "descriptionHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionHoveredNull: Self = StObject.set(x, "descriptionHovered", null)
      
      @scala.inline
      def setDescriptionHoveredUndefined: Self = StObject.set(x, "descriptionHovered", js.undefined)
      
      @scala.inline
      def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      @scala.inline
      def setDescriptionPressed(value: IStyle): Self = StObject.set(x, "descriptionPressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionPressedNull: Self = StObject.set(x, "descriptionPressed", null)
      
      @scala.inline
      def setDescriptionPressedUndefined: Self = StObject.set(x, "descriptionPressed", js.undefined)
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFlexContainer(value: IStyle): Self = StObject.set(x, "flexContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexContainerNull: Self = StObject.set(x, "flexContainer", null)
      
      @scala.inline
      def setFlexContainerUndefined: Self = StObject.set(x, "flexContainer", js.undefined)
      
      @scala.inline
      def setIcon(value: IStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconChecked(value: IStyle): Self = StObject.set(x, "iconChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconCheckedNull: Self = StObject.set(x, "iconChecked", null)
      
      @scala.inline
      def setIconCheckedUndefined: Self = StObject.set(x, "iconChecked", js.undefined)
      
      @scala.inline
      def setIconDisabled(value: IStyle): Self = StObject.set(x, "iconDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconDisabledNull: Self = StObject.set(x, "iconDisabled", null)
      
      @scala.inline
      def setIconDisabledUndefined: Self = StObject.set(x, "iconDisabled", js.undefined)
      
      @scala.inline
      def setIconExpanded(value: IStyle): Self = StObject.set(x, "iconExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconExpandedHovered(value: IStyle): Self = StObject.set(x, "iconExpandedHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconExpandedHoveredNull: Self = StObject.set(x, "iconExpandedHovered", null)
      
      @scala.inline
      def setIconExpandedHoveredUndefined: Self = StObject.set(x, "iconExpandedHovered", js.undefined)
      
      @scala.inline
      def setIconExpandedNull: Self = StObject.set(x, "iconExpanded", null)
      
      @scala.inline
      def setIconExpandedUndefined: Self = StObject.set(x, "iconExpanded", js.undefined)
      
      @scala.inline
      def setIconHovered(value: IStyle): Self = StObject.set(x, "iconHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconHoveredNull: Self = StObject.set(x, "iconHovered", null)
      
      @scala.inline
      def setIconHoveredUndefined: Self = StObject.set(x, "iconHovered", js.undefined)
      
      @scala.inline
      def setIconNull: Self = StObject.set(x, "icon", null)
      
      @scala.inline
      def setIconPressed(value: IStyle): Self = StObject.set(x, "iconPressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPressedNull: Self = StObject.set(x, "iconPressed", null)
      
      @scala.inline
      def setIconPressedUndefined: Self = StObject.set(x, "iconPressed", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setLabel(value: IStyle): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelChecked(value: IStyle): Self = StObject.set(x, "labelChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelCheckedNull: Self = StObject.set(x, "labelChecked", null)
      
      @scala.inline
      def setLabelCheckedUndefined: Self = StObject.set(x, "labelChecked", js.undefined)
      
      @scala.inline
      def setLabelDisabled(value: IStyle): Self = StObject.set(x, "labelDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelDisabledNull: Self = StObject.set(x, "labelDisabled", null)
      
      @scala.inline
      def setLabelDisabledUndefined: Self = StObject.set(x, "labelDisabled", js.undefined)
      
      @scala.inline
      def setLabelHovered(value: IStyle): Self = StObject.set(x, "labelHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelHoveredNull: Self = StObject.set(x, "labelHovered", null)
      
      @scala.inline
      def setLabelHoveredUndefined: Self = StObject.set(x, "labelHovered", js.undefined)
      
      @scala.inline
      def setLabelNull: Self = StObject.set(x, "label", null)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMenuIcon(value: IStyle): Self = StObject.set(x, "menuIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuIconChecked(value: IStyle): Self = StObject.set(x, "menuIconChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuIconCheckedNull: Self = StObject.set(x, "menuIconChecked", null)
      
      @scala.inline
      def setMenuIconCheckedUndefined: Self = StObject.set(x, "menuIconChecked", js.undefined)
      
      @scala.inline
      def setMenuIconDisabled(value: IStyle): Self = StObject.set(x, "menuIconDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuIconDisabledNull: Self = StObject.set(x, "menuIconDisabled", null)
      
      @scala.inline
      def setMenuIconDisabledUndefined: Self = StObject.set(x, "menuIconDisabled", js.undefined)
      
      @scala.inline
      def setMenuIconExpanded(value: IStyle): Self = StObject.set(x, "menuIconExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuIconExpandedHovered(value: IStyle): Self = StObject.set(x, "menuIconExpandedHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuIconExpandedHoveredNull: Self = StObject.set(x, "menuIconExpandedHovered", null)
      
      @scala.inline
      def setMenuIconExpandedHoveredUndefined: Self = StObject.set(x, "menuIconExpandedHovered", js.undefined)
      
      @scala.inline
      def setMenuIconExpandedNull: Self = StObject.set(x, "menuIconExpanded", null)
      
      @scala.inline
      def setMenuIconExpandedUndefined: Self = StObject.set(x, "menuIconExpanded", js.undefined)
      
      @scala.inline
      def setMenuIconHovered(value: IStyle): Self = StObject.set(x, "menuIconHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuIconHoveredNull: Self = StObject.set(x, "menuIconHovered", null)
      
      @scala.inline
      def setMenuIconHoveredUndefined: Self = StObject.set(x, "menuIconHovered", js.undefined)
      
      @scala.inline
      def setMenuIconNull: Self = StObject.set(x, "menuIcon", null)
      
      @scala.inline
      def setMenuIconPressed(value: IStyle): Self = StObject.set(x, "menuIconPressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuIconPressedNull: Self = StObject.set(x, "menuIconPressed", null)
      
      @scala.inline
      def setMenuIconPressedUndefined: Self = StObject.set(x, "menuIconPressed", js.undefined)
      
      @scala.inline
      def setMenuIconUndefined: Self = StObject.set(x, "menuIcon", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootChecked(value: IStyle): Self = StObject.set(x, "rootChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootCheckedDisabled(value: IStyle): Self = StObject.set(x, "rootCheckedDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootCheckedDisabledNull: Self = StObject.set(x, "rootCheckedDisabled", null)
      
      @scala.inline
      def setRootCheckedDisabledUndefined: Self = StObject.set(x, "rootCheckedDisabled", js.undefined)
      
      @scala.inline
      def setRootCheckedHovered(value: IStyle): Self = StObject.set(x, "rootCheckedHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootCheckedHoveredNull: Self = StObject.set(x, "rootCheckedHovered", null)
      
      @scala.inline
      def setRootCheckedHoveredUndefined: Self = StObject.set(x, "rootCheckedHovered", js.undefined)
      
      @scala.inline
      def setRootCheckedNull: Self = StObject.set(x, "rootChecked", null)
      
      @scala.inline
      def setRootCheckedPressed(value: IStyle): Self = StObject.set(x, "rootCheckedPressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootCheckedPressedNull: Self = StObject.set(x, "rootCheckedPressed", null)
      
      @scala.inline
      def setRootCheckedPressedUndefined: Self = StObject.set(x, "rootCheckedPressed", js.undefined)
      
      @scala.inline
      def setRootCheckedUndefined: Self = StObject.set(x, "rootChecked", js.undefined)
      
      @scala.inline
      def setRootDisabled(value: IStyle): Self = StObject.set(x, "rootDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDisabledNull: Self = StObject.set(x, "rootDisabled", null)
      
      @scala.inline
      def setRootDisabledUndefined: Self = StObject.set(x, "rootDisabled", js.undefined)
      
      @scala.inline
      def setRootExpanded(value: IStyle): Self = StObject.set(x, "rootExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootExpandedHovered(value: IStyle): Self = StObject.set(x, "rootExpandedHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootExpandedHoveredNull: Self = StObject.set(x, "rootExpandedHovered", null)
      
      @scala.inline
      def setRootExpandedHoveredUndefined: Self = StObject.set(x, "rootExpandedHovered", js.undefined)
      
      @scala.inline
      def setRootExpandedNull: Self = StObject.set(x, "rootExpanded", null)
      
      @scala.inline
      def setRootExpandedUndefined: Self = StObject.set(x, "rootExpanded", js.undefined)
      
      @scala.inline
      def setRootFocused(value: IStyle): Self = StObject.set(x, "rootFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootFocusedNull: Self = StObject.set(x, "rootFocused", null)
      
      @scala.inline
      def setRootFocusedUndefined: Self = StObject.set(x, "rootFocused", js.undefined)
      
      @scala.inline
      def setRootHasMenu(value: IStyle): Self = StObject.set(x, "rootHasMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootHasMenuNull: Self = StObject.set(x, "rootHasMenu", null)
      
      @scala.inline
      def setRootHasMenuUndefined: Self = StObject.set(x, "rootHasMenu", js.undefined)
      
      @scala.inline
      def setRootHovered(value: IStyle): Self = StObject.set(x, "rootHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootHoveredNull: Self = StObject.set(x, "rootHovered", null)
      
      @scala.inline
      def setRootHoveredUndefined: Self = StObject.set(x, "rootHovered", js.undefined)
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootPressed(value: IStyle): Self = StObject.set(x, "rootPressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootPressedNull: Self = StObject.set(x, "rootPressed", null)
      
      @scala.inline
      def setRootPressedUndefined: Self = StObject.set(x, "rootPressed", js.undefined)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setScreenReaderText(value: IStyle): Self = StObject.set(x, "screenReaderText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenReaderTextNull: Self = StObject.set(x, "screenReaderText", null)
      
      @scala.inline
      def setScreenReaderTextUndefined: Self = StObject.set(x, "screenReaderText", js.undefined)
      
      @scala.inline
      def setSecondaryText(value: IStyle): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryTextNull: Self = StObject.set(x, "secondaryText", null)
      
      @scala.inline
      def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
      
      @scala.inline
      def setSplitButtonContainer(value: IStyle): Self = StObject.set(x, "splitButtonContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitButtonContainerChecked(value: IStyle): Self = StObject.set(x, "splitButtonContainerChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitButtonContainerCheckedHovered(value: IStyle): Self = StObject.set(x, "splitButtonContainerCheckedHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitButtonContainerCheckedHoveredNull: Self = StObject.set(x, "splitButtonContainerCheckedHovered", null)
      
      @scala.inline
      def setSplitButtonContainerCheckedHoveredUndefined: Self = StObject.set(x, "splitButtonContainerCheckedHovered", js.undefined)
      
      @scala.inline
      def setSplitButtonContainerCheckedNull: Self = StObject.set(x, "splitButtonContainerChecked", null)
      
      @scala.inline
      def setSplitButtonContainerCheckedUndefined: Self = StObject.set(x, "splitButtonContainerChecked", js.undefined)
      
      @scala.inline
      def setSplitButtonContainerDisabled(value: IStyle): Self = StObject.set(x, "splitButtonContainerDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitButtonContainerDisabledNull: Self = StObject.set(x, "splitButtonContainerDisabled", null)
      
      @scala.inline
      def setSplitButtonContainerDisabledUndefined: Self = StObject.set(x, "splitButtonContainerDisabled", js.undefined)
      
      @scala.inline
      def setSplitButtonContainerFocused(value: IStyle): Self = StObject.set(x, "splitButtonContainerFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitButtonContainerFocusedNull: Self = StObject.set(x, "splitButtonContainerFocused", null)
      
      @scala.inline
      def setSplitButtonContainerFocusedUndefined: Self = StObject.set(x, "splitButtonContainerFocused", js.undefined)
      
      @scala.inline
      def setSplitButtonContainerHovered(value: IStyle): Self = StObject.set(x, "splitButtonContainerHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitButtonContainerHoveredNull: Self = StObject.set(x, "splitButtonContainerHovered", null)
      
      @scala.inline
      def setSplitButtonContainerHoveredUndefined: Self = StObject.set(x, "splitButtonContainerHovered", js.undefined)
      
      @scala.inline
      def setSplitButtonContainerNull: Self = StObject.set(x, "splitButtonContainer", null)
      
      @scala.inline
      def setSplitButtonContainerUndefined: Self = StObject.set(x, "splitButtonContainer", js.undefined)
      
      @scala.inline
      def setSplitButtonDivider(value: IStyle): Self = StObject.set(x, "splitButtonDivider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitButtonDividerDisabled(value: IStyle): Self = StObject.set(x, "splitButtonDividerDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitButtonDividerDisabledNull: Self = StObject.set(x, "splitButtonDividerDisabled", null)
      
      @scala.inline
      def setSplitButtonDividerDisabledUndefined: Self = StObject.set(x, "splitButtonDividerDisabled", js.undefined)
      
      @scala.inline
      def setSplitButtonDividerNull: Self = StObject.set(x, "splitButtonDivider", null)
      
      @scala.inline
      def setSplitButtonDividerUndefined: Self = StObject.set(x, "splitButtonDivider", js.undefined)
      
      @scala.inline
      def setSplitButtonFlexContainer(value: IStyle): Self = StObject.set(x, "splitButtonFlexContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitButtonFlexContainerNull: Self = StObject.set(x, "splitButtonFlexContainer", null)
      
      @scala.inline
      def setSplitButtonFlexContainerUndefined: Self = StObject.set(x, "splitButtonFlexContainer", js.undefined)
      
      @scala.inline
      def setSplitButtonMenuButton(value: IStyle): Self = StObject.set(x, "splitButtonMenuButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitButtonMenuButtonChecked(value: IStyle): Self = StObject.set(x, "splitButtonMenuButtonChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitButtonMenuButtonCheckedNull: Self = StObject.set(x, "splitButtonMenuButtonChecked", null)
      
      @scala.inline
      def setSplitButtonMenuButtonCheckedUndefined: Self = StObject.set(x, "splitButtonMenuButtonChecked", js.undefined)
      
      @scala.inline
      def setSplitButtonMenuButtonDisabled(value: IStyle): Self = StObject.set(x, "splitButtonMenuButtonDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitButtonMenuButtonDisabledNull: Self = StObject.set(x, "splitButtonMenuButtonDisabled", null)
      
      @scala.inline
      def setSplitButtonMenuButtonDisabledUndefined: Self = StObject.set(x, "splitButtonMenuButtonDisabled", js.undefined)
      
      @scala.inline
      def setSplitButtonMenuButtonExpanded(value: IStyle): Self = StObject.set(x, "splitButtonMenuButtonExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitButtonMenuButtonExpandedNull: Self = StObject.set(x, "splitButtonMenuButtonExpanded", null)
      
      @scala.inline
      def setSplitButtonMenuButtonExpandedUndefined: Self = StObject.set(x, "splitButtonMenuButtonExpanded", js.undefined)
      
      @scala.inline
      def setSplitButtonMenuButtonNull: Self = StObject.set(x, "splitButtonMenuButton", null)
      
      @scala.inline
      def setSplitButtonMenuButtonUndefined: Self = StObject.set(x, "splitButtonMenuButton", js.undefined)
      
      @scala.inline
      def setSplitButtonMenuIcon(value: IStyle): Self = StObject.set(x, "splitButtonMenuIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitButtonMenuIconDisabled(value: IStyle): Self = StObject.set(x, "splitButtonMenuIconDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitButtonMenuIconDisabledNull: Self = StObject.set(x, "splitButtonMenuIconDisabled", null)
      
      @scala.inline
      def setSplitButtonMenuIconDisabledUndefined: Self = StObject.set(x, "splitButtonMenuIconDisabled", js.undefined)
      
      @scala.inline
      def setSplitButtonMenuIconNull: Self = StObject.set(x, "splitButtonMenuIcon", null)
      
      @scala.inline
      def setSplitButtonMenuIconUndefined: Self = StObject.set(x, "splitButtonMenuIcon", js.undefined)
      
      @scala.inline
      def setTextContainer(value: IStyle): Self = StObject.set(x, "textContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextContainerNull: Self = StObject.set(x, "textContainer", null)
      
      @scala.inline
      def setTextContainerUndefined: Self = StObject.set(x, "textContainer", js.undefined)
    }
  }
}
