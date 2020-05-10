package typingsSlinky.jestRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonVirtual extends js.Object {
  var virtual: js.UndefOr[Boolean] = js.native
}

object AnonVirtual {
  @scala.inline
  def apply(): AnonVirtual = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonVirtual]
  }
  @scala.inline
  implicit class AnonVirtualOps[Self <: AnonVirtual] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVirtual(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtual")(js.undefined)
        ret
    }
  }
  
}

