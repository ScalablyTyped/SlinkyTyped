package typingsSlinky.chaiAsPromised.mod

import typingsSlinky.chai.Chai.ChaiPlugin
import typingsSlinky.chaiAsPromised.Chai.PromisedAssertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChaiAsPromised extends ChaiPlugin {
  
  def transferPromiseness(assertion: PromisedAssertion, promise: js.Thenable[_]): Unit = js.native
  
  def transformAsserterArgs(values: js.Array[_]): js.Any = js.native
}
