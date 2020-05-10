package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemFailureDetails extends js.Object {
  /**
    * A message describing any failures that occurred during file system creation.
    */
  var Message: js.UndefOr[ErrorMessage] = js.native
}

object FileSystemFailureDetails {
  @scala.inline
  def apply(): FileSystemFailureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemFailureDetails]
  }
  @scala.inline
  implicit class FileSystemFailureDetailsOps[Self <: FileSystemFailureDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: ErrorMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
  }
  
}

