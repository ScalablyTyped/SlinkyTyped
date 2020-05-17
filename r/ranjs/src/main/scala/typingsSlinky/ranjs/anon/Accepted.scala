package typingsSlinky.ranjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accepted extends js.Object {
  var accepted: Boolean = js.native
  var x: js.Array[Double] = js.native
}

object Accepted {
  @scala.inline
  def apply(accepted: Boolean, x: js.Array[Double]): Accepted = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accepted]
  }
  @scala.inline
  implicit class AcceptedOps[Self <: Accepted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccepted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

