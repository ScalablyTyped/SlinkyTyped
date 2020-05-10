package typingsSlinky.namedRoutes.mod.expressServeStaticCoreAugmentingMod

import typingsSlinky.namedRoutes.mod.NamedRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application extends js.Object {
  var namedRoutes: NamedRouter = js.native
}

object Application {
  @scala.inline
  def apply(namedRoutes: NamedRouter): Application = {
    val __obj = js.Dynamic.literal(namedRoutes = namedRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Application]
  }
  @scala.inline
  implicit class ApplicationOps[Self <: Application] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamedRoutes(value: NamedRouter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedRoutes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

