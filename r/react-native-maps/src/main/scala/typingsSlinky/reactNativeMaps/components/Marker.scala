package typingsSlinky.reactNativeMaps.components

import typingsSlinky.reactNativeMaps.mod.AnimatedRegion
import typingsSlinky.reactNativeMaps.mod.LatLng
import typingsSlinky.reactNativeMaps.mod.MarkerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Marker {
  
  @JSImport("react-native-maps", "Marker")
  @js.native
  object component extends js.Object
  
  def withProps(p: MarkerProps): SharedBuilder_MarkerProps278311419[typingsSlinky.reactNativeMaps.mod.Marker] = new SharedBuilder_MarkerProps278311419[typingsSlinky.reactNativeMaps.mod.Marker](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(coordinate: LatLng | AnimatedRegion): SharedBuilder_MarkerProps278311419[typingsSlinky.reactNativeMaps.mod.Marker] = {
    val __props = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any])
    new SharedBuilder_MarkerProps278311419[typingsSlinky.reactNativeMaps.mod.Marker](js.Array(this.component, __props.asInstanceOf[MarkerProps]))
  }
}
