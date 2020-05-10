package typingsSlinky.agGrid.rowNodeBlockMod

import typingsSlinky.agGrid.contextMod.Context
import typingsSlinky.agGrid.rowRendererMod.RowRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowNodeBlockBeans extends js.Object {
  var context: Context = js.native
  var rowRenderer: RowRenderer = js.native
}

object RowNodeBlockBeans {
  @scala.inline
  def apply(context: Context, rowRenderer: RowRenderer): RowNodeBlockBeans = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], rowRenderer = rowRenderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowNodeBlockBeans]
  }
  @scala.inline
  implicit class RowNodeBlockBeansOps[Self <: RowNodeBlockBeans] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: Context): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowRenderer(value: RowRenderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowRenderer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

