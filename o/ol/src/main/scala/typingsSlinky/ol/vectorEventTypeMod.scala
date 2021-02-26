package typingsSlinky.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorEventTypeMod {
  
  @JSImport("ol/source/VectorEventType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[VectorEventType with String] = js.native
    
    /* "addfeature" */ val ADDFEATURE: typingsSlinky.ol.vectorEventTypeMod.VectorEventType.ADDFEATURE with String = js.native
    
    /* "changefeature" */ val CHANGEFEATURE: typingsSlinky.ol.vectorEventTypeMod.VectorEventType.CHANGEFEATURE with String = js.native
    
    /* "clear" */ val CLEAR: typingsSlinky.ol.vectorEventTypeMod.VectorEventType.CLEAR with String = js.native
    
    /* "removefeature" */ val REMOVEFEATURE: typingsSlinky.ol.vectorEventTypeMod.VectorEventType.REMOVEFEATURE with String = js.native
  }
  
  @js.native
  sealed trait VectorEventType extends StObject
  @JSImport("ol/source/VectorEventType", "VectorEventType")
  @js.native
  object VectorEventType extends StObject {
    
    @js.native
    sealed trait ADDFEATURE extends VectorEventType
    
    @js.native
    sealed trait CHANGEFEATURE extends VectorEventType
    
    @js.native
    sealed trait CLEAR extends VectorEventType
    
    @js.native
    sealed trait REMOVEFEATURE extends VectorEventType
  }
}
