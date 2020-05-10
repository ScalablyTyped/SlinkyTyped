package typingsSlinky.gapiPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneNumber extends js.Object {
  var canonicalForm: String = js.native
  var formattedType: String = js.native
  var metadata: FieldMetadata = js.native
  var `type`: String = js.native
  var value: String = js.native
}

object PhoneNumber {
  @scala.inline
  def apply(
    canonicalForm: String,
    formattedType: String,
    metadata: FieldMetadata,
    `type`: String,
    value: String
  ): PhoneNumber = {
    val __obj = js.Dynamic.literal(canonicalForm = canonicalForm.asInstanceOf[js.Any], formattedType = formattedType.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumber]
  }
  @scala.inline
  implicit class PhoneNumberOps[Self <: PhoneNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanonicalForm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonicalForm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormattedType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: FieldMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

