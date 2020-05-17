package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentElement[K2] extends js.Object {
  var componentElement: org.scalajs.dom.raw.Element = js.native
  var rowData: typingsSlinky.oracleOraclejet.ojganttMod.ojGantt.Row[K2] = js.native
}

object ComponentElement {
  @scala.inline
  def apply[K2](
    componentElement: org.scalajs.dom.raw.Element,
    rowData: typingsSlinky.oracleOraclejet.ojganttMod.ojGantt.Row[K2]
  ): ComponentElement[K2] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElement[K2]]
  }
  @scala.inline
  implicit class ComponentElementOps[Self[k2] <: ComponentElement[k2], K2] (val x: Self[K2]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K2] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K2]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K2] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K2] with Other]
    @scala.inline
    def withComponentElement(value: org.scalajs.dom.raw.Element): Self[K2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowData(value: typingsSlinky.oracleOraclejet.ojganttMod.ojGantt.Row[K2]): Self[K2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

