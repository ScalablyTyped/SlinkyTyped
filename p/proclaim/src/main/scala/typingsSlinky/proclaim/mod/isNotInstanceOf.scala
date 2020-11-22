package typingsSlinky.proclaim.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proclaim", "isNotInstanceOf")
@js.native
object isNotInstanceOf extends js.Object {
  
  /**
    * Assert that !(actual instanceof expected).
    */
  def apply(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  def apply(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
}
