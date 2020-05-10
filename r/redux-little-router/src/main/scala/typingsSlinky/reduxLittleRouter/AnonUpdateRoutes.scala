package typingsSlinky.reduxLittleRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUpdateRoutes extends js.Object {
  var updateRoutes: Boolean = js.native
}

object AnonUpdateRoutes {
  @scala.inline
  def apply(updateRoutes: Boolean): AnonUpdateRoutes = {
    val __obj = js.Dynamic.literal(updateRoutes = updateRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUpdateRoutes]
  }
  @scala.inline
  implicit class AnonUpdateRoutesOps[Self <: AnonUpdateRoutes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdateRoutes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRoutes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

