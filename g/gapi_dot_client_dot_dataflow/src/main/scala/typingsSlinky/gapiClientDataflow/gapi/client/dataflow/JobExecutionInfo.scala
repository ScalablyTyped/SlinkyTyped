package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobExecutionInfo extends js.Object {
  /** A mapping from each stage to the information about that stage. */
  var stages: js.UndefOr[Record[String, JobExecutionStageInfo]] = js.native
}

object JobExecutionInfo {
  @scala.inline
  def apply(): JobExecutionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionInfo]
  }
  @scala.inline
  implicit class JobExecutionInfoOps[Self <: JobExecutionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStages(value: Record[String, JobExecutionStageInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stages")(js.undefined)
        ret
    }
  }
  
}

