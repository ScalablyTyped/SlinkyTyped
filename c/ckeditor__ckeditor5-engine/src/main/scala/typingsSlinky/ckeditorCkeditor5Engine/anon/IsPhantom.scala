package typingsSlinky.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsPhantom extends js.Object {
  var isPhantom: Boolean = js.native
}

object IsPhantom {
  @scala.inline
  def apply(isPhantom: Boolean): IsPhantom = {
    val __obj = js.Dynamic.literal(isPhantom = isPhantom.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPhantom]
  }
  @scala.inline
  implicit class IsPhantomOps[Self <: IsPhantom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsPhantom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPhantom")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

