package typingsSlinky.reactNativeMaps.components

import typingsSlinky.reactNativeMaps.mod.MapViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MapViewAnimated {
  @JSImport("react-native-maps", "MapViewAnimated")
  @js.native
  object component extends js.Object
  
  def withProps(p: MapViewProps): SharedBuilder_MapViewProps_1186437086[typingsSlinky.reactNativeMaps.mod.MapViewAnimated] = new SharedBuilder_MapViewProps_1186437086[typingsSlinky.reactNativeMaps.mod.MapViewAnimated](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MapViewAnimated.type): SharedBuilder_MapViewProps_1186437086[typingsSlinky.reactNativeMaps.mod.MapViewAnimated] = new SharedBuilder_MapViewProps_1186437086[typingsSlinky.reactNativeMaps.mod.MapViewAnimated](js.Array(this.component, js.Dictionary.empty))()
}

