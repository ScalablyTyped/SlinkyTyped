package typingsSlinky.authmosphere

import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object precedenceMod {
  
  /**
    * Must return a promise that return true or false.
    * If the result is true the scope checking will be skipped and next is called
    */
  type PrecedenceFunction = js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ NextFunction, 
    js.Promise[Boolean]
  ]
  
  @js.native
  trait PrecedenceOptions extends StObject {
    
    def precedenceFunction(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_], next: NextFunction): js.Promise[Boolean] = js.native
    @JSName("precedenceFunction")
    var precedenceFunction_Original: PrecedenceFunction = js.native
  }
}
