package typingsSlinky.dndCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shallow extends js.Object {
  var shallow: Boolean = js.native
}

object Shallow {
  @scala.inline
  def apply(shallow: Boolean): Shallow = {
    val __obj = js.Dynamic.literal(shallow = shallow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shallow]
  }
  @scala.inline
  implicit class ShallowOps[Self <: Shallow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShallow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shallow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

