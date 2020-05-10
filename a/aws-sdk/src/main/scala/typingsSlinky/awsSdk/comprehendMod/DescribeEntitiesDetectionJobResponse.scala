package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEntitiesDetectionJobResponse extends js.Object {
  /**
    * An object that contains the properties associated with an entities detection job.
    */
  var EntitiesDetectionJobProperties: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.EntitiesDetectionJobProperties] = js.native
}

object DescribeEntitiesDetectionJobResponse {
  @scala.inline
  def apply(): DescribeEntitiesDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEntitiesDetectionJobResponse]
  }
  @scala.inline
  implicit class DescribeEntitiesDetectionJobResponseOps[Self <: DescribeEntitiesDetectionJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntitiesDetectionJobProperties(value: EntitiesDetectionJobProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntitiesDetectionJobProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntitiesDetectionJobProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntitiesDetectionJobProperties")(js.undefined)
        ret
    }
  }
  
}

