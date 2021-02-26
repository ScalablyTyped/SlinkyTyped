package typingsSlinky.node.tlsMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.anon.AllowHalfOpen
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.nodeStrings.OCSPRequest
import typingsSlinky.node.nodeStrings.keylog
import typingsSlinky.node.nodeStrings.newSession
import typingsSlinky.node.nodeStrings.resumeSession
import typingsSlinky.node.nodeStrings.secureConnection
import typingsSlinky.node.nodeStrings.tlsClientError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tls", "Server")
@js.native
class Server ()
  extends typingsSlinky.node.netMod.Server {
  def this(connectionListener: js.Function1[/* socket */ Socket, Unit]) = this()
  def this(options: AllowHalfOpen) = this()
  def this(options: js.UndefOr[scala.Nothing], connectionListener: js.Function1[/* socket */ Socket, Unit]) = this()
  def this(options: AllowHalfOpen, connectionListener: js.Function1[/* socket */ Socket, Unit]) = this()
  
  /**
    * The server.addContext() method adds a secure context that will be
    * used if the client request's SNI name matches the supplied hostname
    * (or wildcard).
    */
  def addContext(hostName: String, credentials: SecureContextOptions): Unit = js.native
  
  @JSName("addListener")
  def addListener_OCSPRequest(
    event: OCSPRequest,
    listener: js.Function3[
      /* certificate */ Buffer, 
      /* issuer */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* resp */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_keylog(event: keylog, listener: js.Function2[/* line */ Buffer, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_newSession(
    event: newSession,
    listener: js.Function3[
      /* sessionId */ Buffer, 
      /* sessionData */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error, /* resp */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_resumeSession(
    event: resumeSession,
    listener: js.Function2[
      /* sessionId */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error, /* sessionData */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_secureConnection(event: secureConnection, listener: js.Function1[/* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_tlsClientError(event: tlsClientError, listener: js.Function2[/* err */ js.Error, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  
  @JSName("emit")
  def emit_OCSPRequest(
    event: OCSPRequest,
    certificate: Buffer,
    issuer: Buffer,
    callback: js.Function2[/* err */ js.Error | Null, /* resp */ Buffer, Unit]
  ): Boolean = js.native
  @JSName("emit")
  def emit_keylog(event: keylog, line: Buffer, tlsSocket: TLSSocket): Boolean = js.native
  @JSName("emit")
  def emit_newSession(
    event: newSession,
    sessionId: Buffer,
    sessionData: Buffer,
    callback: js.Function2[/* err */ js.Error, /* resp */ Buffer, Unit]
  ): Boolean = js.native
  @JSName("emit")
  def emit_resumeSession(
    event: resumeSession,
    sessionId: Buffer,
    callback: js.Function2[/* err */ js.Error, /* sessionData */ Buffer, Unit]
  ): Boolean = js.native
  @JSName("emit")
  def emit_secureConnection(event: secureConnection, tlsSocket: TLSSocket): Boolean = js.native
  @JSName("emit")
  def emit_tlsClientError(event: tlsClientError, err: js.Error, tlsSocket: TLSSocket): Boolean = js.native
  
  /**
    * Returns the session ticket keys.
    */
  def getTicketKeys(): Buffer = js.native
  
  @JSName("on")
  def on_OCSPRequest(
    event: OCSPRequest,
    listener: js.Function3[
      /* certificate */ Buffer, 
      /* issuer */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* resp */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_keylog(event: keylog, listener: js.Function2[/* line */ Buffer, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("on")
  def on_newSession(
    event: newSession,
    listener: js.Function3[
      /* sessionId */ Buffer, 
      /* sessionData */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error, /* resp */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_resumeSession(
    event: resumeSession,
    listener: js.Function2[
      /* sessionId */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error, /* sessionData */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_secureConnection(event: secureConnection, listener: js.Function1[/* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("on")
  def on_tlsClientError(event: tlsClientError, listener: js.Function2[/* err */ js.Error, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  
  @JSName("once")
  def once_OCSPRequest(
    event: OCSPRequest,
    listener: js.Function3[
      /* certificate */ Buffer, 
      /* issuer */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* resp */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_keylog(event: keylog, listener: js.Function2[/* line */ Buffer, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("once")
  def once_newSession(
    event: newSession,
    listener: js.Function3[
      /* sessionId */ Buffer, 
      /* sessionData */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error, /* resp */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_resumeSession(
    event: resumeSession,
    listener: js.Function2[
      /* sessionId */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error, /* sessionData */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_secureConnection(event: secureConnection, listener: js.Function1[/* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("once")
  def once_tlsClientError(event: tlsClientError, listener: js.Function2[/* err */ js.Error, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  
  @JSName("prependListener")
  def prependListener_OCSPRequest(
    event: OCSPRequest,
    listener: js.Function3[
      /* certificate */ Buffer, 
      /* issuer */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* resp */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_keylog(event: keylog, listener: js.Function2[/* line */ Buffer, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_newSession(
    event: newSession,
    listener: js.Function3[
      /* sessionId */ Buffer, 
      /* sessionData */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error, /* resp */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_resumeSession(
    event: resumeSession,
    listener: js.Function2[
      /* sessionId */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error, /* sessionData */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_secureConnection(event: secureConnection, listener: js.Function1[/* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_tlsClientError(event: tlsClientError, listener: js.Function2[/* err */ js.Error, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_OCSPRequest(
    event: OCSPRequest,
    listener: js.Function3[
      /* certificate */ Buffer, 
      /* issuer */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* resp */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_keylog(event: keylog, listener: js.Function2[/* line */ Buffer, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_newSession(
    event: newSession,
    listener: js.Function3[
      /* sessionId */ Buffer, 
      /* sessionData */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error, /* resp */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_resumeSession(
    event: resumeSession,
    listener: js.Function2[
      /* sessionId */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error, /* sessionData */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_secureConnection(event: secureConnection, listener: js.Function1[/* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_tlsClientError(event: tlsClientError, listener: js.Function2[/* err */ js.Error, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  
  /**
    *
    * The server.setSecureContext() method replaces the
    * secure context of an existing server. Existing connections to the
    * server are not interrupted.
    */
  def setSecureContext(details: SecureContextOptions): Unit = js.native
  
  /**
    * The server.setSecureContext() method replaces the secure context of
    * an existing server. Existing connections to the server are not
    * interrupted.
    */
  def setTicketKeys(keys: Buffer): Unit = js.native
}
