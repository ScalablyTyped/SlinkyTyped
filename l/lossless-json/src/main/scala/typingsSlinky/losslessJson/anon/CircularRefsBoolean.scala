package typingsSlinky.losslessJson.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircularRefsBoolean extends js.Object {
  var circularRefs: Boolean = js.native
}

object CircularRefsBoolean {
  @scala.inline
  def apply(circularRefs: Boolean): CircularRefsBoolean = {
    val __obj = js.Dynamic.literal(circularRefs = circularRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircularRefsBoolean]
  }
  @scala.inline
  implicit class CircularRefsBooleanOps[Self <: CircularRefsBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCircularRefs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circularRefs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

