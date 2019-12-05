package typingsSlinky.rrc.rrcMod

import typingsSlinky.history.historyMod.LocationDescriptorObject
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.rrc.Anon_Pathname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps extends js.Object {
  var location: LocationDescriptorObject[LocationState] with Anon_Pathname
  var routes: js.Array[RouteConfiguration]
}

object SwitchProps {
  @scala.inline
  def apply(
    location: LocationDescriptorObject[LocationState] with Anon_Pathname,
    routes: js.Array[RouteConfiguration]
  ): SwitchProps = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SwitchProps]
  }
}

