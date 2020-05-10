package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTopicsDetectionJobResponse extends js.Object {
  /**
    * The list of properties for the requested job.
    */
  var TopicsDetectionJobProperties: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.TopicsDetectionJobProperties] = js.native
}

object DescribeTopicsDetectionJobResponse {
  @scala.inline
  def apply(): DescribeTopicsDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTopicsDetectionJobResponse]
  }
  @scala.inline
  implicit class DescribeTopicsDetectionJobResponseOps[Self <: DescribeTopicsDetectionJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTopicsDetectionJobProperties(value: TopicsDetectionJobProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicsDetectionJobProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicsDetectionJobProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicsDetectionJobProperties")(js.undefined)
        ret
    }
  }
  
}

