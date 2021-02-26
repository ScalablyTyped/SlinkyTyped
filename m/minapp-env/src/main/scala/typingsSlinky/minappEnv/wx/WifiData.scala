package typingsSlinky.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 提供预设的 Wi-Fi 信息列表 */
@js.native
trait WifiData extends StObject {
  
  /** Wi-Fi 的 BSSID */
  var BSSID: js.UndefOr[String] = js.native
  
  /** Wi-Fi 的 SSID */
  var SSID: js.UndefOr[String] = js.native
  
  /** Wi-Fi 设备密码 */
  var password: js.UndefOr[String] = js.native
}
object WifiData {
  
  @scala.inline
  def apply(): WifiData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WifiData]
  }
  
  @scala.inline
  implicit class WifiDataMutableBuilder[Self <: WifiData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBSSID(value: String): Self = StObject.set(x, "BSSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBSSIDUndefined: Self = StObject.set(x, "BSSID", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setSSID(value: String): Self = StObject.set(x, "SSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSIDUndefined: Self = StObject.set(x, "SSID", js.undefined)
  }
}
