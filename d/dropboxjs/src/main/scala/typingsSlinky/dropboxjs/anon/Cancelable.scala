package typingsSlinky.dropboxjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cancelable extends js.Object {
  var cancelable: Boolean = js.native
}

object Cancelable {
  @scala.inline
  def apply(cancelable: Boolean): Cancelable = {
    val __obj = js.Dynamic.literal(cancelable = cancelable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancelable]
  }
  @scala.inline
  implicit class CancelableOps[Self <: Cancelable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

