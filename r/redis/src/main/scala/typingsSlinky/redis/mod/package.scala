package typingsSlinky.redis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[T] = js.Function2[/* err */ js.Error | scala.Null, /* reply */ T, scala.Unit]
  
  type RetryStrategy = js.Function1[
    /* options */ typingsSlinky.redis.mod.RetryStrategyOptions, 
    scala.Double | js.Error | js.Any
  ]
}
