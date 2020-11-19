package typingsSlinky.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "AxisAlignedBoundingBox")
@js.native
class AxisAlignedBoundingBox () extends js.Object {
  def this(minimum: Cartesian3) = this()
  def this(minimum: js.UndefOr[scala.Nothing], maximum: Cartesian3) = this()
  def this(minimum: Cartesian3, maximum: Cartesian3) = this()
  def this(minimum: js.UndefOr[scala.Nothing], maximum: js.UndefOr[scala.Nothing], center: Cartesian3) = this()
  def this(minimum: js.UndefOr[scala.Nothing], maximum: Cartesian3, center: Cartesian3) = this()
  def this(minimum: Cartesian3, maximum: js.UndefOr[scala.Nothing], center: Cartesian3) = this()
  def this(minimum: Cartesian3, maximum: Cartesian3, center: Cartesian3) = this()
  
  var center: Cartesian3 = js.native
  
  def clone(result: AxisAlignedBoundingBox): AxisAlignedBoundingBox = js.native
  
  def equals(): Boolean = js.native
  def equals(right: AxisAlignedBoundingBox): Boolean = js.native
  
  def intersect(plane: Cartesian4): Intersect = js.native
  
  var maximum: Cartesian3 = js.native
  
  var minimum: Cartesian3 = js.native
}
/* static members */
@JSImport("cesium", "AxisAlignedBoundingBox")
@js.native
object AxisAlignedBoundingBox extends js.Object {
  
  def clone(box: AxisAlignedBoundingBox): AxisAlignedBoundingBox = js.native
  def clone(box: AxisAlignedBoundingBox, result: AxisAlignedBoundingBox): AxisAlignedBoundingBox = js.native
  
  def equals(): Boolean = js.native
  def equals(left: js.UndefOr[scala.Nothing], right: AxisAlignedBoundingBox): Boolean = js.native
  def equals(left: AxisAlignedBoundingBox): Boolean = js.native
  def equals(left: AxisAlignedBoundingBox, right: AxisAlignedBoundingBox): Boolean = js.native
  
  def fromPoints(positions: js.Array[Cartesian3]): AxisAlignedBoundingBox = js.native
  def fromPoints(positions: js.Array[Cartesian3], result: AxisAlignedBoundingBox): AxisAlignedBoundingBox = js.native
  
  def intersect(box: AxisAlignedBoundingBox, plane: Cartesian4): Intersect = js.native
}
