package typingsSlinky.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MutualTlsAuthenticationInput extends StObject {
  
  /**
    * An Amazon S3 URL that specifies the truststore for mutual TLS authentication, for example, s3://bucket-name/key-name. The truststore can contain certificates from public or private certificate authorities. To update the truststore, upload a new version to S3, and then update your custom domain name to use the new version. To update the truststore, you must have permissions to access the S3 object.
    */
  var TruststoreUri: js.UndefOr[UriWithLengthBetween1And2048] = js.native
  
  /**
    * The version of the S3 object that contains your truststore. To specify a version, you must have versioning enabled for the S3 bucket.
    */
  var TruststoreVersion: js.UndefOr[StringWithLengthBetween1And64] = js.native
}
object MutualTlsAuthenticationInput {
  
  @scala.inline
  def apply(): MutualTlsAuthenticationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutualTlsAuthenticationInput]
  }
  
  @scala.inline
  implicit class MutualTlsAuthenticationInputMutableBuilder[Self <: MutualTlsAuthenticationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTruststoreUri(value: UriWithLengthBetween1And2048): Self = StObject.set(x, "TruststoreUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruststoreUriUndefined: Self = StObject.set(x, "TruststoreUri", js.undefined)
    
    @scala.inline
    def setTruststoreVersion(value: StringWithLengthBetween1And64): Self = StObject.set(x, "TruststoreVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruststoreVersionUndefined: Self = StObject.set(x, "TruststoreVersion", js.undefined)
  }
}
