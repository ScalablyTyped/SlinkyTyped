package typingsSlinky.bsLogger

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bs-logger/dist/logger/context", JSImport.Namespace)
@js.native
object contextMod extends js.Object {
  
  @js.native
  trait LogContext
    extends /* key */ StringDictionary[js.Any]
  
  @js.native
  sealed trait LogContexts extends js.Object
  @js.native
  object LogContexts extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LogContexts with String] = js.native
    
    @js.native
    sealed trait _package extends LogContexts
    /* "package" */ @js.native
    object _package extends TopLevel[_package with String]
    
    @js.native
    sealed trait application extends LogContexts
    /* "application" */ @js.native
    object application extends TopLevel[application with String]
    
    @js.native
    sealed trait hostname extends LogContexts
    /* "hostname" */ @js.native
    object hostname extends TopLevel[hostname with String]
    
    @js.native
    sealed trait logLevel extends LogContexts
    /* "logLevel" */ @js.native
    object logLevel extends TopLevel[logLevel with String]
    
    @js.native
    sealed trait namespace extends LogContexts
    /* "namespace" */ @js.native
    object namespace extends TopLevel[namespace with String]
  }
}
