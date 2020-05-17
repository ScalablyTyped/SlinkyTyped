package typingsSlinky.pdfmake.interfacesMod

import typingsSlinky.pdfmake.anon.Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineStyle extends js.Object {
  var dash: js.UndefOr[Length] = js.native
}

object LineStyle {
  @scala.inline
  def apply(): LineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineStyle]
  }
  @scala.inline
  implicit class LineStyleOps[Self <: LineStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDash(value: Length): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dash")(js.undefined)
        ret
    }
  }
  
}

