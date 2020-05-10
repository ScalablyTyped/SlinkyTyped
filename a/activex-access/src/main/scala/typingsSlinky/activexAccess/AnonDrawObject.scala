package typingsSlinky.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDrawObject extends js.Object {
  val drawObject: js.Any = js.native
}

object AnonDrawObject {
  @scala.inline
  def apply(drawObject: js.Any): AnonDrawObject = {
    val __obj = js.Dynamic.literal(drawObject = drawObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDrawObject]
  }
  @scala.inline
  implicit class AnonDrawObjectOps[Self <: AnonDrawObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawObject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

