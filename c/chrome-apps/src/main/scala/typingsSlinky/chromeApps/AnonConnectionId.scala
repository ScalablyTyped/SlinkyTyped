package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConnectionId extends js.Object {
  var connectionId: integer = js.native
}

object AnonConnectionId {
  @scala.inline
  def apply(connectionId: integer): AnonConnectionId = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConnectionId]
  }
  @scala.inline
  implicit class AnonConnectionIdOps[Self <: AnonConnectionId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionId(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

