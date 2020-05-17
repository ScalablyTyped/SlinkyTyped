package typingsSlinky.jointjs.mod.shapes.standard

import typingsSlinky.jointjs.mod.attributes.SVGPathAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CylinderBodyAttributes extends SVGPathAttributes {
  var lateralArea: js.UndefOr[String | Double] = js.native
}

object CylinderBodyAttributes {
  @scala.inline
  def apply(): CylinderBodyAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CylinderBodyAttributes]
  }
  @scala.inline
  implicit class CylinderBodyAttributesOps[Self <: CylinderBodyAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLateralArea(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lateralArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLateralArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lateralArea")(js.undefined)
        ret
    }
  }
  
}

