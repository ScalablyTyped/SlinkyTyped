package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon19 extends js.Object {
  var harvest: `7` = js.native
}

object Anon19 {
  @scala.inline
  def apply(harvest: `7`): Anon19 = {
    val __obj = js.Dynamic.literal(harvest = harvest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon19]
  }
  @scala.inline
  implicit class Anon19Ops[Self <: Anon19] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHarvest(value: `7`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("harvest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

