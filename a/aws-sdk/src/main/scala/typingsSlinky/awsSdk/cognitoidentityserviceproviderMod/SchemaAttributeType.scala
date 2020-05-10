package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAttributeType extends js.Object {
  /**
    * The attribute data type.
    */
  var AttributeDataType: js.UndefOr[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.AttributeDataType] = js.native
  /**
    *  We recommend that you use WriteAttributes in the user pool client to control how attributes can be mutated for new use cases instead of using DeveloperOnlyAttribute.  Specifies whether the attribute type is developer only. This attribute can only be modified by an administrator. Users will not be able to modify this attribute using their access token. For example, DeveloperOnlyAttribute can be modified using the API but cannot be updated using the API.
    */
  var DeveloperOnlyAttribute: js.UndefOr[BooleanType] = js.native
  /**
    * Specifies whether the value of the attribute can be changed. For any user pool attribute that's mapped to an identity provider attribute, you must set this parameter to true. Amazon Cognito updates mapped attributes when users sign in to your application through an identity provider. If an attribute is immutable, Amazon Cognito throws an error when it attempts to update the attribute. For more information, see Specifying Identity Provider Attribute Mappings for Your User Pool.
    */
  var Mutable: js.UndefOr[BooleanType] = js.native
  /**
    * A schema attribute of the name type.
    */
  var Name: js.UndefOr[CustomAttributeNameType] = js.native
  /**
    * Specifies the constraints for an attribute of the number type.
    */
  var NumberAttributeConstraints: js.UndefOr[NumberAttributeConstraintsType] = js.native
  /**
    * Specifies whether a user pool attribute is required. If the attribute is required and the user does not provide a value, registration or sign-in will fail.
    */
  var Required: js.UndefOr[BooleanType] = js.native
  /**
    * Specifies the constraints for an attribute of the string type.
    */
  var StringAttributeConstraints: js.UndefOr[StringAttributeConstraintsType] = js.native
}

object SchemaAttributeType {
  @scala.inline
  def apply(): SchemaAttributeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttributeType]
  }
  @scala.inline
  implicit class SchemaAttributeTypeOps[Self <: SchemaAttributeType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeDataType(value: AttributeDataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeDataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeDataType")(js.undefined)
        ret
    }
    @scala.inline
    def withDeveloperOnlyAttribute(value: BooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeveloperOnlyAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperOnlyAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeveloperOnlyAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withMutable(value: BooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mutable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mutable")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: CustomAttributeNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberAttributeConstraints(value: NumberAttributeConstraintsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberAttributeConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberAttributeConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberAttributeConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: BooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Required")(js.undefined)
        ret
    }
    @scala.inline
    def withStringAttributeConstraints(value: StringAttributeConstraintsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringAttributeConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringAttributeConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringAttributeConstraints")(js.undefined)
        ret
    }
  }
  
}

