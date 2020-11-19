package typingsSlinky.polka

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * A middleware function
    */
  type Middleware[P /* <: typingsSlinky.expressServeStaticCore.mod.Params */, ResBody, ReqBody, ReqQuery] = typingsSlinky.express.mod.RequestHandler[P, ResBody, ReqBody, ReqQuery]
  
  /**
    * Calls the next middleware function in the chain, or throws an error.
    */
  type Next = js.Function1[/* err */ js.UndefOr[java.lang.String | js.Error], scala.Unit]
}
