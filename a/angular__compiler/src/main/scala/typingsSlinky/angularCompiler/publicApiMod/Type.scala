package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.outputAstMod.TypeModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "Type")
@js.native
abstract class Type ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.Type {
  def this(modifiers: js.Array[TypeModifier]) = this()
}
