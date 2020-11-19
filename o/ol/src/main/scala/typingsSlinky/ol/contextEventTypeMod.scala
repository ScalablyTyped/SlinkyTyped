package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/webgl/ContextEventType", JSImport.Namespace)
@js.native
object contextEventTypeMod extends js.Object {
  
  @js.native
  sealed trait ContextEventType extends js.Object
  @js.native
  object ContextEventType extends js.Object {
    
    @js.native
    sealed trait LOST extends ContextEventType
    
    @js.native
    sealed trait RESTORED extends ContextEventType
  }
  
  @js.native
  object default extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ContextEventType with String] = js.native
    
    /* "webglcontextlost" */ val LOST: typingsSlinky.ol.contextEventTypeMod.ContextEventType.LOST with String = js.native
    
    /* "webglcontextrestored" */ val RESTORED: typingsSlinky.ol.contextEventTypeMod.ContextEventType.RESTORED with String = js.native
  }
}
