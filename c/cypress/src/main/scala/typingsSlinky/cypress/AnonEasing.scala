package typingsSlinky.cypress

import typingsSlinky.cypress.JQuery_._SpeedSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEasing
  extends _SpeedSettings[js.Any] {
  /**
    * A string indicating which easing function to use for the transition.
    */
  var easing: String = js.native
}

object AnonEasing {
  @scala.inline
  def apply(easing: String): AnonEasing = {
    val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEasing]
  }
  @scala.inline
  implicit class AnonEasingOps[Self <: AnonEasing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

