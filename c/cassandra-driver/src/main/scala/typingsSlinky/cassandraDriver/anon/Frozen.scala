package typingsSlinky.cassandraDriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frozen extends js.Object {
  var frozen: Boolean = js.native
  var reversed: Boolean = js.native
}

object Frozen {
  @scala.inline
  def apply(frozen: Boolean, reversed: Boolean): Frozen = {
    val __obj = js.Dynamic.literal(frozen = frozen.asInstanceOf[js.Any], reversed = reversed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frozen]
  }
  @scala.inline
  implicit class FrozenOps[Self <: Frozen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrozen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReversed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

