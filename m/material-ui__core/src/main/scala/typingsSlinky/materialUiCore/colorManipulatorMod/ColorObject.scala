package typingsSlinky.materialUiCore.colorManipulatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorObject extends js.Object {
  var `type`: ColorFormat = js.native
  var values: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double]) = js.native
}

object ColorObject {
  @scala.inline
  def apply(
    `type`: ColorFormat,
    values: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
  ): ColorObject = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorObject]
  }
  @scala.inline
  implicit class ColorObjectOps[Self <: ColorObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: ColorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

