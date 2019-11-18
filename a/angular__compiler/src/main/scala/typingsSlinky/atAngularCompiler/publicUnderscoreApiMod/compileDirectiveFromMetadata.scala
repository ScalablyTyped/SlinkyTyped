package typingsSlinky.atAngularCompiler.publicUnderscoreApiMod

import typingsSlinky.atAngularCompiler.srcRender3ViewApiMod.R3DirectiveDef
import typingsSlinky.atAngularCompiler.srcRender3ViewApiMod.R3DirectiveMetadata
import typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserBindingUnderscoreParserMod.BindingParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "compileDirectiveFromMetadata")
@js.native
object compileDirectiveFromMetadata extends js.Object {
  def apply(
    meta: R3DirectiveMetadata,
    constantPool: typingsSlinky.atAngularCompiler.srcConstantUnderscorePoolMod.ConstantPool,
    bindingParser: BindingParser
  ): R3DirectiveDef = js.native
}

