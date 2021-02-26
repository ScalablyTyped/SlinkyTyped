package typingsSlinky.mangopay2NodejsSdk.anon

import typingsSlinky.mangopay2NodejsSdk.mod.mandate.MandateCultureCode
import typingsSlinky.mangopay2NodejsSdk.mod.mandate.MandateExecutionType
import typingsSlinky.mangopay2NodejsSdk.mod.mandate.MandateScheme
import typingsSlinky.mangopay2NodejsSdk.mod.mandate.MandateStatus
import typingsSlinky.mangopay2NodejsSdk.mod.mandate.MandateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.mandate.MandateData> */
@js.native
trait PartialMandateData extends StObject {
  
  var BankAccountId: js.UndefOr[String] = js.native
  
  var BankReference: js.UndefOr[String] = js.native
  
  var CreationDate: js.UndefOr[Double] = js.native
  
  var Culture: js.UndefOr[MandateCultureCode] = js.native
  
  var DocumentURL: js.UndefOr[String] = js.native
  
  var ExecutionType: js.UndefOr[MandateExecutionType] = js.native
  
  var Id: js.UndefOr[String] = js.native
  
  var MandateType: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.mandate.MandateType] = js.native
  
  var RedirectURL: js.UndefOr[String] = js.native
  
  var ResultCode: js.UndefOr[String] = js.native
  
  var ResultMessage: js.UndefOr[String] = js.native
  
  var ReturnURL: js.UndefOr[String] = js.native
  
  var Scheme: js.UndefOr[MandateScheme] = js.native
  
  var Status: js.UndefOr[MandateStatus] = js.native
  
  var Tag: js.UndefOr[String] = js.native
  
  var UserId: js.UndefOr[String] = js.native
}
object PartialMandateData {
  
  @scala.inline
  def apply(): PartialMandateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMandateData]
  }
  
  @scala.inline
  implicit class PartialMandateDataMutableBuilder[Self <: PartialMandateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBankAccountId(value: String): Self = StObject.set(x, "BankAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBankAccountIdUndefined: Self = StObject.set(x, "BankAccountId", js.undefined)
    
    @scala.inline
    def setBankReference(value: String): Self = StObject.set(x, "BankReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBankReferenceUndefined: Self = StObject.set(x, "BankReference", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setCulture(value: MandateCultureCode): Self = StObject.set(x, "Culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCultureUndefined: Self = StObject.set(x, "Culture", js.undefined)
    
    @scala.inline
    def setDocumentURL(value: String): Self = StObject.set(x, "DocumentURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentURLUndefined: Self = StObject.set(x, "DocumentURL", js.undefined)
    
    @scala.inline
    def setExecutionType(value: MandateExecutionType): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionTypeUndefined: Self = StObject.set(x, "ExecutionType", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setMandateType(value: MandateType): Self = StObject.set(x, "MandateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMandateTypeUndefined: Self = StObject.set(x, "MandateType", js.undefined)
    
    @scala.inline
    def setRedirectURL(value: String): Self = StObject.set(x, "RedirectURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectURLUndefined: Self = StObject.set(x, "RedirectURL", js.undefined)
    
    @scala.inline
    def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCodeUndefined: Self = StObject.set(x, "ResultCode", js.undefined)
    
    @scala.inline
    def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultMessageUndefined: Self = StObject.set(x, "ResultMessage", js.undefined)
    
    @scala.inline
    def setReturnURL(value: String): Self = StObject.set(x, "ReturnURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnURLUndefined: Self = StObject.set(x, "ReturnURL", js.undefined)
    
    @scala.inline
    def setScheme(value: MandateScheme): Self = StObject.set(x, "Scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeUndefined: Self = StObject.set(x, "Scheme", js.undefined)
    
    @scala.inline
    def setStatus(value: MandateStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
