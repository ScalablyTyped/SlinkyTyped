package typingsSlinky.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaConferenceParametersAddOnParameters extends js.Object {
  var parameters: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaConferenceParametersAddOnParameters {
  @scala.inline
  def apply(): SchemaConferenceParametersAddOnParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConferenceParametersAddOnParameters]
  }
  @scala.inline
  implicit class SchemaConferenceParametersAddOnParametersOps[Self <: SchemaConferenceParametersAddOnParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameters(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
  }
  
}

