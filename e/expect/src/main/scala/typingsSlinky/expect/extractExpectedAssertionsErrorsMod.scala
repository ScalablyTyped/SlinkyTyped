package typingsSlinky.expect

import typingsSlinky.expect.anon.Actual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expect/build/extractExpectedAssertionsErrors", JSImport.Namespace)
@js.native
object extractExpectedAssertionsErrorsMod extends js.Object {
  
  def default(): AssertionsErrors = js.native
  
  type AssertionsErrors = js.Array[Actual]
}
