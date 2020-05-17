package typingsSlinky.jexcel.anon

import typingsSlinky.jexcel.mod.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Colspan extends js.Object {
  var colspan: js.UndefOr[Double] = js.native
  var title: js.UndefOr[CellValue] = js.native
}

object Colspan {
  @scala.inline
  def apply(): Colspan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Colspan]
  }
  @scala.inline
  implicit class ColspanOps[Self <: Colspan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColspan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colspan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColspan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colspan")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: CellValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

