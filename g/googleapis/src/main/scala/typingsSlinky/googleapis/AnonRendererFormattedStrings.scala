package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRendererFormattedStrings extends js.Object {
  var rendererFormattedStrings: js.UndefOr[AnonAuditGroupExpandTooltip] = js.native
}

object AnonRendererFormattedStrings {
  @scala.inline
  def apply(): AnonRendererFormattedStrings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRendererFormattedStrings]
  }
  @scala.inline
  implicit class AnonRendererFormattedStringsOps[Self <: AnonRendererFormattedStrings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRendererFormattedStrings(value: AnonAuditGroupExpandTooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendererFormattedStrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRendererFormattedStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendererFormattedStrings")(js.undefined)
        ret
    }
  }
  
}

