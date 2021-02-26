package typingsSlinky.npmlog

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("npmlog", JSImport.Namespace)
  @js.native
  val ^ : Logger = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.npmlog.npmlogStrings.silly
    - typingsSlinky.npmlog.npmlogStrings.verbose
    - typingsSlinky.npmlog.npmlogStrings.info
    - typingsSlinky.npmlog.npmlogStrings.timing
    - typingsSlinky.npmlog.npmlogStrings.http
    - typingsSlinky.npmlog.npmlogStrings.notice
    - typingsSlinky.npmlog.npmlogStrings.warn
    - typingsSlinky.npmlog.npmlogStrings.error
    - typingsSlinky.npmlog.npmlogStrings.silent
  */
  trait LogLevels extends StObject
  object LogLevels {
    
    @scala.inline
    def error: typingsSlinky.npmlog.npmlogStrings.error = "error".asInstanceOf[typingsSlinky.npmlog.npmlogStrings.error]
    
    @scala.inline
    def http: typingsSlinky.npmlog.npmlogStrings.http = "http".asInstanceOf[typingsSlinky.npmlog.npmlogStrings.http]
    
    @scala.inline
    def info: typingsSlinky.npmlog.npmlogStrings.info = "info".asInstanceOf[typingsSlinky.npmlog.npmlogStrings.info]
    
    @scala.inline
    def notice: typingsSlinky.npmlog.npmlogStrings.notice = "notice".asInstanceOf[typingsSlinky.npmlog.npmlogStrings.notice]
    
    @scala.inline
    def silent: typingsSlinky.npmlog.npmlogStrings.silent = "silent".asInstanceOf[typingsSlinky.npmlog.npmlogStrings.silent]
    
    @scala.inline
    def silly: typingsSlinky.npmlog.npmlogStrings.silly = "silly".asInstanceOf[typingsSlinky.npmlog.npmlogStrings.silly]
    
    @scala.inline
    def timing: typingsSlinky.npmlog.npmlogStrings.timing = "timing".asInstanceOf[typingsSlinky.npmlog.npmlogStrings.timing]
    
    @scala.inline
    def verbose: typingsSlinky.npmlog.npmlogStrings.verbose = "verbose".asInstanceOf[typingsSlinky.npmlog.npmlogStrings.verbose]
    
    @scala.inline
    def warn: typingsSlinky.npmlog.npmlogStrings.warn = "warn".asInstanceOf[typingsSlinky.npmlog.npmlogStrings.warn]
  }
  
  // TODO: newStream, newGroup, setGaugeTemplate and setGaugeTemplateSet need to be added
  @js.native
  trait Logger
    extends EventEmitter
       with // Allows for custom log levels
  // npmlog.addLevel("custom", level)
  // npmlog.custom(prefix, message)
  /* key */ StringDictionary[js.Any] {
    
    def apply(): js.Any = js.native
    
    def addLevel(level: String, n: Double): Unit = js.native
    def addLevel(level: String, n: Double, style: js.UndefOr[scala.Nothing], disp: String): Unit = js.native
    def addLevel(level: String, n: Double, style: StyleObject): Unit = js.native
    def addLevel(level: String, n: Double, style: StyleObject, disp: String): Unit = js.native
    
    def disableColor(): Unit = js.native
    
    def disableProgress(): Unit = js.native
    
    def disableUnicode(): Unit = js.native
    
    def enableColor(): Unit = js.native
    
    def enableProgress(): Unit = js.native
    
    def enableUnicode(): Unit = js.native
    
    def error(prefix: String, message: String, args: js.Any*): Unit = js.native
    
    var heading: String = js.native
    
    var headingStyle: StyleObject = js.native
    
    def http(prefix: String, message: String, args: js.Any*): Unit = js.native
    
    def info(prefix: String, message: String, args: js.Any*): Unit = js.native
    
    var level: String = js.native
    
    def log(level: String, prefix: String, message: String, args: js.Any*): Unit = js.native
    // Defaults to process.stderr
    def log(level: LogLevels, prefix: String, message: String, args: js.Any*): Unit = js.native
    
    var maxRecordSize: Double = js.native
    
    def notice(prefix: String, message: String, args: js.Any*): Unit = js.native
    
    def pause(): Unit = js.native
    
    var prefixStyle: StyleObject = js.native
    
    def progressEnabled(): Boolean = js.native
    
    var record: js.Array[MessageObject] = js.native
    
    def resume(): Unit = js.native
    
    def silent(prefix: String, message: String, args: js.Any*): Unit = js.native
    
    def silly(prefix: String, message: String, args: js.Any*): Unit = js.native
    
    var stream: js.Any = js.native
    
    def timing(prefix: String, message: String, args: js.Any*): Unit = js.native
    
    def verbose(prefix: String, message: String, args: js.Any*): Unit = js.native
    
    def warn(prefix: String, message: String, args: js.Any*): Unit = js.native
  }
  
  @js.native
  trait MessageObject extends StObject {
    
    var id: Double = js.native
    
    var level: String = js.native
    
    var message: String = js.native
    
    var messageRaw: String = js.native
    
    var prefix: String = js.native
  }
  object MessageObject {
    
    @scala.inline
    def apply(id: Double, level: String, message: String, messageRaw: String, prefix: String): MessageObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageRaw = messageRaw.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageObject]
    }
    
    @scala.inline
    implicit class MessageObjectMutableBuilder[Self <: MessageObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageRaw(value: String): Self = StObject.set(x, "messageRaw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StyleObject extends StObject {
    
    var bell: js.UndefOr[Boolean] = js.native
    
    var bg: js.UndefOr[String] = js.native
    
    var bold: js.UndefOr[Boolean] = js.native
    
    var fg: js.UndefOr[String] = js.native
    
    var inverse: js.UndefOr[Boolean] = js.native
    
    var underline: js.UndefOr[Boolean] = js.native
  }
  object StyleObject {
    
    @scala.inline
    def apply(): StyleObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleObject]
    }
    
    @scala.inline
    implicit class StyleObjectMutableBuilder[Self <: StyleObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBell(value: Boolean): Self = StObject.set(x, "bell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBellUndefined: Self = StObject.set(x, "bell", js.undefined)
      
      @scala.inline
      def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
      
      @scala.inline
      def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      @scala.inline
      def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    }
  }
  
  type _To = Logger
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Logger = ^
}
