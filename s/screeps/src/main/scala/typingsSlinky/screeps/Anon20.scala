package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon20 extends js.Object {
  var dismantle: `3` = js.native
}

object Anon20 {
  @scala.inline
  def apply(dismantle: `3`): Anon20 = {
    val __obj = js.Dynamic.literal(dismantle = dismantle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon20]
  }
  @scala.inline
  implicit class Anon20Ops[Self <: Anon20] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDismantle(value: `3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismantle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

