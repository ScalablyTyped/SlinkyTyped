package typingsSlinky.handsontable.mod.Handsontable.plugins.FiltersPlugin

import typingsSlinky.handsontable.anon.Col
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellLikeData extends js.Object {
  var meta: Col = js.native
  var value: String = js.native
}

object CellLikeData {
  @scala.inline
  def apply(meta: Col, value: String): CellLikeData = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellLikeData]
  }
  @scala.inline
  implicit class CellLikeDataOps[Self <: CellLikeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMeta(value: Col): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

