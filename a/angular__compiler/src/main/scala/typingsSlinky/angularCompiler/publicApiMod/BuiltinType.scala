package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.outputAstMod.TypeModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "BuiltinType")
@js.native
class BuiltinType protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.BuiltinType {
  def this(name: typingsSlinky.angularCompiler.outputAstMod.BuiltinTypeName) = this()
  def this(
    name: typingsSlinky.angularCompiler.outputAstMod.BuiltinTypeName,
    modifiers: js.Array[TypeModifier]
  ) = this()
}

