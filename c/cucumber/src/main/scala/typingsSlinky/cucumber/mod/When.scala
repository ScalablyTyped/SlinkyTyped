package typingsSlinky.cucumber.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cucumber", "When")
@js.native
object When extends js.Object {
  def apply(pattern: String, code: StepDefinitionCode): Unit = js.native
  def apply(pattern: String, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  def apply(pattern: js.RegExp, code: StepDefinitionCode): Unit = js.native
  def apply(pattern: js.RegExp, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
}

