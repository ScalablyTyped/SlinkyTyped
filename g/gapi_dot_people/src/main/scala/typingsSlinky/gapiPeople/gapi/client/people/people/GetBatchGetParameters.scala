package typingsSlinky.gapiPeople.gapi.client.people.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBatchGetParameters extends js.Object {
  var personFields: String = js.native
  // Query parameters
  var resourcesName: js.UndefOr[String] = js.native
}

object GetBatchGetParameters {
  @scala.inline
  def apply(personFields: String): GetBatchGetParameters = {
    val __obj = js.Dynamic.literal(personFields = personFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBatchGetParameters]
  }
  @scala.inline
  implicit class GetBatchGetParametersOps[Self <: GetBatchGetParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPersonFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourcesName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcesName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourcesName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcesName")(js.undefined)
        ret
    }
  }
  
}

