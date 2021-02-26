package typingsSlinky.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypedLinkFacet extends StObject {
  
  /**
    * A set of key-value pairs associated with the typed link. Typed link attributes are used when you have data values that are related to the link itself, and not to one of the two objects being linked. Identity attributes also serve to distinguish the link from others of the same type between the same objects.
    */
  var Attributes: TypedLinkAttributeDefinitionList = js.native
  
  /**
    * The set of attributes that distinguish links made from this facet from each other, in the order of significance. Listing typed links can filter on the values of these attributes. See ListOutgoingTypedLinks and ListIncomingTypedLinks for details.
    */
  var IdentityAttributeOrder: AttributeNameList = js.native
  
  /**
    * The unique name of the typed link facet.
    */
  var Name: TypedLinkName = js.native
}
object TypedLinkFacet {
  
  @scala.inline
  def apply(
    Attributes: TypedLinkAttributeDefinitionList,
    IdentityAttributeOrder: AttributeNameList,
    Name: TypedLinkName
  ): TypedLinkFacet = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], IdentityAttributeOrder = IdentityAttributeOrder.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLinkFacet]
  }
  
  @scala.inline
  implicit class TypedLinkFacetMutableBuilder[Self <: TypedLinkFacet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: TypedLinkAttributeDefinitionList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesVarargs(value: TypedLinkAttributeDefinition*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
    
    @scala.inline
    def setIdentityAttributeOrder(value: AttributeNameList): Self = StObject.set(x, "IdentityAttributeOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityAttributeOrderVarargs(value: AttributeName*): Self = StObject.set(x, "IdentityAttributeOrder", js.Array(value :_*))
    
    @scala.inline
    def setName(value: TypedLinkName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
