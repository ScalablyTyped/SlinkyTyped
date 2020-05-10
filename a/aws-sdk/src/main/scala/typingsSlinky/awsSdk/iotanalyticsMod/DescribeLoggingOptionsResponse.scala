package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoggingOptionsResponse extends js.Object {
  /**
    * The current settings of the AWS IoT Analytics logging options.
    */
  var loggingOptions: js.UndefOr[LoggingOptions] = js.native
}

object DescribeLoggingOptionsResponse {
  @scala.inline
  def apply(): DescribeLoggingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoggingOptionsResponse]
  }
  @scala.inline
  implicit class DescribeLoggingOptionsResponseOps[Self <: DescribeLoggingOptionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoggingOptions(value: LoggingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingOptions")(js.undefined)
        ret
    }
  }
  
}

