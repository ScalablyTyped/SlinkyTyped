package typingsSlinky.doctrine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMidstream extends js.Object {
  var midstream: Boolean = js.native
}

object AnonMidstream {
  @scala.inline
  def apply(midstream: Boolean): AnonMidstream = {
    val __obj = js.Dynamic.literal(midstream = midstream.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMidstream]
  }
  @scala.inline
  implicit class AnonMidstreamOps[Self <: AnonMidstream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMidstream(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midstream")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

