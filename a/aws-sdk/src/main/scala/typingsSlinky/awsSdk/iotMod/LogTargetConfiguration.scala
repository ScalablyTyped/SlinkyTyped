package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogTargetConfiguration extends js.Object {
  /**
    * The logging level.
    */
  var logLevel: js.UndefOr[LogLevel] = js.native
  /**
    * A log target
    */
  var logTarget: js.UndefOr[LogTarget] = js.native
}

object LogTargetConfiguration {
  @scala.inline
  def apply(): LogTargetConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogTargetConfiguration]
  }
  @scala.inline
  implicit class LogTargetConfigurationOps[Self <: LogTargetConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogLevel(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLogTarget(value: LogTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logTarget")(js.undefined)
        ret
    }
  }
  
}

