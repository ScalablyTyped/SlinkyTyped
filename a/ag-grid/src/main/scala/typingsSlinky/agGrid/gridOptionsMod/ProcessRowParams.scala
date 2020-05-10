package typingsSlinky.agGrid.gridOptionsMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.columnApiMod.ColumnApi
import typingsSlinky.agGrid.gridApiMod.GridApi
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessRowParams extends js.Object {
  var api: GridApi = js.native
  var columnApi: ColumnApi = js.native
  var context: js.Any = js.native
  var ePinnedLeftRow: HTMLElement = js.native
  var ePinnedRightRow: HTMLElement = js.native
  var eRow: HTMLElement = js.native
  var node: RowNode = js.native
  var rowIndex: Double = js.native
  def addRenderedRowListener(eventType: String, listener: js.Function): Unit = js.native
}

object ProcessRowParams {
  @scala.inline
  def apply(
    addRenderedRowListener: (String, js.Function) => Unit,
    api: GridApi,
    columnApi: ColumnApi,
    context: js.Any,
    ePinnedLeftRow: HTMLElement,
    ePinnedRightRow: HTMLElement,
    eRow: HTMLElement,
    node: RowNode,
    rowIndex: Double
  ): ProcessRowParams = {
    val __obj = js.Dynamic.literal(addRenderedRowListener = js.Any.fromFunction2(addRenderedRowListener), api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], ePinnedLeftRow = ePinnedLeftRow.asInstanceOf[js.Any], ePinnedRightRow = ePinnedRightRow.asInstanceOf[js.Any], eRow = eRow.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessRowParams]
  }
  @scala.inline
  implicit class ProcessRowParamsOps[Self <: ProcessRowParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddRenderedRowListener(value: (String, js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRenderedRowListener")(js.Any.fromFunction2(value))
        ret
    }
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
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEPinnedLeftRow(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ePinnedLeftRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEPinnedRightRow(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ePinnedRightRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withERow(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: RowNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

