package typingsSlinky.backboneMarionette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPreventRender extends js.Object {
  var preventRender: Boolean = js.native
}

object AnonPreventRender {
  @scala.inline
  def apply(preventRender: Boolean): AnonPreventRender = {
    val __obj = js.Dynamic.literal(preventRender = preventRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreventRender]
  }
  @scala.inline
  implicit class AnonPreventRenderOps[Self <: AnonPreventRender] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreventRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventRender")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

