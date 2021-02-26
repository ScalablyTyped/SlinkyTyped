package typingsSlinky.grumblerScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @js.native
  sealed trait ENV extends StObject
  @JSImport("grumbler-scripts/config/constants", "ENV")
  @js.native
  object ENV extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ENV with String] = js.native
    
    @js.native
    sealed trait DEMO extends ENV
    /* "demo" */ val DEMO: typingsSlinky.grumblerScripts.constantsMod.ENV.DEMO with String = js.native
    
    @js.native
    sealed trait LOCAL extends ENV
    /* "local" */ val LOCAL: typingsSlinky.grumblerScripts.constantsMod.ENV.LOCAL with String = js.native
    
    @js.native
    sealed trait PRODUCTION extends ENV
    /* "production" */ val PRODUCTION: typingsSlinky.grumblerScripts.constantsMod.ENV.PRODUCTION with String = js.native
    
    @js.native
    sealed trait SANDBOX extends ENV
    /* "sandbox" */ val SANDBOX: typingsSlinky.grumblerScripts.constantsMod.ENV.SANDBOX with String = js.native
    
    @js.native
    sealed trait STAGE extends ENV
    /* "stage" */ val STAGE: typingsSlinky.grumblerScripts.constantsMod.ENV.STAGE with String = js.native
    
    @js.native
    sealed trait TEST extends ENV
    /* "test" */ val TEST: typingsSlinky.grumblerScripts.constantsMod.ENV.TEST with String = js.native
  }
}
