package typingsSlinky.screeps

import typingsSlinky.screeps.screepsStrings.UH2O
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon3 extends js.Object {
  var OH: UH2O = js.native
}

object Anon3 {
  @scala.inline
  def apply(OH: UH2O): Anon3 = {
    val __obj = js.Dynamic.literal(OH = OH.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon3]
  }
  @scala.inline
  implicit class Anon3Ops[Self <: Anon3] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOH(value: UH2O): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OH")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

