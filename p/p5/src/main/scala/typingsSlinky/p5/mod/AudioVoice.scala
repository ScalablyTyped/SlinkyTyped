package typingsSlinky.p5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioVoice extends StObject {
  
  /**
    *   Connect to p5 objects or Web Audio Nodes
    */
  def connect(unit: js.Object): Unit = js.native
  
  /**
    *   Disconnect from soundOut
    */
  def disconnect(): Unit = js.native
}
object AudioVoice {
  
  @scala.inline
  def apply(connect: js.Object => Unit, disconnect: () => Unit): AudioVoice = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction0(disconnect))
    __obj.asInstanceOf[AudioVoice]
  }
  
  @scala.inline
  implicit class AudioVoiceMutableBuilder[Self <: AudioVoice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnect(value: js.Object => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
  }
}
