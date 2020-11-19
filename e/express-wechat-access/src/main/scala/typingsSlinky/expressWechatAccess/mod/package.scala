package typingsSlinky.expressWechatAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type WeMiddleware = js.Function3[
    /* req */ js.Any, 
    /* res */ org.scalajs.dom.experimental.Response | typingsSlinky.node.httpMod.ServerResponse, 
    /* next */ typingsSlinky.express.mod.NextFunction, 
    js.Any
  ]
}
