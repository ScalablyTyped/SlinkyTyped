package typingsSlinky.jointjs.mod.dia.Element

import typingsSlinky.jointjs.anon.Markup
import typingsSlinky.jointjs.mod.dia.Cell.Selectors
import typingsSlinky.jointjs.mod.dia.MarkupJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortGroup extends js.Object {
  var attrs: js.UndefOr[Selectors] = js.native
  var label: js.UndefOr[Markup] = js.native
  var markup: js.UndefOr[String | MarkupJSON] = js.native
  var position: js.UndefOr[PositionType] = js.native
}

object PortGroup {
  @scala.inline
  def apply(): PortGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortGroup]
  }
  @scala.inline
  implicit class PortGroupOps[Self <: PortGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrs(value: Selectors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: Markup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkup(value: String | MarkupJSON): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markup")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: PositionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

