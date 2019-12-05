package typingsSlinky.atMrmlncReaddirDashEnhanced

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atMrmlncReaddirDashEnhancedMod {
  import typingsSlinky.node.NodeJS.ErrnoException

  type Callback[T] = js.Function2[/* err */ ErrnoException, /* result */ T, Unit]
  type CallbackEntry = Callback[js.Array[Entry]]
  type CallbackString = Callback[js.Array[String]]
  type FilterFunction = js.Function1[/* stat */ Entry, Boolean]
}
