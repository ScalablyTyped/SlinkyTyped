package typingsSlinky.documentdbSession

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressSession.mod.SessionData
import typingsSlinky.expressSession.mod.SessionOptions
import typingsSlinky.expressSession.mod.global.Express.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Call extends js.Object {
    
    def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def apply(options: SessionOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    var Cookie: Instantiable0[typingsSlinky.expressSession.mod.Cookie] = js.native
    
    /**
      * **Warning:** the default server-side session storage, `MemoryStore`, is purposely not designed for a production environment.
      * It will leak memory under most conditions, does not scale past a single process, and is only meant for debugging and developing.
      */
    var MemoryStore: Instantiable0[typingsSlinky.expressSession.mod.MemoryStore] = js.native
    
    var Session: Instantiable2[
        /* request */ Request, 
        /* data */ SessionData, 
        typingsSlinky.expressSession.mod.Session
      ] = js.native
    
    var Store: Instantiable0[typingsSlinky.expressSession.mod.Store] = js.native
  }
}
