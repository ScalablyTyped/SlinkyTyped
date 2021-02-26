package typingsSlinky.imap

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.imap.anon.New
import typingsSlinky.imap.anon.Other
import typingsSlinky.imap.imapStrings.attributes
import typingsSlinky.imap.imapStrings.body
import typingsSlinky.imap.imapStrings.end
import typingsSlinky.imap.imapStrings.error
import typingsSlinky.imap.imapStrings.message
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("imap", JSImport.Namespace)
  @js.native
  class ^ protected () extends Connection {
    /** @constructor */
    def this(config: Config) = this()
  }
  
  /** Parses a raw header and returns an object keyed on header fields and the values are Arrays of header field values. Set disableAutoDecode to true to disable automatic decoding of MIME encoded-words that may exist in header field values. */
  /* static member */
  @JSImport("imap", "parseHeader")
  @js.native
  def parseHeader(rawHeader: String): StringDictionary[js.Array[String]] = js.native
  @JSImport("imap", "parseHeader")
  @js.native
  def parseHeader(rawHeader: String, disableAutoDecode: Boolean): StringDictionary[js.Array[String]] = js.native
  
  @js.native
  trait AppendOptions extends StObject {
    
    /* string|string[] */
    /** What to use for message arrival date/time. Default: (current date/time) */
    var date: js.UndefOr[js.Date] = js.native
    
    /** A single flag (e.g. 'Seen') or an array of flags (e.g. ['Seen', 'Flagged']) to append to the message. Default: (no flags) */
    var flags: js.UndefOr[js.Any] = js.native
    
    /** The name of the mailbox to append the message to. Default: the currently open mailbox */
    var mailbox: js.UndefOr[String] = js.native
  }
  object AppendOptions {
    
    @scala.inline
    def apply(): AppendOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppendOptions]
    }
    
    @scala.inline
    implicit class AppendOptionsMutableBuilder[Self <: AppendOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setFlags(value: js.Any): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setMailbox(value: String): Self = StObject.set(x, "mailbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMailboxUndefined: Self = StObject.set(x, "mailbox", js.undefined)
    }
  }
  
  @js.native
  trait Box extends StObject {
    
    /** array - A list of system-defined flags applicable for this mailbox. Flags in this list but not in permFlags may be stored for the current session only. Additional server implementation-specific flags may also be available. */
    var flags: js.Array[String] = js.native
    
    /** Contains various message counts for this mailbox: */
    var messages: New = js.native
    
    /** The name of this mailbox. */
    var name: String = js.native
    
    /** True if new keywords can be added to messages in this mailbox. */
    var newKeywords: Boolean = js.native
    
    /** A list of flags that can be permanently added/removed to/from messages in this mailbox. */
    var permFlags: js.Array[String] = js.native
    
    /** Whether or not this mailbox has persistent UIDs. This should almost always be true for modern mailboxes and should only be false for legacy mail stores where supporting persistent UIDs was not technically feasible. */
    var persistentUIDs: Boolean = js.native
    
    /** True if this mailbox was opened in read-only mode. (Only available with openBox() calls) */
    var readOnly: js.UndefOr[Boolean] = js.native
    
    /** The uid that will be assigned to the next message that arrives at this mailbox. */
    var uidnext: Double = js.native
    
    /** A 32-bit number that can be used to determine if UIDs in this mailbox have changed since the last time this mailbox was opened. */
    var uidvalidity: Double = js.native
  }
  object Box {
    
    @scala.inline
    def apply(
      flags: js.Array[String],
      messages: New,
      name: String,
      newKeywords: Boolean,
      permFlags: js.Array[String],
      persistentUIDs: Boolean,
      uidnext: Double,
      uidvalidity: Double
    ): Box = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newKeywords = newKeywords.asInstanceOf[js.Any], permFlags = permFlags.asInstanceOf[js.Any], persistentUIDs = persistentUIDs.asInstanceOf[js.Any], uidnext = uidnext.asInstanceOf[js.Any], uidvalidity = uidvalidity.asInstanceOf[js.Any])
      __obj.asInstanceOf[Box]
    }
    
    @scala.inline
    implicit class BoxMutableBuilder[Self <: Box] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlags(value: js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value :_*))
      
      @scala.inline
      def setMessages(value: New): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewKeywords(value: Boolean): Self = StObject.set(x, "newKeywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermFlags(value: js.Array[String]): Self = StObject.set(x, "permFlags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermFlagsVarargs(value: String*): Self = StObject.set(x, "permFlags", js.Array(value :_*))
      
      @scala.inline
      def setPersistentUIDs(value: Boolean): Self = StObject.set(x, "persistentUIDs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setUidnext(value: Double): Self = StObject.set(x, "uidnext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidvalidity(value: Double): Self = StObject.set(x, "uidvalidity", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Config extends StObject {
    
    /** Number of milliseconds to wait to be authenticated after a connection has been established. Default: 5000 */
    var authTimeout: js.UndefOr[Double] = js.native
    
    /** Set to 'always' to always attempt connection upgrades via STARTTLS, 'required' only if upgrading is required, or 'never' to never attempt upgrading. Default: 'never' */
    var autotls: js.UndefOr[String] = js.native
    
    /** Number of milliseconds to wait for a connection to be established. Default: 10000 */
    var connTimeout: js.UndefOr[Double] = js.native
    
    /* boolean|KeepAlive */
    /** If set, the function will be called with one argument, a string containing some debug info Default: (no debug output) */
    var debug: js.UndefOr[js.Function] = js.native
    
    /** Hostname or IP address of the IMAP server. Default: "localhost" */
    var host: js.UndefOr[String] = js.native
    
    /** Configures the keepalive mechanism. Set to true to enable keepalive with defaults or set to object to enable and configure keepalive behavior: Default: true */
    var keepalive: js.UndefOr[js.Any] = js.native
    
    /** Password for plain-text authentication. */
    var password: String = js.native
    
    /** Port number of the IMAP server. Default: 143 */
    var port: js.UndefOr[Double] = js.native
    
    /** Perform implicit TLS connection? Default: false */
    var tls: js.UndefOr[Boolean] = js.native
    
    /** Options object to pass to tls.connect() Default: (none) */
    var tlsOptions: js.UndefOr[js.Object] = js.native
    
    /** Username for plain-text authentication. */
    var user: String = js.native
    
    /** Base64-encoded OAuth token for OAuth authentication for servers that support it (See Andris Reinman's xoauth.js module to help generate this string). */
    var xoauth: js.UndefOr[String] = js.native
    
    /** Base64-encoded OAuth2 token for The SASL XOAUTH2 Mechanism for servers that support it (See Andris Reinman's xoauth2 module to help generate this string). */
    var xoauth2: js.UndefOr[String] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(password: String, user: String): Config = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthTimeout(value: Double): Self = StObject.set(x, "authTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthTimeoutUndefined: Self = StObject.set(x, "authTimeout", js.undefined)
      
      @scala.inline
      def setAutotls(value: String): Self = StObject.set(x, "autotls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutotlsUndefined: Self = StObject.set(x, "autotls", js.undefined)
      
      @scala.inline
      def setConnTimeout(value: Double): Self = StObject.set(x, "connTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnTimeoutUndefined: Self = StObject.set(x, "connTimeout", js.undefined)
      
      @scala.inline
      def setDebug(value: js.Function): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setKeepalive(value: js.Any): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsOptions(value: js.Object): Self = StObject.set(x, "tlsOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsOptionsUndefined: Self = StObject.set(x, "tlsOptions", js.undefined)
      
      @scala.inline
      def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXoauth(value: String): Self = StObject.set(x, "xoauth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXoauth2(value: String): Self = StObject.set(x, "xoauth2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXoauth2Undefined: Self = StObject.set(x, "xoauth2", js.undefined)
      
      @scala.inline
      def setXoauthUndefined: Self = StObject.set(x, "xoauth", js.undefined)
    }
  }
  
  @js.native
  trait Connection
    extends EventEmitter
       with MessageFunctions {
    
    /** Creates a new mailbox on the server. mailboxName should include any necessary prefix/path. */
    def addBox(mailboxName: String, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    // from NodeJS.EventEmitter
    def addListener(event: String, listener: js.Function): this.type = js.native
    
    /** Appends a message to selected mailbox. msgData is a string or Buffer containing an RFC-822 compatible MIME message. Valid options properties are: */
    def append(msgData: js.Any, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    def append(msgData: js.Any, options: AppendOptions, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    def closeBox(autoExpunge: Boolean, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    /** Closes the currently open mailbox. If autoExpunge is true, any messages marked as Deleted in the currently open mailbox will be removed if the mailbox was NOT opened in read-only mode. If autoExpunge is false, you disconnect, or you open another mailbox, messages marked as Deleted will NOT be removed from the currently open mailbox. */
    def closeBox(callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    /** Attempts to connect and authenticate with the IMAP server. */
    def connect(): Unit = js.native
    
    /** Removes a specific mailbox that exists on the server. mailboxName should including any necessary prefix/path. */
    def delBox(mailboxName: String, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    /** The (top-level) mailbox hierarchy delimiter. If the server does not support mailbox hierarchies and only a flat list, this value will be falsey. */
    var delimiter: String = js.native
    
    /** Immediately destroys the connection to the server. */
    def destroy(): Unit = js.native
    
    /** Closes the connection to the server after all requests in the queue have been sent. */
    def end(): Unit = js.native
    
    /** Permanently removes all messages flagged as Deleted in the currently open mailbox. If the server supports the 'UIDPLUS' capability, uids can be supplied to only remove messages that both have their uid in uids and have the \Deleted flag set. Note: At least on Gmail, performing this operation with any currently open mailbox that is not the Spam or Trash mailbox will merely archive any messages marked as Deleted (by moving them to the 'All Mail' mailbox). */
    def expunge(callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    def expunge(uids: js.Any, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    /** Obtains the full list of mailboxes. If nsPrefix is not specified, the main personal namespace is used. */
    def getBoxes(callback: js.Function2[/* error */ js.Error, /* mailboxes */ MailBoxes, Unit]): Unit = js.native
    def getBoxes(nsPrefix: String, callback: js.Function2[/* error */ js.Error, /* mailboxes */ MailBoxes, Unit]): Unit = js.native
    
    /** Obtains the full list of subscribed mailboxes. If nsPrefix is not specified, the main personal namespace is used. */
    def getSubscribedBoxes(callback: js.Function2[/* error */ js.Error, /* mailboxes */ MailBoxes, Unit]): Unit = js.native
    def getSubscribedBoxes(nsPrefix: String, callback: js.Function2[/* error */ js.Error, /* mailboxes */ MailBoxes, Unit]): Unit = js.native
    
    /** Contains information about each namespace type (if supported by the server) with the following properties: */
    var namespaces: Other = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    
    def once(event: String, listener: js.Function): this.type = js.native
    
    /** Opens a specific mailbox that exists on the server. mailboxName should include any necessary prefix/path. modifiers is used by IMAP extensions. */
    def openBox(mailboxName: String, callback: js.Function2[/* error */ js.Error, /* mailbox */ Box, Unit]): Unit = js.native
    def openBox(
      mailboxName: String,
      openReadOnly: Boolean,
      callback: js.Function2[/* error */ js.Error, /* mailbox */ Box, Unit]
    ): Unit = js.native
    def openBox(
      mailboxName: String,
      openReadOnly: Boolean,
      modifiers: js.Object,
      callback: js.Function2[/* error */ js.Error, /* mailbox */ Box, Unit]
    ): Unit = js.native
    
    def removeListener(event: String, listener: js.Function): this.type = js.native
    
    /** Renames a specific mailbox that exists on the server. Both oldMailboxName and newMailboxName should include any necessary prefix/path. Note: Renaming the 'INBOX' mailbox will instead cause all messages in 'INBOX' to be moved to the new mailbox. */
    def renameBox(
      oldMailboxName: String,
      newMailboxName: String,
      callback: js.Function2[/* error */ js.Error, /* mailbox */ Box, Unit]
    ): Unit = js.native
    
    /**
      seq exposes the search() ... serverSupports() set of commands, but returns sequence number(s) instead of UIDs.
      */
    var seq: MessageFunctions = js.native
    
    /** The current state of the connection (e.g. 'disconnected', 'connected', 'authenticated'). */
    var state: String = js.native
    
    /** Fetches information about a mailbox other than the one currently open. Note: There is no guarantee that this will be a fast operation on the server. Also, do not call this on the currently open mailbox. */
    def status(mailboxName: String, callback: js.Function2[/* error */ js.Error, /* mailbox */ Box, Unit]): Unit = js.native
    
    /** Subscribes to a specific mailbox that exists on the server. mailboxName should include any necessary prefix/path. */
    def subscribeBox(mailboxName: String, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    /** Unsubscribes from a specific mailbox that exists on the server. mailboxName should include any necessary prefix/path. */
    def unsubscribeBox(mailboxName: String, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  }
  
  @js.native
  trait FetchOptions extends StObject {
    
    /** A string or Array of strings containing the body part section to fetch. Default: (none) Example sections: */
    var bodies: js.UndefOr[String | js.Array[String]] = js.native
    
    /** Fetch the message envelope. Default: false */
    var envelope: js.UndefOr[Boolean] = js.native
    
    /** Mark message(s) as read when fetched. Default: false */
    var markSeen: js.UndefOr[Boolean] = js.native
    
    /** Fetch modifiers defined by IMAP extensions. Default: (none) */
    var modifiers: js.UndefOr[js.Object] = js.native
    
    /** Fetch the RFC822 size. Default: false */
    var size: js.UndefOr[Boolean] = js.native
    
    /** Fetch the message structure. Default: false */
    var struct: js.UndefOr[Boolean] = js.native
  }
  object FetchOptions {
    
    @scala.inline
    def apply(): FetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchOptions]
    }
    
    @scala.inline
    implicit class FetchOptionsMutableBuilder[Self <: FetchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodies(value: String | js.Array[String]): Self = StObject.set(x, "bodies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodiesUndefined: Self = StObject.set(x, "bodies", js.undefined)
      
      @scala.inline
      def setBodiesVarargs(value: String*): Self = StObject.set(x, "bodies", js.Array(value :_*))
      
      @scala.inline
      def setEnvelope(value: Boolean): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvelopeUndefined: Self = StObject.set(x, "envelope", js.undefined)
      
      @scala.inline
      def setMarkSeen(value: Boolean): Self = StObject.set(x, "markSeen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkSeenUndefined: Self = StObject.set(x, "markSeen", js.undefined)
      
      @scala.inline
      def setModifiers(value: js.Object): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      @scala.inline
      def setSize(value: Boolean): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStruct(value: Boolean): Self = StObject.set(x, "struct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStructUndefined: Self = StObject.set(x, "struct", js.undefined)
    }
  }
  
  @js.native
  trait Folder extends StObject {
    
    /** mailbox attributes. An attribute of 'NOSELECT' indicates the mailbox cannot be opened */
    var attribs: js.Array[String] = js.native
    
    /** an object containing another structure similar in format to this top level, otherwise null if no children */
    var children: MailBoxes = js.native
    
    /** hierarchy delimiter for accessing this mailbox's direct children. */
    var delimiter: String = js.native
    
    /** pointer to parent mailbox, null if at the top level */
    var parent: Folder = js.native
  }
  object Folder {
    
    @scala.inline
    def apply(attribs: js.Array[String], children: MailBoxes, delimiter: String, parent: Folder): Folder = {
      val __obj = js.Dynamic.literal(attribs = attribs.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Folder]
    }
    
    @scala.inline
    implicit class FolderMutableBuilder[Self <: Folder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribs(value: js.Array[String]): Self = StObject.set(x, "attribs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttribsVarargs(value: String*): Self = StObject.set(x, "attribs", js.Array(value :_*))
      
      @scala.inline
      def setChildren(value: MailBoxes): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: Folder): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ImapFetch
    extends typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter {
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_message(event: message, listener: js.Function2[/* message */ ImapMessage, /* seqno */ Double, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  }
  
  @js.native
  trait ImapMessage
    extends typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter {
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_attributes(event: attributes, listener: js.Function1[/* attrs */ ImapMessageAttributes, Unit]): this.type = js.native
    @JSName("on")
    def on_body(
      event: body,
      listener: js.Function2[/* stream */ ReadableStream, /* info */ ImapMessageBodyInfo, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  }
  
  @js.native
  trait ImapMessageAttributes extends StObject {
    
    /** The internal server date for the message. */
    var date: js.Date = js.native
    
    /** A list of flags currently set on this message. */
    var flags: js.Array[String] = js.native
    
    /** The RFC822 message size (only set if requested with fetch()). */
    var size: js.UndefOr[Double] = js.native
    
    /** The message's body structure (only set if requested with fetch()). */
    var struct: js.UndefOr[js.Array[_]] = js.native
    
    /** A 32-bit ID that uniquely identifies this message within its mailbox. */
    var uid: Double = js.native
  }
  object ImapMessageAttributes {
    
    @scala.inline
    def apply(date: js.Date, flags: js.Array[String], uid: Double): ImapMessageAttributes = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImapMessageAttributes]
    }
    
    @scala.inline
    implicit class ImapMessageAttributesMutableBuilder[Self <: ImapMessageAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlags(value: js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStruct(value: js.Array[_]): Self = StObject.set(x, "struct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStructUndefined: Self = StObject.set(x, "struct", js.undefined)
      
      @scala.inline
      def setStructVarargs(value: js.Any*): Self = StObject.set(x, "struct", js.Array(value :_*))
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ImapMessageBodyInfo extends StObject {
    
    /** The size of this body in bytes. */
    var size: Double = js.native
    
    /** The specifier for this body (e.g. 'TEXT', 'HEADER.FIELDS (TO FROM SUBJECT)', etc). */
    var which: String = js.native
  }
  object ImapMessageBodyInfo {
    
    @scala.inline
    def apply(size: Double, which: String): ImapMessageBodyInfo = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImapMessageBodyInfo]
    }
    
    @scala.inline
    implicit class ImapMessageBodyInfoMutableBuilder[Self <: ImapMessageBodyInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhich(value: String): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KeepAlive extends StObject {
    
    /** Set to true to force use of NOOP keepalive on servers also support IDLE. Default: false */
    var forceNoop: js.UndefOr[Boolean] = js.native
    
    /** This is the interval (in milliseconds) at which an IDLE command (for servers that support IDLE) is re-sent. Default: 300000 (5 mins) */
    var idleInterval: js.UndefOr[Double] = js.native
    
    /** This is the interval (in milliseconds) at which NOOPs are sent and the interval at which idleInterval is checked. Default: 10000 */
    var interval: js.UndefOr[Double] = js.native
  }
  object KeepAlive {
    
    @scala.inline
    def apply(): KeepAlive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeepAlive]
    }
    
    @scala.inline
    implicit class KeepAliveMutableBuilder[Self <: KeepAlive] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceNoop(value: Boolean): Self = StObject.set(x, "forceNoop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceNoopUndefined: Self = StObject.set(x, "forceNoop", js.undefined)
      
      @scala.inline
      def setIdleInterval(value: Double): Self = StObject.set(x, "idleInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdleIntervalUndefined: Self = StObject.set(x, "idleInterval", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    }
  }
  
  type MailBoxes = StringDictionary[Folder]
  
  @js.native
  trait MessageFunctions extends StObject {
    
    /** Adds flag(s) to message(s). */
    def addFlags(source: js.Any, flags: js.Any, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    /** Adds keyword(s) to message(s). keywords is either a single keyword or an array of keywords. */
    def addKeywords(source: js.Any, keywords: js.Any, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    /** Copies message(s) in the currently open mailbox to another mailbox. */
    def copy(source: js.Any, mailboxName: String, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    /** Removes flag(s) from message(s). */
    def delFlags(source: js.Any, flags: js.Any, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    /** Removes keyword(s) from message(s). keywords is either a single keyword or an array of keywords. */
    def delKeywords(source: js.Any, keywords: js.Any, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    /** Fetches message(s) in the currently open mailbox; source can be a single message identifier, a message identifier range (e.g. '2504:2507' or '*' or '2504:*'), an array of message identifiers, or an array of message identifier ranges. */
    def fetch(source: js.Any, options: FetchOptions): ImapFetch = js.native
    
    /** Moves message(s) in the currently open mailbox to another mailbox. Note: The message(s) in the destination mailbox will have a new message UID. */
    def move(source: js.Any, mailboxName: String, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    /** Searches the currently open mailbox for messages using given criteria. criteria is a list describing what you want to find. For criteria types that require arguments, use an array instead of just the string criteria type name (e.g. ['FROM', 'foo@bar.com']). Prefix criteria types with an "!" to negate.
      The following message flags are valid types that do not have arguments:
      ALL:            void;    // All messages.
      ANSWERED:       void;    // Messages with the Answered flag set.
      DELETED:        void;    // Messages with the Deleted flag set.
      DRAFT:          void;    // Messages with the Draft flag set.
      FLAGGED:        void;    // Messages with the Flagged flag set.
      NEW:            void;    // Messages that have the Recent flag set but not the Seen flag.
      SEEN:           void;    // Messages that have the Seen flag set.
      RECENT:         void;    // Messages that have the Recent flag set.
      OLD:            void;    // Messages that do not have the Recent flag set. This is functionally equivalent to "!RECENT" (as opposed to "!NEW").
      UNANSWERED:     void;    // Messages that do not have the Answered flag set.
      UNDELETED:      void;    // Messages that do not have the Deleted flag set.
      UNDRAFT:        void;    // Messages that do not have the Draft flag set.
      UNFLAGGED:      void;    // Messages that do not have the Flagged flag set.
      UNSEEN:         void;    // Messages that do not have the Seen flag set.
      The following are valid types that require string value(s):
      BCC:            any;    // Messages that contain the specified string in the BCC field.
      CC:             any;    // Messages that contain the specified string in the CC field.
      FROM:           any;    // Messages that contain the specified string in the FROM field.
      SUBJECT:        any;    // Messages that contain the specified string in the SUBJECT field.
      TO:             any;    // Messages that contain the specified string in the TO field.
      BODY:           any;    // Messages that contain the specified string in the message body.
      TEXT:           any;    // Messages that contain the specified string in the header OR the message body.
      KEYWORD:        any;    // Messages with the specified keyword set.
      HEADER:         any;    // Requires two string values, with the first being the header name and the second being the value to search for. If this second string is empty, all messages that contain the given header name will be returned.
      The following are valid types that require a string parseable by JavaScripts Date object OR a Date instance:
      BEFORE:         any;    // Messages whose internal date (disregarding time and timezone) is earlier than the specified date.
      ON:             any;    // Messages whose internal date (disregarding time and timezone) is within the specified date.
      SINCE:          any;    // Messages whose internal date (disregarding time and timezone) is within or later than the specified date.
      SENTBEFORE:     any;    // Messages whose Date header (disregarding time and timezone) is earlier than the specified date.
      SENTON:         any;    // Messages whose Date header (disregarding time and timezone) is within the specified date.
      SENTSINCE:      any;    // Messages whose Date header (disregarding time and timezone) is within or later than the specified date.
      The following are valid types that require one Integer value:
      LARGER:         number;    // Messages with a size larger than the specified number of bytes.
      SMALLER:        number;    // Messages with a size smaller than the specified number of bytes.
      The following are valid criterion that require one or more Integer values:
      UID:            any;    // Messages with UIDs corresponding to the specified UID set. Ranges are permitted (e.g. '2504:2507' or '*' or '2504:*').
      */
    def search(
      criteria: js.Array[_],
      callback: js.Function2[/* error */ js.Error, /* uids */ js.Array[Double], Unit]
    ): Unit = js.native
    
    /** Checks if the server supports the specified capability. */
    def serverSupports(capability: String): Boolean = js.native
    
    /** Sets the flag(s) for message(s). */
    def setFlags(source: js.Any, flags: js.Any, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    /** Sets keyword(s) for message(s). keywords is either a single keyword or an array of keywords. */
    def setKeywords(source: js.Any, keywords: js.Any, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  }
  object MessageFunctions {
    
    @scala.inline
    def apply(
      addFlags: (js.Any, js.Any, js.Function1[/* error */ js.Error, Unit]) => Unit,
      addKeywords: (js.Any, js.Any, js.Function1[/* error */ js.Error, Unit]) => Unit,
      copy: (js.Any, String, js.Function1[/* error */ js.Error, Unit]) => Unit,
      delFlags: (js.Any, js.Any, js.Function1[/* error */ js.Error, Unit]) => Unit,
      delKeywords: (js.Any, js.Any, js.Function1[/* error */ js.Error, Unit]) => Unit,
      fetch: (js.Any, FetchOptions) => ImapFetch,
      move: (js.Any, String, js.Function1[/* error */ js.Error, Unit]) => Unit,
      search: (js.Array[_], js.Function2[/* error */ js.Error, /* uids */ js.Array[Double], Unit]) => Unit,
      serverSupports: String => Boolean,
      setFlags: (js.Any, js.Any, js.Function1[/* error */ js.Error, Unit]) => Unit,
      setKeywords: (js.Any, js.Any, js.Function1[/* error */ js.Error, Unit]) => Unit
    ): MessageFunctions = {
      val __obj = js.Dynamic.literal(addFlags = js.Any.fromFunction3(addFlags), addKeywords = js.Any.fromFunction3(addKeywords), copy = js.Any.fromFunction3(copy), delFlags = js.Any.fromFunction3(delFlags), delKeywords = js.Any.fromFunction3(delKeywords), fetch = js.Any.fromFunction2(fetch), move = js.Any.fromFunction3(move), search = js.Any.fromFunction2(search), serverSupports = js.Any.fromFunction1(serverSupports), setFlags = js.Any.fromFunction3(setFlags), setKeywords = js.Any.fromFunction3(setKeywords))
      __obj.asInstanceOf[MessageFunctions]
    }
    
    @scala.inline
    implicit class MessageFunctionsMutableBuilder[Self <: MessageFunctions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddFlags(value: (js.Any, js.Any, js.Function1[/* error */ js.Error, Unit]) => Unit): Self = StObject.set(x, "addFlags", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAddKeywords(value: (js.Any, js.Any, js.Function1[/* error */ js.Error, Unit]) => Unit): Self = StObject.set(x, "addKeywords", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCopy(value: (js.Any, String, js.Function1[/* error */ js.Error, Unit]) => Unit): Self = StObject.set(x, "copy", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDelFlags(value: (js.Any, js.Any, js.Function1[/* error */ js.Error, Unit]) => Unit): Self = StObject.set(x, "delFlags", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDelKeywords(value: (js.Any, js.Any, js.Function1[/* error */ js.Error, Unit]) => Unit): Self = StObject.set(x, "delKeywords", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFetch(value: (js.Any, FetchOptions) => ImapFetch): Self = StObject.set(x, "fetch", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMove(value: (js.Any, String, js.Function1[/* error */ js.Error, Unit]) => Unit): Self = StObject.set(x, "move", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSearch(
        value: (js.Array[_], js.Function2[/* error */ js.Error, /* uids */ js.Array[Double], Unit]) => Unit
      ): Self = StObject.set(x, "search", js.Any.fromFunction2(value))
      
      @scala.inline
      def setServerSupports(value: String => Boolean): Self = StObject.set(x, "serverSupports", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFlags(value: (js.Any, js.Any, js.Function1[/* error */ js.Error, Unit]) => Unit): Self = StObject.set(x, "setFlags", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSetKeywords(value: (js.Any, js.Any, js.Function1[/* error */ js.Error, Unit]) => Unit): Self = StObject.set(x, "setKeywords", js.Any.fromFunction3(value))
    }
  }
}
