package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchRemoveFacetFromObject extends js.Object {
  /**
    * A reference to the object whose facet will be removed.
    */
  var ObjectReference: typingsSlinky.awsSdk.clouddirectoryMod.ObjectReference = js.native
  /**
    * The facet to remove from the object.
    */
  var SchemaFacet: typingsSlinky.awsSdk.clouddirectoryMod.SchemaFacet = js.native
}

object BatchRemoveFacetFromObject {
  @scala.inline
  def apply(ObjectReference: ObjectReference, SchemaFacet: SchemaFacet): BatchRemoveFacetFromObject = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference.asInstanceOf[js.Any], SchemaFacet = SchemaFacet.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchRemoveFacetFromObject]
  }
  @scala.inline
  implicit class BatchRemoveFacetFromObjectOps[Self <: BatchRemoveFacetFromObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

