package typingsSlinky.photoswipe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Prevent extends js.Object {
  var prevent: Boolean = js.native
}

object Prevent {
  @scala.inline
  def apply(prevent: Boolean): Prevent = {
    val __obj = js.Dynamic.literal(prevent = prevent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prevent]
  }
  @scala.inline
  implicit class PreventOps[Self <: Prevent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrevent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

