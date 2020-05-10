package typingsSlinky.graylog2.mod

import typingsSlinky.graylog2.FnCall
import typingsSlinky.graylog2.ReadonlyGraylogConfig
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graylog2", "graylog")
@js.native
class graylog protected () extends EventEmitter {
  def this(config: ReadonlyGraylogConfig) = this()
  @JSName("alert")
  var alert_Original: FnCall = js.native
  @JSName("critical")
  var critical_Original: FnCall = js.native
  @JSName("debug")
  var debug_Original: FnCall = js.native
  @JSName("emergency")
  var emergency_Original: FnCall = js.native
  @JSName("error")
  var error_Original: FnCall = js.native
  @JSName("info")
  var info_Original: FnCall = js.native
  @JSName("notice")
  var notice_Original: FnCall = js.native
  @JSName("warn")
  var warn_Original: FnCall = js.native
  @JSName("warning")
  var warning_Original: FnCall = js.native
  def alert(message: String): Unit = js.native
  def alert(
    message: String,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def alert(message: String, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def alert(
    message: String,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def alert(message: String, additionalFields: Record[String, _]): Unit = js.native
  def alert(
    message: String,
    additionalFields: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def alert(message: String, fullMessage: String): Unit = js.native
  def alert(message: String, fullMessage: String, additionalFields: Record[String, _]): Unit = js.native
  def alert(message: String, fullMessage: String, additionalFields: Record[String, _], timestamp: Double): Unit = js.native
  def alert(message: js.Error): Unit = js.native
  def alert(
    message: js.Error,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def alert(message: js.Error, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def alert(
    message: js.Error,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def alert(message: js.Error, additionalFields: Record[String, _]): Unit = js.native
  def alert(
    message: js.Error,
    additionalFields: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def alert(message: Record[String, _]): Unit = js.native
  def alert(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def alert(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _]
  ): Unit = js.native
  def alert(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def close(): Unit = js.native
  def close(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def critical(message: String): Unit = js.native
  def critical(
    message: String,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def critical(message: String, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def critical(
    message: String,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def critical(message: String, additionalFields: Record[String, _]): Unit = js.native
  def critical(
    message: String,
    additionalFields: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def critical(message: String, fullMessage: String): Unit = js.native
  def critical(message: String, fullMessage: String, additionalFields: Record[String, _]): Unit = js.native
  def critical(message: String, fullMessage: String, additionalFields: Record[String, _], timestamp: Double): Unit = js.native
  def critical(message: js.Error): Unit = js.native
  def critical(
    message: js.Error,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def critical(message: js.Error, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def critical(
    message: js.Error,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def critical(message: js.Error, additionalFields: Record[String, _]): Unit = js.native
  def critical(
    message: js.Error,
    additionalFields: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def critical(message: Record[String, _]): Unit = js.native
  def critical(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def critical(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _]
  ): Unit = js.native
  def critical(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def debug(message: String): Unit = js.native
  def debug(
    message: String,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def debug(message: String, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def debug(
    message: String,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def debug(message: String, additionalFields: Record[String, _]): Unit = js.native
  def debug(
    message: String,
    additionalFields: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def debug(message: String, fullMessage: String): Unit = js.native
  def debug(message: String, fullMessage: String, additionalFields: Record[String, _]): Unit = js.native
  def debug(message: String, fullMessage: String, additionalFields: Record[String, _], timestamp: Double): Unit = js.native
  def debug(message: js.Error): Unit = js.native
  def debug(
    message: js.Error,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def debug(message: js.Error, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def debug(
    message: js.Error,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def debug(message: js.Error, additionalFields: Record[String, _]): Unit = js.native
  def debug(
    message: js.Error,
    additionalFields: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def debug(message: Record[String, _]): Unit = js.native
  def debug(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def debug(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _]
  ): Unit = js.native
  def debug(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def emergency(message: String): Unit = js.native
  def emergency(
    message: String,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def emergency(message: String, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def emergency(
    message: String,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def emergency(message: String, additionalFields: Record[String, _]): Unit = js.native
  def emergency(
    message: String,
    additionalFields: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def emergency(message: String, fullMessage: String): Unit = js.native
  def emergency(message: String, fullMessage: String, additionalFields: Record[String, _]): Unit = js.native
  def emergency(message: String, fullMessage: String, additionalFields: Record[String, _], timestamp: Double): Unit = js.native
  def emergency(message: js.Error): Unit = js.native
  def emergency(
    message: js.Error,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def emergency(message: js.Error, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def emergency(
    message: js.Error,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def emergency(message: js.Error, additionalFields: Record[String, _]): Unit = js.native
  def emergency(
    message: js.Error,
    additionalFields: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def emergency(message: Record[String, _]): Unit = js.native
  def emergency(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def emergency(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _]
  ): Unit = js.native
  def emergency(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def error(message: String): Unit = js.native
  def error(
    message: String,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def error(message: String, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def error(
    message: String,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def error(message: String, additionalFields: Record[String, _]): Unit = js.native
  def error(
    message: String,
    additionalFields: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def error(message: String, fullMessage: String): Unit = js.native
  def error(message: String, fullMessage: String, additionalFields: Record[String, _]): Unit = js.native
  def error(message: String, fullMessage: String, additionalFields: Record[String, _], timestamp: Double): Unit = js.native
  def error(message: js.Error): Unit = js.native
  def error(
    message: js.Error,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def error(message: js.Error, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def error(
    message: js.Error,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def error(message: js.Error, additionalFields: Record[String, _]): Unit = js.native
  def error(
    message: js.Error,
    additionalFields: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def error(message: Record[String, _]): Unit = js.native
  def error(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def error(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _]
  ): Unit = js.native
  def error(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def info(message: String): Unit = js.native
  def info(
    message: String,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def info(message: String, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def info(
    message: String,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def info(message: String, additionalFields: Record[String, _]): Unit = js.native
  def info(
    message: String,
    additionalFields: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def info(message: String, fullMessage: String): Unit = js.native
  def info(message: String, fullMessage: String, additionalFields: Record[String, _]): Unit = js.native
  def info(message: String, fullMessage: String, additionalFields: Record[String, _], timestamp: Double): Unit = js.native
  def info(message: js.Error): Unit = js.native
  def info(
    message: js.Error,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def info(message: js.Error, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def info(
    message: js.Error,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def info(message: js.Error, additionalFields: Record[String, _]): Unit = js.native
  def info(
    message: js.Error,
    additionalFields: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def info(message: Record[String, _]): Unit = js.native
  def info(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def info(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _]
  ): Unit = js.native
  def info(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def log(message: String): Unit = js.native
  def log(
    message: String,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def log(message: String, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def log(
    message: String,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def log(message: String, additionalFields: Record[String, _]): Unit = js.native
  def log(
    message: String,
    additionalFields: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def log(message: String, fullMessage: String): Unit = js.native
  def log(message: String, fullMessage: String, additionalFields: Record[String, _]): Unit = js.native
  def log(message: String, fullMessage: String, additionalFields: Record[String, _], timestamp: Double): Unit = js.native
  def log(message: js.Error): Unit = js.native
  def log(
    message: js.Error,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def log(message: js.Error, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def log(
    message: js.Error,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def log(message: js.Error, additionalFields: Record[String, _]): Unit = js.native
  def log(
    message: js.Error,
    additionalFields: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def log(message: Record[String, _]): Unit = js.native
  def log(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def log(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _]
  ): Unit = js.native
  def log(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def notice(message: String): Unit = js.native
  def notice(
    message: String,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def notice(message: String, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def notice(
    message: String,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def notice(message: String, additionalFields: Record[String, _]): Unit = js.native
  def notice(
    message: String,
    additionalFields: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def notice(message: String, fullMessage: String): Unit = js.native
  def notice(message: String, fullMessage: String, additionalFields: Record[String, _]): Unit = js.native
  def notice(message: String, fullMessage: String, additionalFields: Record[String, _], timestamp: Double): Unit = js.native
  def notice(message: js.Error): Unit = js.native
  def notice(
    message: js.Error,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def notice(message: js.Error, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def notice(
    message: js.Error,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def notice(message: js.Error, additionalFields: Record[String, _]): Unit = js.native
  def notice(
    message: js.Error,
    additionalFields: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def notice(message: Record[String, _]): Unit = js.native
  def notice(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def notice(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _]
  ): Unit = js.native
  def notice(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def warn(message: String): Unit = js.native
  def warn(
    message: String,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def warn(message: String, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def warn(
    message: String,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def warn(message: String, additionalFields: Record[String, _]): Unit = js.native
  def warn(
    message: String,
    additionalFields: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def warn(message: String, fullMessage: String): Unit = js.native
  def warn(message: String, fullMessage: String, additionalFields: Record[String, _]): Unit = js.native
  def warn(message: String, fullMessage: String, additionalFields: Record[String, _], timestamp: Double): Unit = js.native
  def warn(message: js.Error): Unit = js.native
  def warn(
    message: js.Error,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def warn(message: js.Error, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def warn(
    message: js.Error,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def warn(message: js.Error, additionalFields: Record[String, _]): Unit = js.native
  def warn(
    message: js.Error,
    additionalFields: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def warn(message: Record[String, _]): Unit = js.native
  def warn(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def warn(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _]
  ): Unit = js.native
  def warn(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def warning(message: String): Unit = js.native
  def warning(
    message: String,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def warning(message: String, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def warning(
    message: String,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def warning(message: String, additionalFields: Record[String, _]): Unit = js.native
  def warning(
    message: String,
    additionalFields: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def warning(message: String, fullMessage: String): Unit = js.native
  def warning(message: String, fullMessage: String, additionalFields: Record[String, _]): Unit = js.native
  def warning(message: String, fullMessage: String, additionalFields: Record[String, _], timestamp: Double): Unit = js.native
  def warning(message: js.Error): Unit = js.native
  def warning(
    message: js.Error,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def warning(message: js.Error, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def warning(
    message: js.Error,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def warning(message: js.Error, additionalFields: Record[String, _]): Unit = js.native
  def warning(
    message: js.Error,
    additionalFields: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def warning(message: Record[String, _]): Unit = js.native
  def warning(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def warning(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _]
  ): Unit = js.native
  def warning(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
}

@JSImport("graylog2", "graylog")
@js.native
object graylog extends js.Object {
  val graylog: typingsSlinky.graylog2.mod.graylog = js.native
}

