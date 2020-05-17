package typingsSlinky.fibers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object futureMod {
  type FutureResolveFunction[T] = js.Function2[/* err */ js.Error, /* val */ T, scala.Unit]
}
