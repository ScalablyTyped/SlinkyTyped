package typingsSlinky.agGrid.gridApiMod

import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedrawRowsParams extends js.Object {
  var rowNodes: js.UndefOr[js.Array[RowNode]] = js.native
}

object RedrawRowsParams {
  @scala.inline
  def apply(): RedrawRowsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedrawRowsParams]
  }
  @scala.inline
  implicit class RedrawRowsParamsOps[Self <: RedrawRowsParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRowNodes(value: js.Array[RowNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNodes")(js.undefined)
        ret
    }
  }
  
}

