package typingsSlinky.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewVal extends js.Object {
  var newVal: js.UndefOr[Boolean] = js.native
  var oldVal: js.UndefOr[Boolean] = js.native
}

object NewVal {
  @scala.inline
  def apply(): NewVal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewVal]
  }
  @scala.inline
  implicit class NewValOps[Self <: NewVal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewVal(value: Boolean): Self = {
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
    def withOldVal(value: Boolean): Self = {
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

