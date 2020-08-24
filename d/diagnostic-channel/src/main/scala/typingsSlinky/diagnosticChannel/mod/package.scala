package typingsSlinky.diagnosticChannel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IFilter = js.Function1[/* publishing */ scala.Boolean, scala.Boolean]
  type ISubscriber[T] = js.Function1[/* event */ typingsSlinky.diagnosticChannel.mod.IStandardEvent[T], scala.Unit]
  type ScopeManager = js.Any
}
