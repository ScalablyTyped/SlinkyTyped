package typingsSlinky.jestCucumber

import typingsSlinky.jestCucumber.modelsMod.Options
import typingsSlinky.jestCucumber.modelsMod.ParsedScenario
import typingsSlinky.jestCucumber.modelsMod.ParsedScenarioOutline
import typingsSlinky.jestCucumber.modelsMod.ScenarioFromStepDefinitions
import typingsSlinky.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-cucumber/dist/src/validation/step-definition-validation", JSImport.Namespace)
@js.native
object stepDefinitionValidationMod extends js.Object {
  
  def ensureFeatureFileAndStepDefinitionScenarioHaveSameSteps(
    options: Options,
    parsedScenario: ParsedScenarioOutline,
    scenarioFromStepDefinitions: ScenarioFromStepDefinitions
  ): Unit = js.native
  def ensureFeatureFileAndStepDefinitionScenarioHaveSameSteps(
    options: Options,
    parsedScenario: ParsedScenario,
    scenarioFromStepDefinitions: ScenarioFromStepDefinitions
  ): Unit = js.native
  
  def matchSteps(stepFromFeatureFile: String, stepMatcher: String): Boolean | RegExpMatchArray | Null = js.native
  def matchSteps(stepFromFeatureFile: String, stepMatcher: js.RegExp): Boolean | RegExpMatchArray | Null = js.native
}
