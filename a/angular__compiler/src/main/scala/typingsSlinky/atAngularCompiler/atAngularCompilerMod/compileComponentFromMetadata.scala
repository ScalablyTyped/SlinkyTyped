package typingsSlinky.atAngularCompiler.atAngularCompilerMod

import typingsSlinky.atAngularCompiler.srcRender3ViewApiMod.R3ComponentDef
import typingsSlinky.atAngularCompiler.srcRender3ViewApiMod.R3ComponentMetadata
import typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserBindingUnderscoreParserMod.BindingParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "compileComponentFromMetadata")
@js.native
object compileComponentFromMetadata extends js.Object {
  def apply(
    meta: R3ComponentMetadata,
    constantPool: typingsSlinky.atAngularCompiler.srcConstantUnderscorePoolMod.ConstantPool,
    bindingParser: BindingParser
  ): R3ComponentDef = js.native
}

