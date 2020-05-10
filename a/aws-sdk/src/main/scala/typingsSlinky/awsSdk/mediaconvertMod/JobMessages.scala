package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobMessages extends js.Object {
  /**
    * List of messages that are informational only and don't indicate a problem with your job.
    */
  var Info: js.UndefOr[listOfString] = js.native
  /**
    * List of messages that warn about conditions that might cause your job not to run or to fail.
    */
  var Warning: js.UndefOr[listOfString] = js.native
}

object JobMessages {
  @scala.inline
  def apply(): JobMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobMessages]
  }
  @scala.inline
  implicit class JobMessagesOps[Self <: JobMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfo(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Info")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Warning")(js.undefined)
        ret
    }
  }
  
}

