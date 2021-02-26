package typingsSlinky.cucumber.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepDefinitions extends StObject {
  
  def Given(pattern: String, code: StepDefinitionCode): Unit = js.native
  def Given(pattern: String, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  def Given(pattern: js.RegExp, code: StepDefinitionCode): Unit = js.native
  def Given(pattern: js.RegExp, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  
  def Then(pattern: String, code: StepDefinitionCode): Unit = js.native
  def Then(pattern: String, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  def Then(pattern: js.RegExp, code: StepDefinitionCode): Unit = js.native
  def Then(pattern: js.RegExp, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  
  def When(pattern: String, code: StepDefinitionCode): Unit = js.native
  def When(pattern: String, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  def When(pattern: js.RegExp, code: StepDefinitionCode): Unit = js.native
  def When(pattern: js.RegExp, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  
  def setDefaultTimeout(time: Double): Unit = js.native
}
