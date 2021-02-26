package typingsSlinky.licenseKeyGen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("license-key-gen", "createLicense")
  @js.native
  def createLicense(licenseData: licenseData): js.Object = js.native
  
  @JSImport("license-key-gen", "validateLicense")
  @js.native
  def validateLicense(licenseData: licenseData, serial: String): js.Object = js.native
  
  @js.native
  trait licenseData extends StObject {
    
    var appVersion: String = js.native
    
    var info: userInfo = js.native
    
    var osType: String = js.native
    
    var prodCode: String = js.native
  }
  object licenseData {
    
    @scala.inline
    def apply(appVersion: String, info: userInfo, osType: String, prodCode: String): licenseData = {
      val __obj = js.Dynamic.literal(appVersion = appVersion.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], osType = osType.asInstanceOf[js.Any], prodCode = prodCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[licenseData]
    }
    
    @scala.inline
    implicit class licenseDataMutableBuilder[Self <: licenseData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfo(value: userInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOsType(value: String): Self = StObject.set(x, "osType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProdCode(value: String): Self = StObject.set(x, "prodCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait userInfo extends StObject {
    
    var city: String = js.native
    
    var company: String = js.native
    
    var state: String = js.native
    
    var street: String = js.native
    
    var zip: String = js.native
  }
  object userInfo {
    
    @scala.inline
    def apply(city: String, company: String, state: String, street: String, zip: String): userInfo = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
      __obj.asInstanceOf[userInfo]
    }
    
    @scala.inline
    implicit class userInfoMutableBuilder[Self <: userInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    }
  }
}
