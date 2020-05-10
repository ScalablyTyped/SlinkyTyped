package typingsSlinky.bootstrapMultiselect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Templates extends js.Object {
  var button: js.UndefOr[String] = js.native
  var divider: js.UndefOr[String] = js.native
  var filter: js.UndefOr[String] = js.native
  var filterClearBtn: js.UndefOr[String] = js.native
  var li: js.UndefOr[String] = js.native
  var liGroup: js.UndefOr[String] = js.native
  var ul: js.UndefOr[String] = js.native
}

object Templates {
  @scala.inline
  def apply(): Templates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Templates]
  }
  @scala.inline
  implicit class TemplatesOps[Self <: Templates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withDivider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDivider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divider")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterClearBtn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterClearBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterClearBtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterClearBtn")(js.undefined)
        ret
    }
    @scala.inline
    def withLi(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("li")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("li")(js.undefined)
        ret
    }
    @scala.inline
    def withLiGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withUl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ul")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ul")(js.undefined)
        ret
    }
  }
  
}

