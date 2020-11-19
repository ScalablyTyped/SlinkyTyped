package typingsSlinky.cesium.mod

import typingsSlinky.cesium.anon.OnlySunLighting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Moon")
@js.native
class Moon () extends js.Object {
  def this(options: OnlySunLighting) = this()
  
  def destroy(): Unit = js.native
  
  var ellipsoid: Ellipsoid = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var onlySunLighting: Boolean = js.native
  
  var show: Boolean = js.native
  
  var textureUrl: String = js.native
}
