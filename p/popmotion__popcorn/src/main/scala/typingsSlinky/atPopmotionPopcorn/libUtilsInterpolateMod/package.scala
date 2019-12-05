package typingsSlinky.atPopmotionPopcorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUtilsInterpolateMod {
  import typingsSlinky.atPopmotionEasing.atPopmotionEasingMod.Easing

  type Mix[T] = js.Function1[/* v */ Double, T]
  type MixEasing = Easing | js.Array[Easing]
  type MixerFactory[T] = js.Function2[/* from */ T, /* to */ T, Mix[T]]
}
