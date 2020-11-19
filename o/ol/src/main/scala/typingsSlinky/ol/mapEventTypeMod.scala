package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/MapEventType", JSImport.Namespace)
@js.native
object mapEventTypeMod extends js.Object {
  
  @js.native
  sealed trait MapEventType extends js.Object
  @js.native
  object MapEventType extends js.Object {
    
    @js.native
    sealed trait MOVEEND extends MapEventType
    
    @js.native
    sealed trait MOVESTART extends MapEventType
    
    @js.native
    sealed trait POSTRENDER extends MapEventType
  }
  
  @js.native
  object default extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MapEventType with String] = js.native
    
    /* "moveend" */ val MOVEEND: typingsSlinky.ol.mapEventTypeMod.MapEventType.MOVEEND with String = js.native
    
    /* "movestart" */ val MOVESTART: typingsSlinky.ol.mapEventTypeMod.MapEventType.MOVESTART with String = js.native
    
    /* "postrender" */ val POSTRENDER: typingsSlinky.ol.mapEventTypeMod.MapEventType.POSTRENDER with String = js.native
  }
}
