package typingsSlinky.pulumiAws.inputMod.ec2clientvpn

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointConnectionLogOptions extends js.Object {
  /**
    * The name of the CloudWatch Logs log group.
    */
  var cloudwatchLogGroup: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the CloudWatch Logs log stream to which the connection data is published.
    */
  var cloudwatchLogStream: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether connection logging is enabled.
    */
  var enabled: Input[Boolean] = js.native
}

object EndpointConnectionLogOptions {
  @scala.inline
  def apply(enabled: Input[Boolean]): EndpointConnectionLogOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointConnectionLogOptions]
  }
  @scala.inline
  implicit class EndpointConnectionLogOptionsOps[Self <: EndpointConnectionLogOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloudwatchLogGroup(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchLogGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudwatchLogGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchLogGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudwatchLogStream(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchLogStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudwatchLogStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchLogStream")(js.undefined)
        ret
    }
  }
  
}

