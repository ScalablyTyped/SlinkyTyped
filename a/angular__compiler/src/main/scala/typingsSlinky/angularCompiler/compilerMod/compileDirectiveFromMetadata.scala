package typingsSlinky.angularCompiler.compilerMod

import typingsSlinky.angularCompiler.apiMod.R3DirectiveDef
import typingsSlinky.angularCompiler.apiMod.R3DirectiveMetadata
import typingsSlinky.angularCompiler.bindingParserMod.BindingParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "compileDirectiveFromMetadata")
@js.native
object compileDirectiveFromMetadata extends js.Object {
  
  def apply(
    meta: R3DirectiveMetadata,
    constantPool: typingsSlinky.angularCompiler.constantPoolMod.ConstantPool,
    bindingParser: BindingParser
  ): R3DirectiveDef = js.native
}
