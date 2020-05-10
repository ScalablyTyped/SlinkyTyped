package typingsSlinky.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEntitiesDetectionV2JobResponse extends js.Object {
  /**
    * An object that contains the properties associated with a detection job.
    */
  var ComprehendMedicalAsyncJobProperties: js.UndefOr[typingsSlinky.awsSdk.comprehendmedicalMod.ComprehendMedicalAsyncJobProperties] = js.native
}

object DescribeEntitiesDetectionV2JobResponse {
  @scala.inline
  def apply(): DescribeEntitiesDetectionV2JobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEntitiesDetectionV2JobResponse]
  }
  @scala.inline
  implicit class DescribeEntitiesDetectionV2JobResponseOps[Self <: DescribeEntitiesDetectionV2JobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComprehendMedicalAsyncJobProperties(value: ComprehendMedicalAsyncJobProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComprehendMedicalAsyncJobProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComprehendMedicalAsyncJobProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComprehendMedicalAsyncJobProperties")(js.undefined)
        ret
    }
  }
  
}

