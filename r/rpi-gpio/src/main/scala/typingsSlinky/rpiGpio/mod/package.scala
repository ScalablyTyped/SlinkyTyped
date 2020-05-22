package typingsSlinky.rpiGpio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorCallback = js.Function1[/* err */ js.UndefOr[js.Error | scala.Null], scala.Unit]
  type ValueCallback[T] = js.Function2[/* err */ js.UndefOr[js.Error | scala.Null], /* value */ js.UndefOr[T], scala.Unit]
}
