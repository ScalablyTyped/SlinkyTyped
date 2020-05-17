package typingsSlinky.cassandraDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EmptyCallback = js.Function1[/* err */ js.Error, scala.Unit]
  type ValueCallback[T] = js.Function2[/* err */ js.Error, /* val */ T, scala.Unit]
}
