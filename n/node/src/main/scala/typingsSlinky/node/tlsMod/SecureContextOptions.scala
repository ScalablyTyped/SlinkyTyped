package typingsSlinky.node.tlsMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecureContextOptions extends js.Object {
  /**
    * Optionally override the trusted CA certificates. Default is to trust
    * the well-known CAs curated by Mozilla. Mozilla's CAs are completely
    * replaced when CAs are explicitly specified using this option.
    */
  var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  /**
    *  Cert chains in PEM format. One cert chain should be provided per
    *  private key. Each cert chain should consist of the PEM formatted
    *  certificate for a provided private key, followed by the PEM
    *  formatted intermediate certificates (if any), in order, and not
    *  including the root CA (the root CA must be pre-known to the peer,
    *  see ca). When providing multiple cert chains, they do not have to
    *  be in the same order as their private keys in key. If the
    *  intermediate certificates are not provided, the peer will not be
    *  able to validate the certificate, and the handshake will fail.
    */
  var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  /**
    * Cipher suite specification, replacing the default. For more
    * information, see modifying the default cipher suite. Permitted
    * ciphers can be obtained via tls.getCiphers(). Cipher names must be
    * uppercased in order for OpenSSL to accept them.
    */
  var ciphers: js.UndefOr[String] = js.native
  /**
    * Name of an OpenSSL engine which can provide the client certificate.
    */
  var clientCertEngine: js.UndefOr[String] = js.native
  /**
    * PEM formatted CRLs (Certificate Revocation Lists).
    */
  var crl: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  /**
    * Diffie Hellman parameters, required for Perfect Forward Secrecy. Use
    * openssl dhparam to create the parameters. The key length must be
    * greater than or equal to 1024 bits or else an error will be thrown.
    * Although 1024 bits is permissible, use 2048 bits or larger for
    * stronger security. If omitted or invalid, the parameters are
    * silently discarded and DHE ciphers will not be available.
    */
  var dhparam: js.UndefOr[String | Buffer] = js.native
  /**
    * A string describing a named curve or a colon separated list of curve
    * NIDs or names, for example P-521:P-384:P-256, to use for ECDH key
    * agreement. Set to auto to select the curve automatically. Use
    * crypto.getCurves() to obtain a list of available curve names. On
    * recent releases, openssl ecparam -list_curves will also display the
    * name and description of each available elliptic curve. Default:
    * tls.DEFAULT_ECDH_CURVE.
    */
  var ecdhCurve: js.UndefOr[String] = js.native
  /**
    * Attempt to use the server's cipher suite preferences instead of the
    * client's. When true, causes SSL_OP_CIPHER_SERVER_PREFERENCE to be
    * set in secureOptions
    */
  var honorCipherOrder: js.UndefOr[Boolean] = js.native
  /**
    * Private keys in PEM format. PEM allows the option of private keys
    * being encrypted. Encrypted keys will be decrypted with
    * options.passphrase. Multiple keys using different algorithms can be
    * provided either as an array of unencrypted key strings or buffers,
    * or an array of objects in the form {pem: <string|buffer>[,
    * passphrase: <string>]}. The object form can only occur in an array.
    * object.passphrase is optional. Encrypted keys will be decrypted with
    * object.passphrase if provided, or options.passphrase if it is not.
    */
  var key: js.UndefOr[String | Buffer | (js.Array[Buffer | KeyObject])] = js.native
  /**
    * Optionally set the maximum TLS version to allow. One
    * of `'TLSv1.3'`, `'TLSv1.2'`, `'TLSv1.1'`, or `'TLSv1'`. Cannot be specified along with the
    * `secureProtocol` option, use one or the other.
    * **Default:** `'TLSv1.3'`, unless changed using CLI options. Using
    * `--tls-max-v1.2` sets the default to `'TLSv1.2'`. Using `--tls-max-v1.3` sets the default to
    * `'TLSv1.3'`. If multiple of the options are provided, the highest maximum is used.
    */
  var maxVersion: js.UndefOr[SecureVersion] = js.native
  /**
    * Optionally set the minimum TLS version to allow. One
    * of `'TLSv1.3'`, `'TLSv1.2'`, `'TLSv1.1'`, or `'TLSv1'`. Cannot be specified along with the
    * `secureProtocol` option, use one or the other.  It is not recommended to use
    * less than TLSv1.2, but it may be required for interoperability.
    * **Default:** `'TLSv1.2'`, unless changed using CLI options. Using
    * `--tls-v1.0` sets the default to `'TLSv1'`. Using `--tls-v1.1` sets the default to
    * `'TLSv1.1'`. Using `--tls-min-v1.3` sets the default to
    * 'TLSv1.3'. If multiple of the options are provided, the lowest minimum is used.
    */
  var minVersion: js.UndefOr[SecureVersion] = js.native
  /**
    * Shared passphrase used for a single private key and/or a PFX.
    */
  var passphrase: js.UndefOr[String] = js.native
  /**
    * PFX or PKCS12 encoded private key and certificate chain. pfx is an
    * alternative to providing key and cert individually. PFX is usually
    * encrypted, if it is, passphrase will be used to decrypt it. Multiple
    * PFX can be provided either as an array of unencrypted PFX buffers,
    * or an array of objects in the form {buf: <string|buffer>[,
    * passphrase: <string>]}. The object form can only occur in an array.
    * object.passphrase is optional. Encrypted PFX will be decrypted with
    * object.passphrase if provided, or options.passphrase if it is not.
    */
  var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | PxfObject])] = js.native
  /**
    * Name of an OpenSSL engine to get private key from. Should be used
    * together with privateKeyIdentifier.
    */
  var privateKeyEngine: js.UndefOr[String] = js.native
  /**
    * Identifier of a private key managed by an OpenSSL engine. Should be
    * used together with privateKeyEngine. Should not be set together with
    * key, because both options define a private key in different ways.
    */
  var privateKeyIdentifier: js.UndefOr[String] = js.native
  /**
    * Optionally affect the OpenSSL protocol behavior, which is not
    * usually necessary. This should be used carefully if at all! Value is
    * a numeric bitmask of the SSL_OP_* options from OpenSSL Options
    */
  var secureOptions: js.UndefOr[Double] = js.native
   // Value is a numeric bitmask of the `SSL_OP_*` options
  /**
    * Legacy mechanism to select the TLS protocol version to use, it does
    * not support independent control of the minimum and maximum version,
    * and does not support limiting the protocol to TLSv1.3. Use
    * minVersion and maxVersion instead. The possible values are listed as
    * SSL_METHODS, use the function names as strings. For example, use
    * 'TLSv1_1_method' to force TLS version 1.1, or 'TLS_method' to allow
    * any TLS protocol version up to TLSv1.3. It is not recommended to use
    * TLS versions less than 1.2, but it may be required for
    * interoperability. Default: none, see minVersion.
    */
  var secureProtocol: js.UndefOr[String] = js.native
  /**
    * Opaque identifier used by servers to ensure session state is not
    * shared between applications. Unused by clients.
    */
  var sessionIdContext: js.UndefOr[String] = js.native
  /**
    *  Colon-separated list of supported signature algorithms. The list
    *  can contain digest algorithms (SHA256, MD5 etc.), public key
    *  algorithms (RSA-PSS, ECDSA etc.), combination of both (e.g
    *  'RSA+SHA384') or TLS v1.3 scheme names (e.g. rsa_pss_pss_sha512).
    */
  var sigalgs: js.UndefOr[String] = js.native
}

object SecureContextOptions {
  @scala.inline
  def apply(): SecureContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureContextOptions]
  }
  @scala.inline
  implicit class SecureContextOptionsOps[Self <: SecureContextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCa(value: String | Buffer | (js.Array[String | Buffer])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ca")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ca")(js.undefined)
        ret
    }
    @scala.inline
    def withCert(value: String | Buffer | (js.Array[String | Buffer])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(js.undefined)
        ret
    }
    @scala.inline
    def withCiphers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCiphers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphers")(js.undefined)
        ret
    }
    @scala.inline
    def withClientCertEngine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCertEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientCertEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCertEngine")(js.undefined)
        ret
    }
    @scala.inline
    def withCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crl")(js.undefined)
        ret
    }
    @scala.inline
    def withDhparam(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dhparam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDhparam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dhparam")(js.undefined)
        ret
    }
    @scala.inline
    def withEcdhCurve(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecdhCurve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcdhCurve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecdhCurve")(js.undefined)
        ret
    }
    @scala.inline
    def withHonorCipherOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("honorCipherOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHonorCipherOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("honorCipherOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String | Buffer | (js.Array[Buffer | KeyObject])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxVersion(value: SecureVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMinVersion(value: SecureVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPassphrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassphrase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(js.undefined)
        ret
    }
    @scala.inline
    def withPfx(value: String | Buffer | (js.Array[String | Buffer | PxfObject])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPfx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfx")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateKeyEngine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeyEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateKeyEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeyEngine")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateKeyIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeyIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateKeyIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeyIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureOptions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionIdContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionIdContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionIdContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionIdContext")(js.undefined)
        ret
    }
    @scala.inline
    def withSigalgs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sigalgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigalgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sigalgs")(js.undefined)
        ret
    }
  }
  
}

