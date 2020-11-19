package typingsSlinky.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ShowGeometryInstanceAttribute")
@js.native
class ShowGeometryInstanceAttribute () extends js.Object {
  def this(show: Boolean) = this()
  
  var componentDatatype: ComponentDatatype = js.native
  
  var componentsPerAttribute: Double = js.native
  
  var normalize: Boolean = js.native
  
  var value: js.typedarray.Uint8Array = js.native
}
/* static members */
@JSImport("cesium", "ShowGeometryInstanceAttribute")
@js.native
object ShowGeometryInstanceAttribute extends js.Object {
  
  def toValue(show: Boolean): js.typedarray.Uint8Array = js.native
  def toValue(show: Boolean, result: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
}
