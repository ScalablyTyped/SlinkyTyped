package typingsSlinky.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingConfiguration extends js.Object {
  /**
    * An array of objects that describes where your execution history events will be logged. Limited to size 1. Required, if your log level is not set to OFF.
    */
  var destinations: js.UndefOr[LogDestinationList] = js.native
  /**
    * Determines whether execution data is included in your log. When set to FALSE, data is excluded.
    */
  var includeExecutionData: js.UndefOr[IncludeExecutionData] = js.native
  /**
    * Defines which category of execution history events are logged.
    */
  var level: js.UndefOr[LogLevel] = js.native
}

object LoggingConfiguration {
  @scala.inline
  def apply(): LoggingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingConfiguration]
  }
  @scala.inline
  implicit class LoggingConfigurationOps[Self <: LoggingConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinations(value: LogDestinationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinations")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeExecutionData(value: IncludeExecutionData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeExecutionData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeExecutionData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeExecutionData")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
  }
  
}

