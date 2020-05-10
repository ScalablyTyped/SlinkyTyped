package typingsSlinky.pulumiAws.outputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolSchemaStringAttributeConstraints extends js.Object {
  /**
    * The maximum length of an attribute value of the string type.
    */
  var maxLength: js.UndefOr[String] = js.native
  /**
    * The minimum length of an attribute value of the string type.
    */
  var minLength: js.UndefOr[String] = js.native
}

object UserPoolSchemaStringAttributeConstraints {
  @scala.inline
  def apply(): UserPoolSchemaStringAttributeConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolSchemaStringAttributeConstraints]
  }
  @scala.inline
  implicit class UserPoolSchemaStringAttributeConstraintsOps[Self <: UserPoolSchemaStringAttributeConstraints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxLength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.undefined)
        ret
    }
  }
  
}

