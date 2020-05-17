package typingsSlinky.firebaseFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nanos extends js.Object {
  var nanos: Double = js.native
  var seconds: String = js.native
}

object Nanos {
  @scala.inline
  def apply(nanos: Double, seconds: String): Nanos = {
    val __obj = js.Dynamic.literal(nanos = nanos.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nanos]
  }
  @scala.inline
  implicit class NanosOps[Self <: Nanos] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNanos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nanos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeconds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

