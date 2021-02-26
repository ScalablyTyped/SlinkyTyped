package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.minappEnvStrings.`2g`
import typingsSlinky.minappEnv.minappEnvStrings.`3g`
import typingsSlinky.minappEnv.minappEnvStrings.`4g`
import typingsSlinky.minappEnv.minappEnvStrings.none
import typingsSlinky.minappEnv.minappEnvStrings.unknown
import typingsSlinky.minappEnv.minappEnvStrings.wifi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnNetworkStatusChangeCallbackResult extends StObject {
  
  /** 当前是否有网络链接 */
  var isConnected: Boolean = js.native
  
  /** 网络类型
    *
    * 可选值：
    * - 'wifi': wifi 网络;
    * - '2g': 2g 网络;
    * - '3g': 3g 网络;
    * - '4g': 4g 网络;
    * - 'unknown': Android 下不常见的网络类型;
    * - 'none': 无网络; */
  var networkType: wifi | `2g` | `3g` | `4g` | unknown | none = js.native
}
object OnNetworkStatusChangeCallbackResult {
  
  @scala.inline
  def apply(isConnected: Boolean, networkType: wifi | `2g` | `3g` | `4g` | unknown | none): OnNetworkStatusChangeCallbackResult = {
    val __obj = js.Dynamic.literal(isConnected = isConnected.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnNetworkStatusChangeCallbackResult]
  }
  
  @scala.inline
  implicit class OnNetworkStatusChangeCallbackResultMutableBuilder[Self <: OnNetworkStatusChangeCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsConnected(value: Boolean): Self = StObject.set(x, "isConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkType(value: wifi | `2g` | `3g` | `4g` | unknown | none): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
  }
}
