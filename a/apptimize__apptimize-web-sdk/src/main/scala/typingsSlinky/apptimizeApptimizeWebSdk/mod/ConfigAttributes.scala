package typingsSlinky.apptimizeApptimizeWebSdk.mod

import typingsSlinky.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_DEBUG
import typingsSlinky.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_ERROR
import typingsSlinky.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_INFO
import typingsSlinky.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_NONE
import typingsSlinky.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_VERBOSE
import typingsSlinky.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_WARN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigAttributes extends js.Object {
  var log_level: js.UndefOr[
    LOG_LEVEL_VERBOSE | LOG_LEVEL_DEBUG | LOG_LEVEL_INFO | LOG_LEVEL_WARN | LOG_LEVEL_ERROR | LOG_LEVEL_NONE
  ] = js.native
  var result_post_delay_ms: js.UndefOr[Double] = js.native
}

object ConfigAttributes {
  @scala.inline
  def apply(): ConfigAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigAttributes]
  }
  @scala.inline
  implicit class ConfigAttributesOps[Self <: ConfigAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLog_level(
      value: LOG_LEVEL_VERBOSE | LOG_LEVEL_DEBUG | LOG_LEVEL_INFO | LOG_LEVEL_WARN | LOG_LEVEL_ERROR | LOG_LEVEL_NONE
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log_level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog_level: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log_level")(js.undefined)
        ret
    }
    @scala.inline
    def withResult_post_delay_ms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result_post_delay_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult_post_delay_ms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result_post_delay_ms")(js.undefined)
        ret
    }
  }
  
}

