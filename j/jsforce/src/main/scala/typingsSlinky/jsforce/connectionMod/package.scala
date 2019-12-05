package typingsSlinky.jsforce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object connectionMod {
  import typingsSlinky.jsforce.jsforceStrings.refresh

  type Callback[T] = js.Function2[/* err */ js.Error | Null, /* result */ T, Unit]
  type ConnectionEvent = refresh
}
