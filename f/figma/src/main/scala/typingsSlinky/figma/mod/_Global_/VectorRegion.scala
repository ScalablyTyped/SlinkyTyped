package typingsSlinky.figma.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorRegion extends js.Object {
  val loops: js.Array[js.Array[Double]] = js.native
  val windingRule: WindingRule = js.native
}

object VectorRegion {
  @scala.inline
  def apply(loops: js.Array[js.Array[Double]], windingRule: WindingRule): VectorRegion = {
    val __obj = js.Dynamic.literal(loops = loops.asInstanceOf[js.Any], windingRule = windingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorRegion]
  }
  @scala.inline
  implicit class VectorRegionOps[Self <: VectorRegion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoops(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindingRule(value: WindingRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windingRule")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

