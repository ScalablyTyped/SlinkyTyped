package typingsSlinky.losslessJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCircularRefsBoolean extends js.Object {
  var circularRefs: Boolean = js.native
}

object AnonCircularRefsBoolean {
  @scala.inline
  def apply(circularRefs: Boolean): AnonCircularRefsBoolean = {
    val __obj = js.Dynamic.literal(circularRefs = circularRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCircularRefsBoolean]
  }
  @scala.inline
  implicit class AnonCircularRefsBooleanOps[Self <: AnonCircularRefsBoolean] (val x: Self) extends AnyVal {
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

