package typingsSlinky.antd.gridRowMod

import typingsSlinky.antd.responsiveObserveMod.ScreenMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowState extends js.Object {
  var screens: ScreenMap = js.native
}

object RowState {
  @scala.inline
  def apply(screens: ScreenMap): RowState = {
    val __obj = js.Dynamic.literal(screens = screens.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowState]
  }
  @scala.inline
  implicit class RowStateOps[Self <: RowState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScreens(value: ScreenMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screens")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

