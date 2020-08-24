package typingsSlinky.angularCompiler.mod

import typingsSlinky.angularCompiler.outputAstMod.TypeModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "Type")
@js.native
abstract class Type ()
  extends typingsSlinky.angularCompiler.compilerMod.Type {
  def this(modifiers: js.Array[TypeModifier]) = this()
}

