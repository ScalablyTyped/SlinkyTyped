package typingsSlinky.jointjs.mod.shapes.devs

import typingsSlinky.jointjs.mod.dia.Element.GenericAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelAttributes extends GenericAttributes[ModelSelectors] {
  var inPorts: js.UndefOr[js.Array[String]] = js.native
  var outPorts: js.UndefOr[js.Array[String]] = js.native
}

object ModelAttributes {
  @scala.inline
  def apply(): ModelAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelAttributes]
  }
  @scala.inline
  implicit class ModelAttributesOps[Self <: ModelAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInPorts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inPorts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inPorts")(js.undefined)
        ret
    }
    @scala.inline
    def withOutPorts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outPorts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outPorts")(js.undefined)
        ret
    }
  }
  
}

