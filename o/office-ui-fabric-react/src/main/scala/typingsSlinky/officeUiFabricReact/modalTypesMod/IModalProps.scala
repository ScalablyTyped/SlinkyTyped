package typingsSlinky.officeUiFabricReact.modalTypesMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.iaccessiblepopuppropsMod.IAccessiblePopupProps
import typingsSlinky.officeUiFabricReact.layerTypesMod.ILayerProps
import typingsSlinky.officeUiFabricReact.modalBaseMod.ModalBase
import typingsSlinky.officeUiFabricReact.overlayTypesMod.IOverlayProps
import typingsSlinky.officeUiFabricReact.withResponsiveModeMod.IWithResponsiveModeState
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModalProps
  extends ClassAttributes[ModalBase]
     with IWithResponsiveModeState
     with IAccessiblePopupProps {
  /**
    * Allow body scroll on content and overlay on touch devices. Changing after mounting has no effect.
    * @defaultvalue false
    */
  var allowTouchBodyScroll: js.UndefOr[Boolean] = js.native
  /**
    * Optional class name to be added to the root class
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Optional callback to access the IDialog interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IModal]] = js.native
  /**
    * Optional override for container class
    */
  var containerClassName: js.UndefOr[String] = js.native
  /**
    * The options to make the modal draggable
    */
  var dragOptions: js.UndefOr[IDragOptions] = js.native
  /**
    * Whether the dialog can be light dismissed by clicking outside the dialog (on the overlay).
    * @defaultvalue false
    */
  var isBlocking: js.UndefOr[Boolean] = js.native
  /**
    * Whether the overlay is dark themed.
    * @defaultvalue true
    */
  var isDarkOverlay: js.UndefOr[Boolean] = js.native
  /**
    * Whether the dialog should be modeless (e.g. not dismiss when focusing/clicking outside of the dialog).
    * if true: isBlocking is ignored, there will be no overlay (isDarkOverlay is ignored),
    * isClickableOutsideFocusTrap is true, and forceFocusInsideTrap is false
    */
  var isModeless: js.UndefOr[Boolean] = js.native
  /**
    * Whether the dialog is displayed.
    * @defaultvalue false
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  /**
    * Defines an optional set of props to be passed through to Layer
    */
  var layerProps: js.UndefOr[ILayerProps] = js.native
  /**
    * A callback function for when the Modal is dismissed light dismiss, before the animation completes.
    */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLButtonElement]], _]] = js.native
  /**
    * A callback function which is called after the Modal is dismissed and the animation is complete.
    */
  var onDismissed: js.UndefOr[js.Function0[_]] = js.native
  /**
    * A callback function for when the Modal content is mounted on the overlay layer
    * @deprecated Use layerProps.onLayerDidMount instead
    */
  var onLayerDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Defines an optional set of props to be passed through to Overlay
    */
  var overlay: js.UndefOr[IOverlayProps] = js.native
  /**
    * Optional override for scrollable content class
    */
  var scrollableContentClassName: js.UndefOr[String] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IModalStyleProps, IModalStyles]] = js.native
  /**
    * ARIA id for the subtitle of the Modal, if any
    */
  var subtitleAriaId: js.UndefOr[String] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * ARIA id for the title of the Modal, if any
    */
  var titleAriaId: js.UndefOr[String] = js.native
  /**
    * Whether the modal should have top offset fixed once opened and expand from the bottom only
    * when the content changes dynamically.
    */
  var topOffsetFixed: js.UndefOr[Boolean] = js.native
}

object IModalProps {
  @scala.inline
  def apply(): IModalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModalProps]
  }
  @scala.inline
  implicit class IModalPropsOps[Self <: IModalProps] (val x: Self) extends AnyVal {
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
    def withComponentRefFunction1(value: /* ref */ IModal | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IModal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IModal]): Self = {
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
    def withContainerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withDragOptions(value: IDragOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOptions")(js.undefined)
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
    def withIsDarkOverlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDarkOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDarkOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDarkOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withIsModeless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModeless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsModeless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModeless")(js.undefined)
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
    def withOnDismiss(value: /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLButtonElement]] => _): Self = {
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
    def withOnDismissed(value: () => _): Self = {
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
    def withOnLayerDidMount(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayerDidMount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLayerDidMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayerDidMount")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlay(value: IOverlayProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollableContentClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollableContentClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollableContentClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollableContentClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IModalStyleProps => Partial[IModalStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IModalStyleProps, IModalStyles]): Self = {
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
    def withSubtitleAriaId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleAriaId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleAriaId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleAriaId")(js.undefined)
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
    def withTitleAriaId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAriaId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleAriaId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAriaId")(js.undefined)
        ret
    }
    @scala.inline
    def withTopOffsetFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topOffsetFixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopOffsetFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topOffsetFixed")(js.undefined)
        ret
    }
  }
  
}

