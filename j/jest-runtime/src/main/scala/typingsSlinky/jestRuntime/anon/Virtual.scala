package typingsSlinky.jestRuntime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Virtual extends js.Object {
  var virtual: js.UndefOr[Boolean] = js.native
}

object Virtual {
  @scala.inline
  def apply(): Virtual = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Virtual]
  }
  @scala.inline
  implicit class VirtualOps[Self <: Virtual] (val x: Self) extends AnyVal {
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

