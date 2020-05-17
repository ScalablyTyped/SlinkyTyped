package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/cloudfront.GetStreamingDistributionRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait GetStreamingDistributionR extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The streaming distribution's ID.
    */
  var Id: String = js.native
}

object GetStreamingDistributionR {
  @scala.inline
  def apply(Id: String): GetStreamingDistributionR = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamingDistributionR]
  }
  @scala.inline
  implicit class GetStreamingDistributionROps[Self <: GetStreamingDistributionR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$waiter(value: WaiterConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$waiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(js.undefined)
        ret
    }
  }
  
}

