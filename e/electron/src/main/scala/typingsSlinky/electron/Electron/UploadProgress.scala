package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadProgress extends js.Object {
  /**
    * Whether the request is currently active. If this is false no other properties
    * will be set
    */
  var active: Boolean = js.native
  /**
    * The number of bytes that have been uploaded so far
    */
  var current: Double = js.native
  /**
    * Whether the upload has started. If this is false both current and total will be
    * set to 0.
    */
  var started: Boolean = js.native
  /**
    * The number of bytes that will be uploaded this request
    */
  var total: Double = js.native
}

object UploadProgress {
  @scala.inline
  def apply(active: Boolean, current: Double, started: Boolean, total: Double): UploadProgress = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadProgress]
  }
  @scala.inline
  implicit class UploadProgressOps[Self <: UploadProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStarted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

