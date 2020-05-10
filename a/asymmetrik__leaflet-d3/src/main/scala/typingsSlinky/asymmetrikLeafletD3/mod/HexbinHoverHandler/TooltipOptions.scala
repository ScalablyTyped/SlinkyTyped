package typingsSlinky.asymmetrikLeafletD3.mod.HexbinHoverHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipOptions extends js.Object {
  def tooltipContent(d: js.Any): String = js.native
}

object TooltipOptions {
  @scala.inline
  def apply(tooltipContent: js.Any => String): TooltipOptions = {
    val __obj = js.Dynamic.literal(tooltipContent = js.Any.fromFunction1(tooltipContent))
    __obj.asInstanceOf[TooltipOptions]
  }
  @scala.inline
  implicit class TooltipOptionsOps[Self <: TooltipOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTooltipContent(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipContent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

