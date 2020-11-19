package typingsSlinky.reactDevUtils

import typingsSlinky.express.mod.Handler
import typingsSlinky.webpackDevServer.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dev-utils/evalSourceMapMiddleware", JSImport.Namespace)
@js.native
object evalSourceMapMiddlewareMod extends js.Object {
  
  /*
    * Middleware responsible for retrieving a generated source
    * Receives a webpack internal url: "webpack-internal:///<module-id>"
    * Returns a generated source: "<source-text><sourceMappingURL><sourceURL>"
    */
  def apply(server: ^): Handler = js.native
}
