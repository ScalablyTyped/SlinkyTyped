package typingsSlinky.graygelf

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import typingsSlinky.graygelf.anon.A
import typingsSlinky.graygelf.anon.AlwaysCompress
import typingsSlinky.graygelf.anon.Dictkey
import typingsSlinky.graygelf.anon.Facility
import typingsSlinky.graygelf.graygelfNumbers.`0`
import typingsSlinky.graygelf.graygelfNumbers.`1240`
import typingsSlinky.graygelf.graygelfNumbers.`1`
import typingsSlinky.graygelf.graygelfNumbers.`2`
import typingsSlinky.graygelf.graygelfNumbers.`3`
import typingsSlinky.graygelf.graygelfNumbers.`4`
import typingsSlinky.graygelf.graygelfNumbers.`5`
import typingsSlinky.graygelf.graygelfNumbers.`6`
import typingsSlinky.graygelf.graygelfNumbers.`7`
import typingsSlinky.graygelf.graygelfNumbers.`8154`
import typingsSlinky.graygelf.graygelfStrings.deflate
import typingsSlinky.graygelf.graygelfStrings.error
import typingsSlinky.graygelf.graygelfStrings.gzip
import typingsSlinky.graygelf.graygelfStrings.message
import typingsSlinky.node.dgramMod.Socket
import typingsSlinky.through.mod.ThroughStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a graygelf instance
    *
    * @param setup
    */
  @JSImport("graygelf", JSImport.Namespace)
  @js.native
  def apply(): Instance = js.native
  @JSImport("graygelf", JSImport.Namespace)
  @js.native
  def apply(setup: setup): Instance = js.native
  
  @JSImport("graygelf", JSImport.Namespace)
  @js.native
  class ^ ()
    extends typingsSlinky.graygelf.mod.graygelf {
    def this(setup: typingsSlinky.graygelf.mod.setup) = this()
  }
  @JSImport("graygelf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Chunk size for local network
    */
  /* static member */
  @JSImport("graygelf", "CHUNK_LAN")
  @js.native
  def CHUNK_LAN: `8154` = js.native
  @scala.inline
  def CHUNK_LAN_=(x: `8154`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHUNK_LAN")(x.asInstanceOf[js.Any])
  
  /**
    * Chunk size for wide network
    */
  /* static member */
  @JSImport("graygelf", "CHUNK_WAN")
  @js.native
  def CHUNK_WAN: `1240` = js.native
  @scala.inline
  def CHUNK_WAN_=(x: `1240`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHUNK_WAN")(x.asInstanceOf[js.Any])
  
  /**
    * GELF log levels
    */
  /* static member */
  object LOG_LEVELS {
    
    @JSImport("graygelf", "LOG_LEVELS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("graygelf", "LOG_LEVELS.alert")
    @js.native
    def alert: `1` = js.native
    @scala.inline
    def alert_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alert")(x.asInstanceOf[js.Any])
    
    @JSImport("graygelf", "LOG_LEVELS.crit")
    @js.native
    def crit: `2` = js.native
    @scala.inline
    def crit_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crit")(x.asInstanceOf[js.Any])
    
    @JSImport("graygelf", "LOG_LEVELS.debug")
    @js.native
    def debug: `7` = js.native
    @scala.inline
    def debug_=(x: `7`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
    
    @JSImport("graygelf", "LOG_LEVELS.emerg")
    @js.native
    def emerg: `0` = js.native
    @scala.inline
    def emerg_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emerg")(x.asInstanceOf[js.Any])
    
    @JSImport("graygelf", "LOG_LEVELS.err")
    @js.native
    def err: `3` = js.native
    @scala.inline
    def err_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("err")(x.asInstanceOf[js.Any])
    
    @JSImport("graygelf", "LOG_LEVELS.error")
    @js.native
    def error: `3` = js.native
    @scala.inline
    def error_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("graygelf", "LOG_LEVELS.info")
    @js.native
    def info: `6` = js.native
    @scala.inline
    def info_=(x: `6`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("graygelf", "LOG_LEVELS.notice")
    @js.native
    def notice: `5` = js.native
    @scala.inline
    def notice_=(x: `5`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notice")(x.asInstanceOf[js.Any])
    
    @JSImport("graygelf", "LOG_LEVELS.panic")
    @js.native
    def panic: `0` = js.native
    @scala.inline
    def panic_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("panic")(x.asInstanceOf[js.Any])
    
    @JSImport("graygelf", "LOG_LEVELS.warn")
    @js.native
    def warn: `4` = js.native
    @scala.inline
    def warn_=(x: `4`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warn")(x.asInstanceOf[js.Any])
    
    @JSImport("graygelf", "LOG_LEVELS.warning")
    @js.native
    def warning: `4` = js.native
    @scala.inline
    def warning_=(x: `4`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait EventListener extends StObject {
    
    /**
      * Set a listener to error event
      *
      * @param event listen error event
      * @param cb callback function that receives error messsage
      */
    def apply(event: error, cbErr: js.Function1[/* err */ String, Unit]): Unit = js.native
    /**
      * Set a listener to message event
      *
      * @param event listen message event
      * @param cb callback function that receives message
      */
    def apply(event: message, cb: js.Function1[/* message */ GelfMessage, Unit]): Unit = js.native
  }
  
  @js.native
  trait GelfMessage
    extends /**
    * any other personal property
    */
  /* key */ StringDictionary[js.UndefOr[String | Double]] {
    
    /**
      * log full message
      */
    var full_message: js.UndefOr[String | Double] = js.native
    
    /**
      * app host
      */
    var host: js.UndefOr[String | Double] = js.native
    
    /**
      * GELF level
      *
      *  emerg: 0; panic: 0;
      *  alert: 1;
      *  crit: 2;
      *  error: 3; err: 3;
      *  warn: 4; warning: 4;
      *  notice: 5;
      *  info: 6;
      *  debug: 7.
      */
    var level: js.UndefOr[
        `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | typingsSlinky.graygelf.graygelfStrings.`0` | typingsSlinky.graygelf.graygelfStrings.`1` | typingsSlinky.graygelf.graygelfStrings.`2` | typingsSlinky.graygelf.graygelfStrings.`3` | typingsSlinky.graygelf.graygelfStrings.`4` | typingsSlinky.graygelf.graygelfStrings.`5` | typingsSlinky.graygelf.graygelfStrings.`6` | typingsSlinky.graygelf.graygelfStrings.`7`
      ] = js.native
    
    /**
      * log short message
      */
    var short_message: js.UndefOr[String | Double] = js.native
    
    /**
      * log timestamp
      */
    var timestamp: js.UndefOr[String | Double] = js.native
    
    /**
      * app version
      */
    var version: js.UndefOr[String | Double] = js.native
  }
  object GelfMessage {
    
    @scala.inline
    def apply(): GelfMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GelfMessage]
    }
    
    @scala.inline
    implicit class GelfMessageMutableBuilder[Self <: GelfMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFull_message(value: String | Double): Self = StObject.set(x, "full_message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_messageUndefined: Self = StObject.set(x, "full_message", js.undefined)
      
      @scala.inline
      def setHost(value: String | Double): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setLevel(
        value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | typingsSlinky.graygelf.graygelfStrings.`0` | typingsSlinky.graygelf.graygelfStrings.`1` | typingsSlinky.graygelf.graygelfStrings.`2` | typingsSlinky.graygelf.graygelfStrings.`3` | typingsSlinky.graygelf.graygelfStrings.`4` | typingsSlinky.graygelf.graygelfStrings.`5` | typingsSlinky.graygelf.graygelfStrings.`6` | typingsSlinky.graygelf.graygelfStrings.`7`
      ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setShort_message(value: String | Double): Self = StObject.set(x, "short_message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShort_messageUndefined: Self = StObject.set(x, "short_message", js.undefined)
      
      @scala.inline
      def setTimestamp(value: String | Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setVersion(value: String | Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Inlined {[ key in 'emerg' | 'panic' | 'alert' | 'crit' | 'error' | 'err' | 'warn' | 'warning' | 'notice' | 'info' | 'debug' ]: (short_message : string | std.Error, args : ...string): graygelf.graygelf.GelfMessage} & {[ key in 'emerg' | 'panic' | 'alert' | 'crit' | 'error' | 'err' | 'warn' | 'warning' | 'notice' | 'info' | 'debug' ]: {a (short_message : string | std.Error, full_message : string | undefined, customFields : graygelf.graygelf.GelfMessage | undefined): graygelf.graygelf.GelfMessage}} & {raw (fields : graygelf.graygelf.GelfMessage): graygelf.graygelf.GelfMessage, stream (name : string): through.through.ThroughStream, write (msg : string | std.Uint8Array): void, _prepGelf (level : 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7, short : string, long : string | undefined, fields : {[key: string] : string} | undefined): graygelf.graygelf.GelfMessage, _send (gelfMessage : graygelf.graygelf.GelfMessage): void,   on :std.EventListener,   once :std.EventListener,   fields :{  facility :string | undefined, [key: string] : string | undefined},   graylogHost :string,   graylogPort :string,   compressType :'deflate' | 'gzip',   chunkSize :number,   alwaysCompress :boolean,   _udp :node.dgram.Socket | undefined} */
  @js.native
  trait Instance extends StObject {
    
    /**
      * Build a Gelf Message
      */
    @JSName("_prepGelf")
    def _prepGelf_0(level: `0`, short: String): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_0(level: `0`, short: String, long: js.UndefOr[scala.Nothing], fields: StringDictionary[String]): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_0(level: `0`, short: String, long: String): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_0(level: `0`, short: String, long: String, fields: StringDictionary[String]): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_1(level: `1`, short: String): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_1(level: `1`, short: String, long: js.UndefOr[scala.Nothing], fields: StringDictionary[String]): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_1(level: `1`, short: String, long: String): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_1(level: `1`, short: String, long: String, fields: StringDictionary[String]): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_2(level: `2`, short: String): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_2(level: `2`, short: String, long: js.UndefOr[scala.Nothing], fields: StringDictionary[String]): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_2(level: `2`, short: String, long: String): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_2(level: `2`, short: String, long: String, fields: StringDictionary[String]): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_3(level: `3`, short: String): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_3(level: `3`, short: String, long: js.UndefOr[scala.Nothing], fields: StringDictionary[String]): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_3(level: `3`, short: String, long: String): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_3(level: `3`, short: String, long: String, fields: StringDictionary[String]): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_4(level: `4`, short: String): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_4(level: `4`, short: String, long: js.UndefOr[scala.Nothing], fields: StringDictionary[String]): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_4(level: `4`, short: String, long: String): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_4(level: `4`, short: String, long: String, fields: StringDictionary[String]): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_5(level: `5`, short: String): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_5(level: `5`, short: String, long: js.UndefOr[scala.Nothing], fields: StringDictionary[String]): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_5(level: `5`, short: String, long: String): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_5(level: `5`, short: String, long: String, fields: StringDictionary[String]): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_6(level: `6`, short: String): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_6(level: `6`, short: String, long: js.UndefOr[scala.Nothing], fields: StringDictionary[String]): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_6(level: `6`, short: String, long: String): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_6(level: `6`, short: String, long: String, fields: StringDictionary[String]): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_7(level: `7`, short: String): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_7(level: `7`, short: String, long: js.UndefOr[scala.Nothing], fields: StringDictionary[String]): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_7(level: `7`, short: String, long: String): GelfMessage = js.native
    @JSName("_prepGelf")
    def _prepGelf_7(level: `7`, short: String, long: String, fields: StringDictionary[String]): GelfMessage = js.native
    
    /**
      * send a gelf message
      */
    def _send(gelfMessage: GelfMessage): Unit = js.native
    
    /**
      * udp socket (not setted if mock is true)
      */
    var _udp: js.UndefOr[Socket] = js.native
    
    def alert(short_message: String, args: String*): GelfMessage = js.native
    def alert(short_message: js.Error, args: String*): GelfMessage = js.native
    @JSName("alert")
    var alert_Original: (js.Function2[/* short_message */ String | js.Error, /* repeated */ String, GelfMessage]) with A = js.native
    
    /**
      * Should always compress
      *
      * @default false
      */
    var alwaysCompress: Boolean = js.native
    
    /**
      * Chunk size
      *
      * @default 1240
      */
    var chunkSize: Double = js.native
    
    /**
      * Compress type
      *
      * @default "deflate"
      */
    var compressType: deflate | gzip = js.native
    
    def crit(short_message: String, args: String*): GelfMessage = js.native
    def crit(short_message: js.Error, args: String*): GelfMessage = js.native
    @JSName("crit")
    var crit_Original: (js.Function2[/* short_message */ String | js.Error, /* repeated */ String, GelfMessage]) with A = js.native
    
    def debug(short_message: String, args: String*): GelfMessage = js.native
    def debug(short_message: js.Error, args: String*): GelfMessage = js.native
    @JSName("debug")
    var debug_Original: (js.Function2[/* short_message */ String | js.Error, /* repeated */ String, GelfMessage]) with A = js.native
    
    def emerg(short_message: String, args: String*): GelfMessage = js.native
    def emerg(short_message: js.Error, args: String*): GelfMessage = js.native
    @JSName("emerg")
    var emerg_Original: (js.Function2[/* short_message */ String | js.Error, /* repeated */ String, GelfMessage]) with A = js.native
    
    def err(short_message: String, args: String*): GelfMessage = js.native
    def err(short_message: js.Error, args: String*): GelfMessage = js.native
    @JSName("err")
    var err_Original: (js.Function2[/* short_message */ String | js.Error, /* repeated */ String, GelfMessage]) with A = js.native
    
    def error(short_message: String, args: String*): GelfMessage = js.native
    def error(short_message: js.Error, args: String*): GelfMessage = js.native
    @JSName("error")
    var error_Original: (js.Function2[/* short_message */ String | js.Error, /* repeated */ String, GelfMessage]) with A = js.native
    
    /**
      * Setup global custom fields to be passed with every message
      */
    var fields: Dictkey = js.native
    
    /**
      * Endpoint setted
      *
      * @default "localhost"
      */
    var graylogHost: String = js.native
    
    /**
      * Port setted
      *
      * @default "12201"
      */
    var graylogPort: String = js.native
    
    def info(short_message: String, args: String*): GelfMessage = js.native
    def info(short_message: js.Error, args: String*): GelfMessage = js.native
    @JSName("info")
    var info_Original: (js.Function2[/* short_message */ String | js.Error, /* repeated */ String, GelfMessage]) with A = js.native
    
    def notice(short_message: String, args: String*): GelfMessage = js.native
    def notice(short_message: js.Error, args: String*): GelfMessage = js.native
    @JSName("notice")
    var notice_Original: (js.Function2[/* short_message */ String | js.Error, /* repeated */ String, GelfMessage]) with A = js.native
    
    def on(evt: Event): Unit = js.native
    @JSName("on")
    var on_Original: typingsSlinky.std.EventListener = js.native
    
    def once(evt: Event): Unit = js.native
    @JSName("once")
    var once_Original: typingsSlinky.std.EventListener = js.native
    
    def panic(short_message: String, args: String*): GelfMessage = js.native
    def panic(short_message: js.Error, args: String*): GelfMessage = js.native
    @JSName("panic")
    var panic_Original: (js.Function2[/* short_message */ String | js.Error, /* repeated */ String, GelfMessage]) with A = js.native
    
    /**
      * Send a complete custom GELF message.
      *
      * Version, host, and timestamp will be supplied if missing.
      * @returns May some custom fields return started by '_', like graygelfMessage._facility
      */
    def raw(fields: GelfMessage): GelfMessage = js.native
    
    /**
      * I don't really know
      */
    def stream(name: String): ThroughStream = js.native
    
    def warn(short_message: String, args: String*): GelfMessage = js.native
    def warn(short_message: js.Error, args: String*): GelfMessage = js.native
    @JSName("warn")
    var warn_Original: (js.Function2[/* short_message */ String | js.Error, /* repeated */ String, GelfMessage]) with A = js.native
    
    def warning(short_message: String, args: String*): GelfMessage = js.native
    def warning(short_message: js.Error, args: String*): GelfMessage = js.native
    @JSName("warning")
    var warning_Original: (js.Function2[/* short_message */ String | js.Error, /* repeated */ String, GelfMessage]) with A = js.native
    
    /**
      * send udp message
      */
    def write(msg: String): Unit = js.native
    def write(msg: js.typedarray.Uint8Array): Unit = js.native
  }
  
  @js.native
  trait graygelf extends Instance {
    
    @JSName("fields")
    var fields_graygelf: Facility = js.native
    
    @JSName("on")
    var on_Original_graygelf: EventListener = js.native
    /**
      * Set a listener to error event
      *
      * @param event listen error event
      * @param cb callback function that receives error messsage
      */
    @JSName("on")
    def on_error(event: error, cbErr: js.Function1[/* err */ String, Unit]): Unit = js.native
    /**
      * Set a listener to message event
      *
      * @param event listen message event
      * @param cb callback function that receives message
      */
    @JSName("on")
    def on_message(event: message, cb: js.Function1[/* message */ GelfMessage, Unit]): Unit = js.native
    
    @JSName("once")
    var once_Original_graygelf: EventListener = js.native
    /**
      * Set a listener to error event
      *
      * @param event listen error event
      * @param cb callback function that receives error messsage
      */
    @JSName("once")
    def once_error(event: error, cbErr: js.Function1[/* err */ String, Unit]): Unit = js.native
    /**
      * Set a listener to message event
      *
      * @param event listen message event
      * @param cb callback function that receives message
      */
    @JSName("once")
    def once_message(event: message, cb: js.Function1[/* message */ GelfMessage, Unit]): Unit = js.native
  }
  
  type setup = String | AlwaysCompress
}
