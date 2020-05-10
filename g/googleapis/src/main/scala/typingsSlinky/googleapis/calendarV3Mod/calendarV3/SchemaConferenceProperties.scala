package typingsSlinky.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaConferenceProperties extends js.Object {
  /**
    * The types of conference solutions that are supported for this calendar.
    * The possible values are:   - &quot;eventHangout&quot;  -
    * &quot;eventNamedHangout&quot;  - &quot;hangoutsMeet&quot;  Optional.
    */
  var allowedConferenceSolutionTypes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaConferenceProperties {
  @scala.inline
  def apply(): SchemaConferenceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConferenceProperties]
  }
  @scala.inline
  implicit class SchemaConferencePropertiesOps[Self <: SchemaConferenceProperties] (val x: Self) extends AnyVal {
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

