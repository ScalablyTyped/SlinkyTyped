package typingsSlinky.awsCryptoIe11Detection

import org.scalajs.dom.raw.Window
import typingsSlinky.awsCryptoIe11Detection.msSubtleCryptoMod.MsSubtleCrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object msWindowMod {
  
  @JSImport("@aws-crypto/ie11-detection/build/MsWindow", "isMsWindow")
  @js.native
  def isMsWindow(window: Window): /* is @aws-crypto/ie11-detection.@aws-crypto/ie11-detection/build/MsWindow.MsWindow */ Boolean = js.native
  
  @js.native
  trait MsCrypto extends StObject {
    
    def getRandomValues(toFill: js.typedarray.Uint8Array): Unit = js.native
    
    var subtle: MsSubtleCrypto = js.native
  }
  object MsCrypto {
    
    @scala.inline
    def apply(getRandomValues: js.typedarray.Uint8Array => Unit, subtle: MsSubtleCrypto): MsCrypto = {
      val __obj = js.Dynamic.literal(getRandomValues = js.Any.fromFunction1(getRandomValues), subtle = subtle.asInstanceOf[js.Any])
      __obj.asInstanceOf[MsCrypto]
    }
    
    @scala.inline
    implicit class MsCryptoMutableBuilder[Self <: MsCrypto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetRandomValues(value: js.typedarray.Uint8Array => Unit): Self = StObject.set(x, "getRandomValues", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubtle(value: MsSubtleCrypto): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MsWindow
    extends typingsSlinky.std.Window {
    
    var MSInputMethodContext: js.Any = js.native
    
    var msCrypto: MsCrypto = js.native
  }
}
