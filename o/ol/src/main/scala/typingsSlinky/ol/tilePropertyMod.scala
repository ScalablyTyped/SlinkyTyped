package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/layer/TileProperty", JSImport.Namespace)
@js.native
object tilePropertyMod extends js.Object {
  
  @js.native
  sealed trait TileProperty extends js.Object
  @js.native
  object TileProperty extends js.Object {
    
    @js.native
    sealed trait PRELOAD extends TileProperty
    
    @js.native
    sealed trait USE_INTERIM_TILES_ON_ERROR extends TileProperty
  }
  
  @js.native
  object default extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TileProperty with String] = js.native
    
    /* "preload" */ val PRELOAD: typingsSlinky.ol.tilePropertyMod.TileProperty.PRELOAD with String = js.native
    
    /* "useInterimTilesOnError" */ val USE_INTERIM_TILES_ON_ERROR: typingsSlinky.ol.tilePropertyMod.TileProperty.USE_INTERIM_TILES_ON_ERROR with String = js.native
  }
}
