package typingsSlinky.handsontable.mod.Handsontable.contextMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmenuConfig extends js.Object {
  var items: js.Array[SubmenuItemConfig] = js.native
}

object SubmenuConfig {
  @scala.inline
  def apply(items: js.Array[SubmenuItemConfig]): SubmenuConfig = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmenuConfig]
  }
  @scala.inline
  implicit class SubmenuConfigOps[Self <: SubmenuConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[SubmenuItemConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

