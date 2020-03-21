package typingsSlinky.fibers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object futureMod {
  type FutureOrFutureArray = typingsSlinky.fibers.futureMod.Future[js.Any] | js.Array[typingsSlinky.fibers.futureMod.Future[js.Any]]
  type FutureResolveFunction[T] = js.Function2[/* err */ js.Error, /* val */ T, scala.Unit]
}
