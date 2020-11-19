package typingsSlinky.cesium.mod

import typingsSlinky.cesium.anon.AboveGround
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EllipsoidSurfaceAppearance")
@js.native
class EllipsoidSurfaceAppearance () extends Appearance {
  def this(options: AboveGround) = this()
  
  val aboveGround: Boolean = js.native
  
  val faceForward: Boolean = js.native
  
  val flat: Boolean = js.native
  
  val vertexFormat: VertexFormat = js.native
}
/* static members */
@JSImport("cesium", "EllipsoidSurfaceAppearance")
@js.native
object EllipsoidSurfaceAppearance extends js.Object {
  
  var VERTEX_FORMAT: VertexFormat = js.native
}
