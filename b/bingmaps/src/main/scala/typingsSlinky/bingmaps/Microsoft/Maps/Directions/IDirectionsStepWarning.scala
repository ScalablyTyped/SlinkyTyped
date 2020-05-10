package typingsSlinky.bingmaps.Microsoft.Maps.Directions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDirectionsStepWarning extends js.Object {
  /** Where the warning starts. */
  var origin: String = js.native
  /** The severity of the warning. Values can be: Low Impact, Minor, Moderate, Serious or None. */
  var severity: String = js.native
  /** The warning text. */
  var text: String = js.native
  /** Where the warning ends. */
  var to: String = js.native
  /** The type of warning. A list of Warning type values can be found here: https://msdn.microsoft.com/en-us/library/hh441731.aspx */
  var warningType: String = js.native
}

object IDirectionsStepWarning {
  @scala.inline
  def apply(origin: String, severity: String, text: String, to: String, warningType: String): IDirectionsStepWarning = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], warningType = warningType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirectionsStepWarning]
  }
  @scala.inline
  implicit class IDirectionsStepWarningOps[Self <: IDirectionsStepWarning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeverity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

