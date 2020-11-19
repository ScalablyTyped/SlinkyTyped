package typingsSlinky.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MasterAuth extends js.Object {
  
  /**
    * [Output only] Base64-encoded public certificate used by clients to
    * authenticate to the cluster endpoint.
    */
  var clientCertificate: js.UndefOr[String] = js.native
  
  /**
    * Configuration for client certificate authentication on the cluster.  If no
    * configuration is specified, a client certificate is issued.
    */
  var clientCertificateConfig: js.UndefOr[ClientCertificateConfig] = js.native
  
  /**
    * [Output only] Base64-encoded private key used by clients to authenticate
    * to the cluster endpoint.
    */
  var clientKey: js.UndefOr[String] = js.native
  
  /**
    * [Output only] Base64-encoded public certificate that is the root of
    * trust for the cluster.
    */
  var clusterCaCertificate: js.UndefOr[String] = js.native
  
  /**
    * The password to use for HTTP basic authentication to the master endpoint.
    * Because the master endpoint is open to the Internet, you should create a
    * strong password.  If a password is provided for cluster creation, username
    * must be non-empty.
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * The username to use for HTTP basic authentication to the master endpoint.
    * For clusters v1.6.0 and later, you can disable basic authentication by
    * providing an empty username.
    */
  var username: js.UndefOr[String] = js.native
}
object MasterAuth {
  
  @scala.inline
  def apply(): MasterAuth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MasterAuth]
  }
  
  @scala.inline
  implicit class MasterAuthOps[Self <: MasterAuth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientCertificate(value: String): Self = this.set("clientCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCertificate: Self = this.set("clientCertificate", js.undefined)
    
    @scala.inline
    def setClientCertificateConfig(value: ClientCertificateConfig): Self = this.set("clientCertificateConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCertificateConfig: Self = this.set("clientCertificateConfig", js.undefined)
    
    @scala.inline
    def setClientKey(value: String): Self = this.set("clientKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientKey: Self = this.set("clientKey", js.undefined)
    
    @scala.inline
    def setClusterCaCertificate(value: String): Self = this.set("clusterCaCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterCaCertificate: Self = this.set("clusterCaCertificate", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
