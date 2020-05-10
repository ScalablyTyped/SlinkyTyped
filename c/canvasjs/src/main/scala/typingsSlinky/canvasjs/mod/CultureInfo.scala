package typingsSlinky.canvasjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CultureInfo extends js.Object {
  /**
    * Day names starting from Sunday. Should be exactly 7 in total.
    * Default: [“Sunday”, “Monday”, “Tuesday”, “Wednesday”, “Thursday”, “Friday”, “Saturday”]
    * Example: [“domingo”, “lunes”, “martes”, “miércoles”, “jueves”, “viernes”, “sábado”]
    */
  var days: js.UndefOr[js.Array[String]] = js.native
  /**
    * Character used to separate fractional part from the whole number.
    * Default: "."
    * Example: “.“ ”,”
    */
  var decimalSeparator: js.UndefOr[String] = js.native
  /**
    * Also referred to as Thousand Separator.
    * Default: “,”
    * Example: “,”, “.”
    */
  var digitGroupSeparator: js.UndefOr[String] = js.native
  /**
    * Tool Tip for Menu Button.
    * Default: “More Options”
    * Example: “More Options”, etc
    */
  var menuText: js.UndefOr[String] = js.native
  /**
    * Month Names starting from January.
    * Default: [“January”, “February”, “March”, “April”, “May”, “June”, “July”, “August”, “September”, “October”, “November”, “December”]
    * Example: [“January”, “February”, “March”, “April”, “May”, “June”, “July”, “August”, “September”, “October”, “November”, “December”]
    */
  var months: js.UndefOr[js.Array[String]] = js.native
  /**
    * Text is shown inside the Button till v1.4
    * v1.5 onwards Text is shown as tooltip.
    * Default: “Pan”
    * Example: “pan”, etc
    */
  var panText: js.UndefOr[String] = js.native
  /**
    * Text is shown inside the Button till v1.4
    * v1.5 onwards Text is shown as tooltip.
    * Default: “Reset”
    * Example: “reset”, etc
    */
  var resetText: js.UndefOr[String] = js.native
  /**
    * Set text is shown instead of Save as JPG.
    * Default: “Save as JPG”
    * Example: “save as jpg”, etc
    */
  var saveJPGText: js.UndefOr[String] = js.native
  /**
    * Set text is shown instead of Save as PNG.
    * Default: “Save as PNG”
    * Example: “save as png”, etc
    */
  var savePNGText: js.UndefOr[String] = js.native
  /**
    * Short Day names starting from Sunday. Should be exactly 7 in total.
    * Default: [“Sun”, “Mon”, “Tue”, “Wed”, “Thu”, “Fri”, “Sat”]
    * Example: [“Sun”, “Mon”, “Tue”, “Wed”, “Thu”, “Fri”, “Sat”]
    */
  var shortDays: js.UndefOr[js.Array[String]] = js.native
  /**
    * Short Month Names starting from January.
    * Default: [“Jan”, “Feb”, “Mar”, “Apr”, “May”, “Jun”, “Jul”, “Aug”, “Sep”, “Oct”, “Nov”, “Dec”]
    * Example: [“Jan”, “Feb”, “Mar”, “Apr”, “May”, “Jun”, “Jul”, “Aug”, “Sep”, “Oct”, “Nov”, “Dec”]
    */
  var shortMonths: js.UndefOr[js.Array[String]] = js.native
  /**
    * Text is shown inside the Button till v1.4
    * v1.5 onwards Text is shown as tooltip.
    * Default: "Zoom"
    * Example: “zoom”, etc
    */
  var zoomText: js.UndefOr[String] = js.native
}

object CultureInfo {
  @scala.inline
  def apply(): CultureInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CultureInfo]
  }
  @scala.inline
  implicit class CultureInfoOps[Self <: CultureInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDays(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimalSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withDigitGroupSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digitGroupSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigitGroupSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digitGroupSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuText")(js.undefined)
        ret
    }
    @scala.inline
    def withMonths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(js.undefined)
        ret
    }
    @scala.inline
    def withPanText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panText")(js.undefined)
        ret
    }
    @scala.inline
    def withResetText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetText")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveJPGText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveJPGText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveJPGText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveJPGText")(js.undefined)
        ret
    }
    @scala.inline
    def withSavePNGText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savePNGText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavePNGText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savePNGText")(js.undefined)
        ret
    }
    @scala.inline
    def withShortDays(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDays")(js.undefined)
        ret
    }
    @scala.inline
    def withShortMonths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomText")(js.undefined)
        ret
    }
  }
  
}

