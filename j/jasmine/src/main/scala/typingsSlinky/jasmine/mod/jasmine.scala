package typingsSlinky.jasmine.mod

import typingsSlinky.jasmine.jasmine.CustomMatcherFactories
import typingsSlinky.jasmine.jasmine.CustomReporter
import typingsSlinky.jasmine.jasmine.Env
import typingsSlinky.jasmine.jasmine.Jasmine
import typingsSlinky.jasmine.jasmine.Reporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait jasmine extends js.Object {
  
  def addMatchers(matchers: CustomMatcherFactories): Unit = js.native
  
  def addReporter(reporter: Reporter): Unit = js.native
  
  def addSpecFile(filePath: String): Unit = js.native
  
  def addSpecFiles(files: js.Array[String]): Unit = js.native
  
  var completionReporter: CustomReporter = js.native
  
  def configureDefaultReporter(options: js.Any, args: js.Any*): Unit = js.native
  
  def coreVersion(): String = js.native
  
  var env: Env = js.native
  
  def execute(): js.Any = js.native
  def execute(files: js.UndefOr[scala.Nothing], filterString: String): js.Any = js.native
  def execute(files: js.Array[String]): js.Any = js.native
  def execute(files: js.Array[String], filterString: String): js.Any = js.native
  
  def exitCodeCompletion(passed: js.Any): Unit = js.native
  
  var helperFiles: js.Array[String] = js.native
  
  var jasmine: Jasmine = js.native
  
  def loadConfig(config: js.Any): Unit = js.native
  
  def loadConfigFile(configFilePath: js.Any): Unit = js.native
  
  def loadHelpers(): Unit = js.native
  
  def loadSpecs(): Unit = js.native
  
  def onComplete(onCompleteCallback: js.Function1[/* passed */ Boolean, Unit]): Unit = js.native
  
  def printDeprecation(): Unit = js.native
  
  var projectBaseDir: String = js.native
  
  def provideFallbackReporter(reporter: Reporter): Unit = js.native
  
  def randomizeTests(): Boolean = js.native
  def randomizeTests(value: js.Any): Boolean = js.native
  
  var reporter: CustomReporter = js.native
  
  var reportersCount: Double = js.native
  
  def seed(value: js.Any): Unit = js.native
  
  def showColors(value: js.Any): Unit = js.native
  
  var showingColors: Boolean = js.native
  
  var specFiles: js.Array[String] = js.native
  
  def stopSpecOnExpectationFailure(value: js.Any): Unit = js.native
}
