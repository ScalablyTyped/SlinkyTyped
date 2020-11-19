package typingsSlinky.johnnyFive.mod

import typingsSlinky.johnnyFive.johnnyFiveStrings.close
import typingsSlinky.johnnyFive.johnnyFiveStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Switch")
@js.native
class Switch protected () extends js.Object {
  def this(option: String) = this()
  def this(option: Double) = this()
  def this(option: SwitchOption) = this()
  
  var id: String = js.native
  
  val isClosed: Boolean = js.native
  
  val isOpen: Boolean = js.native
  
  @JSName("on")
  def on_close(event: close, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_open(event: open, cb: js.Function0[Unit]): this.type = js.native
  
  var pin: Double | String = js.native
}
