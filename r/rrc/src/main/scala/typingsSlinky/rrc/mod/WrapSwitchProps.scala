package typingsSlinky.rrc.mod

import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouter.mod.`match`
import typingsSlinky.rrc.anon.LocationDescriptorObjectL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapSwitchProps[Params] extends SwitchProps {
  var getKey: js.UndefOr[GetKeyFunction[Params]] = js.undefined
}

object WrapSwitchProps {
  @scala.inline
  def apply[Params](
    location: LocationDescriptorObjectL,
    routes: js.Array[RouteConfiguration],
    getKey: (/* match */ `match`[Params], /* route */ RouteConfiguration, /* location */ Location[LocationState]) => String = null
  ): WrapSwitchProps[Params] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    if (getKey != null) __obj.updateDynamic("getKey")(js.Any.fromFunction3(getKey))
    __obj.asInstanceOf[WrapSwitchProps[Params]]
  }
}

