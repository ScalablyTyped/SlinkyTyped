package typingsSlinky.reactToolbox.layoutSidebarMod

import typingsSlinky.reactToolbox.libDrawerDrawerMod.DrawerCommonProps
import typingsSlinky.reactToolbox.reactToolboxStrings.lg
import typingsSlinky.reactToolbox.reactToolboxStrings.lgTablet
import typingsSlinky.reactToolbox.reactToolboxStrings.md
import typingsSlinky.reactToolbox.reactToolboxStrings.sm
import typingsSlinky.reactToolbox.reactToolboxStrings.smTablet
import typingsSlinky.reactToolbox.reactToolboxStrings.xl
import typingsSlinky.reactToolbox.reactToolboxStrings.xxl
import typingsSlinky.reactToolbox.reactToolboxStrings.xxxl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SidebarProps extends DrawerCommonProps {
  /**
    * If true, when the `AppBar` gets pinned, it will stand over the `Drawer`.
    * @default false
    */
  var clipped: js.UndefOr[Boolean] = js.native
  /**
    * The breakpoint at which the drawer is automatically pinned.
    */
  var permanentAt: js.UndefOr[sm | smTablet | md | lg | lgTablet | xl | xxl | xxxl] = js.native
  /**
    * If true, the sidebar will be pinned open.
    * @default false
    */
  var pinned: js.UndefOr[Boolean] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[SidebarTheme] = js.native
  /**
    * Width in standard increments (1-12) or percentage (25, 33, 50, 66, 75, 100)
    * @default 5
    */
  var width: js.UndefOr[Double] = js.native
}

object SidebarProps {
  @scala.inline
  def apply(): SidebarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidebarProps]
  }
  @scala.inline
  implicit class SidebarPropsOps[Self <: SidebarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClipped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipped")(js.undefined)
        ret
    }
    @scala.inline
    def withPermanentAt(value: sm | smTablet | md | lg | lgTablet | xl | xxl | xxxl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permanentAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermanentAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permanentAt")(js.undefined)
        ret
    }
    @scala.inline
    def withPinned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: SidebarTheme): Self = {
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
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

