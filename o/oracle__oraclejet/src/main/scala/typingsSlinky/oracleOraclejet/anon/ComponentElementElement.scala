package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentElementElement extends js.Object {
  var componentElement: org.scalajs.dom.raw.Element = js.native
}

object ComponentElementElement {
  @scala.inline
  def apply(componentElement: org.scalajs.dom.raw.Element): ComponentElementElement = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElementElement]
  }
  @scala.inline
  implicit class ComponentElementElementOps[Self <: ComponentElementElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentElement(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentElement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

