package typingsSlinky.angularCompiler.mod

import typingsSlinky.angularCompiler.templateMod.ParseTemplateOptions
import typingsSlinky.angularCompiler.templateMod.ParsedTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "parseTemplate")
@js.native
object parseTemplate extends js.Object {
  
  def apply(template: String, templateUrl: String): ParsedTemplate = js.native
  def apply(template: String, templateUrl: String, options: ParseTemplateOptions): ParsedTemplate = js.native
}
