package typingsSlinky.nivoColors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ColorIdentityFunction[D] = js.Function1[/* datum */ D, java.lang.String | scala.Double]
  type ColorModifier = js.Tuple2[typingsSlinky.nivoColors.mod.ColorModifierType, scala.Double]
  type CustomColorFunction[D] = js.Function1[/* datum */ D, java.lang.String]
  type DatumIdentityFunction[D] = js.Function1[/* datum */ D, java.lang.String | scala.Double]
  type InheritedColorFunction[D] = js.Function1[/* datum */ D, java.lang.String]
  type OrdinalColorScale[D] = js.Function1[/* datum */ D, java.lang.String]
}
