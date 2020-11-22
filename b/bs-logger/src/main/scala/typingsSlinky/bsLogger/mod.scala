package typingsSlinky.bsLogger

import typingsSlinky.bsLogger.loggerMod.CreateLoggerOptions
import typingsSlinky.bsLogger.loggerMod.Logger
import typingsSlinky.bsLogger.messageMod.LogMessageFormatter
import typingsSlinky.bsLogger.targetMockMod.ExtendedArray
import typingsSlinky.bsLogger.targetMod.LogTarget
import typingsSlinky.bsLogger.testingMod.LoggerMock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bs-logger", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val DEFAULT_LOG_TARGET: String = js.native
  
  def createLogger(): Logger = js.native
  def createLogger(hasContextTargetsTranslate: CreateLoggerOptions): Logger = js.native
  
  val default: Logger = js.native
  
  def lastSequenceNumber(): Double = js.native
  
  def logLevelNameFor(): String = js.native
  def logLevelNameFor(level: Double): String = js.native
  
  val logger: Logger = js.native
  
  def parseLogLevel(level: String): js.UndefOr[Double] = js.native
  def parseLogLevel(level: Double): js.UndefOr[Double] = js.native
  
  def parseLogTargets(): js.Array[LogTarget] = js.native
  def parseLogTargets(targetString: String): js.Array[LogTarget] = js.native
  
  def registerLogFormatter(name: String, format: LogMessageFormatter): Unit = js.native
  
  def resetLogFormatters(): Unit = js.native
  
  def resetSequence(): Unit = js.native
  def resetSequence(next: Double): Unit = js.native
  
  def setup(): Unit = js.native
  def setup(factory: js.Function0[Logger]): Unit = js.native
  
  @js.native
  object LogContexts extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.bsLogger.contextMod.LogContexts with String] = js.native
    
    /* "package" */ val _package: typingsSlinky.bsLogger.contextMod.LogContexts._package with String = js.native
    
    /* "application" */ val application: typingsSlinky.bsLogger.contextMod.LogContexts.application with String = js.native
    
    /* "hostname" */ val hostname: typingsSlinky.bsLogger.contextMod.LogContexts.hostname with String = js.native
    
    /* "logLevel" */ val logLevel: typingsSlinky.bsLogger.contextMod.LogContexts.logLevel with String = js.native
    
    /* "namespace" */ val namespace: typingsSlinky.bsLogger.contextMod.LogContexts.namespace with String = js.native
  }
  
  @js.native
  object LogLevels extends js.Object {
    
    var debug: Double = js.native
    
    var error: Double = js.native
    
    var fatal: Double = js.native
    
    val higher: Double = js.native
    
    var info: Double = js.native
    
    val lower: Double = js.native
    
    var trace: Double = js.native
    
    var warn: Double = js.native
  }
  
  @js.native
  object testing extends js.Object {
    
    def createLoggerMock(): LoggerMock = js.native
    def createLoggerMock(options: js.UndefOr[scala.Nothing], target: typingsSlinky.bsLogger.targetMockMod.LogTargetMock): LoggerMock = js.native
    def createLoggerMock(options: CreateLoggerOptions): LoggerMock = js.native
    def createLoggerMock(options: CreateLoggerOptions, target: typingsSlinky.bsLogger.targetMockMod.LogTargetMock): LoggerMock = js.native
    
    def extendArray[T](array: js.Array[T]): ExtendedArray[T] = js.native
    
    def setup(): Unit = js.native
    def setup(target: typingsSlinky.bsLogger.targetMockMod.LogTargetMock): Unit = js.native
    
    @js.native
    class LogTargetMock ()
      extends typingsSlinky.bsLogger.testingMod.LogTargetMock {
      def this(minLevel: Double) = this()
    }
  }
}
