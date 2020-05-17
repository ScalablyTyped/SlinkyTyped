package typingsSlinky.carbonIconHelpers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait D extends js.Object {
  var d: String = js.native
}

object D {
  @scala.inline
  def apply(d: String): D = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any])
    __obj.asInstanceOf[D]
  }
  @scala.inline
  implicit class DOps[Self <: D] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withD(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

