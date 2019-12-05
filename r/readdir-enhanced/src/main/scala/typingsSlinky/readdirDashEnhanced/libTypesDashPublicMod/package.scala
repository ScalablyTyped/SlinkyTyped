package typingsSlinky.readdirDashEnhanced

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesDashPublicMod {
  type Callback[T] = js.Function2[/* err */ js.Error | Null, /* result */ T, Unit]
  type FilterFunction = js.Function1[/* stat */ Stats, js.Any]
}
