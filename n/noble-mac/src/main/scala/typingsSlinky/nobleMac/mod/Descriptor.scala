package typingsSlinky.nobleMac.mod

import typingsSlinky.nobleMac.nobleMacStrings.valueRead
import typingsSlinky.nobleMac.nobleMacStrings.valueWrite
import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("noble-mac", "Descriptor")
@js.native
class Descriptor () extends EventEmitter {
  
  var name: String = js.native
  
  def on(event: String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_valueRead(event: valueRead, listener: js.Function2[/* error */ String, /* data */ Buffer, Unit]): this.type = js.native
  @JSName("on")
  def on_valueWrite(event: valueWrite, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
  
  def readValue(): Unit = js.native
  def readValue(callback: js.Function2[/* error */ String, /* data */ Buffer, Unit]): Unit = js.native
  
  var `type`: String = js.native
  
  var uuid: String = js.native
  
  def writeValue(data: Buffer): Unit = js.native
  def writeValue(data: Buffer, callback: js.Function1[/* error */ String, Unit]): Unit = js.native
}
