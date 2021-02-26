package typingsSlinky.consoleLogLevel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("console-log-level", JSImport.Namespace)
  @js.native
  def apply(opts: Options): Logger = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.consoleLogLevel.consoleLogLevelStrings.trace
    - typingsSlinky.consoleLogLevel.consoleLogLevelStrings.debug
    - typingsSlinky.consoleLogLevel.consoleLogLevelStrings.info
    - typingsSlinky.consoleLogLevel.consoleLogLevelStrings.warn
    - typingsSlinky.consoleLogLevel.consoleLogLevelStrings.error
    - typingsSlinky.consoleLogLevel.consoleLogLevelStrings.fatal
  */
  trait LogLevelNames extends StObject
  object LogLevelNames {
    
    @scala.inline
    def debug: typingsSlinky.consoleLogLevel.consoleLogLevelStrings.debug = "debug".asInstanceOf[typingsSlinky.consoleLogLevel.consoleLogLevelStrings.debug]
    
    @scala.inline
    def error: typingsSlinky.consoleLogLevel.consoleLogLevelStrings.error = "error".asInstanceOf[typingsSlinky.consoleLogLevel.consoleLogLevelStrings.error]
    
    @scala.inline
    def fatal: typingsSlinky.consoleLogLevel.consoleLogLevelStrings.fatal = "fatal".asInstanceOf[typingsSlinky.consoleLogLevel.consoleLogLevelStrings.fatal]
    
    @scala.inline
    def info: typingsSlinky.consoleLogLevel.consoleLogLevelStrings.info = "info".asInstanceOf[typingsSlinky.consoleLogLevel.consoleLogLevelStrings.info]
    
    @scala.inline
    def trace: typingsSlinky.consoleLogLevel.consoleLogLevelStrings.trace = "trace".asInstanceOf[typingsSlinky.consoleLogLevel.consoleLogLevelStrings.trace]
    
    @scala.inline
    def warn: typingsSlinky.consoleLogLevel.consoleLogLevelStrings.warn = "warn".asInstanceOf[typingsSlinky.consoleLogLevel.consoleLogLevelStrings.warn]
  }
  
  /* Inlined std.Record<console-log-level.console-log-level.LogLevelNames, (args : ...any): void> */
  @js.native
  trait Logger extends StObject {
    
    def debug(args: js.Any*): Unit = js.native
    @JSName("debug")
    var debug_Original: js.Function1[/* repeated */ js.Any, Unit] = js.native
    
    def error(args: js.Any*): Unit = js.native
    @JSName("error")
    var error_Original: js.Function1[/* repeated */ js.Any, Unit] = js.native
    
    def fatal(args: js.Any*): Unit = js.native
    @JSName("fatal")
    var fatal_Original: js.Function1[/* repeated */ js.Any, Unit] = js.native
    
    def info(args: js.Any*): Unit = js.native
    @JSName("info")
    var info_Original: js.Function1[/* repeated */ js.Any, Unit] = js.native
    
    def trace(args: js.Any*): Unit = js.native
    @JSName("trace")
    var trace_Original: js.Function1[/* repeated */ js.Any, Unit] = js.native
    
    def warn(args: js.Any*): Unit = js.native
    @JSName("warn")
    var warn_Original: js.Function1[/* repeated */ js.Any, Unit] = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var level: js.UndefOr[LogLevelNames] = js.native
    
    var prefix: js.UndefOr[String | PrefixFunction] = js.native
    
    var stderr: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: LogLevelNames): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setPrefix(value: String | PrefixFunction): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixFunction1(value: /* level */ String => String): Self = StObject.set(x, "prefix", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setStderr(value: Boolean): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
    }
  }
  
  type PrefixFunction = js.Function1[/* level */ String, String]
}
