package typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesListServerCasResponse extends StObject {
  
  var activeVersion: js.UndefOr[String] = js.native
  
  /** List of server CA certificates for the instance. */
  var certs: js.UndefOr[js.Array[SslCert]] = js.native
  
  /** This is always *sql#instancesListServerCas*. */
  var kind: js.UndefOr[String] = js.native
}
object InstancesListServerCasResponse {
  
  @scala.inline
  def apply(): InstancesListServerCasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesListServerCasResponse]
  }
  
  @scala.inline
  implicit class InstancesListServerCasResponseMutableBuilder[Self <: InstancesListServerCasResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveVersion(value: String): Self = StObject.set(x, "activeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveVersionUndefined: Self = StObject.set(x, "activeVersion", js.undefined)
    
    @scala.inline
    def setCerts(value: js.Array[SslCert]): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertsUndefined: Self = StObject.set(x, "certs", js.undefined)
    
    @scala.inline
    def setCertsVarargs(value: SslCert*): Self = StObject.set(x, "certs", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
