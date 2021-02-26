package typingsSlinky.node.tlsMod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecureContextOptions extends StObject {
  
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
    * The number of seconds after which a TLS session created by the
    * server will no longer be resumable. See Session Resumption for more
    * information. Default: 300.
    */
  var sessionTimeout: js.UndefOr[Double] = js.native
  
  /**
    *  Colon-separated list of supported signature algorithms. The list
    *  can contain digest algorithms (SHA256, MD5 etc.), public key
    *  algorithms (RSA-PSS, ECDSA etc.), combination of both (e.g
    *  'RSA+SHA384') or TLS v1.3 scheme names (e.g. rsa_pss_pss_sha512).
    */
  var sigalgs: js.UndefOr[String] = js.native
  
  /**
    * 48-bytes of cryptographically strong pseudo-random data.
    * See Session Resumption for more information.
    */
  var ticketKeys: js.UndefOr[Buffer] = js.native
}
object SecureContextOptions {
  
  @scala.inline
  def apply(): SecureContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureContextOptions]
  }
  
  @scala.inline
  implicit class SecureContextOptionsMutableBuilder[Self <: SecureContextOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
    
    @scala.inline
    def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value :_*))
    
    @scala.inline
    def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    @scala.inline
    def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value :_*))
    
    @scala.inline
    def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
    
    @scala.inline
    def setClientCertEngine(value: String): Self = StObject.set(x, "clientCertEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCertEngineUndefined: Self = StObject.set(x, "clientCertEngine", js.undefined)
    
    @scala.inline
    def setCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrlUndefined: Self = StObject.set(x, "crl", js.undefined)
    
    @scala.inline
    def setCrlVarargs(value: (String | Buffer)*): Self = StObject.set(x, "crl", js.Array(value :_*))
    
    @scala.inline
    def setDhparam(value: String | Buffer): Self = StObject.set(x, "dhparam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDhparamUndefined: Self = StObject.set(x, "dhparam", js.undefined)
    
    @scala.inline
    def setEcdhCurve(value: String): Self = StObject.set(x, "ecdhCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcdhCurveUndefined: Self = StObject.set(x, "ecdhCurve", js.undefined)
    
    @scala.inline
    def setHonorCipherOrder(value: Boolean): Self = StObject.set(x, "honorCipherOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHonorCipherOrderUndefined: Self = StObject.set(x, "honorCipherOrder", js.undefined)
    
    @scala.inline
    def setKey(value: String | Buffer | (js.Array[Buffer | KeyObject])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setKeyVarargs(value: (Buffer | KeyObject)*): Self = StObject.set(x, "key", js.Array(value :_*))
    
    @scala.inline
    def setMaxVersion(value: SecureVersion): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVersionUndefined: Self = StObject.set(x, "maxVersion", js.undefined)
    
    @scala.inline
    def setMinVersion(value: SecureVersion): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinVersionUndefined: Self = StObject.set(x, "minVersion", js.undefined)
    
    @scala.inline
    def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    
    @scala.inline
    def setPfx(value: String | Buffer | (js.Array[String | Buffer | PxfObject])): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
    
    @scala.inline
    def setPfxVarargs(value: (String | Buffer | PxfObject)*): Self = StObject.set(x, "pfx", js.Array(value :_*))
    
    @scala.inline
    def setPrivateKeyEngine(value: String): Self = StObject.set(x, "privateKeyEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyEngineUndefined: Self = StObject.set(x, "privateKeyEngine", js.undefined)
    
    @scala.inline
    def setPrivateKeyIdentifier(value: String): Self = StObject.set(x, "privateKeyIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyIdentifierUndefined: Self = StObject.set(x, "privateKeyIdentifier", js.undefined)
    
    @scala.inline
    def setSecureOptions(value: Double): Self = StObject.set(x, "secureOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureOptionsUndefined: Self = StObject.set(x, "secureOptions", js.undefined)
    
    @scala.inline
    def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
    
    @scala.inline
    def setSessionIdContext(value: String): Self = StObject.set(x, "sessionIdContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdContextUndefined: Self = StObject.set(x, "sessionIdContext", js.undefined)
    
    @scala.inline
    def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
    
    @scala.inline
    def setSigalgs(value: String): Self = StObject.set(x, "sigalgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigalgsUndefined: Self = StObject.set(x, "sigalgs", js.undefined)
    
    @scala.inline
    def setTicketKeys(value: Buffer): Self = StObject.set(x, "ticketKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicketKeysUndefined: Self = StObject.set(x, "ticketKeys", js.undefined)
  }
}
