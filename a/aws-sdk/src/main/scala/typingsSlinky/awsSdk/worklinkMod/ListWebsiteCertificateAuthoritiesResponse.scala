package typingsSlinky.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWebsiteCertificateAuthoritiesResponse extends StObject {
  
  /**
    * The pagination token used to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.NextToken] = js.native
  
  /**
    * Information about the certificates.
    */
  var WebsiteCertificateAuthorities: js.UndefOr[WebsiteCaSummaryList] = js.native
}
object ListWebsiteCertificateAuthoritiesResponse {
  
  @scala.inline
  def apply(): ListWebsiteCertificateAuthoritiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWebsiteCertificateAuthoritiesResponse]
  }
  
  @scala.inline
  implicit class ListWebsiteCertificateAuthoritiesResponseMutableBuilder[Self <: ListWebsiteCertificateAuthoritiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setWebsiteCertificateAuthorities(value: WebsiteCaSummaryList): Self = StObject.set(x, "WebsiteCertificateAuthorities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteCertificateAuthoritiesUndefined: Self = StObject.set(x, "WebsiteCertificateAuthorities", js.undefined)
    
    @scala.inline
    def setWebsiteCertificateAuthoritiesVarargs(value: WebsiteCaSummary*): Self = StObject.set(x, "WebsiteCertificateAuthorities", js.Array(value :_*))
  }
}
