package typingsSlinky.reactFns.geoPositionGeoPositionMod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactFns.anon.IsLoading
import typingsSlinky.reactFns.typesMod.SharedRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-fns/dist/GeoPosition/GeoPosition", "GeoPosition")
@js.native
class GeoPosition ()
  extends Component[SharedRenderProps[GeoPositionProps], GeoPositionProps, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MGeoPosition(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MGeoPosition(): Unit = js.native
  
  var geoId: js.Any = js.native
  
  def requestGeo(): Unit = js.native
  
  @JSName("state")
  var state_GeoPosition: IsLoading = js.native
}
