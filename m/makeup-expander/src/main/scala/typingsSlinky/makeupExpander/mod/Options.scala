package typingsSlinky.makeupExpander.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var autoCollapse: js.UndefOr[Boolean] = js.native
  var collapseOnClickOut: js.UndefOr[Boolean] = js.native
  var collapseOnFocusOut: js.UndefOr[Boolean] = js.native
  var collapseOnMouseOut: js.UndefOr[Boolean] = js.native
  var contentSelector: js.UndefOr[String] = js.native
  var expandOnClick: js.UndefOr[Boolean] = js.native
  var expandOnFocus: js.UndefOr[Boolean] = js.native
  var expandOnHover: js.UndefOr[Boolean] = js.native
  var expandedClass: js.UndefOr[String] = js.native
  var focusManagement: js.UndefOr[String | Null] = js.native
  var hostSelector: js.UndefOr[String] = js.native
  var simulateSpacebarClick: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoCollapse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCollapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseOnClickOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseOnClickOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseOnClickOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseOnClickOut")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseOnFocusOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseOnFocusOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseOnFocusOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseOnFocusOut")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseOnMouseOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseOnMouseOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseOnMouseOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseOnMouseOut")(js.undefined)
        ret
    }
    @scala.inline
    def withContentSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandOnHover")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedClass")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusManagement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusManagement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusManagement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusManagement")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusManagementNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusManagement")(null)
        ret
    }
    @scala.inline
    def withHostSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withSimulateSpacebarClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulateSpacebarClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimulateSpacebarClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulateSpacebarClick")(js.undefined)
        ret
    }
  }
  
}

