package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAggregationAuthorizationResponse extends js.Object {
  /**
    * Returns an AggregationAuthorization object. 
    */
  var AggregationAuthorization: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.AggregationAuthorization] = js.native
}

object PutAggregationAuthorizationResponse {
  @scala.inline
  def apply(): PutAggregationAuthorizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAggregationAuthorizationResponse]
  }
  @scala.inline
  implicit class PutAggregationAuthorizationResponseOps[Self <: PutAggregationAuthorizationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregationAuthorization(value: AggregationAuthorization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AggregationAuthorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregationAuthorization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AggregationAuthorization")(js.undefined)
        ret
    }
  }
  
}

