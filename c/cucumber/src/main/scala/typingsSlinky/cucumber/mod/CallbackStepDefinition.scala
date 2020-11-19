package typingsSlinky.cucumber.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallbackStepDefinition extends js.Object {
  
  def apply(): Unit = js.native
  def apply(error: js.UndefOr[scala.Nothing], pending: String): Unit = js.native
  def apply(error: js.Any): Unit = js.native
  def apply(error: js.Any, pending: String): Unit = js.native
  
  def pending(): js.Thenable[_] = js.native
}
