package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnAfterEnteringVRObservableEvent extends js.Object {
  /**
    * If entering vr was successful
    */
  var success: Boolean = js.native
}

object OnAfterEnteringVRObservableEvent {
  @scala.inline
  def apply(success: Boolean): OnAfterEnteringVRObservableEvent = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAfterEnteringVRObservableEvent]
  }
  @scala.inline
  implicit class OnAfterEnteringVRObservableEventOps[Self <: OnAfterEnteringVRObservableEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

