package typingsSlinky.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tlsMod {
  
  @scala.inline
  def CLIENT_RENEG_LIMIT: scala.Double = typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("CLIENT_RENEG_LIMIT").asInstanceOf[scala.Double]
  
  @scala.inline
  def CLIENT_RENEG_WINDOW: scala.Double = typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("CLIENT_RENEG_WINDOW").asInstanceOf[scala.Double]
  
  /**
    * The default curve name to use for ECDH key agreement in a tls server.
    * The default value is 'auto'. See tls.createSecureContext() for further
    * information.
    */
  @scala.inline
  def DEFAULT_ECDH_CURVE: java.lang.String = typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_ECDH_CURVE").asInstanceOf[java.lang.String]
  @scala.inline
  def DEFAULT_ECDH_CURVE_=(x: java.lang.String): scala.Unit = typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ECDH_CURVE")(x.asInstanceOf[js.Any])
  
  /**
    * The default value of the maxVersion option of
    * tls.createSecureContext(). It can be assigned any of the supported TLS
    * protocol versions, 'TLSv1.3', 'TLSv1.2', 'TLSv1.1', or 'TLSv1'. Default:
    * 'TLSv1.3', unless changed using CLI options. Using --tls-max-v1.2 sets
    * the default to 'TLSv1.2'. Using --tls-max-v1.3 sets the default to
    * 'TLSv1.3'. If multiple of the options are provided, the highest maximum
    * is used.
    */
  @scala.inline
  def DEFAULT_MAX_VERSION: typingsSlinky.node.tlsMod.SecureVersion = typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_MAX_VERSION").asInstanceOf[typingsSlinky.node.tlsMod.SecureVersion]
  @scala.inline
  def DEFAULT_MAX_VERSION_=(x: typingsSlinky.node.tlsMod.SecureVersion): scala.Unit = typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAX_VERSION")(x.asInstanceOf[js.Any])
  
  /**
    * The default value of the minVersion option of tls.createSecureContext().
    * It can be assigned any of the supported TLS protocol versions,
    * 'TLSv1.3', 'TLSv1.2', 'TLSv1.1', or 'TLSv1'. Default: 'TLSv1.2', unless
    * changed using CLI options. Using --tls-min-v1.0 sets the default to
    * 'TLSv1'. Using --tls-min-v1.1 sets the default to 'TLSv1.1'. Using
    * --tls-min-v1.3 sets the default to 'TLSv1.3'. If multiple of the options
    * are provided, the lowest minimum is used.
    */
  @scala.inline
  def DEFAULT_MIN_VERSION: typingsSlinky.node.tlsMod.SecureVersion = typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_MIN_VERSION").asInstanceOf[typingsSlinky.node.tlsMod.SecureVersion]
  @scala.inline
  def DEFAULT_MIN_VERSION_=(x: typingsSlinky.node.tlsMod.SecureVersion): scala.Unit = typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MIN_VERSION")(x.asInstanceOf[js.Any])
  
  /*
    * Verifies the certificate `cert` is issued to host `host`.
    * @host The hostname to verify the certificate against
    * @cert PeerCertificate representing the peer's certificate
    *
    * Returns Error object, populating it with the reason, host and cert on failure.  On success, returns undefined.
    */
  @scala.inline
  def checkServerIdentity(host: java.lang.String, cert: typingsSlinky.node.tlsMod.PeerCertificate): js.UndefOr[js.Error] = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("checkServerIdentity")(host.asInstanceOf[js.Any], cert.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Error]]
  
  @scala.inline
  def connect(options: typingsSlinky.node.tlsMod.ConnectionOptions): typingsSlinky.node.tlsMod.TLSSocket = typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    options: typingsSlinky.node.tlsMod.ConnectionOptions,
    secureConnectListener: js.Function0[scala.Unit]
  ): typingsSlinky.node.tlsMod.TLSSocket = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: scala.Double): typingsSlinky.node.tlsMod.TLSSocket = typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    port: scala.Double,
    host: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    secureConnectListener: js.Function0[scala.Unit]
  ): typingsSlinky.node.tlsMod.TLSSocket = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    port: scala.Double,
    host: js.UndefOr[scala.Nothing],
    options: typingsSlinky.node.tlsMod.ConnectionOptions
  ): typingsSlinky.node.tlsMod.TLSSocket = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    port: scala.Double,
    host: js.UndefOr[scala.Nothing],
    options: typingsSlinky.node.tlsMod.ConnectionOptions,
    secureConnectListener: js.Function0[scala.Unit]
  ): typingsSlinky.node.tlsMod.TLSSocket = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: scala.Double, host: java.lang.String): typingsSlinky.node.tlsMod.TLSSocket = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    port: scala.Double,
    host: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    secureConnectListener: js.Function0[scala.Unit]
  ): typingsSlinky.node.tlsMod.TLSSocket = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: scala.Double, host: java.lang.String, options: typingsSlinky.node.tlsMod.ConnectionOptions): typingsSlinky.node.tlsMod.TLSSocket = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    port: scala.Double,
    host: java.lang.String,
    options: typingsSlinky.node.tlsMod.ConnectionOptions,
    secureConnectListener: js.Function0[scala.Unit]
  ): typingsSlinky.node.tlsMod.TLSSocket = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    port: scala.Double,
    options: js.UndefOr[scala.Nothing],
    secureConnectListener: js.Function0[scala.Unit]
  ): typingsSlinky.node.tlsMod.TLSSocket = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: scala.Double, options: typingsSlinky.node.tlsMod.ConnectionOptions): typingsSlinky.node.tlsMod.TLSSocket = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    port: scala.Double,
    options: typingsSlinky.node.tlsMod.ConnectionOptions,
    secureConnectListener: js.Function0[scala.Unit]
  ): typingsSlinky.node.tlsMod.TLSSocket = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.TLSSocket]
  
  @scala.inline
  def createSecureContext(): typingsSlinky.node.tlsMod.SecureContext = typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecureContext")().asInstanceOf[typingsSlinky.node.tlsMod.SecureContext]
  @scala.inline
  def createSecureContext(options: typingsSlinky.node.tlsMod.SecureContextOptions): typingsSlinky.node.tlsMod.SecureContext = typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecureContext")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.tlsMod.SecureContext]
  
  /**
    * @deprecated since v0.11.3 Use `tls.TLSSocket` instead.
    */
  @scala.inline
  def createSecurePair(): typingsSlinky.node.tlsMod.SecurePair = typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")().asInstanceOf[typingsSlinky.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: js.UndefOr[scala.Nothing],
    isServer: js.UndefOr[scala.Nothing],
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: scala.Boolean
  ): typingsSlinky.node.tlsMod.SecurePair = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: js.UndefOr[scala.Nothing],
    isServer: js.UndefOr[scala.Nothing],
    requestCert: scala.Boolean
  ): typingsSlinky.node.tlsMod.SecurePair = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: js.UndefOr[scala.Nothing],
    isServer: js.UndefOr[scala.Nothing],
    requestCert: scala.Boolean,
    rejectUnauthorized: scala.Boolean
  ): typingsSlinky.node.tlsMod.SecurePair = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(credentials: js.UndefOr[scala.Nothing], isServer: scala.Boolean): typingsSlinky.node.tlsMod.SecurePair = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: js.UndefOr[scala.Nothing],
    isServer: scala.Boolean,
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: scala.Boolean
  ): typingsSlinky.node.tlsMod.SecurePair = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(credentials: js.UndefOr[scala.Nothing], isServer: scala.Boolean, requestCert: scala.Boolean): typingsSlinky.node.tlsMod.SecurePair = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: js.UndefOr[scala.Nothing],
    isServer: scala.Boolean,
    requestCert: scala.Boolean,
    rejectUnauthorized: scala.Boolean
  ): typingsSlinky.node.tlsMod.SecurePair = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(credentials: typingsSlinky.node.tlsMod.SecureContext): typingsSlinky.node.tlsMod.SecurePair = typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: typingsSlinky.node.tlsMod.SecureContext,
    isServer: js.UndefOr[scala.Nothing],
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: scala.Boolean
  ): typingsSlinky.node.tlsMod.SecurePair = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: typingsSlinky.node.tlsMod.SecureContext,
    isServer: js.UndefOr[scala.Nothing],
    requestCert: scala.Boolean
  ): typingsSlinky.node.tlsMod.SecurePair = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: typingsSlinky.node.tlsMod.SecureContext,
    isServer: js.UndefOr[scala.Nothing],
    requestCert: scala.Boolean,
    rejectUnauthorized: scala.Boolean
  ): typingsSlinky.node.tlsMod.SecurePair = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(credentials: typingsSlinky.node.tlsMod.SecureContext, isServer: scala.Boolean): typingsSlinky.node.tlsMod.SecurePair = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: typingsSlinky.node.tlsMod.SecureContext,
    isServer: scala.Boolean,
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: scala.Boolean
  ): typingsSlinky.node.tlsMod.SecurePair = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: typingsSlinky.node.tlsMod.SecureContext,
    isServer: scala.Boolean,
    requestCert: scala.Boolean
  ): typingsSlinky.node.tlsMod.SecurePair = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: typingsSlinky.node.tlsMod.SecureContext,
    isServer: scala.Boolean,
    requestCert: scala.Boolean,
    rejectUnauthorized: scala.Boolean
  ): typingsSlinky.node.tlsMod.SecurePair = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.SecurePair]
  
  @scala.inline
  def createServer(): typingsSlinky.node.tlsMod.Server = typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[typingsSlinky.node.tlsMod.Server]
  @scala.inline
  def createServer(options: typingsSlinky.node.tlsMod.TlsOptions): typingsSlinky.node.tlsMod.Server = typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.tlsMod.Server]
  @scala.inline
  def createServer(
    options: typingsSlinky.node.tlsMod.TlsOptions,
    secureConnectionListener: js.Function1[/* socket */ typingsSlinky.node.tlsMod.TLSSocket, scala.Unit]
  ): typingsSlinky.node.tlsMod.Server = (typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], secureConnectionListener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.tlsMod.Server]
  @scala.inline
  def createServer(
    secureConnectionListener: js.Function1[/* socket */ typingsSlinky.node.tlsMod.TLSSocket, scala.Unit]
  ): typingsSlinky.node.tlsMod.Server = typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(secureConnectionListener.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.tlsMod.Server]
  
  @scala.inline
  def getCiphers(): js.Array[java.lang.String] = typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("getCiphers")().asInstanceOf[js.Array[java.lang.String]]
  
  /**
    * An immutable array of strings representing the root certificates (in PEM
    * format) used for verifying peer certificates. This is the default value
    * of the ca option to tls.createSecureContext().
    */
  @scala.inline
  def rootCertificates: js.Array[java.lang.String] = typingsSlinky.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("rootCertificates").asInstanceOf[js.Array[java.lang.String]]
}
