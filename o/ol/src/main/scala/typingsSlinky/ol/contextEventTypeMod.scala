package typingsSlinky.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextEventTypeMod {
  
  @JSImport("ol/webgl/ContextEventType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ContextEventType with String] = js.native
    
    /* "webglcontextlost" */ val LOST: typingsSlinky.ol.contextEventTypeMod.ContextEventType.LOST with String = js.native
    
    /* "webglcontextrestored" */ val RESTORED: typingsSlinky.ol.contextEventTypeMod.ContextEventType.RESTORED with String = js.native
  }
  
  @js.native
  sealed trait ContextEventType extends StObject
  @JSImport("ol/webgl/ContextEventType", "ContextEventType")
  @js.native
  object ContextEventType extends StObject {
    
    @js.native
    sealed trait LOST extends ContextEventType
    
    @js.native
    sealed trait RESTORED extends ContextEventType
  }
}
