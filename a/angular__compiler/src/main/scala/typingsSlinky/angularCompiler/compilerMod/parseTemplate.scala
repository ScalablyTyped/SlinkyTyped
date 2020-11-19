package typingsSlinky.angularCompiler.compilerMod

import typingsSlinky.angularCompiler.anon.Errors
import typingsSlinky.angularCompiler.templateMod.ParseTemplateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "parseTemplate")
@js.native
object parseTemplate extends js.Object {
  
  def apply(template: String, templateUrl: String): Errors = js.native
  def apply(template: String, templateUrl: String, options: ParseTemplateOptions): Errors = js.native
}
