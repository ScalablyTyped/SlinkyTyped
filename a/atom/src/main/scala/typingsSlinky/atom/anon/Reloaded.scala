package typingsSlinky.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reloaded extends js.Object {
  var reloaded: Boolean = js.native
}

object Reloaded {
  @scala.inline
  def apply(reloaded: Boolean): Reloaded = {
    val __obj = js.Dynamic.literal(reloaded = reloaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reloaded]
  }
  @scala.inline
  implicit class ReloadedOps[Self <: Reloaded] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReloaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloaded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

