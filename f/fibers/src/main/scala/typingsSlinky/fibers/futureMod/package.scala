package typingsSlinky.fibers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object futureMod {
  type FutureOrFutureArray = Future[js.Any] | js.Array[Future[js.Any]]
  type FutureResolveFunction[T] = js.Function2[/* err */ js.Error, /* val */ T, Unit]
}
