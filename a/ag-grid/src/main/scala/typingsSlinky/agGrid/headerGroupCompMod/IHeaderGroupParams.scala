package typingsSlinky.agGrid.headerGroupCompMod

import typingsSlinky.agGrid.columnApiMod.ColumnApi
import typingsSlinky.agGrid.columnGroupMod.ColumnGroup
import typingsSlinky.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHeaderGroupParams extends js.Object {
  var api: GridApi = js.native
  var columnApi: ColumnApi = js.native
  var columnGroup: ColumnGroup = js.native
  var context: js.Any = js.native
  var displayName: String = js.native
  def setExpanded(expanded: Boolean): Unit = js.native
}

object IHeaderGroupParams {
  @scala.inline
  def apply(
    api: GridApi,
    columnApi: ColumnApi,
    columnGroup: ColumnGroup,
    context: js.Any,
    displayName: String,
    setExpanded: Boolean => Unit
  ): IHeaderGroupParams = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], columnGroup = columnGroup.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], setExpanded = js.Any.fromFunction1(setExpanded))
    __obj.asInstanceOf[IHeaderGroupParams]
  }
  @scala.inline
  implicit class IHeaderGroupParamsOps[Self <: IHeaderGroupParams] (val x: Self) extends AnyVal {
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
    def withColumnApi(value: ColumnApi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnGroup(value: ColumnGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetExpanded(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExpanded")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

