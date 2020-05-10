package typingsSlinky.gatsbyImage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWasCached extends js.Object {
  var wasCached: Boolean = js.native
}

object AnonWasCached {
  @scala.inline
  def apply(wasCached: Boolean): AnonWasCached = {
    val __obj = js.Dynamic.literal(wasCached = wasCached.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWasCached]
  }
  @scala.inline
  implicit class AnonWasCachedOps[Self <: AnonWasCached] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWasCached(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasCached")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

