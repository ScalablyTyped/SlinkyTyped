package typingsSlinky.browserBunyan.anon

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

@js.native
trait Typeofbunyan extends js.Object {
  val DEBUG: Double = js.native
  val ERROR: Double = js.native
  val FATAL: Double = js.native
  val INFO: Double = js.native
  var RingBuffer: Instantiable1[/* options */ RingBufferOptions, typingsSlinky.bunyan.mod.RingBuffer] = js.native
  var RotatingFileStream: Instantiable1[
    /* options */ RotatingFileStreamOptions, 
    typingsSlinky.bunyan.mod.RotatingFileStream
  ] = js.native
  val TRACE: Double = js.native
  val WARN: Double = js.native
  val levelFromName: nameinLogLevelStringnumbe = js.native
  val nameFromLevel: NumberDictionary[String] = js.native
  val stdSerializers: StdSerializers_ = js.native
  def createLogger(options: LoggerOptions): Logger = js.native
  def resolveLevel(value: LogLevel): Double = js.native
  def safeCycles(): js.Function2[/* key */ String, /* value */ js.Any, _] = js.native
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
  @scala.inline
  implicit class TypeofbunyanOps[Self <: Typeofbunyan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDEBUG(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withERROR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFATAL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FATAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINFO(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INFO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRingBuffer(value: Instantiable1[/* options */ RingBufferOptions, RingBuffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RingBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotatingFileStream(value: Instantiable1[/* options */ RotatingFileStreamOptions, RotatingFileStream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RotatingFileStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRACE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRACE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWARN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateLogger(value: LoggerOptions => Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createLogger")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLevelFromName(value: nameinLogLevelStringnumbe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelFromName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameFromLevel(value: NumberDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameFromLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolveLevel(value: LogLevel => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveLevel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSafeCycles(value: () => js.Function2[/* key */ String, /* value */ js.Any, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeCycles")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStdSerializers(value: StdSerializers_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdSerializers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

