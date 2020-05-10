package typingsSlinky.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceGroupItem extends js.Object {
  var aggregates: js.UndefOr[js.Array[DataSourceGroupItemAggregate]] = js.native
  var compare: js.UndefOr[
    js.Function2[/* a */ DataSourceGroupCompareItem, /* b */ DataSourceGroupCompareItem, Double]
  ] = js.native
  var dir: js.UndefOr[String] = js.native
  var field: js.UndefOr[String] = js.native
}

object DataSourceGroupItem {
  @scala.inline
  def apply(): DataSourceGroupItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceGroupItem]
  }
  @scala.inline
  implicit class DataSourceGroupItemOps[Self <: DataSourceGroupItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregates(value: js.Array[DataSourceGroupItemAggregate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregates")(js.undefined)
        ret
    }
    @scala.inline
    def withCompare(value: (/* a */ DataSourceGroupCompareItem, /* b */ DataSourceGroupCompareItem) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCompare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
  }
  
}

