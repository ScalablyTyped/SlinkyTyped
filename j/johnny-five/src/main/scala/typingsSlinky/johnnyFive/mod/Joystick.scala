package typingsSlinky.johnnyFive.mod

import typingsSlinky.johnnyFive.johnnyFiveStrings.axismove
import typingsSlinky.johnnyFive.johnnyFiveStrings.change
import typingsSlinky.johnnyFive.johnnyFiveStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Joystick")
@js.native
class Joystick protected () extends js.Object {
  def this(option: JoystickOption) = this()
  
  var axis: js.Array[Double] = js.native
  
  var id: String = js.native
  
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_axismove(event: axismove, cb: js.Function2[/* error */ js.Error, /* date */ js.Date, Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: change, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
  
  var raw: js.Array[Double] = js.native
  
  val x: Double = js.native
  
  val y: Double = js.native
}
