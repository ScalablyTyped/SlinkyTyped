package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEventsConfigurationResponse extends js.Object {
  /**
    * The events configuration details.
    */
  var EventsConfiguration: js.UndefOr[typingsSlinky.awsSdk.chimeMod.EventsConfiguration] = js.native
}

object GetEventsConfigurationResponse {
  @scala.inline
  def apply(): GetEventsConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEventsConfigurationResponse]
  }
  @scala.inline
  implicit class GetEventsConfigurationResponseOps[Self <: GetEventsConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventsConfiguration(value: EventsConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventsConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventsConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventsConfiguration")(js.undefined)
        ret
    }
  }
  
}

