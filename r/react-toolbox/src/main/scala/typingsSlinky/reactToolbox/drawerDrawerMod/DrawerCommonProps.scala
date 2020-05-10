package typingsSlinky.reactToolbox.drawerDrawerMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactToolbox.reactToolboxStrings.left
import typingsSlinky.reactToolbox.reactToolboxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerCommonProps extends js.Object {
  /**
    * If true, the drawer will be visible.
    * @default false
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[TagMod[Any]] = js.native
  /**
    * If true the Drawer is rendered inside the normal tree.
    * @default false
    */
  var insideTree: js.UndefOr[Boolean] = js.native
  /**
    * Callback function to be invoked when the overlay is clicked.
    */
  var onOverlayClick: js.UndefOr[js.Function] = js.native
  /**
    * Type of drawer. It can be left or right to display the drawer on the left or right side of the screen.
    * @default left
    */
  var `type`: js.UndefOr[left | right] = js.native
  /**
    * If true display an Overlay that locks the scroll when the Drawer is active.
    * @default true
    */
  var withOverlay: js.UndefOr[Boolean] = js.native
}

object DrawerCommonProps {
  @scala.inline
  def apply(): DrawerCommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerCommonProps]
  }
  @scala.inline
  implicit class DrawerCommonPropsOps[Self <: DrawerCommonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withInsideTree(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insideTree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsideTree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insideTree")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOverlayClick(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverlayClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOverlayClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverlayClick")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: left | right): Self = {
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
    @scala.inline
    def withWithOverlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withOverlay")(js.undefined)
        ret
    }
  }
  
}

