package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for a single person
  */
@js.native
trait SchemaPersonResponse extends js.Object {
  /**
    * **DEPRECATED** (Please use status instead)  [HTTP 1.1 status code]
    * (http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html).
    */
  var httpStatusCode: js.UndefOr[Double] = js.native
  /**
    * The person.
    */
  var person: js.UndefOr[SchemaPerson] = js.native
  /**
    * The original requested resource name. May be different than the resource
    * name on the returned person.  The resource name can change when adding or
    * removing fields that link a contact and profile such as a verified email,
    * verified phone number, or a profile URL.
    */
  var requestedResourceName: js.UndefOr[String] = js.native
  /**
    * The status of the response.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
}

object SchemaPersonResponse {
  @scala.inline
  def apply(): SchemaPersonResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPersonResponse]
  }
  @scala.inline
  implicit class SchemaPersonResponseOps[Self <: SchemaPersonResponse] (val x: Self) extends AnyVal {
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
    def withoutHttpStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpStatusCode")(js.undefined)
        ret
    }
    @scala.inline
    def withPerson(value: SchemaPerson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("person")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("person")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedResourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedResourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SchemaStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

