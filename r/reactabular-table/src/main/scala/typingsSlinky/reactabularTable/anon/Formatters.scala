package typingsSlinky.reactabularTable.anon

import typingsSlinky.reactabularTable.mod.CellFormatter
import typingsSlinky.reactabularTable.mod.CellTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Formatters extends js.Object {
  var formatters: js.UndefOr[js.Array[CellFormatter]] = js.native
  var transforms: js.UndefOr[js.Array[CellTransform]] = js.native
}

object Formatters {
  @scala.inline
  def apply(): Formatters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Formatters]
  }
  @scala.inline
  implicit class FormattersOps[Self <: Formatters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatters(value: js.Array[CellFormatter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatters")(js.undefined)
        ret
    }
    @scala.inline
    def withTransforms(value: js.Array[CellTransform]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transforms")(js.undefined)
        ret
    }
  }
  
}

