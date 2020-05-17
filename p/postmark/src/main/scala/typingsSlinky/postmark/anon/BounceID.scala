package typingsSlinky.postmark.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BounceID extends js.Object {
  var BounceID: Double = js.native
  var Summary: String = js.native
}

object BounceID {
  @scala.inline
  def apply(BounceID: Double, Summary: String): BounceID = {
    val __obj = js.Dynamic.literal(BounceID = BounceID.asInstanceOf[js.Any], Summary = Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[BounceID]
  }
  @scala.inline
  implicit class BounceIDOps[Self <: BounceID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounceID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BounceID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Summary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

