package typingsSlinky.nodeForge.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodeForge.mod.Bytes
import typingsSlinky.nodeForge.mod.pki.CAStore
import typingsSlinky.nodeForge.mod.pki.Certificate
import typingsSlinky.nodeForge.mod.pki.PEM
import typingsSlinky.nodeForge.mod.tls.CertificateRequest
import typingsSlinky.nodeForge.mod.tls.CipherSuite
import typingsSlinky.nodeForge.mod.tls.Connection
import typingsSlinky.nodeForge.mod.tls.Session
import typingsSlinky.nodeForge.mod.tls.SessionCache
import typingsSlinky.nodeForge.mod.tls.TLSError
import typingsSlinky.nodeForge.mod.tls.Verified
import typingsSlinky.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaStore extends js.Object {
  var caStore: js.UndefOr[CAStore | js.Array[Certificate]] = js.native
  var cipherSuites: js.UndefOr[js.Array[CipherSuite]] = js.native
  var deflate: js.UndefOr[js.Function1[/* inBytes */ Bytes, Bytes]] = js.native
  var getCertificate: js.UndefOr[
    js.Function2[
      /* conn */ Connection, 
      /* hint */ CertificateRequest | js.Array[String], 
      PEM | js.Array[PEM]
    ]
  ] = js.native
  var getPrivateKey: js.UndefOr[js.Function2[/* conn */ Connection, /* certificate */ Certificate, PEM]] = js.native
  var getSignature: js.UndefOr[
    js.Function3[
      /* conn */ Connection, 
      /* bytes */ Bytes, 
      /* callback */ js.Function2[/* conn */ Connection, /* bytes */ Bytes, Unit], 
      Unit
    ]
  ] = js.native
  var heartbeatReceived: js.UndefOr[js.Function2[/* conn */ Connection, /* payload */ ByteBuffer, Unit]] = js.native
  var inflate: js.UndefOr[js.Function1[/* inBytes */ Bytes, Bytes]] = js.native
  var server: js.UndefOr[Boolean] = js.native
  var sessionCache: js.UndefOr[SessionCache | StringDictionary[Session]] = js.native
  var sessionId: js.UndefOr[Bytes | Null] = js.native
  var verify: js.UndefOr[
    js.Function4[
      /* conn */ Connection, 
      /* verified */ Verified, 
      /* depth */ Double, 
      /* certs */ js.Array[Certificate], 
      Verified
    ]
  ] = js.native
  var verifyClient: js.UndefOr[Boolean] = js.native
  var virtualHost: js.UndefOr[String] = js.native
  def closed(conn: Connection): Unit = js.native
  def connected(conn: Connection): Unit = js.native
  def dataReady(conn: Connection): Unit = js.native
  def error(conn: Connection, error: TLSError): Unit = js.native
  def tlsDataReady(conn: Connection): Unit = js.native
}

object CaStore {
  @scala.inline
  def apply(
    closed: Connection => Unit,
    connected: Connection => Unit,
    dataReady: Connection => Unit,
    error: (Connection, TLSError) => Unit,
    tlsDataReady: Connection => Unit
  ): CaStore = {
    val __obj = js.Dynamic.literal(closed = js.Any.fromFunction1(closed), connected = js.Any.fromFunction1(connected), dataReady = js.Any.fromFunction1(dataReady), error = js.Any.fromFunction2(error), tlsDataReady = js.Any.fromFunction1(tlsDataReady))
    __obj.asInstanceOf[CaStore]
  }
  @scala.inline
  implicit class CaStoreOps[Self <: CaStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClosed(value: Connection => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConnected(value: Connection => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDataReady(value: Connection => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataReady")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withError(value: (Connection, TLSError) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTlsDataReady(value: Connection => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsDataReady")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCaStore(value: CAStore | js.Array[Certificate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caStore")(js.undefined)
        ret
    }
    @scala.inline
    def withCipherSuites(value: js.Array[CipherSuite]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cipherSuites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCipherSuites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cipherSuites")(js.undefined)
        ret
    }
    @scala.inline
    def withDeflate(value: /* inBytes */ Bytes => Bytes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deflate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDeflate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deflate")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCertificate(
      value: (/* conn */ Connection, /* hint */ CertificateRequest | js.Array[String]) => PEM | js.Array[PEM]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCertificate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCertificate")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPrivateKey(value: (/* conn */ Connection, /* certificate */ Certificate) => PEM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrivateKey")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetPrivateKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrivateKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSignature(
      value: (/* conn */ Connection, /* bytes */ Bytes, /* callback */ js.Function2[/* conn */ Connection, /* bytes */ Bytes, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSignature")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSignature")(js.undefined)
        ret
    }
    @scala.inline
    def withHeartbeatReceived(value: (/* conn */ Connection, /* payload */ ByteBuffer) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatReceived")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHeartbeatReceived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatReceived")(js.undefined)
        ret
    }
    @scala.inline
    def withInflate(value: /* inBytes */ Bytes => Bytes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inflate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInflate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inflate")(js.undefined)
        ret
    }
    @scala.inline
    def withServer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionCache(value: SessionCache | StringDictionary[Session]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionCache")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionId(value: Bytes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(null)
        ret
    }
    @scala.inline
    def withVerify(
      value: (/* conn */ Connection, /* verified */ Verified, /* depth */ Double, /* certs */ js.Array[Certificate]) => Verified
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutVerify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.undefined)
        ret
    }
    @scala.inline
    def withVerifyClient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifyClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyClient")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualHost")(js.undefined)
        ret
    }
  }
  
}

