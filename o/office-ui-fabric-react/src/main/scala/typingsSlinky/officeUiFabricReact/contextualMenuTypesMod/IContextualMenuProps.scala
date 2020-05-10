package typingsSlinky.officeUiFabricReact.contextualMenuTypesMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsSlinky.officeUiFabricReact.calloutTypesMod.Target
import typingsSlinky.officeUiFabricReact.contextualMenuClassNamesMod.IContextualMenuClassNames
import typingsSlinky.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemProps
import typingsSlinky.officeUiFabricReact.withResponsiveModeMod.IWithResponsiveModeState
import typingsSlinky.std.Partial
import typingsSlinky.std.Window_
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typingsSlinky.uifabricUtilities.irectangleMod.IRectangle
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextualMenuProps
  extends IBaseProps[IContextualMenu]
     with IWithResponsiveModeState {
  /**
    * If true the positioning logic will prefer to flip edges rather than to nudge the rectangle to fit within bounds,
    * thus making sure the element aligns perfectly with target's alignment edge
    */
  var alignTargetEdge: js.UndefOr[Boolean] = js.native
  /**
    * Accessible label for the ContextualMenu's root element (inside the callout).
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * The width of the beak.
    * @defaultvalue 16
    */
  var beakWidth: js.UndefOr[Double] = js.native
  /**
    * The bounding rectangle (or callback that returns a rectangle) which the contextual menu can appear in.
    */
  var bounds: js.UndefOr[
    IRectangle | (js.Function2[
      /* target */ js.UndefOr[Target], 
      /* targetWindow */ js.UndefOr[Window_], 
      js.UndefOr[IRectangle]
    ])
  ] = js.native
  /**
    * Additional custom props for the Callout.
    */
  var calloutProps: js.UndefOr[ICalloutProps] = js.native
  /**
    * Additional CSS class to apply to the ContextualMenu.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Method to override the render of the individual menu items
    * @defaultvalue ContextualMenuItem
    */
  var contextualMenuItemAs: js.UndefOr[ReactComponentClass[IContextualMenuItemProps]] = js.native
  /**
    * If true, the menu will be positioned to cover the target.
    * If false, it will be positioned next to the target.
    * @defaultvalue false
    */
  var coverTarget: js.UndefOr[Boolean] = js.native
  /**
    * If true, the contextual menu will not be updated until focus enters the menu via other means.
    * This will only result in different behavior when `shouldFocusOnMount = false`.
    * @defaultvalue null
    */
  var delayUpdateFocusOnHover: js.UndefOr[Boolean] = js.native
  /**
    * How the menu should be positioned
    * @defaultvalue DirectionalHint.bottomAutoEdge
    */
  var directionalHint: js.UndefOr[typingsSlinky.officeUiFabricReact.directionalHintMod.DirectionalHint] = js.native
  /**
    * If true the position will not change sides in an attempt to fit the ContextualMenu within bounds.
    * It will still attempt to align it to whatever bounds are given.
    * @defaultvalue false
    */
  var directionalHintFixed: js.UndefOr[Boolean] = js.native
  /**
    * How the menu should be positioned in RTL layouts.
    * If not specified, a mirror of `directionalHint` will be used.
    */
  var directionalHintForRTL: js.UndefOr[typingsSlinky.officeUiFabricReact.directionalHintMod.DirectionalHint] = js.native
  /**
    * If true do not render on a new layer. If false render on a new layer.
    * @defaultvalue false
    */
  var doNotLayer: js.UndefOr[Boolean] = js.native
  /**
    * Props to pass down to the FocusZone.
    * NOTE: the default FocusZoneDirection will be used unless a direction
    * is specified in the focusZoneProps (even if other focusZoneProps are defined)
    * @defaultvalue \{ direction: FocusZoneDirection.vertical \}
    */
  var focusZoneProps: js.UndefOr[IFocusZoneProps] = js.native
  /**
    * The gap between the ContextualMenu and the target
    * @defaultvalue 0
    */
  var gapSpace: js.UndefOr[Double] = js.native
  /**
    * Method to provide the classnames to style the contextual menu.
    * @deprecated Use `styles` instead to leverage mergeStyles API.
    */
  var getMenuClassNames: js.UndefOr[
    js.Function2[/* theme */ ITheme, /* className */ js.UndefOr[String], IContextualMenuClassNames]
  ] = js.native
  /**
    * If true, renders the ContextualMenu in a hidden state.
    * Use this flag, rather than rendering a ContextualMenu conditionally based on visibility,
    * to improve rendering performance when it becomes visible.
    * Note: When ContextualMenu is hidden its content will not be rendered. It will only render
    * once the ContextualMenu is visible.
    * @defaultValue undefined
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * ID for the ContextualMenu's root element (inside the callout).
    * Should be used for `aria-owns` and other such uses, rather than direct reference for programmatic purposes.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * If true then the beak is visible. If false it will not be shown.
    */
  var isBeakVisible: js.UndefOr[Boolean] = js.native
  /**
    * Whether this menu is a submenu of another menu.
    */
  var isSubMenu: js.UndefOr[Boolean] = js.native
  /**
    * Menu items to display.
    * @defaultvalue []
    */
  var items: js.Array[IContextualMenuItem] = js.native
  /**
    * Used as `aria-labelledby` for the menu element inside the callout.
    */
  var labelElementId: js.UndefOr[String] = js.native
  /**
    * Callback when the ContextualMenu tries to close. If `dismissAll` is true then all
    * submenus will be dismissed.
    */
  var onDismiss: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element]], 
      /* dismissAll */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /**
    * Click handler which is invoked if `onClick` is not passed for individual contextual
    * menu item.
    * Returning true will dismiss the menu even if `ev.preventDefault()` was called.
    */
  var onItemClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]], 
      /* item */ js.UndefOr[IContextualMenuItem], 
      Boolean | Unit
    ]
  ] = js.native
  /**
    * Callback for when the menu is being closed (removing from the DOM).
    */
  var onMenuDismissed: js.UndefOr[js.Function1[/* contextualMenu */ js.UndefOr[IContextualMenuProps], Unit]] = js.native
  /**
    * Callback for when the menu has been opened.
    */
  var onMenuOpened: js.UndefOr[js.Function1[/* contextualMenu */ js.UndefOr[IContextualMenuProps], Unit]] = js.native
  /**
    * Method to override the render of the list of menu items.
    */
  var onRenderMenuList: js.UndefOr[IRenderFunction[IContextualMenuListProps]] = js.native
  /** Custom render function for a submenu. */
  var onRenderSubMenu: js.UndefOr[IRenderFunction[IContextualMenuProps]] = js.native
  /**
    * Whether to focus on the contextual menu container (as opposed to the first menu item).
    */
  var shouldFocusOnContainer: js.UndefOr[Boolean] = js.native
  /**
    * Whether to focus on the menu when mounted.
    * @defaultvalue true
    */
  var shouldFocusOnMount: js.UndefOr[Boolean] = js.native
  /**
    * If true, the component will be updated even when `hidden=true`.
    * Note that this would consume resources to update even though
    * nothing is being shown to the user.
    * This might be helpful though if your updates are small and you want the
    * contextual menu to be revealed fast to the user when `hidden` is set to false.
    */
  var shouldUpdateWhenHidden: js.UndefOr[Boolean] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IContextualMenuStyleProps, IContextualMenuStyles]] = js.native
  /**
    * Delay (in milliseconds) to wait before expanding / dismissing a submenu on mouseEnter or mouseLeave
    */
  var subMenuHoverDelay: js.UndefOr[Double] = js.native
  /**
    * The target that the ContextualMenu should try to position itself based on.
    * It can be either an element, a query selector string resolving to a valid element,
    * or a MouseEvent. If a MouseEvent is given, the origin point of the event will be used.
    */
  var target: js.UndefOr[Target] = js.native
  /**
    * Theme provided by higher-order component.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Optional title to be displayed on top of the menu.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * If true the context menu will have a minimum width equal to the width of the target element
    * @defaultvalue false
    */
  var useTargetAsMinWidth: js.UndefOr[Boolean] = js.native
  /**
    * If true the context menu will render as the same width as the target element
    * @defaultvalue false
    */
  var useTargetWidth: js.UndefOr[Boolean] = js.native
}

object IContextualMenuProps {
  @scala.inline
  def apply(items: js.Array[IContextualMenuItem]): IContextualMenuProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuProps]
  }
  @scala.inline
  implicit class IContextualMenuPropsOps[Self <: IContextualMenuProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[IContextualMenuItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlignTargetEdge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignTargetEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignTargetEdge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignTargetEdge")(js.undefined)
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
    def withBeakWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeakWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundsFunction2(
      value: (/* target */ js.UndefOr[Target], /* targetWindow */ js.UndefOr[Window_]) => js.UndefOr[IRectangle]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBounds(
      value: IRectangle | (js.Function2[
          /* target */ js.UndefOr[Target], 
          /* targetWindow */ js.UndefOr[Window_], 
          js.UndefOr[IRectangle]
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutProps(value: ICalloutProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutProps")(js.undefined)
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
    def withContextualMenuItemAsFunctionComponent(value: ReactComponentClass[IContextualMenuItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualMenuItemAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextualMenuItemAsComponentClass(value: ReactComponentClass[IContextualMenuItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualMenuItemAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextualMenuItemAs(value: ReactComponentClass[IContextualMenuItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualMenuItemAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextualMenuItemAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualMenuItemAs")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverTarget(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayUpdateFocusOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayUpdateFocusOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayUpdateFocusOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayUpdateFocusOnHover")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionalHint(value: typingsSlinky.officeUiFabricReact.directionalHintMod.DirectionalHint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionalHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHint")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionalHintFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHintFixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionalHintFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHintFixed")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionalHintForRTL(value: typingsSlinky.officeUiFabricReact.directionalHintMod.DirectionalHint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHintForRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionalHintForRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHintForRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withDoNotLayer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoNotLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusZoneProps(value: IFocusZoneProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusZoneProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusZoneProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusZoneProps")(js.undefined)
        ret
    }
    @scala.inline
    def withGapSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGapSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMenuClassNames(value: (/* theme */ ITheme, /* className */ js.UndefOr[String]) => IContextualMenuClassNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMenuClassNames")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetMenuClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMenuClassNames")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBeakVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBeakVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBeakVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBeakVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSubMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSubMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSubMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSubMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelElementId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelElementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelElementId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelElementId")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDismiss(
      value: (/* ev */ js.UndefOr[SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element]], /* dismissAll */ js.UndefOr[Boolean]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemClick(
      value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]], /* item */ js.UndefOr[IContextualMenuItem]) => Boolean | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMenuDismissed(value: /* contextualMenu */ js.UndefOr[IContextualMenuProps] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuDismissed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMenuDismissed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuDismissed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMenuOpened(value: /* contextualMenu */ js.UndefOr[IContextualMenuProps] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuOpened")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMenuOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderMenuList(
      value: (/* props */ js.UndefOr[IContextualMenuListProps], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IContextualMenuListProps], ReactElement | Null]
        ]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderMenuList")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderMenuList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderMenuList")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderSubMenu(
      value: (/* props */ js.UndefOr[IContextualMenuProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IContextualMenuProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderSubMenu")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderSubMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderSubMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldFocusOnContainer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFocusOnContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldFocusOnContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFocusOnContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldFocusOnMount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFocusOnMount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldFocusOnMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFocusOnMount")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldUpdateWhenHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUpdateWhenHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldUpdateWhenHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUpdateWhenHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IContextualMenuStyleProps => Partial[IContextualMenuStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IContextualMenuStyleProps, IContextualMenuStyles]): Self = {
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
    def withSubMenuHoverDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuHoverDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubMenuHoverDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuHoverDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetRefObject(value: ReactRef[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetMouseEvent(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Target): Self = {
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
    def withTargetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(null)
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
    @scala.inline
    def withUseTargetAsMinWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTargetAsMinWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTargetAsMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTargetAsMinWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTargetWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTargetWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTargetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTargetWidth")(js.undefined)
        ret
    }
  }
  
}

