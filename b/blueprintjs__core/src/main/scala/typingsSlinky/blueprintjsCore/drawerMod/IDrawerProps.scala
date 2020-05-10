package typingsSlinky.blueprintjsCore.drawerMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.overlayMod.IBackdropProps
import typingsSlinky.blueprintjsCore.overlayMod.IOverlayableProps
import typingsSlinky.blueprintjsCore.positionMod.Position
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDrawerProps
  extends IOverlayableProps
     with IBackdropProps
     with IProps {
  /**
    * Name of a Blueprint UI icon (or an icon element) to render in the
    * drawer's header. Note that the header will only be rendered if `title` is
    * provided.
    */
  var icon: js.UndefOr[IconName | MaybeElement] = js.native
  /**
    * Whether to show the close button in the dialog's header.
    * Note that the header will only be rendered if `title` is provided.
    * @default true
    */
  var isCloseButtonShown: js.UndefOr[Boolean] = js.native
  /**
    * Toggles the visibility of the overlay and its children.
    * This prop is required because the component is controlled.
    */
  var isOpen: Boolean = js.native
  /**
    * Position of a drawer. All angled positions will be casted into pure positions
    * (TOP, BOTTOM, LEFT or RIGHT).
    * @default Position.RIGHT
    */
  var position: js.UndefOr[Position] = js.native
  /**
    * CSS size of the drawer. This sets `width` if `vertical={false}` (default)
    * and `height` otherwise.
    *
    * Constants are available for common sizes:
    * - `Drawer.SIZE_SMALL = 360px`
    * - `Drawer.SIZE_STANDARD = 50%`
    * - `Drawer.SIZE_LARGE = 90%`
    *
    * @default Drawer.SIZE_STANDARD = "50%"
    */
  var size: js.UndefOr[Double | String] = js.native
  /**
    * CSS styles to apply to the dialog.
    * @default {}
    */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * Title of the dialog. If provided, an element with `Classes.DIALOG_HEADER`
    * will be rendered inside the dialog before any children elements.
    */
  var title: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Name of the transition for internal `CSSTransition`. Providing your own
    * name here will require defining new CSS transition properties.
    */
  var transitionName: js.UndefOr[String] = js.native
  /**
    * Whether the drawer should appear with vertical styling.
    * It will be ignored if `position` prop is set
    * @default false
    * @deprecated use `position` instead
    */
  var vertical: js.UndefOr[Boolean] = js.native
}

object IDrawerProps {
  @scala.inline
  def apply(isOpen: Boolean): IDrawerProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDrawerProps]
  }
  @scala.inline
  implicit class IDrawerPropsOps[Self <: IDrawerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: IconName | MaybeElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(null)
        ret
    }
    @scala.inline
    def withIsCloseButtonShown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCloseButtonShown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCloseButtonShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCloseButtonShown")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
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
    def withTitleReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: TagMod[Any]): Self = {
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
    def withTransitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
  }
  
}

