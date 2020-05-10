package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInitialRender extends js.Object {
  var initialRender: Boolean = js.native
}

object AnonInitialRender {
  @scala.inline
  def apply(initialRender: Boolean): AnonInitialRender = {
    val __obj = js.Dynamic.literal(initialRender = initialRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInitialRender]
  }
  @scala.inline
  implicit class AnonInitialRenderOps[Self <: AnonInitialRender] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRender")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

