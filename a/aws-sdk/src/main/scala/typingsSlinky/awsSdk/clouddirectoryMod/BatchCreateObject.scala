package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchCreateObject extends js.Object {
  /**
    * The batch reference name. See Transaction Support for more information.
    */
  var BatchReferenceName: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.BatchReferenceName] = js.native
  /**
    * The name of the link.
    */
  var LinkName: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.LinkName] = js.native
  /**
    * An attribute map, which contains an attribute ARN as the key and attribute value as the map value.
    */
  var ObjectAttributeList: AttributeKeyAndValueList = js.native
  /**
    * If specified, the parent reference to which this object will be attached.
    */
  var ParentReference: js.UndefOr[ObjectReference] = js.native
  /**
    * A list of FacetArns that will be associated with the object. For more information, see arns.
    */
  var SchemaFacet: SchemaFacetList = js.native
}

object BatchCreateObject {
  @scala.inline
  def apply(ObjectAttributeList: AttributeKeyAndValueList, SchemaFacet: SchemaFacetList): BatchCreateObject = {
    val __obj = js.Dynamic.literal(ObjectAttributeList = ObjectAttributeList.asInstanceOf[js.Any], SchemaFacet = SchemaFacet.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateObject]
  }
  @scala.inline
  implicit class BatchCreateObjectOps[Self <: BatchCreateObject] (val x: Self) extends AnyVal {
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
    def withSchemaFacet(value: SchemaFacetList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaFacet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchReferenceName(value: BatchReferenceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchReferenceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchReferenceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchReferenceName")(js.undefined)
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

