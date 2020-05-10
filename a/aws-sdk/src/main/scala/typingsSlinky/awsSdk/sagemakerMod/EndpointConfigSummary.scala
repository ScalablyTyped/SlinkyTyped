package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointConfigSummary extends js.Object {
  /**
    * A timestamp that shows when the endpoint configuration was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * The Amazon Resource Name (ARN) of the endpoint configuration.
    */
  var EndpointConfigArn: typingsSlinky.awsSdk.sagemakerMod.EndpointConfigArn = js.native
  /**
    * The name of the endpoint configuration.
    */
  var EndpointConfigName: typingsSlinky.awsSdk.sagemakerMod.EndpointConfigName = js.native
}

object EndpointConfigSummary {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    EndpointConfigArn: EndpointConfigArn,
    EndpointConfigName: EndpointConfigName
  ): EndpointConfigSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], EndpointConfigArn = EndpointConfigArn.asInstanceOf[js.Any], EndpointConfigName = EndpointConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointConfigSummary]
  }
  @scala.inline
  implicit class EndpointConfigSummaryOps[Self <: EndpointConfigSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointConfigArn(value: EndpointConfigArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointConfigArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointConfigName(value: EndpointConfigName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointConfigName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

