package typingsSlinky.gapiPeople.gapi.client.people.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetParameters extends js.Object {
  // Query parameters
  var personFields: String = js.native
  var resourceName: String = js.native
}

object GetParameters {
  @scala.inline
  def apply(personFields: String, resourceName: String): GetParameters = {
    val __obj = js.Dynamic.literal(personFields = personFields.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters]
  }
  @scala.inline
  implicit class GetParametersOps[Self <: GetParameters] (val x: Self) extends AnyVal {
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
    def withResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

