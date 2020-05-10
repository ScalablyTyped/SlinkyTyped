package typingsSlinky.knockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonControlsDescendantBindings extends js.Object {
  var controlsDescendantBindings: Boolean = js.native
}

object AnonControlsDescendantBindings {
  @scala.inline
  def apply(controlsDescendantBindings: Boolean): AnonControlsDescendantBindings = {
    val __obj = js.Dynamic.literal(controlsDescendantBindings = controlsDescendantBindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonControlsDescendantBindings]
  }
  @scala.inline
  implicit class AnonControlsDescendantBindingsOps[Self <: AnonControlsDescendantBindings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControlsDescendantBindings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsDescendantBindings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

