package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateAccessLogsResult extends js.Object {
  /**
    *  Pre-signed URL for the requested access logs. 
    */
  var logUrl: js.UndefOr[LogUrl] = js.native
}

object GenerateAccessLogsResult {
  @scala.inline
  def apply(): GenerateAccessLogsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateAccessLogsResult]
  }
  @scala.inline
  implicit class GenerateAccessLogsResultOps[Self <: GenerateAccessLogsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogUrl(value: LogUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logUrl")(js.undefined)
        ret
    }
  }
  
}

