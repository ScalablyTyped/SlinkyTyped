package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon21 extends js.Object {
  var dismantle: `4` = js.native
}

object Anon21 {
  @scala.inline
  def apply(dismantle: `4`): Anon21 = {
    val __obj = js.Dynamic.literal(dismantle = dismantle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon21]
  }
  @scala.inline
  implicit class Anon21Ops[Self <: Anon21] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDismantle(value: `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismantle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

