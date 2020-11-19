package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.apiMod.R3ComponentDef
import typingsSlinky.angularCompiler.apiMod.R3ComponentMetadata
import typingsSlinky.angularCompiler.bindingParserMod.BindingParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "compileComponentFromMetadata")
@js.native
object compileComponentFromMetadata extends js.Object {
  
  def apply(
    meta: R3ComponentMetadata,
    constantPool: typingsSlinky.angularCompiler.constantPoolMod.ConstantPool,
    bindingParser: BindingParser
  ): R3ComponentDef = js.native
}
