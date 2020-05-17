package typingsSlinky.jupyterlabServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransientDisplayidString extends js.Object {
  var transient: DisplayidString = js.native
}

object TransientDisplayidString {
  @scala.inline
  def apply(transient: DisplayidString): TransientDisplayidString = {
    val __obj = js.Dynamic.literal(transient = transient.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransientDisplayidString]
  }
  @scala.inline
  implicit class TransientDisplayidStringOps[Self <: TransientDisplayidString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransient(value: DisplayidString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transient")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

