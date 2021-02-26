package typingsSlinky.iamportReactNative

import slinky.core.ReactComponentClass
import typingsSlinky.iamportReactNative.anon.Cardquota
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("iamport-react-native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("iamport-react-native", "default.Certification")
    @js.native
    def Certification: ReactComponentClass[CertificationProps] = js.native
    @scala.inline
    def Certification_=(x: ReactComponentClass[CertificationProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Certification")(x.asInstanceOf[js.Any])
    
    @JSImport("iamport-react-native", "default.Payment")
    @js.native
    def Payment: ReactComponentClass[PaymentProps] = js.native
    @scala.inline
    def Payment_=(x: ReactComponentClass[PaymentProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Payment")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CallbackRsp extends StObject {
    
    var apply_num: js.UndefOr[String] = js.native
    
    var buyer_addr: js.UndefOr[String] = js.native
    
    var buyer_email: js.UndefOr[String] = js.native
    
    var buyer_name: js.UndefOr[String] = js.native
    
    var buyer_postcode: js.UndefOr[String] = js.native
    
    var buyer_tel: js.UndefOr[String] = js.native
    
    var custom_data: js.UndefOr[js.Object] = js.native
    
    var error_code: js.UndefOr[String] = js.native
    
    var error_msg: js.UndefOr[String] = js.native
    
    var imp_success: js.UndefOr[String] = js.native
    
    var imp_uid: js.UndefOr[String] = js.native
    
    var merchant_uid: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var paid_amount: js.UndefOr[String] = js.native
    
    var paid_at: js.UndefOr[Double] = js.native
    
    var pay_method: js.UndefOr[String] = js.native
    
    var pg_provider: js.UndefOr[String] = js.native
    
    var pg_tid: js.UndefOr[String] = js.native
    
    var receipt_url: js.UndefOr[String] = js.native
    
    var status: js.UndefOr[String] = js.native
    
    var success: js.UndefOr[Boolean] = js.native
    
    var vbank_date: js.UndefOr[Double] = js.native
    
    var vbank_holder: js.UndefOr[String] = js.native
    
    var vbank_name: js.UndefOr[String] = js.native
    
    var vbank_num: js.UndefOr[String] = js.native
  }
  object CallbackRsp {
    
    @scala.inline
    def apply(): CallbackRsp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallbackRsp]
    }
    
    @scala.inline
    implicit class CallbackRspMutableBuilder[Self <: CallbackRsp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply_num(value: String): Self = StObject.set(x, "apply_num", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApply_numUndefined: Self = StObject.set(x, "apply_num", js.undefined)
      
      @scala.inline
      def setBuyer_addr(value: String): Self = StObject.set(x, "buyer_addr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuyer_addrUndefined: Self = StObject.set(x, "buyer_addr", js.undefined)
      
      @scala.inline
      def setBuyer_email(value: String): Self = StObject.set(x, "buyer_email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuyer_emailUndefined: Self = StObject.set(x, "buyer_email", js.undefined)
      
      @scala.inline
      def setBuyer_name(value: String): Self = StObject.set(x, "buyer_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuyer_nameUndefined: Self = StObject.set(x, "buyer_name", js.undefined)
      
      @scala.inline
      def setBuyer_postcode(value: String): Self = StObject.set(x, "buyer_postcode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuyer_postcodeUndefined: Self = StObject.set(x, "buyer_postcode", js.undefined)
      
      @scala.inline
      def setBuyer_tel(value: String): Self = StObject.set(x, "buyer_tel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuyer_telUndefined: Self = StObject.set(x, "buyer_tel", js.undefined)
      
      @scala.inline
      def setCustom_data(value: js.Object): Self = StObject.set(x, "custom_data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustom_dataUndefined: Self = StObject.set(x, "custom_data", js.undefined)
      
      @scala.inline
      def setError_code(value: String): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_codeUndefined: Self = StObject.set(x, "error_code", js.undefined)
      
      @scala.inline
      def setError_msg(value: String): Self = StObject.set(x, "error_msg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_msgUndefined: Self = StObject.set(x, "error_msg", js.undefined)
      
      @scala.inline
      def setImp_success(value: String): Self = StObject.set(x, "imp_success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImp_successUndefined: Self = StObject.set(x, "imp_success", js.undefined)
      
      @scala.inline
      def setImp_uid(value: String): Self = StObject.set(x, "imp_uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImp_uidUndefined: Self = StObject.set(x, "imp_uid", js.undefined)
      
      @scala.inline
      def setMerchant_uid(value: String): Self = StObject.set(x, "merchant_uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMerchant_uidUndefined: Self = StObject.set(x, "merchant_uid", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPaid_amount(value: String): Self = StObject.set(x, "paid_amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaid_amountUndefined: Self = StObject.set(x, "paid_amount", js.undefined)
      
      @scala.inline
      def setPaid_at(value: Double): Self = StObject.set(x, "paid_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaid_atUndefined: Self = StObject.set(x, "paid_at", js.undefined)
      
      @scala.inline
      def setPay_method(value: String): Self = StObject.set(x, "pay_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPay_methodUndefined: Self = StObject.set(x, "pay_method", js.undefined)
      
      @scala.inline
      def setPg_provider(value: String): Self = StObject.set(x, "pg_provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPg_providerUndefined: Self = StObject.set(x, "pg_provider", js.undefined)
      
      @scala.inline
      def setPg_tid(value: String): Self = StObject.set(x, "pg_tid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPg_tidUndefined: Self = StObject.set(x, "pg_tid", js.undefined)
      
      @scala.inline
      def setReceipt_url(value: String): Self = StObject.set(x, "receipt_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceipt_urlUndefined: Self = StObject.set(x, "receipt_url", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setVbank_date(value: Double): Self = StObject.set(x, "vbank_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVbank_dateUndefined: Self = StObject.set(x, "vbank_date", js.undefined)
      
      @scala.inline
      def setVbank_holder(value: String): Self = StObject.set(x, "vbank_holder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVbank_holderUndefined: Self = StObject.set(x, "vbank_holder", js.undefined)
      
      @scala.inline
      def setVbank_name(value: String): Self = StObject.set(x, "vbank_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVbank_nameUndefined: Self = StObject.set(x, "vbank_name", js.undefined)
      
      @scala.inline
      def setVbank_num(value: String): Self = StObject.set(x, "vbank_num", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVbank_numUndefined: Self = StObject.set(x, "vbank_num", js.undefined)
    }
  }
  
  @js.native
  trait CertificationData extends StObject {
    
    var app_scheme: js.UndefOr[String] = js.native
    
    var carrier: js.UndefOr[IMP_CARRIERS] = js.native
    
    var company: js.UndefOr[String] = js.native
    
    var merchant_uid: js.UndefOr[String] = js.native
    
    var min_age: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var phone: js.UndefOr[String] = js.native
  }
  object CertificationData {
    
    @scala.inline
    def apply(): CertificationData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificationData]
    }
    
    @scala.inline
    implicit class CertificationDataMutableBuilder[Self <: CertificationData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp_scheme(value: String): Self = StObject.set(x, "app_scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApp_schemeUndefined: Self = StObject.set(x, "app_scheme", js.undefined)
      
      @scala.inline
      def setCarrier(value: IMP_CARRIERS): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
      
      @scala.inline
      def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      @scala.inline
      def setMerchant_uid(value: String): Self = StObject.set(x, "merchant_uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMerchant_uidUndefined: Self = StObject.set(x, "merchant_uid", js.undefined)
      
      @scala.inline
      def setMin_age(value: String): Self = StObject.set(x, "min_age", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin_ageUndefined: Self = StObject.set(x, "min_age", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    }
  }
  
  @js.native
  trait CertificationProps extends StObject {
    
    def callback(rsp: CallbackRsp): Unit = js.native
    
    var data: CertificationData = js.native
    
    var loading: js.UndefOr[js.Object] = js.native
    
    var tierCode: js.UndefOr[String] = js.native
    
    var userCode: String = js.native
  }
  object CertificationProps {
    
    @scala.inline
    def apply(callback: CallbackRsp => Unit, data: CertificationData, userCode: String): CertificationProps = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), data = data.asInstanceOf[js.Any], userCode = userCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificationProps]
    }
    
    @scala.inline
    implicit class CertificationPropsMutableBuilder[Self <: CertificationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: CallbackRsp => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setData(value: CertificationData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoading(value: js.Object): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setTierCode(value: String): Self = StObject.set(x, "tierCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTierCodeUndefined: Self = StObject.set(x, "tierCode", js.undefined)
      
      @scala.inline
      def setUserCode(value: String): Self = StObject.set(x, "userCode", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.SKT
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.KTF
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.LGT
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.MVNO
  */
  trait IMP_CARRIERS extends StObject
  object IMP_CARRIERS {
    
    @scala.inline
    def KTF: typingsSlinky.iamportReactNative.iamportReactNativeStrings.KTF = "KTF".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.KTF]
    
    @scala.inline
    def LGT: typingsSlinky.iamportReactNative.iamportReactNativeStrings.LGT = "LGT".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.LGT]
    
    @scala.inline
    def MVNO: typingsSlinky.iamportReactNative.iamportReactNativeStrings.MVNO = "MVNO".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.MVNO]
    
    @scala.inline
    def SKT: typingsSlinky.iamportReactNative.iamportReactNativeStrings.SKT = "SKT".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.SKT]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.KRW
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.USD
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.EUR
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.JPY
  */
  trait IMP_CURRENCY extends StObject
  object IMP_CURRENCY {
    
    @scala.inline
    def EUR: typingsSlinky.iamportReactNative.iamportReactNativeStrings.EUR = "EUR".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.EUR]
    
    @scala.inline
    def JPY: typingsSlinky.iamportReactNative.iamportReactNativeStrings.JPY = "JPY".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.JPY]
    
    @scala.inline
    def KRW: typingsSlinky.iamportReactNative.iamportReactNativeStrings.KRW = "KRW".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.KRW]
    
    @scala.inline
    def USD: typingsSlinky.iamportReactNative.iamportReactNativeStrings.USD = "USD".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.USD]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.card
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.trans
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.vbank
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.phone
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.samsung
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.kpay
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.cultureland
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.smartculture
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.happymoney
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.booknlife
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.kakaopay
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.lpay
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.payco
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.ssgpay
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.tosspay
  */
  trait IMP_PAY_METHOD extends StObject
  object IMP_PAY_METHOD {
    
    @scala.inline
    def booknlife: typingsSlinky.iamportReactNative.iamportReactNativeStrings.booknlife = "booknlife".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.booknlife]
    
    @scala.inline
    def card: typingsSlinky.iamportReactNative.iamportReactNativeStrings.card = "card".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.card]
    
    @scala.inline
    def cultureland: typingsSlinky.iamportReactNative.iamportReactNativeStrings.cultureland = "cultureland".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.cultureland]
    
    @scala.inline
    def happymoney: typingsSlinky.iamportReactNative.iamportReactNativeStrings.happymoney = "happymoney".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.happymoney]
    
    @scala.inline
    def kakaopay: typingsSlinky.iamportReactNative.iamportReactNativeStrings.kakaopay = "kakaopay".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.kakaopay]
    
    @scala.inline
    def kpay: typingsSlinky.iamportReactNative.iamportReactNativeStrings.kpay = "kpay".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.kpay]
    
    @scala.inline
    def lpay: typingsSlinky.iamportReactNative.iamportReactNativeStrings.lpay = "lpay".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.lpay]
    
    @scala.inline
    def payco: typingsSlinky.iamportReactNative.iamportReactNativeStrings.payco = "payco".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.payco]
    
    @scala.inline
    def phone: typingsSlinky.iamportReactNative.iamportReactNativeStrings.phone = "phone".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.phone]
    
    @scala.inline
    def samsung: typingsSlinky.iamportReactNative.iamportReactNativeStrings.samsung = "samsung".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.samsung]
    
    @scala.inline
    def smartculture: typingsSlinky.iamportReactNative.iamportReactNativeStrings.smartculture = "smartculture".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.smartculture]
    
    @scala.inline
    def ssgpay: typingsSlinky.iamportReactNative.iamportReactNativeStrings.ssgpay = "ssgpay".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.ssgpay]
    
    @scala.inline
    def tosspay: typingsSlinky.iamportReactNative.iamportReactNativeStrings.tosspay = "tosspay".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.tosspay]
    
    @scala.inline
    def trans: typingsSlinky.iamportReactNative.iamportReactNativeStrings.trans = "trans".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.trans]
    
    @scala.inline
    def vbank: typingsSlinky.iamportReactNative.iamportReactNativeStrings.vbank = "vbank".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.vbank]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.html5_inicis
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.inicis
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.uplus
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.kcp
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.kcp_billing
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.nice
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.jtnet
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.kakao
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.kakaopay
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.danal
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.danal_tpay
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.kicc
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.settle
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.mobilians
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.payco
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.eximbay
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.paypal
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.naverco
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.naverpay
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.smilepay
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.chai
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.payple
    - typingsSlinky.iamportReactNative.iamportReactNativeStrings.alipay
  */
  trait IMP_PG extends StObject
  object IMP_PG {
    
    @scala.inline
    def alipay: typingsSlinky.iamportReactNative.iamportReactNativeStrings.alipay = "alipay".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.alipay]
    
    @scala.inline
    def chai: typingsSlinky.iamportReactNative.iamportReactNativeStrings.chai = "chai".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.chai]
    
    @scala.inline
    def danal: typingsSlinky.iamportReactNative.iamportReactNativeStrings.danal = "danal".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.danal]
    
    @scala.inline
    def danal_tpay: typingsSlinky.iamportReactNative.iamportReactNativeStrings.danal_tpay = "danal_tpay".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.danal_tpay]
    
    @scala.inline
    def eximbay: typingsSlinky.iamportReactNative.iamportReactNativeStrings.eximbay = "eximbay".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.eximbay]
    
    @scala.inline
    def html5_inicis: typingsSlinky.iamportReactNative.iamportReactNativeStrings.html5_inicis = "html5_inicis".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.html5_inicis]
    
    @scala.inline
    def inicis: typingsSlinky.iamportReactNative.iamportReactNativeStrings.inicis = "inicis".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.inicis]
    
    @scala.inline
    def jtnet: typingsSlinky.iamportReactNative.iamportReactNativeStrings.jtnet = "jtnet".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.jtnet]
    
    @scala.inline
    def kakao: typingsSlinky.iamportReactNative.iamportReactNativeStrings.kakao = "kakao".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.kakao]
    
    @scala.inline
    def kakaopay: typingsSlinky.iamportReactNative.iamportReactNativeStrings.kakaopay = "kakaopay".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.kakaopay]
    
    @scala.inline
    def kcp: typingsSlinky.iamportReactNative.iamportReactNativeStrings.kcp = "kcp".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.kcp]
    
    @scala.inline
    def kcp_billing: typingsSlinky.iamportReactNative.iamportReactNativeStrings.kcp_billing = "kcp_billing".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.kcp_billing]
    
    @scala.inline
    def kicc: typingsSlinky.iamportReactNative.iamportReactNativeStrings.kicc = "kicc".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.kicc]
    
    @scala.inline
    def mobilians: typingsSlinky.iamportReactNative.iamportReactNativeStrings.mobilians = "mobilians".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.mobilians]
    
    @scala.inline
    def naverco: typingsSlinky.iamportReactNative.iamportReactNativeStrings.naverco = "naverco".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.naverco]
    
    @scala.inline
    def naverpay: typingsSlinky.iamportReactNative.iamportReactNativeStrings.naverpay = "naverpay".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.naverpay]
    
    @scala.inline
    def nice: typingsSlinky.iamportReactNative.iamportReactNativeStrings.nice = "nice".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.nice]
    
    @scala.inline
    def payco: typingsSlinky.iamportReactNative.iamportReactNativeStrings.payco = "payco".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.payco]
    
    @scala.inline
    def paypal: typingsSlinky.iamportReactNative.iamportReactNativeStrings.paypal = "paypal".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.paypal]
    
    @scala.inline
    def payple: typingsSlinky.iamportReactNative.iamportReactNativeStrings.payple = "payple".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.payple]
    
    @scala.inline
    def settle: typingsSlinky.iamportReactNative.iamportReactNativeStrings.settle = "settle".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.settle]
    
    @scala.inline
    def smilepay: typingsSlinky.iamportReactNative.iamportReactNativeStrings.smilepay = "smilepay".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.smilepay]
    
    @scala.inline
    def uplus: typingsSlinky.iamportReactNative.iamportReactNativeStrings.uplus = "uplus".asInstanceOf[typingsSlinky.iamportReactNative.iamportReactNativeStrings.uplus]
  }
  
  @js.native
  trait PaymentData extends StObject {
    
    var amount: Double = js.native
    
    var app_scheme: String = js.native
    
    var biz_num: js.UndefOr[String] = js.native
    
    var buyer_addr: js.UndefOr[String] = js.native
    
    var buyer_email: js.UndefOr[String] = js.native
    
    var buyer_name: js.UndefOr[String] = js.native
    
    var buyer_postcode: js.UndefOr[String] = js.native
    
    var buyer_tel: String = js.native
    
    var currency: js.UndefOr[IMP_CURRENCY] = js.native
    
    var custom_data: js.UndefOr[js.Object] = js.native
    
    var digital: js.UndefOr[Boolean] = js.native
    
    var display: js.UndefOr[Cardquota] = js.native
    
    var escrow: js.UndefOr[Boolean] = js.native
    
    var m_redirect_url: js.UndefOr[String] = js.native
    
    var merchant_uid: String = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var notice_url: js.UndefOr[String | js.Array[String]] = js.native
    
    var pay_method: js.UndefOr[IMP_PAY_METHOD] = js.native
    
    var pg: js.UndefOr[IMP_PG] = js.native
    
    var popup: js.UndefOr[Boolean] = js.native
    
    var tax_free: js.UndefOr[Double] = js.native
    
    var vbank_due: js.UndefOr[String] = js.native
  }
  object PaymentData {
    
    @scala.inline
    def apply(amount: Double, app_scheme: String, buyer_tel: String, merchant_uid: String): PaymentData = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], app_scheme = app_scheme.asInstanceOf[js.Any], buyer_tel = buyer_tel.asInstanceOf[js.Any], merchant_uid = merchant_uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentData]
    }
    
    @scala.inline
    implicit class PaymentDataMutableBuilder[Self <: PaymentData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApp_scheme(value: String): Self = StObject.set(x, "app_scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiz_num(value: String): Self = StObject.set(x, "biz_num", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiz_numUndefined: Self = StObject.set(x, "biz_num", js.undefined)
      
      @scala.inline
      def setBuyer_addr(value: String): Self = StObject.set(x, "buyer_addr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuyer_addrUndefined: Self = StObject.set(x, "buyer_addr", js.undefined)
      
      @scala.inline
      def setBuyer_email(value: String): Self = StObject.set(x, "buyer_email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuyer_emailUndefined: Self = StObject.set(x, "buyer_email", js.undefined)
      
      @scala.inline
      def setBuyer_name(value: String): Self = StObject.set(x, "buyer_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuyer_nameUndefined: Self = StObject.set(x, "buyer_name", js.undefined)
      
      @scala.inline
      def setBuyer_postcode(value: String): Self = StObject.set(x, "buyer_postcode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuyer_postcodeUndefined: Self = StObject.set(x, "buyer_postcode", js.undefined)
      
      @scala.inline
      def setBuyer_tel(value: String): Self = StObject.set(x, "buyer_tel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: IMP_CURRENCY): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setCustom_data(value: js.Object): Self = StObject.set(x, "custom_data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustom_dataUndefined: Self = StObject.set(x, "custom_data", js.undefined)
      
      @scala.inline
      def setDigital(value: Boolean): Self = StObject.set(x, "digital", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDigitalUndefined: Self = StObject.set(x, "digital", js.undefined)
      
      @scala.inline
      def setDisplay(value: Cardquota): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setEscrow(value: Boolean): Self = StObject.set(x, "escrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscrowUndefined: Self = StObject.set(x, "escrow", js.undefined)
      
      @scala.inline
      def setM_redirect_url(value: String): Self = StObject.set(x, "m_redirect_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM_redirect_urlUndefined: Self = StObject.set(x, "m_redirect_url", js.undefined)
      
      @scala.inline
      def setMerchant_uid(value: String): Self = StObject.set(x, "merchant_uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNotice_url(value: String | js.Array[String]): Self = StObject.set(x, "notice_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotice_urlUndefined: Self = StObject.set(x, "notice_url", js.undefined)
      
      @scala.inline
      def setNotice_urlVarargs(value: String*): Self = StObject.set(x, "notice_url", js.Array(value :_*))
      
      @scala.inline
      def setPay_method(value: IMP_PAY_METHOD): Self = StObject.set(x, "pay_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPay_methodUndefined: Self = StObject.set(x, "pay_method", js.undefined)
      
      @scala.inline
      def setPg(value: IMP_PG): Self = StObject.set(x, "pg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPgUndefined: Self = StObject.set(x, "pg", js.undefined)
      
      @scala.inline
      def setPopup(value: Boolean): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
      
      @scala.inline
      def setTax_free(value: Double): Self = StObject.set(x, "tax_free", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTax_freeUndefined: Self = StObject.set(x, "tax_free", js.undefined)
      
      @scala.inline
      def setVbank_due(value: String): Self = StObject.set(x, "vbank_due", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVbank_dueUndefined: Self = StObject.set(x, "vbank_due", js.undefined)
    }
  }
  
  @js.native
  trait PaymentProps extends StObject {
    
    def callback(rsp: CallbackRsp): Unit = js.native
    
    var data: PaymentData = js.native
    
    var handleInicisTrans: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
    
    var loading: js.UndefOr[js.Object] = js.native
    
    var open3rdPartyApp: js.UndefOr[js.Function1[/* iamportUrl */ js.Any, Unit]] = js.native
    
    var tierCode: js.UndefOr[String] = js.native
    
    var userCode: String = js.native
  }
  object PaymentProps {
    
    @scala.inline
    def apply(callback: CallbackRsp => Unit, data: PaymentData, userCode: String): PaymentProps = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), data = data.asInstanceOf[js.Any], userCode = userCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentProps]
    }
    
    @scala.inline
    implicit class PaymentPropsMutableBuilder[Self <: PaymentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: CallbackRsp => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setData(value: PaymentData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleInicisTrans(value: /* event */ js.Any => Unit): Self = StObject.set(x, "handleInicisTrans", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleInicisTransUndefined: Self = StObject.set(x, "handleInicisTrans", js.undefined)
      
      @scala.inline
      def setLoading(value: js.Object): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setOpen3rdPartyApp(value: /* iamportUrl */ js.Any => Unit): Self = StObject.set(x, "open3rdPartyApp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpen3rdPartyAppUndefined: Self = StObject.set(x, "open3rdPartyApp", js.undefined)
      
      @scala.inline
      def setTierCode(value: String): Self = StObject.set(x, "tierCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTierCodeUndefined: Self = StObject.set(x, "tierCode", js.undefined)
      
      @scala.inline
      def setUserCode(value: String): Self = StObject.set(x, "userCode", value.asInstanceOf[js.Any])
    }
  }
}
