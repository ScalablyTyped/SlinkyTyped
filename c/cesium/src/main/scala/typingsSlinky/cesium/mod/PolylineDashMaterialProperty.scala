package typingsSlinky.cesium.mod

import typingsSlinky.cesium.anon.DashLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PolylineDashMaterialProperty")
@js.native
class PolylineDashMaterialProperty () extends MaterialProperty {
  def this(options: DashLength) = this()
  
  var color: Color = js.native
  
  var dashLength: Property = js.native
  
  var dashPattern: Property = js.native
  
  var gapColor: Color = js.native
}
