package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/source/VectorEventType", JSImport.Namespace)
@js.native
object vectorEventTypeMod extends js.Object {
  
  @js.native
  sealed trait VectorEventType extends js.Object
  @js.native
  object VectorEventType extends js.Object {
    
    @js.native
    sealed trait ADDFEATURE extends VectorEventType
    
    @js.native
    sealed trait CHANGEFEATURE extends VectorEventType
    
    @js.native
    sealed trait CLEAR extends VectorEventType
    
    @js.native
    sealed trait REMOVEFEATURE extends VectorEventType
  }
  
  @js.native
  object default extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[VectorEventType with String] = js.native
    
    /* "addfeature" */ val ADDFEATURE: typingsSlinky.ol.vectorEventTypeMod.VectorEventType.ADDFEATURE with String = js.native
    
    /* "changefeature" */ val CHANGEFEATURE: typingsSlinky.ol.vectorEventTypeMod.VectorEventType.CHANGEFEATURE with String = js.native
    
    /* "clear" */ val CLEAR: typingsSlinky.ol.vectorEventTypeMod.VectorEventType.CLEAR with String = js.native
    
    /* "removefeature" */ val REMOVEFEATURE: typingsSlinky.ol.vectorEventTypeMod.VectorEventType.REMOVEFEATURE with String = js.native
  }
}
