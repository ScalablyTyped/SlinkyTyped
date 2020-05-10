package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteObjectsOutput extends js.Object {
  /**
    * Container element for a successful delete. It identifies the object that was successfully deleted.
    */
  var Deleted: js.UndefOr[DeletedObjects] = js.native
  /**
    * Container for a failed delete operation that describes the object that Amazon S3 attempted to delete and the error it encountered.
    */
  var Errors: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Errors] = js.native
  var RequestCharged: js.UndefOr[typingsSlinky.awsSdk.s3Mod.RequestCharged] = js.native
}

object DeleteObjectsOutput {
  @scala.inline
  def apply(): DeleteObjectsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteObjectsOutput]
  }
  @scala.inline
  implicit class DeleteObjectsOutputOps[Self <: DeleteObjectsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleted(value: DeletedObjects): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deleted")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: Errors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Errors")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestCharged(value: RequestCharged): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestCharged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCharged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestCharged")(js.undefined)
        ret
    }
  }
  
}

