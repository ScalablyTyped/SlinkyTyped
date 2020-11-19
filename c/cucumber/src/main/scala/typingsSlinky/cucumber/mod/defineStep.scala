package typingsSlinky.cucumber.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cucumber", "defineStep")
@js.native
object defineStep extends js.Object {
  
  def apply(pattern: String, code: StepDefinitionCode): Unit = js.native
  def apply(pattern: String, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  def apply(pattern: js.RegExp, code: StepDefinitionCode): Unit = js.native
  def apply(pattern: js.RegExp, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
}
