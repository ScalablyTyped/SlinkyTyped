package typingsSlinky.reactNativeFs.anon

import typingsSlinky.reactNativeFs.mod.DownloadResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobId extends js.Object {
  var jobId: Double = js.native
  var promise: js.Promise[DownloadResult] = js.native
}

object JobId {
  @scala.inline
  def apply(jobId: Double, promise: js.Promise[DownloadResult]): JobId = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobId]
  }
  @scala.inline
  implicit class JobIdOps[Self <: JobId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPromise(value: js.Promise[DownloadResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

