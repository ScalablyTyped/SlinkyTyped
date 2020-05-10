package typingsSlinky.postmark.bounceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bounces extends js.Object {
  var Bounces: js.Array[Bounce] = js.native
  var TotalCount: Double = js.native
}

object Bounces {
  @scala.inline
  def apply(Bounces: js.Array[Bounce], TotalCount: Double): Bounces = {
    val __obj = js.Dynamic.literal(Bounces = Bounces.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounces]
  }
  @scala.inline
  implicit class BouncesOps[Self <: Bounces] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounces(value: js.Array[Bounce]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bounces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

