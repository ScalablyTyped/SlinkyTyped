package typingsSlinky.domSerial

import org.scalajs.dom.raw.Event
import typingsSlinky.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Serial extends EventTarget {
  
  def getPorts(): js.Promise[js.Array[SerialPort]] = js.native
  
  def onconnect(event: Event): Unit = js.native
  @JSName("onconnect")
  var onconnect_Original: EventHandler = js.native
  
  def ondisconnect(event: Event): Unit = js.native
  @JSName("ondisconnect")
  var ondisconnect_Original: EventHandler = js.native
  
  def requestPort(): js.Promise[SerialPort] = js.native
  def requestPort(options: SerialPortRequestOptions): js.Promise[SerialPort] = js.native
}
