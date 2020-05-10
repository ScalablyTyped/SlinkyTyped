package typingsSlinky.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A holder for any type of filter.
  */
@js.native
trait SchemaFilter extends js.Object {
  /**
    * A composite filter.
    */
  var compositeFilter: js.UndefOr[SchemaCompositeFilter] = js.native
  /**
    * A filter on a property.
    */
  var propertyFilter: js.UndefOr[SchemaPropertyFilter] = js.native
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
    def withPropertyFilter(value: SchemaPropertyFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyFilter")(js.undefined)
        ret
    }
  }
  
}

