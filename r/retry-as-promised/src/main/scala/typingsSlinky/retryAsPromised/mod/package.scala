package typingsSlinky.retryAsPromised

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
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
