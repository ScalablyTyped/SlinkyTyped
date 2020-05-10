package typingsSlinky.firebaseMessaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonValueName extends js.Object {
  var valueName: String = js.native
}

object AnonValueName {
  @scala.inline
  def apply(valueName: String): AnonValueName = {
    val __obj = js.Dynamic.literal(valueName = valueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValueName]
  }
  @scala.inline
  implicit class AnonValueNameOps[Self <: AnonValueName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValueName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

