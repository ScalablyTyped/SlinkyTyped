package typingsSlinky.agGrid.gridOptionsMod

import typingsSlinky.agGrid.columnApiMod.ColumnApi
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMainMenuItemsParams extends js.Object {
  var api: GridApi = js.native
  var column: Column = js.native
  var columnApi: ColumnApi = js.native
  var context: js.Any = js.native
  var defaultItems: js.Array[String] = js.native
}

object GetMainMenuItemsParams {
  @scala.inline
  def apply(
    api: GridApi,
    column: Column,
    columnApi: ColumnApi,
    context: js.Any,
    defaultItems: js.Array[String]
  ): GetMainMenuItemsParams = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], defaultItems = defaultItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMainMenuItemsParams]
  }
  @scala.inline
  implicit class GetMainMenuItemsParamsOps[Self <: GetMainMenuItemsParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi(value: GridApi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn(value: Column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnApi(value: ColumnApi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultItems(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

