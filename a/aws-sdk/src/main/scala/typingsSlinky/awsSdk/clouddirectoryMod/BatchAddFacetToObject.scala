package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAddFacetToObject extends js.Object {
  /**
    * The attributes to set on the object.
    */
  var ObjectAttributeList: AttributeKeyAndValueList = js.native
  /**
    * A reference to the object being mutated.
    */
  var ObjectReference: typingsSlinky.awsSdk.clouddirectoryMod.ObjectReference = js.native
  /**
    * Represents the facet being added to the object.
    */
  var SchemaFacet: typingsSlinky.awsSdk.clouddirectoryMod.SchemaFacet = js.native
}

object BatchAddFacetToObject {
  @scala.inline
  def apply(
    ObjectAttributeList: AttributeKeyAndValueList,
    ObjectReference: ObjectReference,
    SchemaFacet: SchemaFacet
  ): BatchAddFacetToObject = {
    val __obj = js.Dynamic.literal(ObjectAttributeList = ObjectAttributeList.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any], SchemaFacet = SchemaFacet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchAddFacetToObject]
  }
}

