package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionLogOptions extends js.Object {
  /**
    * The name of the CloudWatch Logs log group.
    */
  var CloudwatchLogGroup: js.UndefOr[String] = js.native
  /**
    * The name of the CloudWatch Logs log stream to which the connection data is published.
    */
  var CloudwatchLogStream: js.UndefOr[String] = js.native
  /**
    * Indicates whether connection logging is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}

object ConnectionLogOptions {
  @scala.inline
  def apply(): ConnectionLogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionLogOptions]
  }
  @scala.inline
  implicit class ConnectionLogOptionsOps[Self <: ConnectionLogOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudwatchLogGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudwatchLogGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudwatchLogGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudwatchLogGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudwatchLogStream(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudwatchLogStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudwatchLogStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudwatchLogStream")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
  }
  
}

