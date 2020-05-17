package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.bindingParserMod.BindingParser
import typingsSlinky.angularCompiler.viewCompilerMod.R3BaseRefMetaData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "compileBaseDefFromMetadata")
@js.native
object compileBaseDefFromMetadata extends js.Object {
  def apply(
    meta: R3BaseRefMetaData,
    constantPool: typingsSlinky.angularCompiler.constantPoolMod.ConstantPool,
    bindingParser: BindingParser
  ): typingsSlinky.angularCompiler.anon.ExpressionType = js.native
}

