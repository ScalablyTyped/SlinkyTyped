package typingsSlinky.carbonColors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon100 extends js.Object {
  var `100`: String = js.native
}

object Anon100 {
  @scala.inline
  def apply(`100`: String): Anon100 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("100")(`100`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon100]
  }
  @scala.inline
  implicit class Anon100Ops[Self <: Anon100] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with100(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("100")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

