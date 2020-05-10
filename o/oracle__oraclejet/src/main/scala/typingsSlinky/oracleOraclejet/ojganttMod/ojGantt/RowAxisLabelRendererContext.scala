package typingsSlinky.oracleOraclejet.ojganttMod.ojGantt

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait RowAxisLabelRendererContext[K2, D2] extends js.Object {
  var componentElement: Element = js.native
  var itemData: js.Array[D2] = js.native
  var maxHeight: Double = js.native
  var maxWidth: Double = js.native
  var parentElement: Element = js.native
  var rowData: Row[K2] = js.native
}

object RowAxisLabelRendererContext {
  @scala.inline
  def apply[K2, D2](
    componentElement: Element,
    itemData: js.Array[D2],
    maxHeight: Double,
    maxWidth: Double,
    parentElement: Element,
    rowData: Row[K2]
  ): RowAxisLabelRendererContext[K2, D2] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowAxisLabelRendererContext[K2, D2]]
  }
  @scala.inline
  implicit class RowAxisLabelRendererContextOps[Self[k2, d2] <: RowAxisLabelRendererContext[k2, d2], K2, D2] (val x: Self[K2, D2]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K2, D2] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K2, D2]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K2, D2]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K2, D2]) with Other]
    @scala.inline
    def withComponentElement(value: Element): Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemData(value: js.Array[D2]): Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentElement(value: Element): Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowData(value: Row[K2]): Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

