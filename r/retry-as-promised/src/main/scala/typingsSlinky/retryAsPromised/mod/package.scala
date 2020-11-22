package typingsSlinky.retryAsPromised

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type MatchOption = java.lang.String | js.RegExp | js.Error
  
  type RetryAsPromisedStatic = js.Function2[
    /* callback */ typingsSlinky.retryAsPromised.mod.RetryCallback[js.Any], 
    /* options */ typingsSlinky.retryAsPromised.mod.Options | scala.Double, 
    typingsSlinky.bluebird.mod.^[js.Any]
  ]
  
  type RetryCallback[T] = js.Function1[
    /* hasCurrent */ typingsSlinky.retryAsPromised.anon.Current, 
    typingsSlinky.bluebird.mod.Thenable[T]
  ]
}
