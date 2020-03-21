package typingsSlinky.popmotionPopcorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interpolateMod {
  type Mix[T] = js.Function1[/* v */ scala.Double, T]
  type MixEasing = typingsSlinky.popmotionEasing.mod.Easing | js.Array[typingsSlinky.popmotionEasing.mod.Easing]
  type MixerFactory[T] = js.Function2[/* from */ T, /* to */ T, typingsSlinky.popmotionPopcorn.interpolateMod.Mix[T]]
}
