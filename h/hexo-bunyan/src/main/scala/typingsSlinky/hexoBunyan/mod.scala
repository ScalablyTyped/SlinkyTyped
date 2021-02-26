package typingsSlinky.hexoBunyan

import typingsSlinky.bunyan.mod.LogLevel
import typingsSlinky.bunyan.mod.Logger
import typingsSlinky.bunyan.mod.LoggerOptions
import typingsSlinky.bunyan.mod.RingBufferOptions
import typingsSlinky.bunyan.mod.RotatingFileStreamOptions
import typingsSlinky.bunyan.mod.StdSerializers_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hexo-bunyan", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends typingsSlinky.bunyan.mod.^ {
    def this(options: LoggerOptions) = this()
  }
  
  @JSImport("hexo-bunyan", "DEBUG")
  @js.native
  val DEBUG: Double = js.native
  
  @JSImport("hexo-bunyan", "ERROR")
  @js.native
  val ERROR: Double = js.native
  
  @JSImport("hexo-bunyan", "FATAL")
  @js.native
  val FATAL: Double = js.native
  
  @JSImport("hexo-bunyan", "INFO")
  @js.native
  val INFO: Double = js.native
  
  @JSImport("hexo-bunyan", "RingBuffer")
  @js.native
  class RingBuffer protected ()
    extends typingsSlinky.bunyan.mod.RingBuffer {
    def this(options: RingBufferOptions) = this()
  }
  
  @JSImport("hexo-bunyan", "RotatingFileStream")
  @js.native
  class RotatingFileStream protected ()
    extends typingsSlinky.bunyan.mod.RotatingFileStream {
    def this(options: RotatingFileStreamOptions) = this()
  }
  
  @JSImport("hexo-bunyan", "TRACE")
  @js.native
  val TRACE: Double = js.native
  
  @JSImport("hexo-bunyan", "WARN")
  @js.native
  val WARN: Double = js.native
  
  @JSImport("hexo-bunyan", "createLogger")
  @js.native
  def createLogger(options: LoggerOptions): Logger = js.native
  
  /* Inlined {[ name in bunyan.bunyan.LogLevelString ]: number} */
  object levelFromName {
    
    @JSImport("hexo-bunyan", "levelFromName")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hexo-bunyan", "levelFromName.debug")
    @js.native
    def debug: Double = js.native
    @scala.inline
    def debug_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
    
    @JSImport("hexo-bunyan", "levelFromName.error")
    @js.native
    def error: Double = js.native
    @scala.inline
    def error_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("hexo-bunyan", "levelFromName.fatal")
    @js.native
    def fatal: Double = js.native
    @scala.inline
    def fatal_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fatal")(x.asInstanceOf[js.Any])
    
    @JSImport("hexo-bunyan", "levelFromName.info")
    @js.native
    def info: Double = js.native
    @scala.inline
    def info_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("hexo-bunyan", "levelFromName.trace")
    @js.native
    def trace: Double = js.native
    @scala.inline
    def trace_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trace")(x.asInstanceOf[js.Any])
    
    @JSImport("hexo-bunyan", "levelFromName.warn")
    @js.native
    def warn: Double = js.native
    @scala.inline
    def warn_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warn")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("hexo-bunyan", "resolveLevel")
  @js.native
  def resolveLevel(value: LogLevel): Double = js.native
  
  @JSImport("hexo-bunyan", "safeCycles")
  @js.native
  def safeCycles(): js.Function2[/* key */ String, /* value */ js.Any, _] = js.native
  
  @JSImport("hexo-bunyan", "stdSerializers")
  @js.native
  val stdSerializers: StdSerializers_ = js.native
}
