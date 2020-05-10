package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachTypedLinkRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the directory where you want to detach the typed link.
    */
  var DirectoryArn: Arn = js.native
  /**
    * Used to accept a typed link specifier as input.
    */
  var TypedLinkSpecifier: typingsSlinky.awsSdk.clouddirectoryMod.TypedLinkSpecifier = js.native
}

object DetachTypedLinkRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, TypedLinkSpecifier: TypedLinkSpecifier): DetachTypedLinkRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], TypedLinkSpecifier = TypedLinkSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachTypedLinkRequest]
  }
  @scala.inline
  implicit class DetachTypedLinkRequestOps[Self <: DetachTypedLinkRequest] (val x: Self) extends AnyVal {
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
    def withTypedLinkSpecifier(value: TypedLinkSpecifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypedLinkSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

