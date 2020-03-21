package typingsSlinky.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object templateMod {
  type DeclareLocalVarCallback = js.Function2[
    /* scope */ typingsSlinky.angularCompiler.templateMod.BindingScope, 
    /* relativeLevel */ scala.Double, 
    js.Array[typingsSlinky.angularCompiler.outputAstMod.Statement]
  ]
}
