package typingsSlinky.jsonwebtokenPromisified

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Secret = java.lang.String | typingsSlinky.node.Buffer | typingsSlinky.jsonwebtokenPromisified.anon.Key
  
  type SignCallback = js.Function2[/* err */ js.Error, /* encoded */ java.lang.String, scala.Unit]
  
  type VerifyCallback = js.Function2[
    /* err */ typingsSlinky.jsonwebtokenPromisified.mod.JsonWebTokenError | typingsSlinky.jsonwebtokenPromisified.mod.NotBeforeError | typingsSlinky.jsonwebtokenPromisified.mod.TokenExpiredError, 
    /* decoded */ js.Object | java.lang.String, 
    scala.Unit
  ]
}
