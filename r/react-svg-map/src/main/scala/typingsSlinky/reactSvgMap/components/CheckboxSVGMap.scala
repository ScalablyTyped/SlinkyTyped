package typingsSlinky.reactSvgMap.components

import typingsSlinky.reactSvgMap.mod.Map
import typingsSlinky.reactSvgMap.mod.OnChangeMapProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CheckboxSVGMap {
  
  @scala.inline
  def apply(map: Map): SharedBuilder_OnChangeMapProps1193081495[typingsSlinky.reactSvgMap.mod.CheckboxSVGMap] = {
    val __props = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    new SharedBuilder_OnChangeMapProps1193081495[typingsSlinky.reactSvgMap.mod.CheckboxSVGMap](js.Array(this.component, __props.asInstanceOf[OnChangeMapProps]))
  }
  
  @JSImport("react-svg-map", "CheckboxSVGMap")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: OnChangeMapProps): SharedBuilder_OnChangeMapProps1193081495[typingsSlinky.reactSvgMap.mod.CheckboxSVGMap] = new SharedBuilder_OnChangeMapProps1193081495[typingsSlinky.reactSvgMap.mod.CheckboxSVGMap](js.Array(this.component, p.asInstanceOf[js.Any]))
}
