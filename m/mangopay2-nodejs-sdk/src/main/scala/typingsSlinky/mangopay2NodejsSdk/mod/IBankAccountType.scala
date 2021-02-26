package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBankAccountType extends StObject {
  
  var CA: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA = js.native
  
  var GB: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB = js.native
  
  var IBAN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN = js.native
  
  var NotSpecified: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified = js.native
  
  var OTHER: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = js.native
  
  var US: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US = js.native
}
object IBankAccountType {
  
  @scala.inline
  def apply(CA: CA, GB: GB, IBAN: IBAN, NotSpecified: NotSpecified, OTHER: OTHER, US: US): IBankAccountType = {
    val __obj = js.Dynamic.literal(CA = CA.asInstanceOf[js.Any], GB = GB.asInstanceOf[js.Any], IBAN = IBAN.asInstanceOf[js.Any], NotSpecified = NotSpecified.asInstanceOf[js.Any], OTHER = OTHER.asInstanceOf[js.Any], US = US.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBankAccountType]
  }
  
  @scala.inline
  implicit class IBankAccountTypeMutableBuilder[Self <: IBankAccountType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCA(value: CA): Self = StObject.set(x, "CA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGB(value: GB): Self = StObject.set(x, "GB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIBAN(value: IBAN): Self = StObject.set(x, "IBAN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotSpecified(value: NotSpecified): Self = StObject.set(x, "NotSpecified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOTHER(value: OTHER): Self = StObject.set(x, "OTHER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUS(value: US): Self = StObject.set(x, "US", value.asInstanceOf[js.Any])
  }
}
