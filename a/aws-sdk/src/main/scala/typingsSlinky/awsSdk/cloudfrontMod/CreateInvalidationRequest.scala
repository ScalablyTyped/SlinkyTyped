package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInvalidationRequest extends js.Object {
  /**
    * The distribution's id.
    */
  var DistributionId: String = js.native
  /**
    * The batch information for the invalidation.
    */
  var InvalidationBatch: typingsSlinky.awsSdk.cloudfrontMod.InvalidationBatch = js.native
}

object CreateInvalidationRequest {
  @scala.inline
  def apply(DistributionId: String, InvalidationBatch: InvalidationBatch): CreateInvalidationRequest = {
    val __obj = js.Dynamic.literal(DistributionId = DistributionId.asInstanceOf[js.Any], InvalidationBatch = InvalidationBatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInvalidationRequest]
  }
  @scala.inline
  implicit class CreateInvalidationRequestOps[Self <: CreateInvalidationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistributionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistributionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidationBatch(value: InvalidationBatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvalidationBatch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

