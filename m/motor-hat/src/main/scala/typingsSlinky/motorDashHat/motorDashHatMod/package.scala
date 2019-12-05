package typingsSlinky.motorDashHat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object motorDashHatMod {
  type Callback = js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[js.Any], Unit]
  type PinDefinition = PinDefinitionObject | js.Array[Double]
}
