package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignTapePoolInput extends js.Object {
  /**
    * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool. Valid values: "GLACIER", "DEEP_ARCHIVE"
    */
  var PoolId: typingsSlinky.awsSdk.storagegatewayMod.PoolId = js.native
  /**
    * The unique Amazon Resource Name (ARN) of the virtual tape that you want to add to the tape pool.
    */
  var TapeARN: typingsSlinky.awsSdk.storagegatewayMod.TapeARN = js.native
}

object AssignTapePoolInput {
  @scala.inline
  def apply(PoolId: PoolId, TapeARN: TapeARN): AssignTapePoolInput = {
    val __obj = js.Dynamic.literal(PoolId = PoolId.asInstanceOf[js.Any], TapeARN = TapeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignTapePoolInput]
  }
  @scala.inline
  implicit class AssignTapePoolInputOps[Self <: AssignTapePoolInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPoolId(value: PoolId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTapeARN(value: TapeARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeARN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

