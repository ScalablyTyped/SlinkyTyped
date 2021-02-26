package typingsSlinky.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExchangeProviderInfo extends StObject {
  
  var addressFormats: StringMap = js.native
  
  var buyTickers: js.Array[String] = js.native
  
  // changenow
  var companyName: String = js.native
  
  // changenow-icon.jpg
  var isActive: Boolean = js.native
  
  var isFixedRate: Boolean = js.native
  
  var isRefundRequired: js.UndefOr[Boolean] = js.native
  
  // https://support.changenow.io
  // TODO region of operation
  var kycPolicy: js.UndefOr[String] = js.native
  
  // https://changenow.io/exchange/txs/{{orderId}}
  var kycUrl: String = js.native
  
  // ChangeNow
  var logo: String = js.native
  
  var name: String = js.native
  
  var sellTickers: js.Array[String] = js.native
  
  // specification of formats required by selected exchange
  var statusUrl: String = js.native
  
  // https://changenow.io/faq#kyc
  var supportUrl: String = js.native
}
object ExchangeProviderInfo {
  
  @scala.inline
  def apply(
    addressFormats: StringMap,
    buyTickers: js.Array[String],
    companyName: String,
    isActive: Boolean,
    isFixedRate: Boolean,
    kycUrl: String,
    logo: String,
    name: String,
    sellTickers: js.Array[String],
    statusUrl: String,
    supportUrl: String
  ): ExchangeProviderInfo = {
    val __obj = js.Dynamic.literal(addressFormats = addressFormats.asInstanceOf[js.Any], buyTickers = buyTickers.asInstanceOf[js.Any], companyName = companyName.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isFixedRate = isFixedRate.asInstanceOf[js.Any], kycUrl = kycUrl.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sellTickers = sellTickers.asInstanceOf[js.Any], statusUrl = statusUrl.asInstanceOf[js.Any], supportUrl = supportUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeProviderInfo]
  }
  
  @scala.inline
  implicit class ExchangeProviderInfoMutableBuilder[Self <: ExchangeProviderInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressFormats(value: StringMap): Self = StObject.set(x, "addressFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyTickers(value: js.Array[String]): Self = StObject.set(x, "buyTickers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyTickersVarargs(value: String*): Self = StObject.set(x, "buyTickers", js.Array(value :_*))
    
    @scala.inline
    def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFixedRate(value: Boolean): Self = StObject.set(x, "isFixedRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRefundRequired(value: Boolean): Self = StObject.set(x, "isRefundRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRefundRequiredUndefined: Self = StObject.set(x, "isRefundRequired", js.undefined)
    
    @scala.inline
    def setKycPolicy(value: String): Self = StObject.set(x, "kycPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKycPolicyUndefined: Self = StObject.set(x, "kycPolicy", js.undefined)
    
    @scala.inline
    def setKycUrl(value: String): Self = StObject.set(x, "kycUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellTickers(value: js.Array[String]): Self = StObject.set(x, "sellTickers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellTickersVarargs(value: String*): Self = StObject.set(x, "sellTickers", js.Array(value :_*))
    
    @scala.inline
    def setStatusUrl(value: String): Self = StObject.set(x, "statusUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportUrl(value: String): Self = StObject.set(x, "supportUrl", value.asInstanceOf[js.Any])
  }
}
