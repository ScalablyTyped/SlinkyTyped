package typingsSlinky.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketTask extends StObject {
  
  /** [SocketTask.close(Object object)](SocketTask.close.md)
    *
    * 关闭 WebSocket 连接 */
  def close(option: CloseOption): Unit = js.native
  
  /** [SocketTask.onClose(function callback)](SocketTask.onClose.md)
    *
    * 监听 WebSocket 连接关闭事件 */
  def onClose(/** WebSocket 连接关闭事件的回调函数 */
  callback: OnCloseCallback): Unit = js.native
  
  /** [SocketTask.onError(function callback)](SocketTask.onError.md)
    *
    * 监听 WebSocket 错误事件 */
  def onError(/** WebSocket 错误事件的回调函数 */
  callback: SocketTaskOnErrorCallback): Unit = js.native
  
  /** [SocketTask.onMessage(function callback)](SocketTask.onMessage.md)
    *
    * 监听 WebSocket 接受到服务器的消息事件 */
  def onMessage(/** WebSocket 接受到服务器的消息事件的回调函数 */
  callback: SocketTaskOnMessageCallback): Unit = js.native
  
  /** [SocketTask.onOpen(function callback)](SocketTask.onOpen.md)
    *
    * 监听 WebSocket 连接打开事件 */
  def onOpen(/** WebSocket 连接打开事件的回调函数 */
  callback: OnOpenCallback): Unit = js.native
  
  /** [SocketTask.send(Object object)](SocketTask.send.md)
    *
    * 通过 WebSocket 连接发送数据 */
  def send(option: SendOption): Unit = js.native
}
object SocketTask {
  
  @scala.inline
  def apply(
    close: CloseOption => Unit,
    onClose: OnCloseCallback => Unit,
    onError: SocketTaskOnErrorCallback => Unit,
    onMessage: SocketTaskOnMessageCallback => Unit,
    onOpen: OnOpenCallback => Unit,
    send: SendOption => Unit
  ): SocketTask = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), onClose = js.Any.fromFunction1(onClose), onError = js.Any.fromFunction1(onError), onMessage = js.Any.fromFunction1(onMessage), onOpen = js.Any.fromFunction1(onOpen), send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[SocketTask]
  }
  
  @scala.inline
  implicit class SocketTaskMutableBuilder[Self <: SocketTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: CloseOption => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClose(value: OnCloseCallback => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnError(value: SocketTaskOnErrorCallback => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMessage(value: SocketTaskOnMessageCallback => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpen(value: OnOpenCallback => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSend(value: SendOption => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
  }
}
