package typingsSlinky.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowJoin extends js.Object {
  var allowJoin: Boolean = js.native
  // True to allow guests to join this room. This implicitly gives guests write access. If false or not given, guests are explicitly forbidden from joining the room.
  var allowRead: Boolean = js.native
}

object AnonAllowJoin {
  @scala.inline
  def apply(allowJoin: Boolean, allowRead: Boolean): AnonAllowJoin = {
    val __obj = js.Dynamic.literal(allowJoin = allowJoin.asInstanceOf[js.Any], allowRead = allowRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowJoin]
  }
  @scala.inline
  implicit class AnonAllowJoinOps[Self <: AnonAllowJoin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowJoin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRead")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

