package typingsSlinky.projectOxford

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPersonId extends js.Object {
  var personId: String = js.native
}

object AnonPersonId {
  @scala.inline
  def apply(personId: String): AnonPersonId = {
    val __obj = js.Dynamic.literal(personId = personId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPersonId]
  }
  @scala.inline
  implicit class AnonPersonIdOps[Self <: AnonPersonId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPersonId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

