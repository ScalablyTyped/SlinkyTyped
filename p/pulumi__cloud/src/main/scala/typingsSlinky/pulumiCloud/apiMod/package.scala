package typingsSlinky.pulumiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object apiMod {
  
  type HttpEndpoint = typingsSlinky.pulumiCloud.apiMod.API
  
  type RouteHandler = js.Function3[
    /* req */ typingsSlinky.pulumiCloud.apiMod.Request, 
    /* res */ typingsSlinky.pulumiCloud.apiMod.Response, 
    /* next */ js.Function0[scala.Unit], 
    scala.Unit
  ]
}
