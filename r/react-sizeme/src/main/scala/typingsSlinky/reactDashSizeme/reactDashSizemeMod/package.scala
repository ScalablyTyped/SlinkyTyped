package typingsSlinky.reactDashSizeme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSizemeMod {
  import typingsSlinky.reactDashSizeme.Anon_Height
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type WithSizeOnSizeCallback = js.Function1[/* size */ Anon_Height, Unit]
}
