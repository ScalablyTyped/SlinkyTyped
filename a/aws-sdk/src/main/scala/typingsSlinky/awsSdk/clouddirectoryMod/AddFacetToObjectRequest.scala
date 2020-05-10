package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddFacetToObjectRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where the object resides. For more information, see arns.
    */
  var DirectoryArn: Arn = js.native
  /**
    * Attributes on the facet that you are adding to the object.
    */
  var ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList] = js.native
  /**
    * A reference to the object you are adding the specified facet to.
    */
  var ObjectReference: typingsSlinky.awsSdk.clouddirectoryMod.ObjectReference = js.native
  /**
    * Identifiers for the facet that you are adding to the object. See SchemaFacet for details.
    */
  var SchemaFacet: typingsSlinky.awsSdk.clouddirectoryMod.SchemaFacet = js.native
}

object AddFacetToObjectRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, ObjectReference: ObjectReference, SchemaFacet: SchemaFacet): AddFacetToObjectRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any], SchemaFacet = SchemaFacet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddFacetToObjectRequest]
  }
  @scala.inline
  implicit class AddFacetToObjectRequestOps[Self <: AddFacetToObjectRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withObjectAttributeList(value: AttributeKeyAndValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectAttributeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectAttributeList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectAttributeList")(js.undefined)
        ret
    }
  }
  
}

