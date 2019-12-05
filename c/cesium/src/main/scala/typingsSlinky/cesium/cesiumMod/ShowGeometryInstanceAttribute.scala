package typingsSlinky.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ShowGeometryInstanceAttribute")
@js.native
class ShowGeometryInstanceAttribute () extends js.Object {
  def this(show: Boolean) = this()
  var componentDatatype: ComponentDatatype = js.native
  var componentsPerAttribute: Double = js.native
  var normalize: Boolean = js.native
  var value: scala.scalajs.js.typedarray.Uint8Array = js.native
}

/* static members */
@JSImport("cesium", "ShowGeometryInstanceAttribute")
@js.native
object ShowGeometryInstanceAttribute extends js.Object {
  def toValue(show: Boolean): scala.scalajs.js.typedarray.Uint8Array = js.native
  def toValue(show: Boolean, result: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
}

