package typingsSlinky.cesium.mod

import typingsSlinky.cesium.anon.DebugShowBoundingVolumeModelMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PolylineCollection")
@js.native
class PolylineCollection () extends js.Object {
  def this(options: DebugShowBoundingVolumeModelMatrix) = this()
  
  def add(): Polyline = js.native
  def add(polyline: js.Any): Polyline = js.native
  
  def contains(polyline: Polyline): Boolean = js.native
  
  var debugShowBoundingVolume: Boolean = js.native
  
  def destroy(): Unit = js.native
  
  def get(index: Double): Polyline = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var length: Double = js.native
  
  var modelMatrix: Matrix4 = js.native
  
  def remove(polyline: Polyline): Boolean = js.native
  
  def removeAll(): Unit = js.native
}
