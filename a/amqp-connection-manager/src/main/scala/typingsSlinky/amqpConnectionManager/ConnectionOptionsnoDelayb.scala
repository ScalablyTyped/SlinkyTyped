package typingsSlinky.amqpConnectionManager

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.dnsMod.LookupOneOptions
import typingsSlinky.node.netMod.LookupFunction
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.tlsMod.KeyObject
import typingsSlinky.node.tlsMod.PSKCallbackNegotation
import typingsSlinky.node.tlsMod.PeerCertificate
import typingsSlinky.node.tlsMod.PxfObject
import typingsSlinky.node.tlsMod.SecureContext
import typingsSlinky.node.tlsMod.SecureVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined node.tls.ConnectionOptions & {  noDelay ? :boolean,   timeout ? :number,   keepAlive ? :boolean,   keepAliveDelay ? :number,   clientProperties ? :any,   credentials ? :{  mechanism  :string,   username  :string,   password  :string, response (): node.Buffer}} */
@js.native
trait ConnectionOptionsnoDelayb extends js.Object {
  /**
    * An array of strings or a Buffer naming possible ALPN protocols.
    * (Protocols should be ordered by their priority.)
    */
  var ALPNProtocols: js.UndefOr[(js.Array[String | js.typedarray.Uint8Array]) | js.typedarray.Uint8Array] = js.native
  /**
    * SNICallback(servername, cb) <Function> A function that will be
    * called if the client supports SNI TLS extension. Two arguments
    * will be passed when called: servername and cb. SNICallback should
    * invoke cb(null, ctx), where ctx is a SecureContext instance.
    * (tls.createSecureContext(...) can be used to get a proper
    * SecureContext.) If SNICallback wasn't provided the default callback
    * with high-level API will be used (see below).
    */
  var SNICallback: js.UndefOr[
    js.Function2[
      /* servername */ String, 
      /* cb */ js.Function2[/* err */ js.Error | Null, /* ctx */ SecureContext, Unit], 
      Unit
    ]
  ] = js.native
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
   // Establish secure connection on a given socket rather than creating a new socket
  var checkServerIdentity: js.UndefOr[
    js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[js.Error]]
  ] = js.native
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
  var clientProperties: js.UndefOr[js.Any] = js.native
  var credentials: js.UndefOr[AnonMechanism] = js.native
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
    * When enabled, TLS packet trace information is written to `stderr`. This can be
    * used to debug TLS connection problems.
    * @default false
    */
  var enableTrace: js.UndefOr[Boolean] = js.native
  /**
    * Attempt to use the server's cipher suite preferences instead of the
    * client's. When true, causes SSL_OP_CIPHER_SERVER_PREFERENCE to be
    * set in secureOptions
    */
  var honorCipherOrder: js.UndefOr[Boolean] = js.native
  var host: js.UndefOr[String] = js.native
  var keepAlive: js.UndefOr[Boolean] = js.native
  var keepAliveDelay: js.UndefOr[Double] = js.native
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
  var lookup: js.UndefOr[LookupFunction] = js.native
  /**
    * Optionally set the maximum TLS version to allow. One
    * of `'TLSv1.3'`, `'TLSv1.2'`, `'TLSv1.1'`, or `'TLSv1'`. Cannot be specified along with the
    * `secureProtocol` option, use one or the other.
    * **Default:** `'TLSv1.3'`, unless changed using CLI options. Using
    * `--tls-max-v1.2` sets the default to `'TLSv1.2'`. Using `--tls-max-v1.3` sets the default to
    * `'TLSv1.3'`. If multiple of the options are provided, the highest maximum is used.
    */
  var maxVersion: js.UndefOr[SecureVersion] = js.native
  var minDHSize: js.UndefOr[Double] = js.native
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
  var noDelay: js.UndefOr[Boolean] = js.native
  /**
    * Shared passphrase used for a single private key and/or a PFX.
    */
  var passphrase: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
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
  var port: js.UndefOr[Double] = js.native
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
    * When negotiating TLS-PSK (pre-shared keys), this function is called
    * with optional identity `hint` provided by the server or `null`
    * in case of TLS 1.3 where `hint` was removed.
    * It will be necessary to provide a custom `tls.checkServerIdentity()`
    * for the connection as the default one will try to check hostname/IP
    * of the server against the certificate but that's not applicable for PSK
    * because there won't be a certificate present.
    * More information can be found in the RFC 4279.
    *
    * @param hint message sent from the server to help client
    * decide which identity to use during negotiation.
    * Always `null` if TLS 1.3 is used.
    * @returns Return `null` to stop the negotiation process. `psk` must be
    * compatible with the selected cipher's digest.
    * `identity` must use UTF-8 encoding.
    */
  var pskCallback: js.UndefOr[js.Function1[/* hint */ String | Null, PSKCallbackNegotation | Null]] = js.native
  /**
    * If true the server will reject any connection which is not
    * authorized with the list of supplied CAs. This option only has an
    * effect if requestCert is true.
    * @default true
    */
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  /**
    * If true the server will request a certificate from clients that
    * connect and attempt to verify that certificate. Defaults to
    * false.
    */
  var requestCert: js.UndefOr[Boolean] = js.native
  /**
    * An optional TLS context object from tls.createSecureContext()
    */
  var secureContext: js.UndefOr[SecureContext] = js.native
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
  var servername: js.UndefOr[String] = js.native
   // SNI TLS Extension
  var session: js.UndefOr[Buffer] = js.native
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
   // Creates unix socket connection to path. If this option is specified, `host` and `port` are ignored.
  var socket: js.UndefOr[Socket] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object ConnectionOptionsnoDelayb {
  @scala.inline
  def apply(): ConnectionOptionsnoDelayb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptionsnoDelayb]
  }
  @scala.inline
  implicit class ConnectionOptionsnoDelaybOps[Self <: ConnectionOptionsnoDelayb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withALPNProtocolsUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALPNProtocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withALPNProtocols(value: (js.Array[String | js.typedarray.Uint8Array]) | js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALPNProtocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutALPNProtocols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALPNProtocols")(js.undefined)
        ret
    }
    @scala.inline
    def withSNICallback(
      value: (/* servername */ String, /* cb */ js.Function2[/* err */ js.Error | Null, /* ctx */ SecureContext, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SNICallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSNICallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SNICallback")(js.undefined)
        ret
    }
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
    def withCheckServerIdentity(value: (/* host */ String, /* cert */ PeerCertificate) => js.UndefOr[js.Error]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkServerIdentity")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCheckServerIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkServerIdentity")(js.undefined)
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
    def withClientProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentials(value: AnonMechanism): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
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
    def withEnableTrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTrace")(js.undefined)
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
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepAlive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAlive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepAliveDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAliveDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveDelay")(js.undefined)
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
    def withLookup(
      value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutLookup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(js.undefined)
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
    def withMinDHSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDHSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDHSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDHSize")(js.undefined)
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
    def withNoDelay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDelay")(js.undefined)
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
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
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
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
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
    def withPskCallback(value: /* hint */ String | Null => PSKCallbackNegotation | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pskCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPskCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pskCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectUnauthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectUnauthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestCert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCert")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureContext(value: SecureContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureContext")(js.undefined)
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
    def withServername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servername")(js.undefined)
        ret
    }
    @scala.inline
    def withSession(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
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
    @scala.inline
    def withSocket(value: Socket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

