package typingsSlinky.awsSdk.acmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCertificatesResponse extends StObject {
  
  /**
    * A list of ACM certificates.
    */
  var CertificateSummaryList: js.UndefOr[typingsSlinky.awsSdk.acmMod.CertificateSummaryList] = js.native
  
  /**
    * When the list is truncated, this value is present and contains the value to use for the NextToken parameter in a subsequent pagination request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.acmMod.NextToken] = js.native
}
object ListCertificatesResponse {
  
  @scala.inline
  def apply(): ListCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificatesResponse]
  }
  
  @scala.inline
  implicit class ListCertificatesResponseMutableBuilder[Self <: ListCertificatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateSummaryList(value: CertificateSummaryList): Self = StObject.set(x, "CertificateSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateSummaryListUndefined: Self = StObject.set(x, "CertificateSummaryList", js.undefined)
    
    @scala.inline
    def setCertificateSummaryListVarargs(value: CertificateSummary*): Self = StObject.set(x, "CertificateSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
