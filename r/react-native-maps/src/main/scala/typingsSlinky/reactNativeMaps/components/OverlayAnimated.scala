package typingsSlinky.reactNativeMaps.components

import typingsSlinky.reactNativeMaps.mod.Coordinate
import typingsSlinky.reactNativeMaps.mod.MapOverlayProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OverlayAnimated {
  
  @scala.inline
  def apply(bounds: js.Tuple2[Coordinate, Coordinate]): SharedBuilder_MapOverlayProps_1437643023[typingsSlinky.reactNativeMaps.mod.OverlayAnimated] = {
    val __props = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any])
    new SharedBuilder_MapOverlayProps_1437643023[typingsSlinky.reactNativeMaps.mod.OverlayAnimated](js.Array(this.component, __props.asInstanceOf[MapOverlayProps]))
  }
  
  @JSImport("react-native-maps", "OverlayAnimated")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MapOverlayProps): SharedBuilder_MapOverlayProps_1437643023[typingsSlinky.reactNativeMaps.mod.OverlayAnimated] = new SharedBuilder_MapOverlayProps_1437643023[typingsSlinky.reactNativeMaps.mod.OverlayAnimated](js.Array(this.component, p.asInstanceOf[js.Any]))
}
