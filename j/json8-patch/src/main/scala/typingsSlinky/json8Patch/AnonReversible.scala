package typingsSlinky.json8Patch

import typingsSlinky.json8Patch.json8PatchBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReversible extends js.Object {
  var reversible: `false` = js.native
}

object AnonReversible {
  @scala.inline
  def apply(reversible: `false`): AnonReversible = {
    val __obj = js.Dynamic.literal(reversible = reversible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReversible]
  }
  @scala.inline
  implicit class AnonReversibleOps[Self <: AnonReversible] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReversible(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

