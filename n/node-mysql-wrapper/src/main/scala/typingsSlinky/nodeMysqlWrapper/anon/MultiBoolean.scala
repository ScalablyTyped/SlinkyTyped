package typingsSlinky.nodeMysqlWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiBoolean extends js.Object {
  var multi: js.UndefOr[Boolean] = js.native
}

object MultiBoolean {
  @scala.inline
  def apply(): MultiBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiBoolean]
  }
  @scala.inline
  implicit class MultiBooleanOps[Self <: MultiBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMulti(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulti: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(js.undefined)
        ret
    }
  }
  
}

