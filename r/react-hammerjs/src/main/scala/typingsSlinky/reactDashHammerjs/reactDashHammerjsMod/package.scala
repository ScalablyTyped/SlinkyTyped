package typingsSlinky.reactDashHammerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashHammerjsMod {
  import typingsSlinky.hammerjs.HammerOptions
  import typingsSlinky.reactDashHammerjs.Anon_Gesture
  import typingsSlinky.reactDashHammerjs.reactDashHammerjsStrings.recognizers
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type HammerOptionsWithRecognizers = (typingsSlinky.std.Omit[HammerOptions, recognizers]) with Anon_Gesture
  type Omit[T, K] = Pick[T, Exclude[String, K]]
}
