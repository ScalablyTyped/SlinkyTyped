package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDirectoryResponse extends js.Object {
  /**
    * The ARN of the published schema in the Directory. Once a published schema is copied into the directory, it has its own ARN, which is referred to applied schema ARN. For more information, see arns.
    */
  var AppliedSchemaArn: Arn = js.native
  /**
    * The ARN that is associated with the Directory. For more information, see arns.
    */
  var DirectoryArn: typingsSlinky.awsSdk.clouddirectoryMod.DirectoryArn = js.native
  /**
    * The name of the Directory.
    */
  var Name: DirectoryName = js.native
  /**
    * The root object node of the created directory.
    */
  var ObjectIdentifier: typingsSlinky.awsSdk.clouddirectoryMod.ObjectIdentifier = js.native
}

object CreateDirectoryResponse {
  @scala.inline
  def apply(
    AppliedSchemaArn: Arn,
    DirectoryArn: DirectoryArn,
    Name: DirectoryName,
    ObjectIdentifier: ObjectIdentifier
  ): CreateDirectoryResponse = {
    val __obj = js.Dynamic.literal(AppliedSchemaArn = AppliedSchemaArn.asInstanceOf[js.Any], DirectoryArn = DirectoryArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ObjectIdentifier = ObjectIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectoryResponse]
  }
  @scala.inline
  implicit class CreateDirectoryResponseOps[Self <: CreateDirectoryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppliedSchemaArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppliedSchemaArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectoryArn(value: DirectoryArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: DirectoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectIdentifier(value: ObjectIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

