package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This exception is used to indicate that the requested type of data sink is not supported.
  *
  * For example, each {@link OpenCommandArgument} supplied as argument of the command "open" contains such a data sink.
  * @author Kai Sommerfeld
  * @see Content
  * @version 1.0
  */
@js.native
trait UnsupportedDataSinkException extends Exception {
  
  /** contains the data sink that is not supported. */
  var Sink: XInterface = js.native
}
object UnsupportedDataSinkException {
  
  @scala.inline
  def apply(Context: XInterface, Message: String, Sink: XInterface): UnsupportedDataSinkException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Sink = Sink.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedDataSinkException]
  }
  
  @scala.inline
  implicit class UnsupportedDataSinkExceptionOps[Self <: UnsupportedDataSinkException] (val x: Self) extends AnyVal {
    
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
    def setSink(value: XInterface): Self = this.set("Sink", value.asInstanceOf[js.Any])
  }
}
