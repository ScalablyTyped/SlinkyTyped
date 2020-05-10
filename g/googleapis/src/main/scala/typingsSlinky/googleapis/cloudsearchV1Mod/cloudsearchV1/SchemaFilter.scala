package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A generic way of expressing filters in a query, which supports two
  * approaches: &lt;br/&gt;&lt;br/&gt; **1. Setting a ValueFilter.** The name
  * must match an operator_name defined in the schema for your data source.
  * &lt;br/&gt; **2. Setting a CompositeFilter.** The filters are evaluated
  * using the logical operator. The top-level operators can only be either an
  * AND or a NOT. AND can appear only at the top-most level. OR can appear only
  * under a top-level AND.
  */
@js.native
trait SchemaFilter extends js.Object {
  var compositeFilter: js.UndefOr[SchemaCompositeFilter] = js.native
  var valueFilter: js.UndefOr[SchemaValueFilter] = js.native
}

object SchemaFilter {
  @scala.inline
  def apply(): SchemaFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilter]
  }
  @scala.inline
  implicit class SchemaFilterOps[Self <: SchemaFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompositeFilter(value: SchemaCompositeFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositeFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompositeFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositeFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withValueFilter(value: SchemaValueFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFilter")(js.undefined)
        ret
    }
  }
  
}

