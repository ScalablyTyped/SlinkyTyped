package typingsSlinky.peerDial.mod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("peer-dial", "Client")
@js.native
class Client () extends EventEmitter {
  
  def getDialDevice(deviceDescriptionUrl: String): Unit = js.native
  def getDialDevice(
    deviceDescriptionUrl: String,
    callback: js.Function2[/* data */ DialDevice, /* err */ js.Any, Unit]
  ): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def start(): Unit = js.native
  
  def stop(): Unit = js.native
}
