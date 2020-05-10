package typingsSlinky.openfin

import typingsSlinky.openfin.windowOptionMod.Api
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon1 extends js.Object {
  var newVal: js.UndefOr[Api] = js.native
  var oldVal: js.UndefOr[Api] = js.native
}

object Anon1 {
  @scala.inline
  def apply(): Anon1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anon1]
  }
  @scala.inline
  implicit class Anon1Ops[Self <: Anon1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewVal(value: Api): Self = {
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
    def withOldVal(value: Api): Self = {
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

