package typingsSlinky.asyncRetry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type RetryFunction[A] = js.Function2[
    /* bail */ js.Function1[/* e */ js.Error, scala.Unit], 
    /* attempt */ scala.Double, 
    A | js.Promise[A]
  ]
}
