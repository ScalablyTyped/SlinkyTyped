package typingsSlinky.reduxLittleRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationOptions extends js.Object {
  var persistQuery: js.UndefOr[Boolean] = js.native
  var updateRoutes: js.UndefOr[Boolean] = js.native
}

object LocationOptions {
  @scala.inline
  def apply(): LocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationOptions]
  }
  @scala.inline
  implicit class LocationOptionsOps[Self <: LocationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPersistQuery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateRoutes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRoutes")(js.undefined)
        ret
    }
  }
  
}

