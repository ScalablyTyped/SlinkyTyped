package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFileShareInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the file share to be deleted. 
    */
  var FileShareARN: typingsSlinky.awsSdk.storagegatewayMod.FileShareARN = js.native
  /**
    * If this value is set to true, the operation deletes a file share immediately and aborts all data uploads to AWS. Otherwise, the file share is not deleted until all data is uploaded to AWS. This process aborts the data upload process, and the file share enters the FORCE_DELETING status.
    */
  var ForceDelete: js.UndefOr[scala.Boolean] = js.native
}

object DeleteFileShareInput {
  @scala.inline
  def apply(FileShareARN: FileShareARN): DeleteFileShareInput = {
    val __obj = js.Dynamic.literal(FileShareARN = FileShareARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileShareInput]
  }
  @scala.inline
  implicit class DeleteFileShareInputOps[Self <: DeleteFileShareInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileShareARN(value: FileShareARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileShareARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceDelete(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForceDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForceDelete")(js.undefined)
        ret
    }
  }
  
}

