package typingsSlinky.gamepad.mod

import typingsSlinky.gamepad.gamepadStrings.attach
import typingsSlinky.gamepad.gamepadStrings.down
import typingsSlinky.gamepad.gamepadStrings.move
import typingsSlinky.gamepad.gamepadStrings.remove
import typingsSlinky.gamepad.gamepadStrings.up
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeGamepad extends EventEmitter {
  
  def detectDevices(): Unit = js.native
  
  def deviceAtIndex(deviceIndex: Double): GamepadInstance = js.native
  
  def init(): Unit = js.native
  
  def numDevices(): Double = js.native
  
  @JSName("on")
  def on_attach(event: attach, listener: js.Function2[/* deviceID */ Double, /* device */ GamepadInstance, Unit]): this.type = js.native
  @JSName("on")
  def on_down(
    event: down,
    listener: js.Function3[/* deviceID */ Double, /* buttonID */ Double, /* timestamp */ Double, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_move(
    event: move,
    listener: js.Function5[
      /* deviceID */ Double, 
      /* axisID */ Double, 
      /* value */ Double, 
      /* lastValue */ Double, 
      /* timestamp */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_remove(event: remove, listener: js.Function1[/* deviceID */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_up(
    event: up,
    listener: js.Function3[/* deviceID */ Double, /* buttonID */ Double, /* timestamp */ Double, Unit]
  ): this.type = js.native
  
  def processEvents(): Unit = js.native
  
  def shutdown(): Unit = js.native
}
