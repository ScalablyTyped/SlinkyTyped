package typingsSlinky.proclaim.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proclaim", "throws")
@js.native
object throws extends js.Object {
  
  /**
    * Assert that fn throws an error.
    */
  def apply(fn: js.Function0[Unit]): AssertionError | Unit = js.native
  def apply(fn: js.Function0[Unit], expected: js.UndefOr[scala.Nothing], msg: String): AssertionError | Unit = js.native
  def apply(fn: js.Function0[Unit], expected: js.Any): AssertionError | Unit = js.native
  def apply(fn: js.Function0[Unit], expected: js.Any, msg: String): AssertionError | Unit = js.native
}
