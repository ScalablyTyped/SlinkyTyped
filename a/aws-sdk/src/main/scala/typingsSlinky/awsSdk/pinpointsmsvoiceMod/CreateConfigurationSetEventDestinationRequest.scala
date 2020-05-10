package typingsSlinky.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConfigurationSetEventDestinationRequest extends js.Object {
  /**
    * ConfigurationSetName
    */
  var ConfigurationSetName: _String = js.native
  var EventDestination: js.UndefOr[EventDestinationDefinition] = js.native
  /**
    * A name that identifies the event destination.
    */
  var EventDestinationName: js.UndefOr[NonEmptyString] = js.native
}

object CreateConfigurationSetEventDestinationRequest {
  @scala.inline
  def apply(ConfigurationSetName: _String): CreateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationSetEventDestinationRequest]
  }
  @scala.inline
  implicit class CreateConfigurationSetEventDestinationRequestOps[Self <: CreateConfigurationSetEventDestinationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationSetName(value: _String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventDestination(value: EventDestinationDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventDestination")(js.undefined)
        ret
    }
    @scala.inline
    def withEventDestinationName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventDestinationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventDestinationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventDestinationName")(js.undefined)
        ret
    }
  }
  
}

