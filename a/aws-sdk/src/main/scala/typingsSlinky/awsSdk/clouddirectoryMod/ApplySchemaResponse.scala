package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplySchemaResponse extends js.Object {
  /**
    * The applied schema ARN that is associated with the copied schema in the Directory. You can use this ARN to describe the schema information applied on this directory. For more information, see arns.
    */
  var AppliedSchemaArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN that is associated with the Directory. For more information, see arns.
    */
  var DirectoryArn: js.UndefOr[Arn] = js.native
}

object ApplySchemaResponse {
  @scala.inline
  def apply(): ApplySchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplySchemaResponse]
  }
  @scala.inline
  implicit class ApplySchemaResponseOps[Self <: ApplySchemaResponse] (val x: Self) extends AnyVal {
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
    def withoutAppliedSchemaArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppliedSchemaArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectoryArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryArn")(js.undefined)
        ret
    }
  }
  
}

