package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon18 extends js.Object {
  var harvest: `5` = js.native
}

object Anon18 {
  @scala.inline
  def apply(harvest: `5`): Anon18 = {
    val __obj = js.Dynamic.literal(harvest = harvest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon18]
  }
  @scala.inline
  implicit class Anon18Ops[Self <: Anon18] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHarvest(value: `5`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("harvest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

