package typingsSlinky.irc

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.irc.anon.Channel
import typingsSlinky.irc.anon.Created
import typingsSlinky.irc.mod.handlers.IJoinChannel
import typingsSlinky.irc.mod.handlers.IPartChannel
import typingsSlinky.irc.mod.handlers.IRaw
import typingsSlinky.irc.mod.handlers.IWhois
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.tlsMod.SecureContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("irc", "Client")
  @js.native
  class Client protected () extends EventEmitter {
    /**
      * Connect to an IRC server
      * @param server - server hostname
      * @param nick - nickname
      * @param opts
      */
    def this(server: String, nick: String) = this()
    def this(server: String, nick: String, opts: IClientOpts) = this()
    
    /**
      * Send an action to the specified target
      * @param target - target
      * @param message - message
      */
    def action(target: String, message: String): Unit = js.native
    
    /**
      * Activate flood protection “after the fact”. You can also use
      * floodProtection while instantiating the Client to enable flood
      * protection, and floodProtectionDelay to set the default message
      * interval.
      * @param interval - ms to wait between messages
      */
    def activateFloodProtection(interval: Double): Unit = js.native
    
    /** Channel listing data. */
    var channellist: js.Array[IChannel] = js.native
    
    /**
      * Channels joined. Includes channel modes, user list, and topic
      * information. Only updated after the server recognizes the join.
      */
    var chans: StringDictionary[Created] = js.native
    
    /**
      * Socket to the server. Rarely, if ever needed. Use Client#send
      * instead.
      */
    var conn: Socket = js.native
    
    /**
      * Connect to the server. Use when `autoConnect` is false.
      * @param retryCount - times to retry
      * @param callback
      */
    def connect(): Unit = js.native
    def connect(retryCount: js.UndefOr[scala.Nothing], callback: IRaw): Unit = js.native
    def connect(retryCount: Double): Unit = js.native
    def connect(retryCount: Double, callback: IRaw): Unit = js.native
    def connect(retryCount: IRaw): Unit = js.native
    def connect(retryCount: IRaw, callback: IRaw): Unit = js.native
    
    /**
      * Send a CTCP message to the specified target
      * @param target - nick or channel
      * @param type - "privmsg" for PRIVMSG, anything else for NOTICE
      * @param text - CTCP message
      */
    def ctcp(target: String, `type`: String, text: String): Unit = js.native
    
    /**
      * Disconnect from the IRC server
      * @param message - message to send
      * @param callback
      */
    def disconnect(message: String, callback: js.Function0[Unit]): Unit = js.native
    
    /** Host mask */
    var hostMask: String = js.native
    
    /**
      * Join the specified channel
      * @param channel - channel to join
      * @param callback
      */
    def join(channel: String): Unit = js.native
    def join(channel: String, callback: IJoinChannel): Unit = js.native
    
    /**
      * Request a channel listing from the server. The arguments for this
      * are farily server specific, this method passes them as specified.
      *
      * Responses from the server are available via `channellist_start`,
      * `channellist_item`, and `channellist` events.
      *
      * @param args - arguments
      */
    def list(args: String*): Unit = js.native
    
    /** Maximum line length */
    var maxLineLength: Double = js.native
    
    /** IRC server MOTD */
    var motd: String = js.native
    
    /**
      * The current nick of the client. Updated if the nick changes
      */
    var nick: String = js.native
    
    /**
      * Send a notice to the specified target.
      * @param target - nick or channel
      * @param message - message to send
      */
    def notice(target: String, message: String): Unit = js.native
    
    /** Bot options */
    var opt: IClientOpts = js.native
    
    /**
      * Part the specified channel
      * @param channel - channel to part
      * @param message - optional message to send
      * @param callback
      */
    def part(channel: String, message: String, callback: IPartChannel): Unit = js.native
    
    /**
      * Send a message to the specified target
      * @param target - nick or channel
      * @param message - message to send
      */
    def say(target: String, message: String): Unit = js.native
    
    /**
      * Send a raw message to the server; generally speaking, it’s best
      * not to use this method unless you know what you’re doing.
      * @param command - irc command
      * @param args - command arguments (splat)
      */
    def send(command: String, args: String*): Unit = js.native
    
    /** Features supported by the server */
    var supported: Channel = js.native
    
    /**
      * Request a whois for the specified nick
      * @param nick - nickname
      * @param callback
      */
    def whois(nick: String, callback: IWhois): Unit = js.native
  }
  
  @js.native
  sealed trait CommandType extends StObject
  @JSImport("irc", "CommandType")
  @js.native
  object CommandType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CommandType with Double] = js.native
    
    @js.native
    sealed trait error extends CommandType
    /* 2 */ val error: typingsSlinky.irc.mod.CommandType.error with Double = js.native
    
    @js.native
    sealed trait normal extends CommandType
    /* 0 */ val normal: typingsSlinky.irc.mod.CommandType.normal with Double = js.native
    
    @js.native
    sealed trait reply extends CommandType
    /* 1 */ val reply: typingsSlinky.irc.mod.CommandType.reply with Double = js.native
  }
  
  /** Colors */
  object colors {
    
    @JSImport("irc", "colors.wrap")
    @js.native
    def wrap(color: String, text: String): String = js.native
    @JSImport("irc", "colors.wrap")
    @js.native
    def wrap(color: String, text: String, reset_color: String): String = js.native
  }
  
  @js.native
  trait IChannel extends StObject {
    
    /** Channel name */
    var name: String = js.native
    
    /** Topic string */
    var topic: String = js.native
    
    /** User count */
    var users: String = js.native
  }
  object IChannel {
    
    @scala.inline
    def apply(name: String, topic: String, users: String): IChannel = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChannel]
    }
    
    @scala.inline
    implicit class IChannelMutableBuilder[Self <: IChannel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: String): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IClientOpts extends StObject {
    
    /**
      * Should we auto-reconnect to networks?
      * @default true
      */
    var autoConnect: js.UndefOr[Boolean] = js.native
    
    /**
      * Should we auto-rejoin channels?
      * @default false
      */
    var autoRejoin: js.UndefOr[Boolean] = js.native
    
    /**
      * Should we accept expired certificates?
      * @default false
      */
    var certExpired: js.UndefOr[Boolean] = js.native
    
    /**
      * Channel prefix
      * @default '&#'
      */
    var channelPrefixes: js.UndefOr[String] = js.native
    
    /**
      * Channels to join
      * @default []
      */
    var channels: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Should we output debug messages to STDOUT?
      * @default false
      */
    var debug: js.UndefOr[Boolean] = js.native
    
    /**
      * Encoding to use. See
      * https://nodejs.org/api/stream.html#stream_readable_setencoding_encoding
      * @default 'utf-8'
      */
    var encoding: js.UndefOr[String] = js.native
    
    /**
      * Should we queue our messages to ensure we don't get kicked?
      * @default false
      */
    var floodProtection: js.UndefOr[Boolean] = js.native
    
    /**
      * Delay between messages when flood protection is active
      * @default 1000
      */
    var floodProtectionDelay: js.UndefOr[Double] = js.native
    
    /**
      * Local interface to bind to for network connections. See
      * https://nodejs.org/api/net.html#net_socket_localaddress
      */
    var localAddress: js.UndefOr[String] = js.native
    
    /**
      * Characters to split a message at.
      * @default 512
      */
    var messageSplit: js.UndefOr[Double] = js.native
    
    /**
      * IRC username
      * @default ''
      */
    var password: js.UndefOr[String] = js.native
    
    /**
      * IRC connection port. See
      * https://nodejs.org/api/net.html#net_socket_remoteport
      * @default 6667
      */
    var port: js.UndefOr[Double] = js.native
    
    /**
      * IRC "real name"
      * @default 'nodeJS IRC client'
      */
    var realName: js.UndefOr[String] = js.native
    
    /**
      * Should we use SASL authentication?
      * @default false
      */
    var sasl: js.UndefOr[Boolean] = js.native
    
    /**
      * Should SSL be used? Can either be true or crypto credentials.
      * @default false
      */
    var secure: js.UndefOr[Boolean | SecureContext] = js.native
    
    /**
      * Should we accept self-signed certificates?
      * @default false
      */
    var selfSigned: js.UndefOr[Boolean] = js.native
    
    /**
      * Should we output IRC errors?
      * @default false
      */
    var showErrors: js.UndefOr[Boolean] = js.native
    
    /**
      * Should we strip mIRC colors from the output messages?
      * @default false
      */
    var stripColors: js.UndefOr[Boolean] = js.native
    
    /**
      * IRC username
      * @default 'nodebot'
      */
    var userName: js.UndefOr[String] = js.native
  }
  object IClientOpts {
    
    @scala.inline
    def apply(): IClientOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IClientOpts]
    }
    
    @scala.inline
    implicit class IClientOptsMutableBuilder[Self <: IClientOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoConnect(value: Boolean): Self = StObject.set(x, "autoConnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoConnectUndefined: Self = StObject.set(x, "autoConnect", js.undefined)
      
      @scala.inline
      def setAutoRejoin(value: Boolean): Self = StObject.set(x, "autoRejoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRejoinUndefined: Self = StObject.set(x, "autoRejoin", js.undefined)
      
      @scala.inline
      def setCertExpired(value: Boolean): Self = StObject.set(x, "certExpired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertExpiredUndefined: Self = StObject.set(x, "certExpired", js.undefined)
      
      @scala.inline
      def setChannelPrefixes(value: String): Self = StObject.set(x, "channelPrefixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelPrefixesUndefined: Self = StObject.set(x, "channelPrefixes", js.undefined)
      
      @scala.inline
      def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      @scala.inline
      def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value :_*))
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFloodProtection(value: Boolean): Self = StObject.set(x, "floodProtection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloodProtectionDelay(value: Double): Self = StObject.set(x, "floodProtectionDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloodProtectionDelayUndefined: Self = StObject.set(x, "floodProtectionDelay", js.undefined)
      
      @scala.inline
      def setFloodProtectionUndefined: Self = StObject.set(x, "floodProtection", js.undefined)
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setMessageSplit(value: Double): Self = StObject.set(x, "messageSplit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageSplitUndefined: Self = StObject.set(x, "messageSplit", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setRealName(value: String): Self = StObject.set(x, "realName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealNameUndefined: Self = StObject.set(x, "realName", js.undefined)
      
      @scala.inline
      def setSasl(value: Boolean): Self = StObject.set(x, "sasl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaslUndefined: Self = StObject.set(x, "sasl", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean | SecureContext): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setSelfSigned(value: Boolean): Self = StObject.set(x, "selfSigned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfSignedUndefined: Self = StObject.set(x, "selfSigned", js.undefined)
      
      @scala.inline
      def setShowErrors(value: Boolean): Self = StObject.set(x, "showErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowErrorsUndefined: Self = StObject.set(x, "showErrors", js.undefined)
      
      @scala.inline
      def setStripColors(value: Boolean): Self = StObject.set(x, "stripColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripColorsUndefined: Self = StObject.set(x, "stripColors", js.undefined)
      
      @scala.inline
      def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    }
  }
  
  @js.native
  trait IMessage extends StObject {
    
    /** Command arguments */
    var args: js.Array[String] = js.native
    
    /** Mapped IRC command */
    var command: String = js.native
    
    /** Command type */
    var commandType: CommandType = js.native
    
    /** Prefix */
    var prefix: js.UndefOr[String] = js.native
    
    /** Raw IRC command */
    var rawCommand: String = js.native
  }
  object IMessage {
    
    @scala.inline
    def apply(args: js.Array[String], command: String, commandType: CommandType, rawCommand: String): IMessage = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], commandType = commandType.asInstanceOf[js.Any], rawCommand = rawCommand.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMessage]
    }
    
    @scala.inline
    implicit class IMessageMutableBuilder[Self <: IMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandType(value: CommandType): Self = StObject.set(x, "commandType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRawCommand(value: String): Self = StObject.set(x, "rawCommand", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IWhoisData extends StObject {
    
    /** Channels */
    var channels: js.Array[String] = js.native
    
    /** Hostnamej */
    var host: String = js.native
    
    /** Nickname */
    var nick: String = js.native
    
    /** Is this user an operator? */
    var operator: String = js.native
    
    /** Real name" */
    var realname: String = js.native
    
    /** Server */
    var server: String = js.native
    
    /** Server description string */
    var serverinfo: String = js.native
    
    /** Username */
    var user: String = js.native
  }
  object IWhoisData {
    
    @scala.inline
    def apply(
      channels: js.Array[String],
      host: String,
      nick: String,
      operator: String,
      realname: String,
      server: String,
      serverinfo: String,
      user: String
    ): IWhoisData = {
      val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], realname = realname.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], serverinfo = serverinfo.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWhoisData]
    }
    
    @scala.inline
    implicit class IWhoisDataMutableBuilder[Self <: IWhoisData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value :_*))
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealname(value: String): Self = StObject.set(x, "realname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerinfo(value: String): Self = StObject.set(x, "serverinfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Handler functions for Client.
    */
  object handlers {
    
    type IAction = js.Function4[/* from */ String, /* to */ String, /* text */ String, /* message */ IMessage, Unit]
    
    type IChannelList = js.Function1[/* list */ js.Array[IChannel], Unit]
    
    type ICtcp = js.Function5[
        /* from */ String, 
        /* to */ String, 
        /* text */ String, 
        /* type */ String, 
        /* message */ IMessage, 
        Unit
      ]
    
    @js.native
    trait ICtcpSpecific extends StObject {
      
      /**
        * @param from - sender
        * @param to - recievier
        * @param message - raw message
        */
      def apply(from: String, to: String, text: String, message: IMessage): Unit = js.native
      def apply(from: String, to: String, text: String, `type`: String, message: IMessage): Unit = js.native
    }
    
    type IError = js.Function1[/* message */ IMessage, Unit]
    
    type IInvite = js.Function3[/* channel */ String, /* from */ String, /* message */ IMessage, Unit]
    
    type IJoin = js.Function3[/* channel */ String, /* nick */ String, /* message */ IMessage, Unit]
    
    type IJoinChannel = js.Function2[/* nick */ String, /* message */ IMessage, Unit]
    
    type IKick = js.Function5[
        /* channel */ String, 
        /* nick */ String, 
        /* by */ String, 
        /* reason */ String, 
        /* message */ IMessage, 
        Unit
      ]
    
    type IKickChannel = js.Function4[/* nick */ String, /* by */ String, /* reason */ String, /* message */ IMessage, Unit]
    
    type IMessageAllChannels = js.Function4[/* nick */ String, /* to */ String, /* text */ String, /* message */ IMessage, Unit]
    
    type IMessageChannel = js.Function3[/* nick */ String, /* text */ String, /* message */ IMessage, Unit]
    
    type IModeChange = js.Function5[
        /* channel */ String, 
        /* by */ String, 
        /* mode */ String, 
        /* argument */ String, 
        /* message */ IMessage, 
        Unit
      ]
    
    type IMotd = js.Function1[/* motd */ String, Unit]
    
    type INames = js.Function2[/* channel */ String, /* nicks */ js.Array[String], Unit]
    
    type INamesChannel = js.Function1[/* nicks */ js.Array[String], Unit]
    
    type INick = js.Function4[
        /* oldnick */ String, 
        /* newnick */ String, 
        /* channels */ js.Array[String], 
        /* message */ IMessage, 
        Unit
      ]
    
    type INotice = js.Function4[/* nick */ String, /* to */ String, /* text */ String, /* message */ IMessage, Unit]
    
    type IPart = js.Function4[
        /* channel */ String, 
        /* nick */ String, 
        /* reason */ String, 
        /* message */ IMessage, 
        Unit
      ]
    
    type IPartChannel = js.Function3[/* nick */ String, /* reason */ String, /* message */ IMessage, Unit]
    
    type IPing = js.Function1[/* server */ String, Unit]
    
    type IPm = js.Function3[/* nick */ String, /* text */ String, /* message */ IMessage, Unit]
    
    type IRaw = js.Function1[/* message */ IMessage, Unit]
    
    type IRecievedMessage = js.Function4[/* nick */ String, /* to */ String, /* text */ String, /* message */ IMessage, Unit]
    
    type IRegistered = js.Function1[/* message */ IMessage, Unit]
    
    type ISelfMessage = js.Function2[/* to */ String, /* text */ String, Unit]
    
    type ITopic = js.Function4[
        /* channel */ String, 
        /* topic */ String, 
        /* nick */ String, 
        /* message */ IMessage, 
        Unit
      ]
    
    type IWhois = js.Function1[/* info */ IWhoisData, Unit]
  }
}
