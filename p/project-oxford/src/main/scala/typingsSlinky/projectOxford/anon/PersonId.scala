package typingsSlinky.projectOxford.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersonId extends js.Object {
  var personId: String = js.native
}

object PersonId {
  @scala.inline
  def apply(personId: String): PersonId = {
    val __obj = js.Dynamic.literal(personId = personId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonId]
  }
  @scala.inline
  implicit class PersonIdOps[Self <: PersonId] (val x: Self) extends AnyVal {
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

