package typingsSlinky.amapJsApi.AMap.Buildings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Style extends js.Object {
  var areas: js.Array[AreaStyle] = js.native
  var hideWithoutStyle: js.UndefOr[Boolean] = js.native
}

object Style {
  @scala.inline
  def apply(areas: js.Array[AreaStyle]): Style = {
    val __obj = js.Dynamic.literal(areas = areas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  @scala.inline
  implicit class StyleOps[Self <: Style] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAreas(value: js.Array[AreaStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideWithoutStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideWithoutStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideWithoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideWithoutStyle")(js.undefined)
        ret
    }
  }
  
}

