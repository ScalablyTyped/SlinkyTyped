package typingsSlinky.projectOxford.mod.PersonGroupResponses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersonGroup extends js.Object {
  var name: String = js.native
  var personGroupId: String = js.native
  var userData: String = js.native
}

object PersonGroup {
  @scala.inline
  def apply(name: String, personGroupId: String, userData: String): PersonGroup = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], personGroupId = personGroupId.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonGroup]
  }
  @scala.inline
  implicit class PersonGroupOps[Self <: PersonGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

