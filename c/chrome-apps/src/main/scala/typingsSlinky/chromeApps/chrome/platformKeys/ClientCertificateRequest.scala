package typingsSlinky.chromeApps.chrome.platformKeys

import typingsSlinky.chromeApps.anon.ECDSASIGN
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.ECDSA_SIGN
import typingsSlinky.chromeApps.chromeAppsStrings.RSA_SIGN
import typingsSlinky.chromeApps.chromeAppsStrings.ecdsaSign
import typingsSlinky.chromeApps.chromeAppsStrings.rsaSign
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Analogous to TLS1.1's CertificateRequest.
  * @see{@link http://tools.ietf.org/html/rfc4346#section-7.4.4}
  */
@js.native
trait ClientCertificateRequest extends js.Object {
  /**
    * List of distinguished names of certificate authorities allowed by the
    * server. Each entry must be a DER-encoded X.509 DistinguishedName.
    */
  var certificateAuthorities: js.Array[js.typedarray.ArrayBuffer] = js.native
  /**
    * This field is a list of the types of certificates requested, sorted in
    * order of the server's preference. Only certificates of a type contained
    * in this list will be retrieved. If *certificateTypes* is the
    * empty list, however, certificates of any type will be returned.
    * @see ClientCertificateType
    */
  var certificateTypes: js.Array[
    ToStringLiteral[
      ECDSASIGN, 
      /* keyof chrome-apps.anon.ECDSASIGN */ RSA_SIGN | ECDSA_SIGN, 
      Exclude[/* keyof chrome-apps.anon.ECDSASIGN */ RSA_SIGN | ECDSA_SIGN, rsaSign | ecdsaSign]
    ]
  ] = js.native
}

object ClientCertificateRequest {
  @scala.inline
  def apply(
    certificateAuthorities: js.Array[js.typedarray.ArrayBuffer],
    certificateTypes: js.Array[
      ToStringLiteral[
        ECDSASIGN, 
        /* keyof chrome-apps.anon.ECDSASIGN */ RSA_SIGN | ECDSA_SIGN, 
        Exclude[/* keyof chrome-apps.anon.ECDSASIGN */ RSA_SIGN | ECDSA_SIGN, rsaSign | ecdsaSign]
      ]
    ]
  ): ClientCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateAuthorities = certificateAuthorities.asInstanceOf[js.Any], certificateTypes = certificateTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCertificateRequest]
  }
  @scala.inline
  implicit class ClientCertificateRequestOps[Self <: ClientCertificateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateAuthorities(value: js.Array[js.typedarray.ArrayBuffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateAuthorities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificateTypes(
      value: js.Array[
          ToStringLiteral[
            ECDSASIGN, 
            /* keyof chrome-apps.anon.ECDSASIGN */ RSA_SIGN | ECDSA_SIGN, 
            Exclude[/* keyof chrome-apps.anon.ECDSASIGN */ RSA_SIGN | ECDSA_SIGN, rsaSign | ecdsaSign]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateTypes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

