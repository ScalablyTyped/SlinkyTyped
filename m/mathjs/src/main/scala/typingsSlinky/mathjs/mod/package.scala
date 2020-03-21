package typingsSlinky.mathjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BigNumber = typingsSlinky.decimalJs.mod.Decimal
  type FactoryFunction[T] = js.Function1[/* scope */ js.Any, T]
  type ImportObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type MathArray = js.Array[js.Array[scala.Double] | scala.Double]
  type MathExpression = java.lang.String | js.Array[java.lang.String] | typingsSlinky.mathjs.mod.MathArray | typingsSlinky.mathjs.mod.Matrix
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typingsSlinky.mathjs.mod.BigNumber
    - typingsSlinky.mathjs.mod.Fraction
    - typingsSlinky.mathjs.mod.Complex
    - typingsSlinky.mathjs.mod.Unit
    - typingsSlinky.mathjs.mod.MathArray
    - typingsSlinky.mathjs.mod.Matrix
  */
  type MathType = typingsSlinky.mathjs.mod._MathType | scala.Double | typingsSlinky.mathjs.mod.BigNumber | typingsSlinky.mathjs.mod.MathArray
  type NoLiteralType[T] = T | scala.Boolean | java.lang.String | scala.Double
}
