package typingsSlinky.assertionError

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AssertionError[T] = js.Error with T with typingsSlinky.assertionError.anon.ShowDiff
}
