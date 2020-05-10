package typingsSlinky.oracleOraclejet

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonComponentElementElement extends js.Object {
  var componentElement: Element = js.native
}

object AnonComponentElementElement {
  @scala.inline
  def apply(componentElement: Element): AnonComponentElementElement = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponentElementElement]
  }
  @scala.inline
  implicit class AnonComponentElementElementOps[Self <: AnonComponentElementElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentElement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

