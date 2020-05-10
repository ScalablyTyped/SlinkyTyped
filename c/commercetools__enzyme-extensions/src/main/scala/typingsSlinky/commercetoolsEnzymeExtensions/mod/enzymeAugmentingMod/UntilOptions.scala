package typingsSlinky.commercetoolsEnzymeExtensions.mod.enzymeAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntilOptions extends js.Object {
  var maxDepth: Double = js.native
}

object UntilOptions {
  @scala.inline
  def apply(maxDepth: Double): UntilOptions = {
    val __obj = js.Dynamic.literal(maxDepth = maxDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntilOptions]
  }
  @scala.inline
  implicit class UntilOptionsOps[Self <: UntilOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

