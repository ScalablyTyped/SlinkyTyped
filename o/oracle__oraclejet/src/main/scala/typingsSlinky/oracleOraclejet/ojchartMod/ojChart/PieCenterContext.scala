package typingsSlinky.oracleOraclejet.ojchartMod.ojChart

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait PieCenterContext extends js.Object {
  var componentElement: Element = js.native
  var innerBounds: js.Object = js.native
  var label: String = js.native
  var outerBounds: js.Object = js.native
}

object PieCenterContext {
  @scala.inline
  def apply(componentElement: Element, innerBounds: js.Object, label: String, outerBounds: js.Object): PieCenterContext = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], innerBounds = innerBounds.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], outerBounds = outerBounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieCenterContext]
  }
  @scala.inline
  implicit class PieCenterContextOps[Self <: PieCenterContext] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withInnerBounds(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuterBounds(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerBounds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

