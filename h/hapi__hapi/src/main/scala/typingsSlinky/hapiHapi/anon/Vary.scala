package typingsSlinky.hapiHapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vary extends js.Object {
  var vary: Boolean = js.native
  var weak: Boolean = js.native
}

object Vary {
  @scala.inline
  def apply(vary: Boolean, weak: Boolean): Vary = {
    val __obj = js.Dynamic.literal(vary = vary.asInstanceOf[js.Any], weak = weak.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vary]
  }
  @scala.inline
  implicit class VaryOps[Self <: Vary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeak(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weak")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

