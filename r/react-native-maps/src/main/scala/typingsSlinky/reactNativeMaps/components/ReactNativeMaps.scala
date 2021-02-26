package typingsSlinky.reactNativeMaps.components

import typingsSlinky.reactNativeMaps.mod.MapViewProps
import typingsSlinky.reactNativeMaps.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeMaps {
  
  @JSImport("react-native-maps", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactNativeMaps.type): SharedBuilder_MapViewProps_1186437086[default] = new SharedBuilder_MapViewProps_1186437086[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MapViewProps): SharedBuilder_MapViewProps_1186437086[default] = new SharedBuilder_MapViewProps_1186437086[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
