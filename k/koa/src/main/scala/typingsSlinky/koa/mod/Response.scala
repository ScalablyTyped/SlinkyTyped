package typingsSlinky.koa.mod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response extends BaseResponse {
  
  var app: Application[DefaultState, DefaultContext] = js.native
  
  var ctx: Context = js.native
  
  var req: IncomingMessage = js.native
  
  var request: Request = js.native
  
  var res: ServerResponse = js.native
}
