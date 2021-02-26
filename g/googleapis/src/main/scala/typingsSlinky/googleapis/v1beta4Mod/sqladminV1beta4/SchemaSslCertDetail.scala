package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SslCertDetail.
  */
@js.native
trait SchemaSslCertDetail extends StObject {
  
  /**
    * The public information about the cert.
    */
  var certInfo: js.UndefOr[SchemaSslCert] = js.native
  
  /**
    * The private key for the client cert, in pem format. Keep private in order
    * to protect your security.
    */
  var certPrivateKey: js.UndefOr[String] = js.native
}
object SchemaSslCertDetail {
  
  @scala.inline
  def apply(): SchemaSslCertDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCertDetail]
  }
  
  @scala.inline
  implicit class SchemaSslCertDetailMutableBuilder[Self <: SchemaSslCertDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertInfo(value: SchemaSslCert): Self = StObject.set(x, "certInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertInfoUndefined: Self = StObject.set(x, "certInfo", js.undefined)
    
    @scala.inline
    def setCertPrivateKey(value: String): Self = StObject.set(x, "certPrivateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertPrivateKeyUndefined: Self = StObject.set(x, "certPrivateKey", js.undefined)
  }
}
