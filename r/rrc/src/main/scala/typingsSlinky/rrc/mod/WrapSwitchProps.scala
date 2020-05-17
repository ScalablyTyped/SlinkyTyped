package typingsSlinky.rrc.mod

import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouter.mod.`match`
import typingsSlinky.rrc.anon.LocationDescriptorObjectL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapSwitchProps[Params] extends SwitchProps {
  var getKey: js.UndefOr[GetKeyFunction[Params]] = js.native
}

object WrapSwitchProps {
  @scala.inline
  def apply[Params](location: LocationDescriptorObjectL, routes: js.Array[RouteConfiguration]): WrapSwitchProps[Params] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapSwitchProps[Params]]
  }
  @scala.inline
  implicit class WrapSwitchPropsOps[Self[params] <: WrapSwitchProps[params], Params] (val x: Self[Params]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Params] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Params]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Params] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Params] with Other]
    @scala.inline
    def withGetKey(
      value: (/* match */ `match`[Params], /* route */ RouteConfiguration, /* location */ Location[LocationState]) => String
    ): Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKey")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetKey: Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKey")(js.undefined)
        ret
    }
  }
  
}

