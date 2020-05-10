package typingsSlinky.gun

import typingsSlinky.gun.gunNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPub extends js.Object {
  var ok: `0` = js.native
  var pub: String = js.native
}

object AnonPub {
  @scala.inline
  def apply(ok: `0`, pub: String): AnonPub = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any], pub = pub.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPub]
  }
  @scala.inline
  implicit class AnonPubOps[Self <: AnonPub] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOk(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPub(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pub")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

