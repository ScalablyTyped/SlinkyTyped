package typingsSlinky.reactTether

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRenderElementTag extends js.Object {
  var renderElementTag: String = js.native
  var renderElementTo: js.Any = js.native
}

object AnonRenderElementTag {
  @scala.inline
  def apply(renderElementTag: String, renderElementTo: js.Any): AnonRenderElementTag = {
    val __obj = js.Dynamic.literal(renderElementTag = renderElementTag.asInstanceOf[js.Any], renderElementTo = renderElementTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRenderElementTag]
  }
  @scala.inline
  implicit class AnonRenderElementTagOps[Self <: AnonRenderElementTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderElementTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderElementTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderElementTo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderElementTo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

