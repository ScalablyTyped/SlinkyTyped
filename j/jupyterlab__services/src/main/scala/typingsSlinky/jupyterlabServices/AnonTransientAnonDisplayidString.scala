package typingsSlinky.jupyterlabServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTransientAnonDisplayidString extends js.Object {
  var transient: AnonDisplayidString = js.native
}

object AnonTransientAnonDisplayidString {
  @scala.inline
  def apply(transient: AnonDisplayidString): AnonTransientAnonDisplayidString = {
    val __obj = js.Dynamic.literal(transient = transient.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTransientAnonDisplayidString]
  }
  @scala.inline
  implicit class AnonTransientAnonDisplayidStringOps[Self <: AnonTransientAnonDisplayidString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransient(value: AnonDisplayidString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transient")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

