package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGetPeopleResponse extends js.Object {
  /**
    * The response for each requested resource name.
    */
  var responses: js.UndefOr[js.Array[SchemaPersonResponse]] = js.native
}

object SchemaGetPeopleResponse {
  @scala.inline
  def apply(): SchemaGetPeopleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetPeopleResponse]
  }
  @scala.inline
  implicit class SchemaGetPeopleResponseOps[Self <: SchemaGetPeopleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponses(value: js.Array[SchemaPersonResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responses")(js.undefined)
        ret
    }
  }
  
}

