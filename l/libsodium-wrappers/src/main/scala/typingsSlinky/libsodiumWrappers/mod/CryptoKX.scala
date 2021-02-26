package typingsSlinky.libsodiumWrappers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CryptoKX extends StObject {
  
  var sharedRx: js.typedarray.Uint8Array = js.native
  
  var sharedTx: js.typedarray.Uint8Array = js.native
}
object CryptoKX {
  
  @scala.inline
  def apply(sharedRx: js.typedarray.Uint8Array, sharedTx: js.typedarray.Uint8Array): CryptoKX = {
    val __obj = js.Dynamic.literal(sharedRx = sharedRx.asInstanceOf[js.Any], sharedTx = sharedTx.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKX]
  }
  
  @scala.inline
  implicit class CryptoKXMutableBuilder[Self <: CryptoKX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSharedRx(value: js.typedarray.Uint8Array): Self = StObject.set(x, "sharedRx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedTx(value: js.typedarray.Uint8Array): Self = StObject.set(x, "sharedTx", value.asInstanceOf[js.Any])
  }
}
