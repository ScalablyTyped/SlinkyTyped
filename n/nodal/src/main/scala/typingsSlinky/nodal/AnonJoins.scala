package typingsSlinky.nodal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonJoins extends js.Object {
  var structure: js.Any = js.native
}

object AnonJoins {
  @scala.inline
  def apply(structure: js.Any): AnonJoins = {
    val __obj = js.Dynamic.literal(structure = structure.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonJoins]
  }
  @scala.inline
  implicit class AnonJoinsOps[Self <: AnonJoins] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStructure(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structure")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

