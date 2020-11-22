package typingsSlinky.jestCucumber

import typingsSlinky.jestCucumber.featureDefinitionCreationMod.ScenariosDefinitionCallbackFunction
import typingsSlinky.jestCucumber.featureDefinitionCreationMod.StepsDefinitionCallbackFunction
import typingsSlinky.jestCucumber.modelsMod.Options
import typingsSlinky.jestCucumber.modelsMod.ParsedFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-cucumber", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def autoBindSteps(features: js.Array[ParsedFeature], stepDefinitions: js.Array[StepsDefinitionCallbackFunction]): Unit = js.native
  
  def defineFeature(featureFromFile: ParsedFeature, scenariosDefinitionCallback: ScenariosDefinitionCallbackFunction): Unit = js.native
  
  def generateCodeFromFeature(feature: ParsedFeature, lineNumber: Double): String | Null = js.native
  
  def generateCodeWithSeparateFunctionsFromFeature(feature: ParsedFeature, lineNumber: Double): String | Null = js.native
  
  def loadFeature(featureFilePath: String): ParsedFeature = js.native
  def loadFeature(featureFilePath: String, options: Options): ParsedFeature = js.native
  
  def loadFeatures(globPattern: String): js.Array[ParsedFeature] = js.native
  def loadFeatures(globPattern: String, options: Options): js.Array[ParsedFeature] = js.native
  
  def parseFeature(featureText: String): ParsedFeature = js.native
  def parseFeature(featureText: String, options: Options): ParsedFeature = js.native
  
  def setJestCucumberConfiguration(options: Options): Unit = js.native
}
