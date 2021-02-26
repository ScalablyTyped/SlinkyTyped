package typingsSlinky.reactNativeMaps.components

import typingsSlinky.reactNativeMaps.mod.AnimatedRegion
import typingsSlinky.reactNativeMaps.mod.LatLng
import typingsSlinky.reactNativeMaps.mod.MarkerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MarkerAnimated {
  
  @scala.inline
  def apply(coordinate: LatLng | AnimatedRegion): SharedBuilder_MarkerProps278311419[typingsSlinky.reactNativeMaps.mod.MarkerAnimated] = {
    val __props = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any])
    new SharedBuilder_MarkerProps278311419[typingsSlinky.reactNativeMaps.mod.MarkerAnimated](js.Array(this.component, __props.asInstanceOf[MarkerProps]))
  }
  
  @JSImport("react-native-maps", "MarkerAnimated")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MarkerProps): SharedBuilder_MarkerProps278311419[typingsSlinky.reactNativeMaps.mod.MarkerAnimated] = new SharedBuilder_MarkerProps278311419[typingsSlinky.reactNativeMaps.mod.MarkerAnimated](js.Array(this.component, p.asInstanceOf[js.Any]))
}
