package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/LayerType", JSImport.Namespace)
@js.native
object layerTypeMod extends js.Object {
  @js.native
  sealed trait LayerType extends js.Object
  
  @js.native
  object LayerType extends js.Object {
    @js.native
    sealed trait IMAGE extends LayerType
    
    @js.native
    sealed trait TILE extends LayerType
    
    @js.native
    sealed trait VECTOR extends LayerType
    
    @js.native
    sealed trait VECTOR_TILE extends LayerType
    
  }
  
  @js.native
  object default extends js.Object {
    /* "IMAGE" */ val IMAGE: typingsSlinky.ol.layerTypeMod.LayerType.IMAGE with String = js.native
    /* "TILE" */ val TILE: typingsSlinky.ol.layerTypeMod.LayerType.TILE with String = js.native
    /* "VECTOR" */ val VECTOR: typingsSlinky.ol.layerTypeMod.LayerType.VECTOR with String = js.native
    /* "VECTOR_TILE" */ val VECTOR_TILE: typingsSlinky.ol.layerTypeMod.LayerType.VECTOR_TILE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LayerType with String] = js.native
  }
  
}

