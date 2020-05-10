package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A value range that was matched by one or more data filers.
  */
@js.native
trait SchemaMatchedValueRange extends js.Object {
  /**
    * The DataFilters from the request that matched the range of values.
    */
  var dataFilters: js.UndefOr[js.Array[SchemaDataFilter]] = js.native
  /**
    * The values matched by the DataFilter.
    */
  var valueRange: js.UndefOr[SchemaValueRange] = js.native
}

object SchemaMatchedValueRange {
  @scala.inline
  def apply(): SchemaMatchedValueRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMatchedValueRange]
  }
  @scala.inline
  implicit class SchemaMatchedValueRangeOps[Self <: SchemaMatchedValueRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataFilters(value: js.Array[SchemaDataFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withValueRange(value: SchemaValueRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRange")(js.undefined)
        ret
    }
  }
  
}

