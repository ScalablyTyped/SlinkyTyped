package typingsSlinky.powerAssert.mod

import typingsSlinky.powerAssert.anon.Actual
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("power-assert", "AssertionError")
@js.native
class AssertionError () extends Error {
  def this(options: Actual) = this()
  
  var actual: js.Any = js.native
  
  var expected: js.Any = js.native
  
  var generatedMessage: Boolean = js.native
  
  var operator: String = js.native
}
