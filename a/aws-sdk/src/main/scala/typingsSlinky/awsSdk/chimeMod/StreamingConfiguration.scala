package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamingConfiguration extends js.Object {
  /**
    * The retention period, in hours, for the Amazon Kinesis data.
    */
  var DataRetentionInHours: typingsSlinky.awsSdk.chimeMod.DataRetentionInHours = js.native
  /**
    * When true, media streaming to Amazon Kinesis is turned off.
    */
  var Disabled: js.UndefOr[Boolean] = js.native
}

object StreamingConfiguration {
  @scala.inline
  def apply(DataRetentionInHours: DataRetentionInHours): StreamingConfiguration = {
    val __obj = js.Dynamic.literal(DataRetentionInHours = DataRetentionInHours.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingConfiguration]
  }
  @scala.inline
  implicit class StreamingConfigurationOps[Self <: StreamingConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataRetentionInHours(value: DataRetentionInHours): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataRetentionInHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Disabled")(js.undefined)
        ret
    }
  }
  
}

