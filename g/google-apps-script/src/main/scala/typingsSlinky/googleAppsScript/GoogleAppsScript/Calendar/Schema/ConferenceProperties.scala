package typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConferenceProperties extends js.Object {
  var allowedConferenceSolutionTypes: js.UndefOr[js.Array[String]] = js.native
}

object ConferenceProperties {
  @scala.inline
  def apply(): ConferenceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceProperties]
  }
  @scala.inline
  implicit class ConferencePropertiesOps[Self <: ConferenceProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedConferenceSolutionTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedConferenceSolutionTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedConferenceSolutionTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedConferenceSolutionTypes")(js.undefined)
        ret
    }
  }
  
}

