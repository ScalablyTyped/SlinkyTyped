package typingsSlinky.openfin.anon

import typingsSlinky.openfin.windowOptionMod.Accelerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `9` extends js.Object {
  var newVal: js.UndefOr[Accelerator] = js.native
  var oldVal: js.UndefOr[Accelerator] = js.native
}

object `9` {
  @scala.inline
  def apply(): `9` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`9`]
  }
  @scala.inline
  implicit class `9Ops`[Self <: `9`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewVal(value: Accelerator): Self = {
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
    def withOldVal(value: Accelerator): Self = {
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

