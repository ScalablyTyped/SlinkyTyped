package typingsSlinky.node.assertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("assert", "throws")
@js.native
object throws extends js.Object {
  
  def apply(block: js.Function0[_]): Unit = js.native
  def apply(block: js.Function0[_], error: AssertPredicate): Unit = js.native
  def apply(block: js.Function0[_], error: AssertPredicate, message: String): Unit = js.native
  def apply(block: js.Function0[_], error: AssertPredicate, message: js.Error): Unit = js.native
  def apply(block: js.Function0[_], message: String): Unit = js.native
  def apply(block: js.Function0[_], message: js.Error): Unit = js.native
}
