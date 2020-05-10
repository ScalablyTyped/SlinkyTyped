package typingsSlinky.openfin

import typingsSlinky.openfin.shapesMod.ContextMenuSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon8 extends js.Object {
  var newVal: js.UndefOr[ContextMenuSettings] = js.native
  var oldVal: js.UndefOr[ContextMenuSettings] = js.native
}

object Anon8 {
  @scala.inline
  def apply(): Anon8 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anon8]
  }
  @scala.inline
  implicit class Anon8Ops[Self <: Anon8] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewVal(value: ContextMenuSettings): Self = {
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
    def withOldVal(value: ContextMenuSettings): Self = {
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

