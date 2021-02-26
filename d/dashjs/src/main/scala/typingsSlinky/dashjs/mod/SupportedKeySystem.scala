package typingsSlinky.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupportedKeySystem extends StObject {
  
  var cdmData: js.typedarray.ArrayBuffer | Null = js.native
  
  var initData: js.typedarray.ArrayBuffer = js.native
  
  var ks: KeySystem = js.native
  
  var sessionId: String | Null = js.native
}
object SupportedKeySystem {
  
  @scala.inline
  def apply(initData: js.typedarray.ArrayBuffer, ks: KeySystem): SupportedKeySystem = {
    val __obj = js.Dynamic.literal(initData = initData.asInstanceOf[js.Any], ks = ks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedKeySystem]
  }
  
  @scala.inline
  implicit class SupportedKeySystemMutableBuilder[Self <: SupportedKeySystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCdmData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "cdmData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCdmDataNull: Self = StObject.set(x, "cdmData", null)
    
    @scala.inline
    def setInitData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "initData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKs(value: KeySystem): Self = StObject.set(x, "ks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdNull: Self = StObject.set(x, "sessionId", null)
  }
}
