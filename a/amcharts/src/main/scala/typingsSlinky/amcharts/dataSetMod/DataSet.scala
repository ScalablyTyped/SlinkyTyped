package typingsSlinky.amcharts.dataSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSet extends js.Object {
  /**
    * Category field name in your dataProvider.
    */
  var categoryField: String = js.native
  /**
    * Color of the data set. One of colors from AmStockChart.colors array will be used if not set.
    */
  var color: String = js.native
  /**
    * Whether this data set is selected for comparing.
    * If you change this property, you should call stockChart.validateData() method
    * in order the changes to be applied.
    */
  var compared: Boolean = js.native
  /**
    * Data provider of the data set.
    */
  var dataProvider: js.Array[_] = js.native
  /**
    * Array of field mappings. Field mapping is an object with fromField and toField properties.
    * fromField is a name of your value field in dataProvider.
    * toField might be chosen freely, it will be used to set value/open/close/high/low fields for the StockGraph.
    * Example: {fromField:"val1", toField:"value"}.
    */
  var fieldMappings: js.Array[_] = js.native
  /**
    * Specifies whether this data set should be visible in "compare to" list.
    * @default true
    */
  var showInCompare: Boolean = js.native
  /**
    * Specifies whether this data set should be visible in "select" dropdown.
    * @default true
    */
  var showInSelect: Boolean = js.native
  /**
    * Array of StockEvent objects.
    */
  var stockEvents: js.Array[typingsSlinky.amcharts.stockEventMod.default] = js.native
  /**
    * DataSet title.
    */
  var title: String = js.native
}

object DataSet {
  @scala.inline
  def apply(
    categoryField: String,
    color: String,
    compared: Boolean,
    dataProvider: js.Array[_],
    fieldMappings: js.Array[_],
    showInCompare: Boolean,
    showInSelect: Boolean,
    stockEvents: js.Array[typingsSlinky.amcharts.stockEventMod.default],
    title: String
  ): DataSet = {
    val __obj = js.Dynamic.literal(categoryField = categoryField.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], compared = compared.asInstanceOf[js.Any], dataProvider = dataProvider.asInstanceOf[js.Any], fieldMappings = fieldMappings.asInstanceOf[js.Any], showInCompare = showInCompare.asInstanceOf[js.Any], showInSelect = showInSelect.asInstanceOf[js.Any], stockEvents = stockEvents.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSet]
  }
  @scala.inline
  implicit class DataSetOps[Self <: DataSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoryField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataProvider(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldMappings(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowInCompare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInCompare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowInSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStockEvents(value: js.Array[typingsSlinky.amcharts.stockEventMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stockEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

