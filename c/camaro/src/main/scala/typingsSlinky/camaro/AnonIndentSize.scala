package typingsSlinky.camaro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIndentSize extends js.Object {
  var indentSize: Double = js.native
}

object AnonIndentSize {
  @scala.inline
  def apply(indentSize: Double): AnonIndentSize = {
    val __obj = js.Dynamic.literal(indentSize = indentSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndentSize]
  }
  @scala.inline
  implicit class AnonIndentSizeOps[Self <: AnonIndentSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndentSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

