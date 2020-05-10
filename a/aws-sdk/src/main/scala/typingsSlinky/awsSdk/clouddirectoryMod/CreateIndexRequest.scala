package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIndexRequest extends js.Object {
  /**
    * The ARN of the directory where the index should be created.
    */
  var DirectoryArn: Arn = js.native
  /**
    * Indicates whether the attribute that is being indexed has unique values or not.
    */
  var IsUnique: Bool = js.native
  /**
    * The name of the link between the parent object and the index object.
    */
  var LinkName: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.LinkName] = js.native
  /**
    * Specifies the attributes that should be indexed on. Currently only a single attribute is supported.
    */
  var OrderedIndexedAttributeList: AttributeKeyList = js.native
  /**
    * A reference to the parent object that contains the index object.
    */
  var ParentReference: js.UndefOr[ObjectReference] = js.native
}

object CreateIndexRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, IsUnique: Bool, OrderedIndexedAttributeList: AttributeKeyList): CreateIndexRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], IsUnique = IsUnique.asInstanceOf[js.Any], OrderedIndexedAttributeList = OrderedIndexedAttributeList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIndexRequest]
  }
  @scala.inline
  implicit class CreateIndexRequestOps[Self <: CreateIndexRequest] (val x: Self) extends AnyVal {
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
    def withIsUnique(value: Bool): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsUnique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrderedIndexedAttributeList(value: AttributeKeyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrderedIndexedAttributeList")(value.asInstanceOf[js.Any])
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

