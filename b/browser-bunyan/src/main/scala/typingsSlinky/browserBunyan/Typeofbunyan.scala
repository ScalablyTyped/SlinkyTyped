package typingsSlinky.browserBunyan

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.bunyan.mod.LogLevel
import typingsSlinky.bunyan.mod.Logger
import typingsSlinky.bunyan.mod.LoggerOptions
import typingsSlinky.bunyan.mod.RingBuffer
import typingsSlinky.bunyan.mod.RingBufferOptions
import typingsSlinky.bunyan.mod.RotatingFileStream
import typingsSlinky.bunyan.mod.RotatingFileStreamOptions
import typingsSlinky.bunyan.mod.StdSerializers_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofbunyan extends js.Object {
  val DEBUG: Double
  val ERROR: Double
  val FATAL: Double
  val INFO: Double
  var RingBuffer: Instantiable1[/* options */ RingBufferOptions, typingsSlinky.bunyan.mod.RingBuffer]
  var RotatingFileStream: Instantiable1[
    /* options */ RotatingFileStreamOptions, 
    typingsSlinky.bunyan.mod.RotatingFileStream
  ]
  val TRACE: Double
  val WARN: Double
  val levelFromName: nameinLogLevelStringnumbe
  val nameFromLevel: NumberDictionary[String]
  val stdSerializers: StdSerializers_
  def createLogger(options: LoggerOptions): Logger
  def resolveLevel(value: LogLevel): Double
  def safeCycles(): js.Function2[/* key */ String, /* value */ js.Any, _]
}

object Typeofbunyan {
  @scala.inline
  def apply(
    DEBUG: Double,
    ERROR: Double,
    FATAL: Double,
    INFO: Double,
    RingBuffer: Instantiable1[/* options */ RingBufferOptions, RingBuffer],
    RotatingFileStream: Instantiable1[/* options */ RotatingFileStreamOptions, RotatingFileStream],
    TRACE: Double,
    WARN: Double,
    createLogger: LoggerOptions => Logger,
    levelFromName: nameinLogLevelStringnumbe,
    nameFromLevel: NumberDictionary[String],
    resolveLevel: LogLevel => Double,
    safeCycles: () => js.Function2[/* key */ String, /* value */ js.Any, _],
    stdSerializers: StdSerializers_
  ): Typeofbunyan = {
    val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], FATAL = FATAL.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], RingBuffer = RingBuffer.asInstanceOf[js.Any], RotatingFileStream = RotatingFileStream.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any], createLogger = js.Any.fromFunction1(createLogger), levelFromName = levelFromName.asInstanceOf[js.Any], nameFromLevel = nameFromLevel.asInstanceOf[js.Any], resolveLevel = js.Any.fromFunction1(resolveLevel), safeCycles = js.Any.fromFunction0(safeCycles), stdSerializers = stdSerializers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeofbunyan]
  }
}

