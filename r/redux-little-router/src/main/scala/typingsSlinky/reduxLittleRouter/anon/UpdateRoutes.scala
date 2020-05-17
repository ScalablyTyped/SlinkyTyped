package typingsSlinky.reduxLittleRouter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRoutes extends js.Object {
  var updateRoutes: Boolean = js.native
}

object UpdateRoutes {
  @scala.inline
  def apply(updateRoutes: Boolean): UpdateRoutes = {
    val __obj = js.Dynamic.literal(updateRoutes = updateRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoutes]
  }
  @scala.inline
  implicit class UpdateRoutesOps[Self <: UpdateRoutes] (val x: Self) extends AnyVal {
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

