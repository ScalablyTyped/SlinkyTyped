package typingsSlinky.ckeditor

import typingsSlinky.ckeditor.CKEDITOR.listenerRegistration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRemoveListenerListenerRegistration extends js.Object {
  var removeListener: listenerRegistration = js.native
}

object AnonRemoveListenerListenerRegistration {
  @scala.inline
  def apply(removeListener: listenerRegistration): AnonRemoveListenerListenerRegistration = {
    val __obj = js.Dynamic.literal(removeListener = removeListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRemoveListenerListenerRegistration]
  }
  @scala.inline
  implicit class AnonRemoveListenerListenerRegistrationOps[Self <: AnonRemoveListenerListenerRegistration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveListener(value: listenerRegistration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListener")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

