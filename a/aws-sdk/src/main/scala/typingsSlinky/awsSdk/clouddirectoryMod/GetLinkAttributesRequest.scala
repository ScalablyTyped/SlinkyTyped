package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLinkAttributesRequest extends js.Object {
  /**
    * A list of attribute names whose values will be retrieved.
    */
  var AttributeNames: AttributeNameList = js.native
  /**
    * The consistency level at which to retrieve the attributes on a typed link.
    */
  var ConsistencyLevel: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.ConsistencyLevel] = js.native
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where the typed link resides. For more information, see arns or Typed Links.
    */
  var DirectoryArn: Arn = js.native
  /**
    * Allows a typed link specifier to be accepted as input.
    */
  var TypedLinkSpecifier: typingsSlinky.awsSdk.clouddirectoryMod.TypedLinkSpecifier = js.native
}

object GetLinkAttributesRequest {
  @scala.inline
  def apply(AttributeNames: AttributeNameList, DirectoryArn: Arn, TypedLinkSpecifier: TypedLinkSpecifier): GetLinkAttributesRequest = {
    val __obj = js.Dynamic.literal(AttributeNames = AttributeNames.asInstanceOf[js.Any], DirectoryArn = DirectoryArn.asInstanceOf[js.Any], TypedLinkSpecifier = TypedLinkSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLinkAttributesRequest]
  }
  @scala.inline
  implicit class GetLinkAttributesRequestOps[Self <: GetLinkAttributesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeNames(value: AttributeNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectoryArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypedLinkSpecifier(value: TypedLinkSpecifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypedLinkSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsistencyLevel(value: ConsistencyLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsistencyLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsistencyLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsistencyLevel")(js.undefined)
        ret
    }
  }
  
}

