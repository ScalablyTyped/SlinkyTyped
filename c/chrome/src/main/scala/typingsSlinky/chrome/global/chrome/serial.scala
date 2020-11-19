package typingsSlinky.chrome.global.chrome

import typingsSlinky.chrome.chrome.serial.ConnectionInfo
import typingsSlinky.chrome.chrome.serial.ConnectionOptions
import typingsSlinky.chrome.chrome.serial.DeviceInfo
import typingsSlinky.chrome.chrome.serial.onReceive.OnReceiveInfo
import typingsSlinky.chrome.chrome.serial.onReceiveError.OnReceiveErrorInfo
import typingsSlinky.chrome.chromeStrings.eight
import typingsSlinky.chrome.chromeStrings.even
import typingsSlinky.chrome.chromeStrings.no
import typingsSlinky.chrome.chromeStrings.odd
import typingsSlinky.chrome.chromeStrings.one
import typingsSlinky.chrome.chromeStrings.seven
import typingsSlinky.chrome.chromeStrings.two
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Serial
////////////////////
/**
  * Use the <code>chrome.serial</code> API to read from and write to a device connected to a serial port.
  * Permissions:  "enterprise.serial"
  * Since: Chrome 29
  * Important: This API works only on Chrome OS.
  */
@JSGlobal("chrome.serial")
@js.native
object serial extends js.Object {
  
  def clearBreak(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  
  def connect(
    path: String,
    options: ConnectionOptions,
    callback: js.Function1[/* connectionInfo */ ConnectionInfo, Unit]
  ): Unit = js.native
  
  def disconnect(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  
  def flush(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  
  def getConnections(callback: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit]): Unit = js.native
  
  def getControlSignals(connectionId: Double, callback: js.Function1[/* signals */ js.Object, Unit]): Unit = js.native
  
  def getDevices(callback: js.Function1[/* ports */ js.Array[DeviceInfo], Unit]): Unit = js.native
  
  def getInfo(callback: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit]): Unit = js.native
  
  def send(
    connectionId: Double,
    data: js.typedarray.ArrayBuffer,
    callback: js.Function1[/* sendInfo */ js.Object, Unit]
  ): Unit = js.native
  
  def setBreak(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  
  def setControlSignals(connectionId: Double, signals: js.Object, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  
  def setPaused(connectionId: Double, paused: Boolean, callback: js.Function0[Unit]): Unit = js.native
  
  def update(
    connectionId: Double,
    options: ConnectionOptions,
    callback: js.Function1[/* result */ Boolean, Unit]
  ): Unit = js.native
  
  @js.native
  object DataBits extends js.Object {
    
    var EIGHT: eight = js.native
    
    var SEVEN: seven = js.native
  }
  
  @js.native
  object ParityBit extends js.Object {
    
    var EVEN: even = js.native
    
    var NO: no = js.native
    
    var ODD: odd = js.native
  }
  
  @js.native
  object StopBits extends js.Object {
    
    var ONE: one = js.native
    
    var TWO: two = js.native
  }
  
  @js.native
  object onReceive extends js.Object {
    
    def addListener(callback: js.Function1[/* info */ OnReceiveInfo, Unit]): Unit = js.native
  }
  
  @js.native
  object onReceiveError extends js.Object {
    
    def addListener(callback: js.Function1[/* info */ OnReceiveErrorInfo, Unit]): Unit = js.native
    
    @js.native
    object OnReceiveErrorEnum extends js.Object {
      
      /* The device detected a break condition. */
      var break: typingsSlinky.chrome.chromeStrings.break = js.native
      
      /* An input buffer overflow has occurred. There is either no room in the input buffer, or a character was received after the end-of-file (EOF) character. */
      var buffer_overflow: typingsSlinky.chrome.chromeStrings.buffer_overflow = js.native
      
      /* The device was most likely disconnected from the host. */
      var device_lost: typingsSlinky.chrome.chromeStrings.device_lost = js.native
      
      /* The connection was disconnected. */
      var disconnected: typingsSlinky.chrome.chromeStrings.disconnected = js.native
      
      /* The device detected a framing error. */
      var frame_error: typingsSlinky.chrome.chromeStrings.frame_error = js.native
      
      /* A character-buffer overrun has occurred. The next character is lost. */
      var overrun: typingsSlinky.chrome.chromeStrings.overrun = js.native
      
      /* The device detected a parity error. */
      var parity_error: typingsSlinky.chrome.chromeStrings.parity_error = js.native
      
      /* A system error occurred and the connection may be unrecoverable. */
      var system_error: typingsSlinky.chrome.chromeStrings.system_error = js.native
      
      /* No data has been received for receiveTimeout milliseconds. */
      var timeout: typingsSlinky.chrome.chromeStrings.timeout = js.native
    }
  }
}
