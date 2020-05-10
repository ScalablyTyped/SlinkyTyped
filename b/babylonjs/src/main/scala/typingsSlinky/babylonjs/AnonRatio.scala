package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRatio extends js.Object {
  var ratio: Double = js.native
}

object AnonRatio {
  @scala.inline
  def apply(ratio: Double): AnonRatio = {
    val __obj = js.Dynamic.literal(ratio = ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRatio]
  }
  @scala.inline
  implicit class AnonRatioOps[Self <: AnonRatio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

