package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/layer/VectorTileRenderType", JSImport.Namespace)
@js.native
object vectorTileRenderTypeMod extends js.Object {
  
  @js.native
  sealed trait VectorTileRenderType extends js.Object
  @js.native
  object VectorTileRenderType extends js.Object {
    
    @js.native
    sealed trait HYBRID extends VectorTileRenderType
    
    @js.native
    sealed trait IMAGE extends VectorTileRenderType
    
    @js.native
    sealed trait VECTOR extends VectorTileRenderType
  }
  
  @js.native
  object default extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[VectorTileRenderType with String] = js.native
    
    /* "hybrid" */ val HYBRID: typingsSlinky.ol.vectorTileRenderTypeMod.VectorTileRenderType.HYBRID with String = js.native
    
    /* "image" */ val IMAGE: typingsSlinky.ol.vectorTileRenderTypeMod.VectorTileRenderType.IMAGE with String = js.native
    
    /* "vector" */ val VECTOR: typingsSlinky.ol.vectorTileRenderTypeMod.VectorTileRenderType.VECTOR with String = js.native
  }
}
