package typingsSlinky.reactBootstrap.dropdownToggleMod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownToggleProps
  extends AllHTMLAttributes[DropdownToggle]
     with ClassAttributes[DropdownToggle] {
  var bsClass: js.UndefOr[String] = js.native
  var bsRole: js.UndefOr[String] = js.native
  var bsSize: js.UndefOr[String] = js.native
   // Added since v0.30.0
  var bsStyle: js.UndefOr[String | Null] = js.native
  var noCaret: js.UndefOr[Boolean] = js.native
  var useAnchor: js.UndefOr[Boolean] = js.native
}

object DropdownToggleProps {
  @scala.inline
  def apply(): DropdownToggleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownToggleProps]
  }
  @scala.inline
  implicit class DropdownTogglePropsOps[Self <: DropdownToggleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBsClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(js.undefined)
        ret
    }
    @scala.inline
    def withBsRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsRole")(js.undefined)
        ret
    }
    @scala.inline
    def withBsSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBsStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBsStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsStyle")(null)
        ret
    }
    @scala.inline
    def withNoCaret(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCaret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCaret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCaret")(js.undefined)
        ret
    }
    @scala.inline
    def withUseAnchor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAnchor")(js.undefined)
        ret
    }
  }
  
}

