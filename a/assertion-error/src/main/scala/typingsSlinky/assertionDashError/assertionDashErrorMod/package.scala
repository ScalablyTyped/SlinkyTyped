package typingsSlinky.assertionDashError

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object assertionDashErrorMod {
  import typingsSlinky.assertionDashError.Anon_ShowDiff

  type AssertionError[T] = js.Error with T with Anon_ShowDiff
}
