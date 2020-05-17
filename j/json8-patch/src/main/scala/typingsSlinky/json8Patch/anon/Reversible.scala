package typingsSlinky.json8Patch.anon

import typingsSlinky.json8Patch.json8PatchBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reversible extends js.Object {
  var reversible: `false` = js.native
}

object Reversible {
  @scala.inline
  def apply(reversible: `false`): Reversible = {
    val __obj = js.Dynamic.literal(reversible = reversible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reversible]
  }
  @scala.inline
  implicit class ReversibleOps[Self <: Reversible] (val x: Self) extends AnyVal {
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

