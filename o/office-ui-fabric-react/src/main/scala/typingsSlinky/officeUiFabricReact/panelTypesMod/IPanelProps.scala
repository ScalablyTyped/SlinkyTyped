package typingsSlinky.officeUiFabricReact.panelTypesMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.focusTrapZoneTypesMod.IFocusTrapZoneProps
import typingsSlinky.officeUiFabricReact.layerTypesMod.ILayerProps
import typingsSlinky.officeUiFabricReact.overlayTypesMod.IOverlayProps
import typingsSlinky.officeUiFabricReact.panelBaseMod.PanelBase
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanelProps extends HTMLAttributes[PanelBase] {
  /**
    * Allow body scroll on content and overlay on touch devices. Changing after mounting has no effect.
    * @defaultvalue false
    */
  var allowTouchBodyScroll: js.UndefOr[Boolean] = js.native
  /**
    * Aria label on close button
    */
  var closeButtonAriaLabel: js.UndefOr[String] = js.native
  /**
    * Deprecated property. Serves no function.
    * @deprecated Serves no function.
    */
  var componentId: js.UndefOr[String] = js.native
  /**
    * Optional callback to access the IPanel interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IPanel]] = js.native
  /**
    * Custom panel width, used only when `type` is set to `PanelType.custom`.
    */
  var customWidth: js.UndefOr[String] = js.native
  /**
    * Sets the HTMLElement to focus on when exiting the FocusTrapZone.
    * @defaultvalue The element.target that triggered the Panel.
    */
  var elementToFocusOnDismiss: js.UndefOr[HTMLElement] = js.native
  /**
    * Indicates the selector for first focusable item.
    * Deprecated, use `focusTrapZoneProps`.
    * @deprecated Use `focusTrapZoneProps`.
    */
  var firstFocusableSelector: js.UndefOr[String] = js.native
  /**
    * Optional props to pass to the FocusTrapZone component to manage focus in the panel.
    */
  var focusTrapZoneProps: js.UndefOr[IFocusTrapZoneProps] = js.native
  /**
    * Indicates whether Panel should force focus inside the focus trap zone.
    * If not explicitly specified, behavior aligns with FocusTrapZone's default behavior.
    * Deprecated, use `focusTrapZoneProps`.
    * @deprecated Use `focusTrapZoneProps`.
    */
  var forceFocusInsideTrap: js.UndefOr[Boolean] = js.native
  /**
    * Has the close button visible.
    * @defaultvalue true
    */
  var hasCloseButton: js.UndefOr[Boolean] = js.native
  /**
    * Optional parameter to provider the class name for header text
    */
  var headerClassName: js.UndefOr[String] = js.native
  /**
    * Header text for the Panel.
    * @defaultvalue ""
    */
  var headerText: js.UndefOr[String] = js.native
  /**
    * The props for header text container.
    */
  var headerTextProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
  /**
    * Indicates if this Panel will ignore keeping track of HTMLElement that activated the Zone.
    * Deprecated, use `focusTrapZoneProps`.
    * @defaultvalue false
    * @deprecated Use `focusTrapZoneProps`.
    */
  var ignoreExternalFocusing: js.UndefOr[Boolean] = js.native
  /**
    * Whether the panel uses a modal overlay or not
    * @defaultvalue true
    */
  var isBlocking: js.UndefOr[Boolean] = js.native
  /**
    * Determines if content should stretch to fill available space putting footer at the bottom of the page
    * @defaultvalue false
    */
  var isFooterAtBottom: js.UndefOr[Boolean] = js.native
  /**
    * Whether the panel is hidden on dismiss, instead of destroyed in the DOM.
    * Protects the contents from being destroyed when the panel is dismissed.
    * @defaultvalue false
    */
  var isHiddenOnDismiss: js.UndefOr[Boolean] = js.native
  /**
    * Whether the panel can be light dismissed.
    * @defaultvalue false
    */
  var isLightDismiss: js.UndefOr[Boolean] = js.native
  /**
    * Whether the panel is displayed.
    * If true, will cause panel to stay open even if dismissed.
    * If false, will cause panel to stay hidden.
    * If undefined, will allow the panel to control its own visility through open/dismiss methods.
    * @defaultvalue undefined
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  /**
    * Optional props to pass to the Layer component hosting the panel.
    */
  var layerProps: js.UndefOr[ILayerProps] = js.native
  /**
    * A callback function for when the panel is closed, before the animation completes.
    * If the panel should NOT be dismissed based on some keyboard event, then simply call ev.preventDefault() on it
    */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[SyntheticEvent[Event, HTMLElement]], Unit]] = js.native
  /**
    * A callback function which is called **after** the Panel is dismissed and the animation is complete.
    * (If you need to update the Panel's `isOpen` prop in response to a dismiss event, use `onDismiss` instead.)
    */
  var onDismissed: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Optional custom function to handle clicks outside the panel in lightdismiss mode
    */
  var onLightDismissClick: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A callback function for when the Panel is opened, before the animation completes.
    */
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A callback function for when the Panel is opened, after the animation completes.
    */
  var onOpened: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Optional custom function to handle clicks outside this component
    */
  var onOuterClick: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Optional custom renderer for body region. Replaces any children passed into the component.
    */
  var onRenderBody: js.UndefOr[IRenderFunction[IPanelProps]] = js.native
  /**
    * Optional custom renderer for footer region. Replaces sticky footer.
    */
  var onRenderFooter: js.UndefOr[IRenderFunction[IPanelProps]] = js.native
  /**
    * Custom renderer for content in the sticky footer
    */
  var onRenderFooterContent: js.UndefOr[IRenderFunction[IPanelProps]] = js.native
  /**
    * Optional custom renderer for header region. Replaces current title
    */
  var onRenderHeader: js.UndefOr[IPanelHeaderRenderer] = js.native
  /**
    * Optional custom renderer navigation region. Replaces the region that contains the close button.
    */
  var onRenderNavigation: js.UndefOr[IRenderFunction[IPanelProps]] = js.native
  /**
    * Optional custom renderer for content in the navigation region. Replaces current close button.
    */
  var onRenderNavigationContent: js.UndefOr[IRenderFunction[IPanelProps]] = js.native
  /**
    * Optional props to pass to the Overlay component that the panel uses.
    */
  var overlayProps: js.UndefOr[IOverlayProps] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles]] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Type of the panel.
    * @defaultvalue PanelType.smallFixedFar
    */
  var `type`: js.UndefOr[PanelType] = js.native
}

object IPanelProps {
  @scala.inline
  def apply(): IPanelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanelProps]
  }
  @scala.inline
  implicit class IPanelPropsOps[Self <: IPanelProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowTouchBodyScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTouchBodyScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTouchBodyScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTouchBodyScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseButtonAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseButtonAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentId")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IPanel | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IPanel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IPanel]): Self = {
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
    def withCustomWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withElementToFocusOnDismiss(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementToFocusOnDismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementToFocusOnDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementToFocusOnDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstFocusableSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstFocusableSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstFocusableSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstFocusableSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusTrapZoneProps(value: IFocusTrapZoneProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusTrapZoneProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusTrapZoneProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusTrapZoneProps")(js.undefined)
        ret
    }
    @scala.inline
    def withForceFocusInsideTrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFocusInsideTrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceFocusInsideTrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFocusInsideTrap")(js.undefined)
        ret
    }
    @scala.inline
    def withHasCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCloseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCloseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTextProps(value: HTMLAttributes[HTMLDivElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTextProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTextProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTextProps")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreExternalFocusing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreExternalFocusing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreExternalFocusing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreExternalFocusing")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBlocking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBlocking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBlocking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBlocking")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFooterAtBottom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFooterAtBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFooterAtBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFooterAtBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHiddenOnDismiss(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHiddenOnDismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHiddenOnDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHiddenOnDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLightDismiss(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLightDismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLightDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLightDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerProps(value: ILayerProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerProps")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDismiss(value: /* ev */ js.UndefOr[SyntheticEvent[Event, HTMLElement]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDismissed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismissed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDismissed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismissed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLightDismissClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLightDismissClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLightDismissClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLightDismissClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpened(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpened")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOuterClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOuterClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnOuterClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOuterClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderBody(
      value: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderBody")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderBody")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderFooter(
      value: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderFooter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderFooterContent(
      value: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderFooterContent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderFooterContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderFooterContent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderHeader(value: IPanelHeaderRenderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnRenderHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderNavigation(
      value: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderNavigation")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderNavigationContent(
      value: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderNavigationContent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderNavigationContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderNavigationContent")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayProps(value: IOverlayProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayProps")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IPanelStyleProps => Partial[IPanelStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles]): Self = {
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
    def withType(value: PanelType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

