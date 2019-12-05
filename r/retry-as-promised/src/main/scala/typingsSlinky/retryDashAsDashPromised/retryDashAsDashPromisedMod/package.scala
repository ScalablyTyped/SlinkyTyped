package typingsSlinky.retryDashAsDashPromised

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object retryDashAsDashPromisedMod {
  import typingsSlinky.bluebird.bluebirdMod.Thenable
  import typingsSlinky.retryDashAsDashPromised.Anon_Current

  type MatchOption = String | js.RegExp | js.Error
  type RetryAsPromisedStatic = js.Function2[
    /* callback */ RetryCallback[js.Any], 
    /* options */ Options | Double, 
    typingsSlinky.bluebird.bluebirdMod.^[js.Any]
  ]
  type RetryCallback[T] = js.Function1[/* hasCurrent */ Anon_Current, Thenable[T]]
}
