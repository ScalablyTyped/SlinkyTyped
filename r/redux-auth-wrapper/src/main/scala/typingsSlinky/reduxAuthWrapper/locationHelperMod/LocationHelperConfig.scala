package typingsSlinky.reduxAuthWrapper.locationHelperMod

import typingsSlinky.history.mod.LocationDescriptorObject
import typingsSlinky.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationHelperConfig[Props] extends js.Object {
  var locationSelector: js.UndefOr[js.Function1[/* props */ Props, LocationDescriptorObject[LocationState]]] = js.native
  var redirectQueryParamName: js.UndefOr[String] = js.native
}

object LocationHelperConfig {
  @scala.inline
  def apply[Props](): LocationHelperConfig[Props] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationHelperConfig[Props]]
  }
  @scala.inline
  implicit class LocationHelperConfigOps[Self[props] <: LocationHelperConfig[props], Props] (val x: Self[Props]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Props] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Props]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Props] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Props] with Other]
    @scala.inline
    def withLocationSelector(value: /* props */ Props => LocationDescriptorObject[LocationState]): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationSelector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLocationSelector: Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectQueryParamName(value: String): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectQueryParamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectQueryParamName: Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectQueryParamName")(js.undefined)
        ret
    }
  }
  
}

