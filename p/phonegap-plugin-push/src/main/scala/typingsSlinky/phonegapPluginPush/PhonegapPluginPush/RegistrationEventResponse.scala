package typingsSlinky.phonegapPluginPush.PhonegapPluginPush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistrationEventResponse extends EventResponse {
  /**
  		 * The registration ID provided by the 3rd party remote push service.
  		 */
  var registrationId: String = js.native
}

object RegistrationEventResponse {
  @scala.inline
  def apply(registrationId: String): RegistrationEventResponse = {
    val __obj = js.Dynamic.literal(registrationId = registrationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistrationEventResponse]
  }
  @scala.inline
  implicit class RegistrationEventResponseOps[Self <: RegistrationEventResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegistrationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

