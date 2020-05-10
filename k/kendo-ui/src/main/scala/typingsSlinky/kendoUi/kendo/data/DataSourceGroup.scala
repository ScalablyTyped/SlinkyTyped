package typingsSlinky.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceGroup extends DataSourceItemOrGroup {
  var aggregates: js.Array[_] = js.native
  var field: String = js.native
  var hasSubgroups: Boolean = js.native
  var items: js.Array[DataSourceItemOrGroup] = js.native
  var value: js.Any = js.native
}

object DataSourceGroup {
  @scala.inline
  def apply(
    aggregates: js.Array[_],
    field: String,
    hasSubgroups: Boolean,
    items: js.Array[DataSourceItemOrGroup],
    value: js.Any
  ): DataSourceGroup = {
    val __obj = js.Dynamic.literal(aggregates = aggregates.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hasSubgroups = hasSubgroups.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceGroup]
  }
  @scala.inline
  implicit class DataSourceGroupOps[Self <: DataSourceGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregates(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasSubgroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSubgroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[DataSourceItemOrGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

