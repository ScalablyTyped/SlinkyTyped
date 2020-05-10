package typingsSlinky.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputStartingPositionConfiguration extends js.Object {
  /**
    * The starting position on the stream.    NOW - Start reading just after the most recent record in the stream, start at the request time stamp that the customer issued.    TRIM_HORIZON - Start reading at the last untrimmed record in the stream, which is the oldest record available in the stream. This option is not available for an Amazon Kinesis Firehose delivery stream.    LAST_STOPPED_POINT - Resume reading from where the application last stopped reading.  
    */
  var InputStartingPosition: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.InputStartingPosition] = js.native
}

object InputStartingPositionConfiguration {
  @scala.inline
  def apply(): InputStartingPositionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputStartingPositionConfiguration]
  }
  @scala.inline
  implicit class InputStartingPositionConfigurationOps[Self <: InputStartingPositionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputStartingPosition(value: InputStartingPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputStartingPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputStartingPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputStartingPosition")(js.undefined)
        ret
    }
  }
  
}

