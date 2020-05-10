package typingsSlinky.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendItemRenderingEventArgs extends js.Object {
  /** Returns the legend item.
    */
  var originalEvent: js.UndefOr[js.Any] = js.native
}

object LegendItemRenderingEventArgs {
  @scala.inline
  def apply(): LegendItemRenderingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendItemRenderingEventArgs]
  }
  @scala.inline
  implicit class LegendItemRenderingEventArgsOps[Self <: LegendItemRenderingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOriginalEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEvent")(js.undefined)
        ret
    }
  }
  
}

