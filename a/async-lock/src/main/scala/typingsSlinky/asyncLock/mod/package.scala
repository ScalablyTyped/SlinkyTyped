package typingsSlinky.asyncLock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncLockDoneCallback[T] = js.Function2[/* err */ js.UndefOr[js.Error], /* ret */ js.UndefOr[T], scala.Unit]
}
