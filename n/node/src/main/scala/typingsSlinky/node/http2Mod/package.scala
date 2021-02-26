package typingsSlinky.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object http2Mod {
  
  type ServerOptions = typingsSlinky.node.http2Mod.ServerSessionOptions
  
  @scala.inline
  def connect(authority: java.lang.String): typingsSlinky.node.http2Mod.ClientHttp2Session = typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(
    authority: java.lang.String,
    listener: js.Function2[
      /* session */ typingsSlinky.node.http2Mod.ClientHttp2Session, 
      /* socket */ typingsSlinky.node.netMod.Socket | typingsSlinky.node.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): typingsSlinky.node.http2Mod.ClientHttp2Session = (typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(
    authority: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[
      /* session */ typingsSlinky.node.http2Mod.ClientHttp2Session, 
      /* socket */ typingsSlinky.node.netMod.Socket | typingsSlinky.node.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): typingsSlinky.node.http2Mod.ClientHttp2Session = (typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(authority: java.lang.String, options: typingsSlinky.node.http2Mod.ClientSessionOptions): typingsSlinky.node.http2Mod.ClientHttp2Session = (typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(
    authority: java.lang.String,
    options: typingsSlinky.node.http2Mod.ClientSessionOptions,
    listener: js.Function2[
      /* session */ typingsSlinky.node.http2Mod.ClientHttp2Session, 
      /* socket */ typingsSlinky.node.netMod.Socket | typingsSlinky.node.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): typingsSlinky.node.http2Mod.ClientHttp2Session = (typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(authority: java.lang.String, options: typingsSlinky.node.http2Mod.SecureClientSessionOptions): typingsSlinky.node.http2Mod.ClientHttp2Session = (typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(
    authority: java.lang.String,
    options: typingsSlinky.node.http2Mod.SecureClientSessionOptions,
    listener: js.Function2[
      /* session */ typingsSlinky.node.http2Mod.ClientHttp2Session, 
      /* socket */ typingsSlinky.node.netMod.Socket | typingsSlinky.node.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): typingsSlinky.node.http2Mod.ClientHttp2Session = (typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(authority: typingsSlinky.node.urlMod.URL_): typingsSlinky.node.http2Mod.ClientHttp2Session = typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(
    authority: typingsSlinky.node.urlMod.URL_,
    listener: js.Function2[
      /* session */ typingsSlinky.node.http2Mod.ClientHttp2Session, 
      /* socket */ typingsSlinky.node.netMod.Socket | typingsSlinky.node.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): typingsSlinky.node.http2Mod.ClientHttp2Session = (typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(
    authority: typingsSlinky.node.urlMod.URL_,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[
      /* session */ typingsSlinky.node.http2Mod.ClientHttp2Session, 
      /* socket */ typingsSlinky.node.netMod.Socket | typingsSlinky.node.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): typingsSlinky.node.http2Mod.ClientHttp2Session = (typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(
    authority: typingsSlinky.node.urlMod.URL_,
    options: typingsSlinky.node.http2Mod.ClientSessionOptions
  ): typingsSlinky.node.http2Mod.ClientHttp2Session = (typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(
    authority: typingsSlinky.node.urlMod.URL_,
    options: typingsSlinky.node.http2Mod.ClientSessionOptions,
    listener: js.Function2[
      /* session */ typingsSlinky.node.http2Mod.ClientHttp2Session, 
      /* socket */ typingsSlinky.node.netMod.Socket | typingsSlinky.node.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): typingsSlinky.node.http2Mod.ClientHttp2Session = (typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(
    authority: typingsSlinky.node.urlMod.URL_,
    options: typingsSlinky.node.http2Mod.SecureClientSessionOptions
  ): typingsSlinky.node.http2Mod.ClientHttp2Session = (typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(
    authority: typingsSlinky.node.urlMod.URL_,
    options: typingsSlinky.node.http2Mod.SecureClientSessionOptions,
    listener: js.Function2[
      /* session */ typingsSlinky.node.http2Mod.ClientHttp2Session, 
      /* socket */ typingsSlinky.node.netMod.Socket | typingsSlinky.node.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): typingsSlinky.node.http2Mod.ClientHttp2Session = (typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.http2Mod.ClientHttp2Session]
  
  @scala.inline
  def createSecureServer(): typingsSlinky.node.http2Mod.Http2SecureServer = typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")().asInstanceOf[typingsSlinky.node.http2Mod.Http2SecureServer]
  @scala.inline
  def createSecureServer(
    onRequestHandler: js.Function2[
      /* request */ typingsSlinky.node.http2Mod.Http2ServerRequest, 
      /* response */ typingsSlinky.node.http2Mod.Http2ServerResponse, 
      scala.Unit
    ]
  ): typingsSlinky.node.http2Mod.Http2SecureServer = typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(onRequestHandler.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.http2Mod.Http2SecureServer]
  @scala.inline
  def createSecureServer(options: typingsSlinky.node.http2Mod.SecureServerOptions): typingsSlinky.node.http2Mod.Http2SecureServer = typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.http2Mod.Http2SecureServer]
  @scala.inline
  def createSecureServer(
    options: typingsSlinky.node.http2Mod.SecureServerOptions,
    onRequestHandler: js.Function2[
      /* request */ typingsSlinky.node.http2Mod.Http2ServerRequest, 
      /* response */ typingsSlinky.node.http2Mod.Http2ServerResponse, 
      scala.Unit
    ]
  ): typingsSlinky.node.http2Mod.Http2SecureServer = (typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(options.asInstanceOf[js.Any], onRequestHandler.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.http2Mod.Http2SecureServer]
  
  @scala.inline
  def createServer(): typingsSlinky.node.http2Mod.Http2Server = typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[typingsSlinky.node.http2Mod.Http2Server]
  @scala.inline
  def createServer(
    onRequestHandler: js.Function2[
      /* request */ typingsSlinky.node.http2Mod.Http2ServerRequest, 
      /* response */ typingsSlinky.node.http2Mod.Http2ServerResponse, 
      scala.Unit
    ]
  ): typingsSlinky.node.http2Mod.Http2Server = typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(onRequestHandler.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.http2Mod.Http2Server]
  @scala.inline
  def createServer(options: typingsSlinky.node.http2Mod.ServerOptions): typingsSlinky.node.http2Mod.Http2Server = typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.http2Mod.Http2Server]
  @scala.inline
  def createServer(
    options: typingsSlinky.node.http2Mod.ServerOptions,
    onRequestHandler: js.Function2[
      /* request */ typingsSlinky.node.http2Mod.Http2ServerRequest, 
      /* response */ typingsSlinky.node.http2Mod.Http2ServerResponse, 
      scala.Unit
    ]
  ): typingsSlinky.node.http2Mod.Http2Server = (typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], onRequestHandler.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.http2Mod.Http2Server]
  
  @scala.inline
  def getDefaultSettings(): typingsSlinky.node.http2Mod.Settings = typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultSettings")().asInstanceOf[typingsSlinky.node.http2Mod.Settings]
  
  @scala.inline
  def getPackedSettings(settings: typingsSlinky.node.http2Mod.Settings): typingsSlinky.node.Buffer = typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("getPackedSettings")(settings.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def getUnpackedSettings(buf: js.typedarray.Uint8Array): typingsSlinky.node.http2Mod.Settings = typingsSlinky.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("getUnpackedSettings")(buf.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.http2Mod.Settings]
}
