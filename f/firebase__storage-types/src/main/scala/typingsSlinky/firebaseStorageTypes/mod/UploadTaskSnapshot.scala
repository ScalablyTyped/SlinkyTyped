package typingsSlinky.firebaseStorageTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadTaskSnapshot extends js.Object {
  var bytesTransferred: Double = js.native
  var metadata: FullMetadata = js.native
  var ref: Reference = js.native
  var state: TaskState = js.native
  var task: UploadTask = js.native
  var totalBytes: Double = js.native
}

object UploadTaskSnapshot {
  @scala.inline
  def apply(
    bytesTransferred: Double,
    metadata: FullMetadata,
    ref: Reference,
    state: TaskState,
    task: UploadTask,
    totalBytes: Double
  ): UploadTaskSnapshot = {
    val __obj = js.Dynamic.literal(bytesTransferred = bytesTransferred.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadTaskSnapshot]
  }
  @scala.inline
  implicit class UploadTaskSnapshotOps[Self <: UploadTaskSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesTransferred(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesTransferred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: FullMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRef(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: TaskState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTask(value: UploadTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

