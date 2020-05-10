package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableDirectoryRequest extends js.Object {
  /**
    * The ARN of the directory to enable.
    */
  var DirectoryArn: Arn = js.native
}

object EnableDirectoryRequest {
  @scala.inline
  def apply(DirectoryArn: Arn): EnableDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableDirectoryRequest]
  }
  @scala.inline
  implicit class EnableDirectoryRequestOps[Self <: EnableDirectoryRequest] (val x: Self) extends AnyVal {
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
  }
  
}

