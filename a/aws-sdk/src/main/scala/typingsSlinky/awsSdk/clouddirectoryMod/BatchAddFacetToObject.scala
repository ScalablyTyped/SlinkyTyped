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
  @scala.inline
  implicit class BatchAddFacetToObjectOps[Self <: BatchAddFacetToObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectAttributeList(value: AttributeKeyAndValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectAttributeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectReference(value: ObjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemaFacet(value: SchemaFacet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaFacet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

