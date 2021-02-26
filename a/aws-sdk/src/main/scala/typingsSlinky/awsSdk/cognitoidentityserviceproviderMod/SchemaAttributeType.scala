package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAttributeType extends StObject {
  
  /**
    * The attribute data type.
    */
  var AttributeDataType: js.UndefOr[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.AttributeDataType] = js.native
  
  /**
    *  We recommend that you use WriteAttributes in the user pool client to control how attributes can be mutated for new use cases instead of using DeveloperOnlyAttribute.  Specifies whether the attribute type is developer only. This attribute can only be modified by an administrator. Users will not be able to modify this attribute using their access token. For example, DeveloperOnlyAttribute can be modified using AdminUpdateUserAttributes but cannot be updated using UpdateUserAttributes.
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
  implicit class SchemaAttributeTypeMutableBuilder[Self <: SchemaAttributeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeDataType(value: AttributeDataType): Self = StObject.set(x, "AttributeDataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeDataTypeUndefined: Self = StObject.set(x, "AttributeDataType", js.undefined)
    
    @scala.inline
    def setDeveloperOnlyAttribute(value: BooleanType): Self = StObject.set(x, "DeveloperOnlyAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperOnlyAttributeUndefined: Self = StObject.set(x, "DeveloperOnlyAttribute", js.undefined)
    
    @scala.inline
    def setMutable(value: BooleanType): Self = StObject.set(x, "Mutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutableUndefined: Self = StObject.set(x, "Mutable", js.undefined)
    
    @scala.inline
    def setName(value: CustomAttributeNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setNumberAttributeConstraints(value: NumberAttributeConstraintsType): Self = StObject.set(x, "NumberAttributeConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberAttributeConstraintsUndefined: Self = StObject.set(x, "NumberAttributeConstraints", js.undefined)
    
    @scala.inline
    def setRequired(value: BooleanType): Self = StObject.set(x, "Required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "Required", js.undefined)
    
    @scala.inline
    def setStringAttributeConstraints(value: StringAttributeConstraintsType): Self = StObject.set(x, "StringAttributeConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringAttributeConstraintsUndefined: Self = StObject.set(x, "StringAttributeConstraints", js.undefined)
  }
}
