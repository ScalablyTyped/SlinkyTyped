package typingsSlinky.cesium.mod

import typingsSlinky.cesium.anon.OutlineWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolylineOutlineMaterialProperty")
@js.native
class PolylineOutlineMaterialProperty () extends MaterialProperty {
  def this(options: OutlineWidth) = this()
  var color: Color = js.native
  var outlineColor: Color = js.native
  var outlineWidth: Property = js.native
}

