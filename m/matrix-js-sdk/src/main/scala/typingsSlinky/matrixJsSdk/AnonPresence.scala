package typingsSlinky.matrixJsSdk

import typingsSlinky.matrixJsSdk.mod.MatrixEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPresence extends js.Object {
  var presence: MatrixEvent = js.native
}

object AnonPresence {
  @scala.inline
  def apply(presence: MatrixEvent): AnonPresence = {
    val __obj = js.Dynamic.literal(presence = presence.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPresence]
  }
  @scala.inline
  implicit class AnonPresenceOps[Self <: AnonPresence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPresence(value: MatrixEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presence")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

