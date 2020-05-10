package typingsSlinky.knockoutDeferredUpdates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Computed
@js.native
trait KnockoutComputedStatic extends js.Object {
  var deferUpdates: Boolean = js.native
}

object KnockoutComputedStatic {
  @scala.inline
  def apply(deferUpdates: Boolean): KnockoutComputedStatic = {
    val __obj = js.Dynamic.literal(deferUpdates = deferUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutComputedStatic]
  }
  @scala.inline
  implicit class KnockoutComputedStaticOps[Self <: KnockoutComputedStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeferUpdates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferUpdates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

