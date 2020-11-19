package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketConnection extends IOStream {
  
  /**
    * Disables the Nagle algorithm if `noDelay` is `true`, otherwise enables it. The Nagle algorithm is enabled
    * by default, so it is only necessary to call this method if you wish to optimize for low delay instead of
    * high throughput.
    */
  def setNoDelay(noDelay: Boolean): js.Promise[Unit] = js.native
}
object SocketConnection {
  
  @scala.inline
  def apply(
    close: () => js.Promise[Unit],
    input: InputStream,
    output: OutputStream,
    setNoDelay: Boolean => js.Promise[Unit]
  ): SocketConnection = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], setNoDelay = js.Any.fromFunction1(setNoDelay))
    __obj.asInstanceOf[SocketConnection]
  }
  
  @scala.inline
  implicit class SocketConnectionOps[Self <: SocketConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSetNoDelay(value: Boolean => js.Promise[Unit]): Self = this.set("setNoDelay", js.Any.fromFunction1(value))
  }
}
