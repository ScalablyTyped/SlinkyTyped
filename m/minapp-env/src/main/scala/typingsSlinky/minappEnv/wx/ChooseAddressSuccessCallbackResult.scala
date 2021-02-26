package typingsSlinky.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseAddressSuccessCallbackResult extends StObject {
  
  /** 国标收货地址第一级地址 */
  var cityName: String = js.native
  
  /** 国标收货地址第一级地址 */
  var countyName: String = js.native
  
  /** 详细收货地址信息 */
  var detailInfo: String = js.native
  
  /** 错误信息 */
  var errMsg: String = js.native
  
  /** 收货地址国家码 */
  var nationalCode: String = js.native
  
  /** 邮编 */
  var postalCode: String = js.native
  
  /** 国标收货地址第一级地址 */
  var provinceName: String = js.native
  
  /** 收货人手机号码 */
  var telNumber: String = js.native
  
  /** 收货人姓名 */
  var userName: String = js.native
}
object ChooseAddressSuccessCallbackResult {
  
  @scala.inline
  def apply(
    cityName: String,
    countyName: String,
    detailInfo: String,
    errMsg: String,
    nationalCode: String,
    postalCode: String,
    provinceName: String,
    telNumber: String,
    userName: String
  ): ChooseAddressSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(cityName = cityName.asInstanceOf[js.Any], countyName = countyName.asInstanceOf[js.Any], detailInfo = detailInfo.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], nationalCode = nationalCode.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], provinceName = provinceName.asInstanceOf[js.Any], telNumber = telNumber.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseAddressSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class ChooseAddressSuccessCallbackResultMutableBuilder[Self <: ChooseAddressSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCityName(value: String): Self = StObject.set(x, "cityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountyName(value: String): Self = StObject.set(x, "countyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailInfo(value: String): Self = StObject.set(x, "detailInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNationalCode(value: String): Self = StObject.set(x, "nationalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvinceName(value: String): Self = StObject.set(x, "provinceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelNumber(value: String): Self = StObject.set(x, "telNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
  }
}
