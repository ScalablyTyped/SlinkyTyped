package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/source/TileEventType", JSImport.Namespace)
@js.native
object tileEventTypeMod extends js.Object {
  
  @js.native
  sealed trait TileEventType extends js.Object
  @js.native
  object TileEventType extends js.Object {
    
    @js.native
    sealed trait TILELOADEND extends TileEventType
    
    @js.native
    sealed trait TILELOADERROR extends TileEventType
    
    @js.native
    sealed trait TILELOADSTART extends TileEventType
  }
  
  @js.native
  object default extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TileEventType with String] = js.native
    
    /* "tileloadend" */ val TILELOADEND: typingsSlinky.ol.tileEventTypeMod.TileEventType.TILELOADEND with String = js.native
    
    /* "tileloaderror" */ val TILELOADERROR: typingsSlinky.ol.tileEventTypeMod.TileEventType.TILELOADERROR with String = js.native
    
    /* "tileloadstart" */ val TILELOADSTART: typingsSlinky.ol.tileEventTypeMod.TileEventType.TILELOADSTART with String = js.native
  }
}
