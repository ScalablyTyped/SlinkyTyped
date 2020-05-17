package typingsSlinky.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawObject extends js.Object {
  val drawObject: js.Any = js.native
}

object DrawObject {
  @scala.inline
  def apply(drawObject: js.Any): DrawObject = {
    val __obj = js.Dynamic.literal(drawObject = drawObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawObject]
  }
  @scala.inline
  implicit class DrawObjectOps[Self <: DrawObject] (val x: Self) extends AnyVal {
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

