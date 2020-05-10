package typingsSlinky.losslessJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCircularRefs extends js.Object {
  var circularRefs: js.UndefOr[Boolean] = js.native
}

object AnonCircularRefs {
  @scala.inline
  def apply(): AnonCircularRefs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCircularRefs]
  }
  @scala.inline
  implicit class AnonCircularRefsOps[Self <: AnonCircularRefs] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutCircularRefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circularRefs")(js.undefined)
        ret
    }
  }
  
}

