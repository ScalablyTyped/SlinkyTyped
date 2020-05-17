package typingsSlinky.procfsStats.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Missed extends js.Object {
  var Missed: String = js.native
}

object Missed {
  @scala.inline
  def apply(Missed: String): Missed = {
    val __obj = js.Dynamic.literal(Missed = Missed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Missed]
  }
  @scala.inline
  implicit class MissedOps[Self <: Missed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMissed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Missed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

