package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Once extends js.Object {
  var once: Boolean = js.native
}

object Once {
  @scala.inline
  def apply(once: Boolean): Once = {
    val __obj = js.Dynamic.literal(once = once.asInstanceOf[js.Any])
    __obj.asInstanceOf[Once]
  }
  @scala.inline
  implicit class OnceOps[Self <: Once] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

