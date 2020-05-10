package typingsSlinky.gapiPeople.gapi.client.people.people

import typingsSlinky.gapiPeople.gapi.client.people.Person
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersonResponse extends js.Object {
  var httpStatusCode: Double = js.native
  var person: Person = js.native
  var requestedResourceName: String = js.native
}

object PersonResponse {
  @scala.inline
  def apply(httpStatusCode: Double, person: Person, requestedResourceName: String): PersonResponse = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any], person = person.asInstanceOf[js.Any], requestedResourceName = requestedResourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonResponse]
  }
  @scala.inline
  implicit class PersonResponseOps[Self <: PersonResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpStatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerson(value: Person): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("person")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestedResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedResourceName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

