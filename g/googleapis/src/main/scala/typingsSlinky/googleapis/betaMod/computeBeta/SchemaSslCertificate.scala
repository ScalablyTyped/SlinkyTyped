package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An SslCertificate resource. This resource provides a mechanism to upload an
  * SSL key and certificate to the load balancer to serve secure connections
  * from the user. (== resource_for beta.sslCertificates ==) (== resource_for
  * v1.sslCertificates ==)
  */
@js.native
trait SchemaSslCertificate extends js.Object {
  
  /**
    * A local certificate file. The certificate must be in PEM format. The
    * certificate chain must be no greater than 5 certs long. The chain must
    * include at least one intermediate cert.
    */
  var certificate: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Expire time of the certificate. RFC3339
    */
  var expireTime: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Type of the resource. Always compute#sslCertificate for SSL
    * certificates.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Configuration and status of a managed SSL certificate.
    */
  var managed: js.UndefOr[SchemaSslCertificateManagedSslCertificate] = js.native
  
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A write-only private key in PEM format. Only insert requests will include
    * this field.
    */
  var privateKey: js.UndefOr[String] = js.native
  
  /**
    * [Output only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * Configuration and status of a self-managed SSL certificate.
    */
  var selfManaged: js.UndefOr[SchemaSslCertificateSelfManagedSslCertificate] = js.native
  
  /**
    * [Output Only] Domains associated with the certificate via Subject
    * Alternative Name.
    */
  var subjectAlternativeNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * (Optional) Specifies the type of SSL certificate, either
    * &quot;SELF_MANAGED&quot; or &quot;MANAGED&quot;. If not specified, the
    * certificate is self-managed and the fields certificate and private_key
    * are used.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaSslCertificate {
  
  @scala.inline
  def apply(): SchemaSslCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCertificate]
  }
  
  @scala.inline
  implicit class SchemaSslCertificateOps[Self <: SchemaSslCertificate] (val x: Self) extends AnyVal {
    
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
    def setCertificate(value: String): Self = this.set("certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificate: Self = this.set("certificate", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExpireTime(value: String): Self = this.set("expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireTime: Self = this.set("expireTime", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setManaged(value: SchemaSslCertificateManagedSslCertificate): Self = this.set("managed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManaged: Self = this.set("managed", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPrivateKey(value: String): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKey: Self = this.set("privateKey", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setSelfManaged(value: SchemaSslCertificateSelfManagedSslCertificate): Self = this.set("selfManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfManaged: Self = this.set("selfManaged", js.undefined)
    
    @scala.inline
    def setSubjectAlternativeNamesVarargs(value: String*): Self = this.set("subjectAlternativeNames", js.Array(value :_*))
    
    @scala.inline
    def setSubjectAlternativeNames(value: js.Array[String]): Self = this.set("subjectAlternativeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubjectAlternativeNames: Self = this.set("subjectAlternativeNames", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
