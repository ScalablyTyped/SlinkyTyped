package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAriaIndeterminateProgressText extends js.Object {
  var ariaIndeterminateProgressText: js.UndefOr[String] = js.native
}

object AnonAriaIndeterminateProgressText {
  @scala.inline
  def apply(): AnonAriaIndeterminateProgressText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAriaIndeterminateProgressText]
  }
  @scala.inline
  implicit class AnonAriaIndeterminateProgressTextOps[Self <: AnonAriaIndeterminateProgressText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaIndeterminateProgressText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaIndeterminateProgressText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaIndeterminateProgressText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaIndeterminateProgressText")(js.undefined)
        ret
    }
  }
  
}

