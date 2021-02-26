package typingsSlinky.mangopay2NodejsSdk.anon

import typingsSlinky.mangopay2NodejsSdk.mod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.disputeDocument.DocumentPageConsult> */
@js.native
trait PartialDocumentPageConsul extends StObject {
  
  var ExpirationDate: js.UndefOr[Timestamp] = js.native
  
  var Url: js.UndefOr[String] = js.native
}
object PartialDocumentPageConsul {
  
  @scala.inline
  def apply(): PartialDocumentPageConsul = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDocumentPageConsul]
  }
  
  @scala.inline
  implicit class PartialDocumentPageConsulMutableBuilder[Self <: PartialDocumentPageConsul] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpirationDate(value: Timestamp): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateUndefined: Self = StObject.set(x, "ExpirationDate", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
