package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateObjectRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory in which the object will be created. For more information, see arns.
    */
  var DirectoryArn: Arn = js.native
  /**
    * The name of link that is used to attach this object to a parent.
    */
  var LinkName: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.LinkName] = js.native
  /**
    * The attribute map whose attribute ARN contains the key and attribute value as the map value.
    */
  var ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList] = js.native
  /**
    * If specified, the parent reference to which this object will be attached.
    */
  var ParentReference: js.UndefOr[ObjectReference] = js.native
  /**
    * A list of schema facets to be associated with the object. Do not provide minor version components. See SchemaFacet for details.
    */
  var SchemaFacets: SchemaFacetList = js.native
}

object CreateObjectRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, SchemaFacets: SchemaFacetList): CreateObjectRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], SchemaFacets = SchemaFacets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateObjectRequest]
  }
  @scala.inline
  implicit class CreateObjectRequestOps[Self <: CreateObjectRequest] (val x: Self) extends AnyVal {
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
    def withSchemaFacets(value: SchemaFacetList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaFacets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkName(value: LinkName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkName")(js.undefined)
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
    @scala.inline
    def withParentReference(value: ObjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentReference")(js.undefined)
        ret
    }
  }
  
}

