package typingsSlinky.normalizeJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTextTransform extends js.Object {
  var textTransform: String = js.native
}

object AnonTextTransform {
  @scala.inline
  def apply(textTransform: String): AnonTextTransform = {
    val __obj = js.Dynamic.literal(textTransform = textTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTextTransform]
  }
  @scala.inline
  implicit class AnonTextTransformOps[Self <: AnonTextTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextTransform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTransform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

