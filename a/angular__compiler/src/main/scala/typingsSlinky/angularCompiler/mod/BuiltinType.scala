package typingsSlinky.angularCompiler.mod

import typingsSlinky.angularCompiler.outputAstMod.TypeModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "BuiltinType")
@js.native
class BuiltinType protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.BuiltinType {
  def this(name: typingsSlinky.angularCompiler.outputAstMod.BuiltinTypeName) = this()
  def this(
    name: typingsSlinky.angularCompiler.outputAstMod.BuiltinTypeName,
    modifiers: js.Array[TypeModifier]
  ) = this()
}

