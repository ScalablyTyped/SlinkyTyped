package typingsSlinky.expoFileSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIntermediates extends js.Object {
  var intermediates: js.UndefOr[Boolean] = js.native
}

object AnonIntermediates {
  @scala.inline
  def apply(): AnonIntermediates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIntermediates]
  }
  @scala.inline
  implicit class AnonIntermediatesOps[Self <: AnonIntermediates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntermediates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intermediates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntermediates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intermediates")(js.undefined)
        ret
    }
  }
  
}

