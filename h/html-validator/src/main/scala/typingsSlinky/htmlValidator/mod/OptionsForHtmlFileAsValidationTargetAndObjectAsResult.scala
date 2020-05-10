package typingsSlinky.htmlValidator.mod

import typingsSlinky.htmlValidator.htmlValidatorStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsForHtmlFileAsValidationTargetAndObjectAsResult extends OptionsForHtmlFileAsValidationTarget {
  var format: js.UndefOr[json] = js.native
}

object OptionsForHtmlFileAsValidationTargetAndObjectAsResult {
  @scala.inline
  def apply(data: String): OptionsForHtmlFileAsValidationTargetAndObjectAsResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsForHtmlFileAsValidationTargetAndObjectAsResult]
  }
  @scala.inline
  implicit class OptionsForHtmlFileAsValidationTargetAndObjectAsResultOps[Self <: OptionsForHtmlFileAsValidationTargetAndObjectAsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: json): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
  }
  
}

