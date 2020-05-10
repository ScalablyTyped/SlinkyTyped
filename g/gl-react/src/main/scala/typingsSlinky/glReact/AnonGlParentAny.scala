package typingsSlinky.glReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGlParentAny extends js.Object {
  var glParent: js.Any = js.native
}

object AnonGlParentAny {
  @scala.inline
  def apply(glParent: js.Any): AnonGlParentAny = {
    val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGlParentAny]
  }
  @scala.inline
  implicit class AnonGlParentAnyOps[Self <: AnonGlParentAny] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glParent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

