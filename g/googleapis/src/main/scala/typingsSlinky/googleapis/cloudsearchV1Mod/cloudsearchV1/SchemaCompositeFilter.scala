package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCompositeFilter extends js.Object {
  /**
    * The logic operator of the sub filter.
    */
  var logicOperator: js.UndefOr[String] = js.native
  /**
    * Sub filters.
    */
  var subFilters: js.UndefOr[js.Array[SchemaFilter]] = js.native
}

object SchemaCompositeFilter {
  @scala.inline
  def apply(): SchemaCompositeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompositeFilter]
  }
  @scala.inline
  implicit class SchemaCompositeFilterOps[Self <: SchemaCompositeFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogicOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logicOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogicOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logicOperator")(js.undefined)
        ret
    }
    @scala.inline
    def withSubFilters(value: js.Array[SchemaFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subFilters")(js.undefined)
        ret
    }
  }
  
}

