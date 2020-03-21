package typingsSlinky.nivoColors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ColorIdentityFunction[D] = js.Function1[/* datum */ D, java.lang.String | scala.Double]
  type ColorModifier = js.Tuple2[typingsSlinky.nivoColors.mod.ColorModifierType, scala.Double]
  type CustomColorFunction[D] = js.Function1[/* datum */ D, java.lang.String]
  type DatumIdentity[D] = java.lang.String | typingsSlinky.nivoColors.mod.DatumIdentityFunction[D]
  type DatumIdentityFunction[D] = js.Function1[/* datum */ D, java.lang.String | scala.Double]
  type InheritedColorFunction[D] = js.Function1[/* datum */ D, java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.nivoColors.AnonTheme
    - typingsSlinky.nivoColors.AnonFrom
    - typingsSlinky.nivoColors.mod.InheritedColorFunction[D]
  */
  type InheritedColorProp[D] = typingsSlinky.nivoColors.mod._InheritedColorProp[D] | java.lang.String | typingsSlinky.nivoColors.mod.InheritedColorFunction[D]
  type OrdinalColorScale[D] = js.Function1[/* datum */ D, java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nivoColors.mod.DatumColorInstruction
    - typingsSlinky.nivoColors.mod.SchemeColorInstruction
    - typingsSlinky.nivoColors.mod.CustomColorFunction[D]
    - js.Array[java.lang.String]
    - java.lang.String
  */
  type OrdinalColorsInstruction[D] = typingsSlinky.nivoColors.mod._OrdinalColorsInstruction[D] | js.Array[java.lang.String] | typingsSlinky.nivoColors.mod.CustomColorFunction[D] | java.lang.String
}
