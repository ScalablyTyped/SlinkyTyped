package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCorrect extends js.Object {
  var DisplayAutoCorrectOptions: Boolean = js.native
  var DisplayAutoLayoutOptions: Boolean = js.native
  @JSName("PowerPoint.AutoCorrect_typekey")
  var PowerPointDotAutoCorrect_typekey: AutoCorrect = js.native
}

object AutoCorrect {
  @scala.inline
  def apply(
    DisplayAutoCorrectOptions: Boolean,
    DisplayAutoLayoutOptions: Boolean,
    PowerPointDotAutoCorrect_typekey: AutoCorrect
  ): AutoCorrect = {
    val __obj = js.Dynamic.literal(DisplayAutoCorrectOptions = DisplayAutoCorrectOptions.asInstanceOf[js.Any], DisplayAutoLayoutOptions = DisplayAutoLayoutOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.AutoCorrect_typekey")(PowerPointDotAutoCorrect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCorrect]
  }
  @scala.inline
  implicit class AutoCorrectOps[Self <: AutoCorrect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayAutoCorrectOptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayAutoCorrectOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayAutoLayoutOptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayAutoLayoutOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotAutoCorrect_typekey(value: AutoCorrect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.AutoCorrect_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

