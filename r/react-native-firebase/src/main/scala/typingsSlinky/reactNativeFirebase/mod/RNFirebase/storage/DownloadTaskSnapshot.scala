package typingsSlinky.reactNativeFirebase.mod.RNFirebase.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadTaskSnapshot extends js.Object {
  var bytesTransferred: Double = js.native
  var ref: Reference = js.native
  var state: TaskState = js.native
  var totalBytes: Double = js.native
}

object DownloadTaskSnapshot {
  @scala.inline
  def apply(bytesTransferred: Double, ref: Reference, state: TaskState, totalBytes: Double): DownloadTaskSnapshot = {
    val __obj = js.Dynamic.literal(bytesTransferred = bytesTransferred.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadTaskSnapshot]
  }
  @scala.inline
  implicit class DownloadTaskSnapshotOps[Self <: DownloadTaskSnapshot] (val x: Self) extends AnyVal {
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
    def withTotalBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

