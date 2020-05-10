package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLinkAttributesRequest extends js.Object {
  /**
    * The attributes update structure.
    */
  var AttributeUpdates: LinkAttributeUpdateList = js.native
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where the updated typed link resides. For more information, see arns or Typed Links.
    */
  var DirectoryArn: Arn = js.native
  /**
    * Allows a typed link specifier to be accepted as input.
    */
  var TypedLinkSpecifier: typingsSlinky.awsSdk.clouddirectoryMod.TypedLinkSpecifier = js.native
}

object UpdateLinkAttributesRequest {
  @scala.inline
  def apply(
    AttributeUpdates: LinkAttributeUpdateList,
    DirectoryArn: Arn,
    TypedLinkSpecifier: TypedLinkSpecifier
  ): UpdateLinkAttributesRequest = {
    val __obj = js.Dynamic.literal(AttributeUpdates = AttributeUpdates.asInstanceOf[js.Any], DirectoryArn = DirectoryArn.asInstanceOf[js.Any], TypedLinkSpecifier = TypedLinkSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLinkAttributesRequest]
  }
  @scala.inline
  implicit class UpdateLinkAttributesRequestOps[Self <: UpdateLinkAttributesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeUpdates(value: LinkAttributeUpdateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeUpdates")(value.asInstanceOf[js.Any])
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
  }
  
}

