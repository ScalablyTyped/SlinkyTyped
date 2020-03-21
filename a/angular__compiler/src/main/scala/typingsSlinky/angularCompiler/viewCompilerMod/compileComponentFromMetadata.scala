package typingsSlinky.angularCompiler.viewCompilerMod

import typingsSlinky.angularCompiler.apiMod.R3ComponentDef
import typingsSlinky.angularCompiler.apiMod.R3ComponentMetadata
import typingsSlinky.angularCompiler.bindingParserMod.BindingParser
import typingsSlinky.angularCompiler.constantPoolMod.ConstantPool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/compiler", "compileComponentFromMetadata")
@js.native
object compileComponentFromMetadata extends js.Object {
  def apply(meta: R3ComponentMetadata, constantPool: ConstantPool, bindingParser: BindingParser): R3ComponentDef = js.native
}

