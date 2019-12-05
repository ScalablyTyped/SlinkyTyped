package typingsSlinky.cesium.cesiumMod

import typingsSlinky.cesium.Anon_ClosedFaceForward
import typingsSlinky.cesium.cesiumMod.MaterialAppearance.MaterialSupport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "MaterialAppearance")
@js.native
class MaterialAppearance () extends Appearance {
  def this(options: Anon_ClosedFaceForward) = this()
  val faceForward: Boolean = js.native
  val flat: Boolean = js.native
  val materialSupport: MaterialSupport = js.native
  val vertexFormat: VertexFormat = js.native
}

@JSImport("cesium", "MaterialAppearance")
@js.native
object MaterialAppearance extends js.Object {
  @js.native
  sealed trait MaterialSupport extends js.Object
  
  @js.native
  object MaterialSupport extends js.Object {
    @js.native
    sealed trait ALL extends MaterialSupport
    
    @js.native
    sealed trait BASIC extends MaterialSupport
    
    @js.native
    sealed trait TEXTURED extends MaterialSupport
    
    /* 2 */ val ALL: typingsSlinky.cesium.cesiumMod.MaterialAppearance.MaterialSupport.ALL with Double = js.native
    /* 0 */ val BASIC: typingsSlinky.cesium.cesiumMod.MaterialAppearance.MaterialSupport.BASIC with Double = js.native
    /* 1 */ val TEXTURED: typingsSlinky.cesium.cesiumMod.MaterialAppearance.MaterialSupport.TEXTURED with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MaterialSupport with Double] = js.native
  }
  
}

