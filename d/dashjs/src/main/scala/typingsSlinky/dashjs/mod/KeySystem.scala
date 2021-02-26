package typingsSlinky.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeySystem extends StObject {
  
  def getCDMData(): js.typedarray.ArrayBuffer | Null = js.native
  
  def getInitData(cp: js.Object): js.typedarray.ArrayBuffer = js.native
  
  def getLicenseRequestFromMessage(message: js.typedarray.ArrayBuffer): js.typedarray.Uint8Array = js.native
  
  def getLicenseServerURLFromInitData(initData: js.typedarray.ArrayBuffer): String | Null = js.native
  
  def getRequestHeadersFromMessage(message: js.typedarray.ArrayBuffer): js.Object | Null = js.native
  
  def getSessionId(): String | Null = js.native
  
  var schemeIdURI: String = js.native
  
  var systemString: String = js.native
  
  var uuid: String = js.native
}
object KeySystem {
  
  @scala.inline
  def apply(
    getCDMData: () => js.typedarray.ArrayBuffer | Null,
    getInitData: js.Object => js.typedarray.ArrayBuffer,
    getLicenseRequestFromMessage: js.typedarray.ArrayBuffer => js.typedarray.Uint8Array,
    getLicenseServerURLFromInitData: js.typedarray.ArrayBuffer => String | Null,
    getRequestHeadersFromMessage: js.typedarray.ArrayBuffer => js.Object | Null,
    getSessionId: () => String | Null,
    schemeIdURI: String,
    systemString: String,
    uuid: String
  ): KeySystem = {
    val __obj = js.Dynamic.literal(getCDMData = js.Any.fromFunction0(getCDMData), getInitData = js.Any.fromFunction1(getInitData), getLicenseRequestFromMessage = js.Any.fromFunction1(getLicenseRequestFromMessage), getLicenseServerURLFromInitData = js.Any.fromFunction1(getLicenseServerURLFromInitData), getRequestHeadersFromMessage = js.Any.fromFunction1(getRequestHeadersFromMessage), getSessionId = js.Any.fromFunction0(getSessionId), schemeIdURI = schemeIdURI.asInstanceOf[js.Any], systemString = systemString.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeySystem]
  }
  
  @scala.inline
  implicit class KeySystemMutableBuilder[Self <: KeySystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCDMData(value: () => js.typedarray.ArrayBuffer | Null): Self = StObject.set(x, "getCDMData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInitData(value: js.Object => js.typedarray.ArrayBuffer): Self = StObject.set(x, "getInitData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLicenseRequestFromMessage(value: js.typedarray.ArrayBuffer => js.typedarray.Uint8Array): Self = StObject.set(x, "getLicenseRequestFromMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLicenseServerURLFromInitData(value: js.typedarray.ArrayBuffer => String | Null): Self = StObject.set(x, "getLicenseServerURLFromInitData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRequestHeadersFromMessage(value: js.typedarray.ArrayBuffer => js.Object | Null): Self = StObject.set(x, "getRequestHeadersFromMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSessionId(value: () => String | Null): Self = StObject.set(x, "getSessionId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSchemeIdURI(value: String): Self = StObject.set(x, "schemeIdURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemString(value: String): Self = StObject.set(x, "systemString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
