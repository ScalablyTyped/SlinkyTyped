package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon28 extends js.Object {
  var fatigue: `3` = js.native
}

object Anon28 {
  @scala.inline
  def apply(fatigue: `3`): Anon28 = {
    val __obj = js.Dynamic.literal(fatigue = fatigue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon28]
  }
  @scala.inline
  implicit class Anon28Ops[Self <: Anon28] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFatigue(value: `3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatigue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

