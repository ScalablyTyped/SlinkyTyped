package typingsSlinky.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConferenceParameters extends js.Object {
  /** Additional add-on specific data. */
  var addOnParameters: js.UndefOr[ConferenceParametersAddOnParameters] = js.native
}

object ConferenceParameters {
  @scala.inline
  def apply(): ConferenceParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceParameters]
  }
  @scala.inline
  implicit class ConferenceParametersOps[Self <: ConferenceParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddOnParameters(value: ConferenceParametersAddOnParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddOnParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnParameters")(js.undefined)
        ret
    }
  }
  
}

