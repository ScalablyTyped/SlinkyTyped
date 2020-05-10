package typingsSlinky.antd

import typingsSlinky.antd.antdStrings.horizontal
import typingsSlinky.antd.antdStrings.vertical
import typingsSlinky.antd.listMod.ListGridType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemLayout extends js.Object {
  var grid: js.UndefOr[ListGridType] = js.native
  var itemLayout: js.UndefOr[horizontal | vertical] = js.native
}

object AnonItemLayout {
  @scala.inline
  def apply(): AnonItemLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonItemLayout]
  }
  @scala.inline
  implicit class AnonItemLayoutOps[Self <: AnonItemLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrid(value: ListGridType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withItemLayout(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemLayout")(js.undefined)
        ret
    }
  }
  
}

