package typingsSlinky.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateMod {
  
  @JSImport("ol/source/State", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[State with String] = js.native
    
    /* "error" */ val ERROR: typingsSlinky.ol.stateMod.State.ERROR with String = js.native
    
    /* "loading" */ val LOADING: typingsSlinky.ol.stateMod.State.LOADING with String = js.native
    
    /* "ready" */ val READY: typingsSlinky.ol.stateMod.State.READY with String = js.native
    
    /* "undefined" */ val UNDEFINED: typingsSlinky.ol.stateMod.State.UNDEFINED with String = js.native
  }
  
  @js.native
  sealed trait State extends StObject
  @JSImport("ol/source/State", "State")
  @js.native
  object State extends StObject {
    
    @js.native
    sealed trait ERROR extends State
    
    @js.native
    sealed trait LOADING extends State
    
    @js.native
    sealed trait READY extends State
    
    @js.native
    sealed trait UNDEFINED extends State
  }
}
