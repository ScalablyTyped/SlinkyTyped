package typingsSlinky.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Serial {
  
  @js.native
  sealed trait Handshake extends StObject
  @JSImport("jsprintmanager", "JSPM.Serial.Handshake")
  @js.native
  object Handshake extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Handshake with Double] = js.native
    
    @js.native
    sealed trait None extends Handshake
    /* 0 */ val None: typingsSlinky.jsprintmanager.mod.JSPM.Serial.Handshake.None with Double = js.native
    
    @js.native
    sealed trait RequestToSend extends Handshake
    /* 1 */ val RequestToSend: typingsSlinky.jsprintmanager.mod.JSPM.Serial.Handshake.RequestToSend with Double = js.native
    
    @js.native
    sealed trait RequestToSendXOnXOff extends Handshake
    /* 2 */ val RequestToSendXOnXOff: typingsSlinky.jsprintmanager.mod.JSPM.Serial.Handshake.RequestToSendXOnXOff with Double = js.native
    
    @js.native
    sealed trait XOnXOff extends Handshake
    /* 3 */ val XOnXOff: typingsSlinky.jsprintmanager.mod.JSPM.Serial.Handshake.XOnXOff with Double = js.native
  }
  
  @js.native
  sealed trait Parity extends StObject
  @JSImport("jsprintmanager", "JSPM.Serial.Parity")
  @js.native
  object Parity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Parity with Double] = js.native
    
    @js.native
    sealed trait Even extends Parity
    /* 2 */ val Even: typingsSlinky.jsprintmanager.mod.JSPM.Serial.Parity.Even with Double = js.native
    
    @js.native
    sealed trait Mark extends Parity
    /* 3 */ val Mark: typingsSlinky.jsprintmanager.mod.JSPM.Serial.Parity.Mark with Double = js.native
    
    @js.native
    sealed trait None extends Parity
    /* 0 */ val None: typingsSlinky.jsprintmanager.mod.JSPM.Serial.Parity.None with Double = js.native
    
    @js.native
    sealed trait Odd extends Parity
    /* 1 */ val Odd: typingsSlinky.jsprintmanager.mod.JSPM.Serial.Parity.Odd with Double = js.native
    
    @js.native
    sealed trait Space extends Parity
    /* 4 */ val Space: typingsSlinky.jsprintmanager.mod.JSPM.Serial.Parity.Space with Double = js.native
  }
  
  @js.native
  sealed trait StopBits extends StObject
  @JSImport("jsprintmanager", "JSPM.Serial.StopBits")
  @js.native
  object StopBits extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[StopBits with Double] = js.native
    
    @js.native
    sealed trait None extends StopBits
    /* 0 */ val None: typingsSlinky.jsprintmanager.mod.JSPM.Serial.StopBits.None with Double = js.native
    
    @js.native
    sealed trait One extends StopBits
    /* 1 */ val One: typingsSlinky.jsprintmanager.mod.JSPM.Serial.StopBits.One with Double = js.native
    
    @js.native
    sealed trait OnePointFive extends StopBits
    /* 3 */ val OnePointFive: typingsSlinky.jsprintmanager.mod.JSPM.Serial.StopBits.OnePointFive with Double = js.native
    
    @js.native
    sealed trait Two extends StopBits
    /* 2 */ val Two: typingsSlinky.jsprintmanager.mod.JSPM.Serial.StopBits.Two with Double = js.native
  }
}
