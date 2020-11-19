package typingsSlinky.angularScenario

import typingsSlinky.angularScenario.angularScenario.BindingFunction
import typingsSlinky.angularScenario.angularScenario.Browser
import typingsSlinky.angularScenario.angularScenario.Element
import typingsSlinky.angularScenario.angularScenario.Expect
import typingsSlinky.angularScenario.angularScenario.Future
import typingsSlinky.angularScenario.angularScenario.Input
import typingsSlinky.angularScenario.angularScenario.PauseFunction
import typingsSlinky.angularScenario.angularScenario.Repeater
import typingsSlinky.angularScenario.angularScenario.RunFunction
import typingsSlinky.angularScenario.angularScenario.RunFunctionWithDescription
import typingsSlinky.angularScenario.angularScenario.Select
import typingsSlinky.angularScenario.angularScenario.SleepFunction
import typingsSlinky.angularScenario.angularScenario.UsingFunction
import typingsSlinky.angularScenario.ng.IAngularStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  var afterEach: RunFunction = js.native
  
  var angular: IAngularStatic = js.native
  
  var beforeEach: RunFunction = js.native
  
  var binding: BindingFunction = js.native
  
  def browser(): Browser = js.native
  
  var ddescribe: RunFunctionWithDescription = js.native
  
  var describe: RunFunctionWithDescription = js.native
  
  def element(selector: String): Element = js.native
  def element(selector: String, elementDescription: String): Element = js.native
  
  def expect(expectation: Future): Expect = js.native
  
  var iit: RunFunctionWithDescription = js.native
  
  def input(ngModelBinding: String): Input = js.native
  
  var it: RunFunctionWithDescription = js.native
  
  var pause: PauseFunction = js.native
  
  def repeater(selector: String): Repeater = js.native
  def repeater(selector: String, repeaterDescription: String): Repeater = js.native
  
  def select(ngModelBinding: String): Select = js.native
  
  var sleep: SleepFunction = js.native
  
  var using: UsingFunction = js.native
  
  var xdescribe: RunFunctionWithDescription = js.native
  
  var xit: RunFunctionWithDescription = js.native
}
