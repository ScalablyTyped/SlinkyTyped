package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowInfo extends js.Object {
  var showInfo: Boolean = js.native
  var strokeWidth: Double = js.native
}

object ShowInfo {
  @scala.inline
  def apply(showInfo: Boolean, strokeWidth: Double): ShowInfo = {
    val __obj = js.Dynamic.literal(showInfo = showInfo.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowInfo]
  }
  @scala.inline
  implicit class ShowInfoOps[Self <: ShowInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

