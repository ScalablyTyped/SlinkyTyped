package typingsSlinky.jointjs.mod.g

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubdivisionsOpt extends PrecisionOpt {
  var subdivisions: js.UndefOr[js.Array[Curve]] = js.native
}

object SubdivisionsOpt {
  @scala.inline
  def apply(): SubdivisionsOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubdivisionsOpt]
  }
  @scala.inline
  implicit class SubdivisionsOptOps[Self <: SubdivisionsOpt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubdivisions(value: js.Array[Curve]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdivisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubdivisions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdivisions")(js.undefined)
        ret
    }
  }
  
}

