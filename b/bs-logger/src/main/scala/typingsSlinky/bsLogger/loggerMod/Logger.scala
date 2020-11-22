package typingsSlinky.bsLogger.loggerMod

import typingsSlinky.bsLogger.contextMod.LogContext
import typingsSlinky.bsLogger.messageMod.LogMessageTranslator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger extends LogMethod {
  
  def child(context: LogContext): Logger = js.native
  def child(translate: LogMessageTranslator): Logger = js.native
  @JSName("child")
  var child_Original: LogChildMethod = js.native
  
  def debug(context: LogContext, message: String, args: js.Any*): Unit = js.native
  def debug(message: String, args: js.Any*): Unit = js.native
  @JSName("debug")
  var debug_Original: LogMethod = js.native
  
  def error(context: LogContext, message: String, args: js.Any*): Unit = js.native
  def error(message: String, args: js.Any*): Unit = js.native
  @JSName("error")
  var error_Original: LogMethod = js.native
  
  def fatal(context: LogContext, message: String, args: js.Any*): Unit = js.native
  def fatal(message: String, args: js.Any*): Unit = js.native
  @JSName("fatal")
  var fatal_Original: LogMethod = js.native
  
  def info(context: LogContext, message: String, args: js.Any*): Unit = js.native
  def info(message: String, args: js.Any*): Unit = js.native
  @JSName("info")
  var info_Original: LogMethod = js.native
  
  def trace(context: LogContext, message: String, args: js.Any*): Unit = js.native
  def trace(message: String, args: js.Any*): Unit = js.native
  @JSName("trace")
  var trace_Original: LogMethod = js.native
  
  def warn(context: LogContext, message: String, args: js.Any*): Unit = js.native
  def warn(message: String, args: js.Any*): Unit = js.native
  @JSName("warn")
  var warn_Original: LogMethod = js.native
  
  def wrap[F /* <: js.Function1[/* repeated */ js.Any, _] */](context: LogContext, message: String, func: F): F = js.native
  def wrap[F /* <: js.Function1[/* repeated */ js.Any, _] */](func: F): F = js.native
  def wrap[F /* <: js.Function1[/* repeated */ js.Any, _] */](level: Double, message: String, func: F): F = js.native
  def wrap[F /* <: js.Function1[/* repeated */ js.Any, _] */](message: String, func: F): F = js.native
  @JSName("wrap")
  var wrap_Original: LogWrapMethod = js.native
}
