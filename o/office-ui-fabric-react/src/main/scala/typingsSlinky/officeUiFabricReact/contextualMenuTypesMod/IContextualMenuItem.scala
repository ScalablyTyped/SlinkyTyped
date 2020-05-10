package typingsSlinky.officeUiFabricReact.contextualMenuTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.PartialIContextualMenuIte
import typingsSlinky.officeUiFabricReact.contextualMenuClassNamesMod.IMenuItemClassNames
import typingsSlinky.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemProps
import typingsSlinky.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuRenderItem
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsSlinky.officeUiFabricReact.verticalDividerTypesMod.IVerticalDividerClassNames
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextualMenuItem
  extends /**
  * (Optional) Any additional properties to apply to the rendered links.
  */
/* propertyName */ StringDictionary[js.Any] {
  /**
    * Optional accessibility label (aria-label) attribute that will be stamped on to the element.
    * If none is specified, the aria-label attribute will contain the item name
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Whether or not this menu item can be checked
    * @defaultvalue false
    */
  var canCheck: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not this menu item is currently checked.
    * @defaultvalue false
    */
  var checked: js.UndefOr[Boolean] = js.native
  /**
    * Additional CSS class to apply to the menu item.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Optional callback to access the IContextualMenuRenderItem interface.
    * This will get passed down to ContextualMenuItem.
    */
  var componentRef: js.UndefOr[IRefObject[IContextualMenuRenderItem]] = js.native
  /**
    * When rendering a custom menu component that is passed in, the component might also be a list of
    * elements. We want to keep track of the correct index our menu is using based off of
    * the length of the custom list. It is up to the user to increment the count for their list.
    */
  var customOnRenderListLength: js.UndefOr[Double] = js.native
  /**
    * Any custom data the developer wishes to associate with the menu item.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * Whether the menu item is disabled
    * @defaultvalue false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Method to provide the classnames to style the individual items inside a menu.
    * @deprecated Use `styles` prop of `IContextualMenuItemProps` to leverage mergeStyles API.
    */
  var getItemClassNames: js.UndefOr[
    js.Function11[
      /* theme */ ITheme, 
      /* disabled */ Boolean, 
      /* expanded */ Boolean, 
      /* checked */ Boolean, 
      /* isAnchorLink */ Boolean, 
      /* knownIcon */ Boolean, 
      /* itemClassName */ js.UndefOr[String], 
      /* dividerClassName */ js.UndefOr[String], 
      /* iconClassName */ js.UndefOr[String], 
      /* subMenuClassName */ js.UndefOr[String], 
      /* primaryDisabled */ js.UndefOr[Boolean], 
      IMenuItemClassNames
    ]
  ] = js.native
  /**
    * Method to provide the classnames to style the Vertical Divider of a split button inside a menu.
    * Default value is the `getSplitButtonVerticalDividerClassNames` func defined in `ContextualMenu.classnames.ts`.
    * @defaultvalue getSplitButtonVerticalDividerClassNames
    */
  var getSplitButtonVerticalDividerClassNames: js.UndefOr[js.Function1[/* theme */ ITheme, IVerticalDividerClassNames]] = js.native
  /**
    * Navigate to this URL when the menu item is clicked.
    */
  var href: js.UndefOr[String] = js.native
  /**
    * Props for the Icon.
    */
  var iconProps: js.UndefOr[IIconProps] = js.native
  /**
    * This prop is no longer used. All contextual menu items are now focusable when disabled.
    * @deprecated in 6.38.2 will be removed in 7.0.0
    */
  var inactive: js.UndefOr[Boolean] = js.native
  /**
    * Optional IContextualMenuItemProps overrides to customize behaviors such as item styling via `styles`.
    */
  var itemProps: js.UndefOr[PartialIContextualMenuIte] = js.native
  var itemType: js.UndefOr[ContextualMenuItemType] = js.native
  /**
    * Unique id to identify the item
    */
  var key: String = js.native
  /**
    * Keytip for this contextual menu item
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.native
  /**
    * Text description for the menu item to display
    * @deprecated Use `text` instead.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Callback for when the menu item is invoked. If `ev.preventDefault()` is called in `onClick`,
    * the click will not close the menu.
    * Returning true will dismiss the menu even if `ev.preventDefault()` was called.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]], 
      /* item */ js.UndefOr[IContextualMenuItem], 
      Boolean | Unit
    ]
  ] = js.native
  /**
    * A function to be executed on mouse down. This is executed before an `onClick` event and can
    * be used to interrupt native on click events as well. The click event should still handle
    * the commands. This should only be used in special cases when react and non-react are mixed.
    */
  var onMouseDown: js.UndefOr[
    js.Function2[/* item */ IContextualMenuItem, /* event */ SyntheticMouseEvent[HTMLElement], Unit]
  ] = js.native
  /**
    * Method to custom render this menu item.
    * For keyboard accessibility, the top-level rendered item should be a focusable element
    * (like an anchor or a button) or have the `data-is-focusable` property set to true.
    *
    * @param item - Item to render. Will typically be of type `IContextualMenuItem`.
    * (When rendering a command bar item, will be `ICommandBarItemProps`.)
    * @param dismissMenu - Function to dismiss the menu. Can be used to ensure that a custom menu
    * item click dismisses the menu. (Will be undefined if rendering a command bar item.)
    */
  var onRender: js.UndefOr[
    js.Function2[
      /* item */ js.Any, 
      /* dismissMenu */ js.Function2[/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean], Unit], 
      TagMod[Any]
    ]
  ] = js.native
  /**
    * Custom render function for the menu item icon
    */
  var onRenderIcon: js.UndefOr[IRenderFunction[IContextualMenuItemProps]] = js.native
  /**
    * If the menu item is a split button, this prop disables purely the primary action of the button.
    * @defaultvalue false
    */
  var primaryDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Link relation setting when using `href`.
    * If `target` is `_blank`, `rel` is defaulted to a value to prevent clickjacking.
    */
  var rel: js.UndefOr[String] = js.native
  /**
    * Optional override for the menu button's role. Defaults to `menuitem` or `menuitemcheckbox`.
    */
  var role: js.UndefOr[String] = js.native
  /**
    * Seconday description for the menu item to display
    */
  var secondaryText: js.UndefOr[String] = js.native
  /**
    * Properties to apply to render this item as a section.
    * This prop is mutually exclusive with `subMenuProps`.
    */
  var sectionProps: js.UndefOr[IContextualMenuSection] = js.native
  /**
    * @deprecated Not used
    */
  var shortCut: js.UndefOr[String] = js.native
  /**
    * Whether or not this menu item is a splitButton.
    * @defaultvalue false
    */
  var split: js.UndefOr[Boolean] = js.native
  /**
    * Additional styles to apply to the menu item
    * @deprecated in favor of the `styles` prop to leverage mergeStyles API.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * Properties to apply to a submenu to this item.
    *
    * The ContextualMenu will provide default values for `target`, `onDismiss`, `isSubMenu`,
    * `id`, `shouldFocusOnMount`, `directionalHint`, `className`, and `gapSpace`, all of which
    * can be overridden.
    */
  var subMenuProps: js.UndefOr[IContextualMenuProps] = js.native
  /**
    * Props for the Icon used for the chevron.
    */
  var submenuIconProps: js.UndefOr[IIconProps] = js.native
  /**
    * Target window when using `href`.
    */
  var target: js.UndefOr[String] = js.native
  /**
    * Text description for the menu item to display
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Optional title for displaying text when hovering over an item.
    */
  var title: js.UndefOr[String] = js.native
}

object IContextualMenuItem {
  @scala.inline
  def apply(key: String): IContextualMenuItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuItem]
  }
  @scala.inline
  implicit class IContextualMenuItemOps[Self <: IContextualMenuItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
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
    def withCanCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IContextualMenuRenderItem | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IContextualMenuRenderItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IContextualMenuRenderItem]): Self = {
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
    def withCustomOnRenderListLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customOnRenderListLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomOnRenderListLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customOnRenderListLength")(js.undefined)
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
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemClassNames(
      value: (/* theme */ ITheme, /* disabled */ Boolean, /* expanded */ Boolean, /* checked */ Boolean, /* isAnchorLink */ Boolean, /* knownIcon */ Boolean, /* itemClassName */ js.UndefOr[String], /* dividerClassName */ js.UndefOr[String], /* iconClassName */ js.UndefOr[String], /* subMenuClassName */ js.UndefOr[String], /* primaryDisabled */ js.UndefOr[Boolean]) => IMenuItemClassNames
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemClassNames")(js.Any.fromFunction11(value))
        ret
    }
    @scala.inline
    def withoutGetItemClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemClassNames")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSplitButtonVerticalDividerClassNames(value: /* theme */ ITheme => IVerticalDividerClassNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSplitButtonVerticalDividerClassNames")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetSplitButtonVerticalDividerClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSplitButtonVerticalDividerClassNames")(js.undefined)
        ret
    }
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.undefined)
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
    def withInactive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactive")(js.undefined)
        ret
    }
    @scala.inline
    def withItemProps(value: PartialIContextualMenuIte): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemProps")(js.undefined)
        ret
    }
    @scala.inline
    def withItemType(value: ContextualMenuItemType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(js.undefined)
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(
      value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]], /* item */ js.UndefOr[IContextualMenuItem]) => Boolean | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseDown(value: (/* item */ IContextualMenuItem, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRender(
      value: (/* item */ js.Any, /* dismissMenu */ js.Function2[/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean], Unit]) => TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderIcon(
      value: (/* props */ js.UndefOr[IContextualMenuItemProps], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IContextualMenuItemProps], ReactElement | Null]
        ]) => ReactElement | Null
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
    def withRel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rel")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
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
    def withSectionProps(value: IContextualMenuSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSectionProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionProps")(js.undefined)
        ret
    }
    @scala.inline
    def withShortCut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortCut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortCut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortCut")(js.undefined)
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
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withSubMenuProps(value: IContextualMenuProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubMenuProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuProps")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmenuIconProps(value: IIconProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenuIconProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmenuIconProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenuIconProps")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
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
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

