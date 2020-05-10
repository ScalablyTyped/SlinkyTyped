package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon29 extends js.Object {
  var fatigue: `4` = js.native
}

object Anon29 {
  @scala.inline
  def apply(fatigue: `4`): Anon29 = {
    val __obj = js.Dynamic.literal(fatigue = fatigue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon29]
  }
  @scala.inline
  implicit class Anon29Ops[Self <: Anon29] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFatigue(value: `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatigue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

