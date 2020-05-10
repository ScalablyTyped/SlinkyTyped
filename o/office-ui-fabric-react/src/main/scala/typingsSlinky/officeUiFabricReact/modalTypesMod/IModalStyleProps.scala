package typingsSlinky.officeUiFabricReact.modalTypesMod

import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Modal/Modal.types.IModalProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Modal/Modal.types.IModalProps, 'className' | 'containerClassName' | 'scrollableContentClassName' | 'topOffsetFixed' | 'isModeless'> & {  isOpen ? :boolean,   isVisible ? :boolean,   hasBeenOpened ? :boolean,   modalRectangleTop ? :number,   layerClassName ? :string,   isDefaultDragHandle ? :boolean} */
@js.native
trait IModalStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var containerClassName: js.UndefOr[String] = js.native
  /** Modal has been opened state. */
  var hasBeenOpened: js.UndefOr[Boolean] = js.native
  /** Whether this modal is draggable and using the default handler */
  var isDefaultDragHandle: js.UndefOr[Boolean] = js.native
  var isModeless: js.UndefOr[Boolean] = js.native
  /** Modal open state. */
  var isOpen: js.UndefOr[Boolean] = js.native
  /** Modal visible state. */
  var isVisible: js.UndefOr[Boolean] = js.native
  /** Classname for layer element */
  var layerClassName: js.UndefOr[String] = js.native
  /** Positioning of modal on first render */
  var modalRectangleTop: js.UndefOr[Double] = js.native
  var scrollableContentClassName: js.UndefOr[String] = js.native
  var theme: ITheme = js.native
  var topOffsetFixed: js.UndefOr[Boolean] = js.native
}

object IModalStyleProps {
  @scala.inline
  def apply(theme: ITheme): IModalStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModalStyleProps]
  }
  @scala.inline
  implicit class IModalStylePropsOps[Self <: IModalStyleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
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
    def withHasBeenOpened(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBeenOpened")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasBeenOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBeenOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDefaultDragHandle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultDragHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDefaultDragHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultDragHandle")(js.undefined)
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
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withModalRectangleTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalRectangleTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalRectangleTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalRectangleTop")(js.undefined)
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

