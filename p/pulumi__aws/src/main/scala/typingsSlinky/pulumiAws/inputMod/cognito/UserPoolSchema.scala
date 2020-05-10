package typingsSlinky.pulumiAws.inputMod.cognito

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolSchema extends js.Object {
  /**
    * The attribute data type. Must be one of `Boolean`, `Number`, `String`, `DateTime`.
    */
  var attributeDataType: Input[String] = js.native
  /**
    * Specifies whether the attribute type is developer only.
    */
  var developerOnlyAttribute: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies whether the attribute can be changed once it has been created.
    */
  var mutable: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name of the attribute.
    */
  var name: Input[String] = js.native
  /**
    * Specifies the constraints for an attribute of the number type.
    */
  var numberAttributeConstraints: js.UndefOr[Input[UserPoolSchemaNumberAttributeConstraints]] = js.native
  /**
    * Specifies whether a user pool attribute is required. If the attribute is required and the user does not provide a value, registration or sign-in will fail.
    */
  var required: js.UndefOr[Input[Boolean]] = js.native
  /**
    * -Specifies the constraints for an attribute of the string type.
    */
  var stringAttributeConstraints: js.UndefOr[Input[UserPoolSchemaStringAttributeConstraints]] = js.native
}

object UserPoolSchema {
  @scala.inline
  def apply(attributeDataType: Input[String], name: Input[String]): UserPoolSchema = {
    val __obj = js.Dynamic.literal(attributeDataType = attributeDataType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolSchema]
  }
  @scala.inline
  implicit class UserPoolSchemaOps[Self <: UserPoolSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeDataType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeDataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeveloperOnlyAttribute(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerOnlyAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperOnlyAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerOnlyAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withMutable(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutable")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberAttributeConstraints(value: Input[UserPoolSchemaNumberAttributeConstraints]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberAttributeConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberAttributeConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberAttributeConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withStringAttributeConstraints(value: Input[UserPoolSchemaStringAttributeConstraints]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringAttributeConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringAttributeConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringAttributeConstraints")(js.undefined)
        ret
    }
  }
  
}

