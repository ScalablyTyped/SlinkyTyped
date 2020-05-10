package typingsSlinky.reactOverlays.dropdownMenuMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownMenuProps extends js.Object {
  /**
    * Aligns the dropdown menu to the 'end' of it's placement position.
    * Generally this is provided by the parent `Dropdown` component,
    * but may also be specified as a prop directly.
    */
  var alignEnd: js.UndefOr[Boolean] = js.native
  /**
    * Enables the Popper.js `flip` modifier, allowing the Dropdown to
    * automatically adjust it's placement in case of overlap with the viewport or toggle.
    */
  var flip: js.UndefOr[Boolean] = js.native
  /**
    * A set of popper options and props passed directly to react-popper's Popper component.
    */
  var popperConfig: js.UndefOr[js.Object] = js.native
  /**
    * Override the default event used by RootCloseWrapper.
    */
  var rootCloseEvent: js.UndefOr[String] = js.native
  /**
    * Controls the visible state of the menu, generally this is
    * provided by the parent `Dropdown` component,
    * but may also be specified as a prop directly.
    */
  var show: js.UndefOr[Boolean] = js.native
  var usePopper: js.UndefOr[Boolean] = js.native
  /**
    * A render prop that returns a Menu element. The `props`
    * argument should spread through to **a component that can accept a ref**.
    */
  def children(renderProps: DropdownMenuRenderProps): ReactElement = js.native
}

object DropdownMenuProps {
  @scala.inline
  def apply(children: DropdownMenuRenderProps => ReactElement): DropdownMenuProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[DropdownMenuProps]
  }
  @scala.inline
  implicit class DropdownMenuPropsOps[Self <: DropdownMenuProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: DropdownMenuRenderProps => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAlignEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withFlip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(js.undefined)
        ret
    }
    @scala.inline
    def withPopperConfig(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popperConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopperConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popperConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withRootCloseEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootCloseEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootCloseEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootCloseEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePopper(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePopper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePopper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePopper")(js.undefined)
        ret
    }
  }
  
}

