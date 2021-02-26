package typingsSlinky.forgeDi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modeMod {
  
  @JSImport("forge-di/dist/framework/Mode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Mode with String] = js.native
    
    /* "All" */ val All: typingsSlinky.forgeDi.modeMod.Mode.All with String = js.native
    
    /* "AtLeastOne" */ val AtLeastOne: typingsSlinky.forgeDi.modeMod.Mode.AtLeastOne with String = js.native
    
    /* "AtMostOne" */ val AtMostOne: typingsSlinky.forgeDi.modeMod.Mode.AtMostOne with String = js.native
  }
  
  @js.native
  sealed trait Mode extends StObject
  @JSImport("forge-di/dist/framework/Mode", "Mode")
  @js.native
  object Mode extends StObject {
    
    @js.native
    sealed trait All extends Mode
    
    @js.native
    sealed trait AtLeastOne extends Mode
    
    @js.native
    sealed trait AtMostOne extends Mode
  }
}
