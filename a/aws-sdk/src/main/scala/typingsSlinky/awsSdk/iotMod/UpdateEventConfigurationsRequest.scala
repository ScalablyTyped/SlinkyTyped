package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEventConfigurationsRequest extends js.Object {
  /**
    * The new event configuration values.
    */
  var eventConfigurations: js.UndefOr[EventConfigurations] = js.native
}

object UpdateEventConfigurationsRequest {
  @scala.inline
  def apply(): UpdateEventConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEventConfigurationsRequest]
  }
  @scala.inline
  implicit class UpdateEventConfigurationsRequestOps[Self <: UpdateEventConfigurationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventConfigurations(value: EventConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventConfigurations")(js.undefined)
        ret
    }
  }
  
}

