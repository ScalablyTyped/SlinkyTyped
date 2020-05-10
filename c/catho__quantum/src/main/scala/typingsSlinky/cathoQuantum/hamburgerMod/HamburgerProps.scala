package typingsSlinky.cathoQuantum.hamburgerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HamburgerProps extends js.Object {
  var ariaLabelDescription: js.UndefOr[String] = js.native
  var inverted: js.UndefOr[Boolean] = js.native
  var isOpened: js.UndefOr[Boolean] = js.native
  var showNotification: js.UndefOr[Boolean] = js.native
}

object HamburgerProps {
  @scala.inline
  def apply(): HamburgerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HamburgerProps]
  }
  @scala.inline
  implicit class HamburgerPropsOps[Self <: HamburgerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaLabelDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabelDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withInverted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInverted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOpened(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpened")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNotification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNotification")(js.undefined)
        ret
    }
  }
  
}

