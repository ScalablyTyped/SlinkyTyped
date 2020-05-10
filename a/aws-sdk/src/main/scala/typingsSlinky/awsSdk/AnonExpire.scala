package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExpire extends js.Object {
  var Address: String = js.native
  var Expire: Double = js.native
}

object AnonExpire {
  @scala.inline
  def apply(Address: String, Expire: Double): AnonExpire = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Expire = Expire.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpire]
  }
  @scala.inline
  implicit class AnonExpireOps[Self <: AnonExpire] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpire(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expire")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

