package typingsSlinky.reactBootstrap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BsClass extends js.Object {
  var bsClass: js.UndefOr[js.Any] = js.native
}

object BsClass {
  @scala.inline
  def apply(): BsClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BsClass]
  }
  @scala.inline
  implicit class BsClassOps[Self <: BsClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBsClass(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(js.undefined)
        ret
    }
  }
  
}

