package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Restriction on Datasource.
  */
@js.native
trait SchemaDataSourceRestriction extends js.Object {
  /**
    * Filter options restricting the results. If multiple filters are present,
    * they are grouped by object type before joining. Filters with the same
    * object type are joined conjunctively, then the resulting expressions are
    * joined disjunctively.  The maximum number of elements is 20.
    */
  var filterOptions: js.UndefOr[js.Array[SchemaFilterOptions]] = js.native
  /**
    * The source of restriction.
    */
  var source: js.UndefOr[SchemaSource] = js.native
}

object SchemaDataSourceRestriction {
  @scala.inline
  def apply(): SchemaDataSourceRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSourceRestriction]
  }
  @scala.inline
  implicit class SchemaDataSourceRestrictionOps[Self <: SchemaDataSourceRestriction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterOptions(value: js.Array[SchemaFilterOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: SchemaSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

