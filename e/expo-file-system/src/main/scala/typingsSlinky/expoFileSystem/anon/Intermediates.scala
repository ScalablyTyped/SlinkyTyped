package typingsSlinky.expoFileSystem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Intermediates extends js.Object {
  var intermediates: js.UndefOr[Boolean] = js.native
}

object Intermediates {
  @scala.inline
  def apply(): Intermediates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Intermediates]
  }
  @scala.inline
  implicit class IntermediatesOps[Self <: Intermediates] (val x: Self) extends AnyVal {
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

