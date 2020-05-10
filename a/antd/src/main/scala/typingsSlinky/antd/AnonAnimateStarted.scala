package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnimateStarted extends js.Object {
  var animateStarted: Boolean = js.native
}

object AnonAnimateStarted {
  @scala.inline
  def apply(animateStarted: Boolean): AnonAnimateStarted = {
    val __obj = js.Dynamic.literal(animateStarted = animateStarted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimateStarted]
  }
  @scala.inline
  implicit class AnonAnimateStartedOps[Self <: AnonAnimateStarted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimateStarted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateStarted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

