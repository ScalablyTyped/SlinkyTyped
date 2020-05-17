package typingsSlinky.openfin.anon

import typingsSlinky.openfin.windowOptionMod.ResizeRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `7` extends js.Object {
  var newVal: js.UndefOr[ResizeRegion] = js.native
  var oldVal: js.UndefOr[ResizeRegion] = js.native
}

object `7` {
  @scala.inline
  def apply(): `7` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`7`]
  }
  @scala.inline
  implicit class `7Ops`[Self <: `7`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewVal(value: ResizeRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVal")(js.undefined)
        ret
    }
    @scala.inline
    def withOldVal(value: ResizeRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldVal")(js.undefined)
        ret
    }
  }
  
}

