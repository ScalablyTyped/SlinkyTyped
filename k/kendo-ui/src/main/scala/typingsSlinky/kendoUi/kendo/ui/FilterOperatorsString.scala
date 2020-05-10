package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterOperatorsString extends js.Object {
  var contains: js.UndefOr[String] = js.native
  var doesnotcontain: js.UndefOr[String] = js.native
  var endswith: js.UndefOr[String] = js.native
  @JSName("eq")
  var eq_FFilterOperatorsString: js.UndefOr[String] = js.native
  var isempty: js.UndefOr[String] = js.native
  var isnotempty: js.UndefOr[String] = js.native
  var isnotnull: js.UndefOr[String] = js.native
  var isnotnullorempty: js.UndefOr[String] = js.native
  var isnull: js.UndefOr[String] = js.native
  var isnullorempty: js.UndefOr[String] = js.native
  var neq: js.UndefOr[String] = js.native
  var startswith: js.UndefOr[String] = js.native
}

object FilterOperatorsString {
  @scala.inline
  def apply(): FilterOperatorsString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOperatorsString]
  }
  @scala.inline
  implicit class FilterOperatorsStringOps[Self <: FilterOperatorsString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContains(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.undefined)
        ret
    }
    @scala.inline
    def withDoesnotcontain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doesnotcontain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoesnotcontain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doesnotcontain")(js.undefined)
        ret
    }
    @scala.inline
    def withEndswith(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endswith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndswith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endswith")(js.undefined)
        ret
    }
    @scala.inline
    def withEq(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eq")(js.undefined)
        ret
    }
    @scala.inline
    def withIsempty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isempty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsempty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isempty")(js.undefined)
        ret
    }
    @scala.inline
    def withIsnotempty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isnotempty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsnotempty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isnotempty")(js.undefined)
        ret
    }
    @scala.inline
    def withIsnotnull(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isnotnull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsnotnull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isnotnull")(js.undefined)
        ret
    }
    @scala.inline
    def withIsnotnullorempty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isnotnullorempty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsnotnullorempty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isnotnullorempty")(js.undefined)
        ret
    }
    @scala.inline
    def withIsnull(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isnull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsnull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isnull")(js.undefined)
        ret
    }
    @scala.inline
    def withIsnullorempty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isnullorempty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsnullorempty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isnullorempty")(js.undefined)
        ret
    }
    @scala.inline
    def withNeq(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neq")(js.undefined)
        ret
    }
    @scala.inline
    def withStartswith(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startswith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartswith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startswith")(js.undefined)
        ret
    }
  }
  
}

