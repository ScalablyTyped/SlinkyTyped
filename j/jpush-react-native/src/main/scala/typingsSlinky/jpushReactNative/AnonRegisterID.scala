package typingsSlinky.jpushReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRegisterID extends js.Object {
  var registerID: String = js.native
}

object AnonRegisterID {
  @scala.inline
  def apply(registerID: String): AnonRegisterID = {
    val __obj = js.Dynamic.literal(registerID = registerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRegisterID]
  }
  @scala.inline
  implicit class AnonRegisterIDOps[Self <: AnonRegisterID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegisterID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

