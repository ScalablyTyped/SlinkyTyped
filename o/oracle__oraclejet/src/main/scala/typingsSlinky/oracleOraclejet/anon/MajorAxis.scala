package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MajorAxis extends js.Object {
  var majorAxis: js.Object = js.native
  var minorAxis: js.Object = js.native
}

object MajorAxis {
  @scala.inline
  def apply(majorAxis: js.Object, minorAxis: js.Object): MajorAxis = {
    val __obj = js.Dynamic.literal(majorAxis = majorAxis.asInstanceOf[js.Any], minorAxis = minorAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[MajorAxis]
  }
  @scala.inline
  implicit class MajorAxisOps[Self <: MajorAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMajorAxis(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorAxis(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorAxis")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

