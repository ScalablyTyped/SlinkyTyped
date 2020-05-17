package typingsSlinky.jointjs.anon

import typingsSlinky.jointjs.mod.dia.Element.PositionType
import typingsSlinky.jointjs.mod.dia.MarkupJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Markup extends js.Object {
  var markup: js.UndefOr[String | MarkupJSON] = js.native
  var position: js.UndefOr[PositionType] = js.native
}

object Markup {
  @scala.inline
  def apply(): Markup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Markup]
  }
  @scala.inline
  implicit class MarkupOps[Self <: Markup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

