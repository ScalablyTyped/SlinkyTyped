package typingsSlinky.httpAuth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BasicChecker = js.Function3[
    /* username */ java.lang.String, 
    /* password */ java.lang.String, 
    /* callback */ js.Function1[/* isAuthorized */ scala.Boolean, scala.Unit], 
    scala.Unit
  ]
  
  type CheckedRequestListener = js.Function2[
    /* req */ typingsSlinky.httpAuth.anon.IncomingMessageuserstring, 
    /* res */ typingsSlinky.node.httpMod.ServerResponse, 
    scala.Unit
  ]
  
  type DigestChecker = js.Function2[
    /* username */ java.lang.String, 
    /* callback */ js.Function1[/* hash */ js.UndefOr[java.lang.String], scala.Unit], 
    scala.Unit
  ]
  
  type Nonce = js.Tuple3[java.lang.String, scala.Double, scala.Double]
  
  type ResultEmitter = js.Function1[
    /* result */ typingsSlinky.httpAuth.mod.BasicResult[scala.Boolean] | typingsSlinky.httpAuth.mod.DigestResult[scala.Boolean] | js.Error, 
    scala.Unit
  ]
}
