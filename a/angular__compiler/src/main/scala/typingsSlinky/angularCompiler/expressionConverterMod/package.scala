package typingsSlinky.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressionConverterMod {
  type BuiltinConverter = js.Function1[
    /* args */ js.Array[typingsSlinky.angularCompiler.outputAstMod.Expression], 
    typingsSlinky.angularCompiler.outputAstMod.Expression
  ]
  type InterpolationFunction = js.Function1[
    /* args */ js.Array[typingsSlinky.angularCompiler.outputAstMod.Expression], 
    typingsSlinky.angularCompiler.outputAstMod.Expression
  ]
}
