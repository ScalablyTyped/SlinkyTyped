package typingsSlinky.reduxOrm.fieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeOpts extends js.Object {
  var getDefault: js.UndefOr[js.Function0[_]] = js.native
}

object AttributeOpts {
  @scala.inline
  def apply(): AttributeOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeOpts]
  }
  @scala.inline
  implicit class AttributeOptsOps[Self <: AttributeOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDefault(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefault")(js.undefined)
        ret
    }
  }
  
}

