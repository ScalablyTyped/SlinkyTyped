package typingsSlinky.koaSessionMinimal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRegenerateId extends js.Object {
  def regenerateId(): Unit = js.native
}

object AnonRegenerateId {
  @scala.inline
  def apply(regenerateId: () => Unit): AnonRegenerateId = {
    val __obj = js.Dynamic.literal(regenerateId = js.Any.fromFunction0(regenerateId))
    __obj.asInstanceOf[AnonRegenerateId]
  }
  @scala.inline
  implicit class AnonRegenerateIdOps[Self <: AnonRegenerateId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegenerateId(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regenerateId")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

