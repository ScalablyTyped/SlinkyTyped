package typingsSlinky.leafletDraw.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapOptions extends js.Object {
  var drawControl: js.UndefOr[Boolean] = js.native
  var drawControlTooltips: js.UndefOr[Boolean] = js.native
  var touchExtend: js.UndefOr[Boolean] = js.native
}

object MapOptions {
  @scala.inline
  def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  @scala.inline
  implicit class MapOptionsOps[Self <: MapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawControl")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawControlTooltips(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawControlTooltips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawControlTooltips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawControlTooltips")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchExtend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchExtend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchExtend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchExtend")(js.undefined)
        ret
    }
  }
  
}

