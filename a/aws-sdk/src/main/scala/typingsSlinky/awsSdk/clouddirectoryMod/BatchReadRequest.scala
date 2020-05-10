package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchReadRequest extends js.Object {
  /**
    * Represents the manner and timing in which the successful write or update of an object is reflected in a subsequent read operation of that same object.
    */
  var ConsistencyLevel: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.ConsistencyLevel] = js.native
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory. For more information, see arns.
    */
  var DirectoryArn: Arn = js.native
  /**
    * A list of operations that are part of the batch.
    */
  var Operations: BatchReadOperationList = js.native
}

object BatchReadRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, Operations: BatchReadOperationList): BatchReadRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], Operations = Operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchReadRequest]
  }
  @scala.inline
  implicit class BatchReadRequestOps[Self <: BatchReadRequest] (val x: Self) extends AnyVal {
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
    def withOperations(value: BatchReadOperationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operations")(value.asInstanceOf[js.Any])
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

