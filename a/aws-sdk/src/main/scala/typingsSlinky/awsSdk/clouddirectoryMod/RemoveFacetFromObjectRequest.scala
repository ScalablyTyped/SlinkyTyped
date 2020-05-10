package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveFacetFromObjectRequest extends js.Object {
  /**
    * The ARN of the directory in which the object resides.
    */
  var DirectoryArn: Arn = js.native
  /**
    * A reference to the object to remove the facet from.
    */
  var ObjectReference: typingsSlinky.awsSdk.clouddirectoryMod.ObjectReference = js.native
  /**
    * The facet to remove. See SchemaFacet for details.
    */
  var SchemaFacet: typingsSlinky.awsSdk.clouddirectoryMod.SchemaFacet = js.native
}

object RemoveFacetFromObjectRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, ObjectReference: ObjectReference, SchemaFacet: SchemaFacet): RemoveFacetFromObjectRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any], SchemaFacet = SchemaFacet.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveFacetFromObjectRequest]
  }
  @scala.inline
  implicit class RemoveFacetFromObjectRequestOps[Self <: RemoveFacetFromObjectRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryArn")(value.asInstanceOf[js.Any])
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

