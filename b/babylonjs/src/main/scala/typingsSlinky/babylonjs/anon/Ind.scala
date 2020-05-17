package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ind extends js.Object {
  var ind: Double = js.native
  var sqDistance: Double = js.native
}

object Ind {
  @scala.inline
  def apply(ind: Double, sqDistance: Double): Ind = {
    val __obj = js.Dynamic.literal(ind = ind.asInstanceOf[js.Any], sqDistance = sqDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ind]
  }
  @scala.inline
  implicit class IndOps[Self <: Ind] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSqDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqDistance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

