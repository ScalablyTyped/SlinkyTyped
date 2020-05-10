package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginGroupFailoverCriteria extends js.Object {
  /**
    * The status codes that, when returned from the primary origin, will trigger CloudFront to failover to the second origin.
    */
  var StatusCodes: typingsSlinky.awsSdk.cloudfrontMod.StatusCodes = js.native
}

object OriginGroupFailoverCriteria {
  @scala.inline
  def apply(StatusCodes: StatusCodes): OriginGroupFailoverCriteria = {
    val __obj = js.Dynamic.literal(StatusCodes = StatusCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginGroupFailoverCriteria]
  }
  @scala.inline
  implicit class OriginGroupFailoverCriteriaOps[Self <: OriginGroupFailoverCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatusCodes(value: StatusCodes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

