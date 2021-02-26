package typingsSlinky.limeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICommandChannel extends StObject {
  
  def onCommand(command: Command): js.Any = js.native
  
  def sendCommand(command: Command): Unit = js.native
}
object ICommandChannel {
  
  @scala.inline
  def apply(onCommand: Command => js.Any, sendCommand: Command => Unit): ICommandChannel = {
    val __obj = js.Dynamic.literal(onCommand = js.Any.fromFunction1(onCommand), sendCommand = js.Any.fromFunction1(sendCommand))
    __obj.asInstanceOf[ICommandChannel]
  }
  
  @scala.inline
  implicit class ICommandChannelMutableBuilder[Self <: ICommandChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnCommand(value: Command => js.Any): Self = StObject.set(x, "onCommand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendCommand(value: Command => Unit): Self = StObject.set(x, "sendCommand", js.Any.fromFunction1(value))
  }
}
