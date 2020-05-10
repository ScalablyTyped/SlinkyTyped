package typingsSlinky.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutControlsDescendantBindings extends js.Object {
  var controlsDescendantBindings: Boolean = js.native
}

object KnockoutControlsDescendantBindings {
  @scala.inline
  def apply(controlsDescendantBindings: Boolean): KnockoutControlsDescendantBindings = {
    val __obj = js.Dynamic.literal(controlsDescendantBindings = controlsDescendantBindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutControlsDescendantBindings]
  }
  @scala.inline
  implicit class KnockoutControlsDescendantBindingsOps[Self <: KnockoutControlsDescendantBindings] (val x: Self) extends AnyVal {
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

