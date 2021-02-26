package typingsSlinky.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HsmClientCertificateMessage extends StObject {
  
  /**
    * A list of the identifiers for one or more HSM client certificates used by Amazon Redshift clusters to store and retrieve database encryption keys in an HSM.
    */
  var HsmClientCertificates: js.UndefOr[HsmClientCertificateList] = js.native
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.native
}
object HsmClientCertificateMessage {
  
  @scala.inline
  def apply(): HsmClientCertificateMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HsmClientCertificateMessage]
  }
  
  @scala.inline
  implicit class HsmClientCertificateMessageMutableBuilder[Self <: HsmClientCertificateMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHsmClientCertificates(value: HsmClientCertificateList): Self = StObject.set(x, "HsmClientCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmClientCertificatesUndefined: Self = StObject.set(x, "HsmClientCertificates", js.undefined)
    
    @scala.inline
    def setHsmClientCertificatesVarargs(value: HsmClientCertificate*): Self = StObject.set(x, "HsmClientCertificates", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
