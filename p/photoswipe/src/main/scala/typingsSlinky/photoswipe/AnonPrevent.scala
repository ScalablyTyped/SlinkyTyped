package typingsSlinky.photoswipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPrevent extends js.Object {
  var prevent: Boolean = js.native
}

object AnonPrevent {
  @scala.inline
  def apply(prevent: Boolean): AnonPrevent = {
    val __obj = js.Dynamic.literal(prevent = prevent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrevent]
  }
  @scala.inline
  implicit class AnonPreventOps[Self <: AnonPrevent] (val x: Self) extends AnyVal {
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

