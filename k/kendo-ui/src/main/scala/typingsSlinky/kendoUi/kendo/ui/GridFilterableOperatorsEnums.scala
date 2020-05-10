package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridFilterableOperatorsEnums extends js.Object {
  @JSName("eq")
  var eq_FGridFilterableOperatorsEnums: js.UndefOr[String] = js.native
  var isnotnull: js.UndefOr[String] = js.native
  var isnull: js.UndefOr[String] = js.native
  var neq: js.UndefOr[String] = js.native
}

object GridFilterableOperatorsEnums {
  @scala.inline
  def apply(): GridFilterableOperatorsEnums = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFilterableOperatorsEnums]
  }
  @scala.inline
  implicit class GridFilterableOperatorsEnumsOps[Self <: GridFilterableOperatorsEnums] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

