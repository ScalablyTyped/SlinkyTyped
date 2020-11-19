package typingsSlinky.nodemailer.mailerMod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.urlMod.Url
import typingsSlinky.nodemailer.mod.SentMessageInfo
import typingsSlinky.nodemailer.mod.Transport
import typingsSlinky.nodemailer.mod.TransportOptions
import typingsSlinky.nodemailer.nodemailerBooleans.`true`
import typingsSlinky.nodemailer.nodemailerStrings.end
import typingsSlinky.nodemailer.nodemailerStrings.error
import typingsSlinky.nodemailer.nodemailerStrings.idle
import typingsSlinky.nodemailer.nodemailerStrings.oauth2_provision_cb
import typingsSlinky.nodemailer.nodemailerStrings.proxy_handler_http
import typingsSlinky.nodemailer.nodemailerStrings.proxy_handler_https
import typingsSlinky.nodemailer.nodemailerStrings.proxy_handler_socks
import typingsSlinky.nodemailer.nodemailerStrings.proxy_handler_socks4
import typingsSlinky.nodemailer.nodemailerStrings.proxy_handler_socks4a
import typingsSlinky.nodemailer.nodemailerStrings.proxy_handler_socks5
import typingsSlinky.nodemailer.nodemailerStrings.token
import typingsSlinky.nodemailer.sharedMod.Logger
import typingsSlinky.nodemailer.xoauth2Mod.Token
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Creates an object for exposing the Mail API */
@js.native
trait Mail extends EventEmitter {
  
  /** Usage: typeof transporter.MailMessage */
  var MailMessage: typingsSlinky.nodemailer.mailMessageMod.^ = js.native
  
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_token(event: token, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
  
  /** Closes all connections in the pool. If there is a message being sent, the connection is closed later */
  def close(): Unit = js.native
  
  var dkim: typingsSlinky.nodemailer.dkimMod.^ = js.native
  
  @JSName("emit")
  def emit_error(event: error, error: js.Error): Boolean = js.native
  @JSName("emit")
  def emit_idle(event: idle): Boolean = js.native
  @JSName("emit")
  def emit_token(event: token, token: Token): Boolean = js.native
  
  def get(key: String): js.Any = js.native
  
  def getVersionString(): String = js.native
  
  @JSName("get")
  def get_oauth2provisioncb(key: oauth2_provision_cb): js.Function3[
    /* user */ String, 
    /* renew */ Boolean, 
    /* callback */ js.Function3[/* err */ js.Error | Null, /* accessToken */ String, /* expires */ Double, Unit], 
    Unit
  ] = js.native
  @JSName("get")
  def get_proxyhandlerhttp(key: proxy_handler_http): js.Function3[
    /* proxy */ Url, 
    /* options */ TransportOptions, 
    /* callback */ js.Function2[
      /* err */ js.Error | Null, 
      /* socketOptions */ typingsSlinky.nodemailer.anon.Connection, 
      Unit
    ], 
    Unit
  ] = js.native
  @JSName("get")
  def get_proxyhandlerhttps(key: proxy_handler_https): js.Function3[
    /* proxy */ Url, 
    /* options */ TransportOptions, 
    /* callback */ js.Function2[
      /* err */ js.Error | Null, 
      /* socketOptions */ typingsSlinky.nodemailer.anon.Connection, 
      Unit
    ], 
    Unit
  ] = js.native
  @JSName("get")
  def get_proxyhandlersocks(key: proxy_handler_socks): js.Function3[
    /* proxy */ Url, 
    /* options */ TransportOptions, 
    /* callback */ js.Function2[
      /* err */ js.Error | Null, 
      /* socketOptions */ typingsSlinky.nodemailer.anon.Connection, 
      Unit
    ], 
    Unit
  ] = js.native
  @JSName("get")
  def get_proxyhandlersocks4(key: proxy_handler_socks4): js.Function3[
    /* proxy */ Url, 
    /* options */ TransportOptions, 
    /* callback */ js.Function2[
      /* err */ js.Error | Null, 
      /* socketOptions */ typingsSlinky.nodemailer.anon.Connection, 
      Unit
    ], 
    Unit
  ] = js.native
  @JSName("get")
  def get_proxyhandlersocks4a(key: proxy_handler_socks4a): js.Function3[
    /* proxy */ Url, 
    /* options */ TransportOptions, 
    /* callback */ js.Function2[
      /* err */ js.Error | Null, 
      /* socketOptions */ typingsSlinky.nodemailer.anon.Connection, 
      Unit
    ], 
    Unit
  ] = js.native
  @JSName("get")
  def get_proxyhandlersocks5(key: proxy_handler_socks5): js.Function3[
    /* proxy */ Url, 
    /* options */ TransportOptions, 
    /* callback */ js.Function2[
      /* err */ js.Error | Null, 
      /* socketOptions */ typingsSlinky.nodemailer.anon.Connection, 
      Unit
    ], 
    Unit
  ] = js.native
  
  /** Returns true if there are free slots in the queue */
  def isIdle(): Boolean = js.native
  
  @JSName("listeners")
  def listeners_end(event: end): js.Array[js.Function1[/* token */ Token, Unit]] = js.native
  @JSName("listeners")
  def listeners_error(event: error): js.Array[js.Function1[/* err */ js.Error, Unit]] = js.native
  @JSName("listeners")
  def listeners_idle(event: idle): js.Array[js.Function0[Unit]] = js.native
  
  var logger: Logger = js.native
  
  var meta: Map[String, _] = js.native
  
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_token(event: token, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
  
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  def once_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_token(event: token, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
  
  var options: Options = js.native
  
  @JSName("prependListener")
  def prependListener_end(event: end, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: end, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  
  def sendMail(mailOptions: Options): js.Promise[SentMessageInfo] = js.native
  /** Sends an email using the preselected transport object */
  def sendMail(
    mailOptions: Options,
    callback: js.Function2[/* err */ js.Error | Null, /* info */ SentMessageInfo, Unit]
  ): Unit = js.native
  
  def set(key: String, value: js.Any): Map[String, _] = js.native
  @JSName("set")
  def set_oauth2provisioncb(
    key: oauth2_provision_cb,
    value: js.Function3[
      /* user */ String, 
      /* renew */ Boolean, 
      /* callback */ js.Function3[
        /* err */ js.Error | Null, 
        /* accessToken */ js.UndefOr[String], 
        /* expires */ js.UndefOr[Double], 
        Unit
      ], 
      Unit
    ]
  ): Map[String, _] = js.native
  @JSName("set")
  def set_proxyhandlerhttp(
    key: proxy_handler_http,
    value: js.Function3[
      /* proxy */ Url, 
      /* options */ TransportOptions, 
      /* callback */ js.Function2[
        /* err */ js.Error | Null, 
        /* socketOptions */ js.UndefOr[typingsSlinky.nodemailer.anon.Connection], 
        Unit
      ], 
      Unit
    ]
  ): Map[String, _] = js.native
  @JSName("set")
  def set_proxyhandlerhttps(
    key: proxy_handler_https,
    value: js.Function3[
      /* proxy */ Url, 
      /* options */ TransportOptions, 
      /* callback */ js.Function2[
        /* err */ js.Error | Null, 
        /* socketOptions */ js.UndefOr[typingsSlinky.nodemailer.anon.Connection], 
        Unit
      ], 
      Unit
    ]
  ): Map[String, _] = js.native
  @JSName("set")
  def set_proxyhandlersocks(
    key: proxy_handler_socks,
    value: js.Function3[
      /* proxy */ Url, 
      /* options */ TransportOptions, 
      /* callback */ js.Function2[
        /* err */ js.Error | Null, 
        /* socketOptions */ js.UndefOr[typingsSlinky.nodemailer.anon.Connection], 
        Unit
      ], 
      Unit
    ]
  ): Map[String, _] = js.native
  @JSName("set")
  def set_proxyhandlersocks4(
    key: proxy_handler_socks4,
    value: js.Function3[
      /* proxy */ Url, 
      /* options */ TransportOptions, 
      /* callback */ js.Function2[
        /* err */ js.Error | Null, 
        /* socketOptions */ js.UndefOr[typingsSlinky.nodemailer.anon.Connection], 
        Unit
      ], 
      Unit
    ]
  ): Map[String, _] = js.native
  @JSName("set")
  def set_proxyhandlersocks4a(
    key: proxy_handler_socks4a,
    value: js.Function3[
      /* proxy */ Url, 
      /* options */ TransportOptions, 
      /* callback */ js.Function2[
        /* err */ js.Error | Null, 
        /* socketOptions */ js.UndefOr[typingsSlinky.nodemailer.anon.Connection], 
        Unit
      ], 
      Unit
    ]
  ): Map[String, _] = js.native
  @JSName("set")
  def set_proxyhandlersocks5(
    key: proxy_handler_socks5,
    value: js.Function3[
      /* proxy */ Url, 
      /* options */ TransportOptions, 
      /* callback */ js.Function2[
        /* err */ js.Error | Null, 
        /* socketOptions */ js.UndefOr[typingsSlinky.nodemailer.anon.Connection], 
        Unit
      ], 
      Unit
    ]
  ): Map[String, _] = js.native
  
  /** Sets up proxy handler for a Nodemailer object */
  def setupProxy(proxyUrl: String): Unit = js.native
  
  var transporter: Transport = js.native
  
  def use(step: String, plugin: PluginFunction): this.type = js.native
  
  def verify(): js.Promise[`true`] = js.native
  /** Verifies SMTP configuration */
  @JSName("verify")
  def verify_true(callback: js.Function2[/* err */ js.Error | Null, `true`, Unit]): Unit = js.native
}
