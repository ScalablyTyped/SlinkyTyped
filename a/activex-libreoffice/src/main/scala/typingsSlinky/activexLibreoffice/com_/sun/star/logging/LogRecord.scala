package typingsSlinky.activexLibreoffice.com_.sun.star.logging

import typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * assembles the complete information about a to-be-logged event
  * @see XLogger
  * @since OOo 2.3
  */
@js.native
trait LogRecord extends js.Object {
  /**
    * specifies the level of the log event
    * @see LogLevel
    */
  var Level: Double = js.native
  var LogTime: DateTime = js.native
  var LoggerName: String = js.native
  var Message: String = js.native
  /**
    * specifies the number of the log event.
    *
    * Subsequent events get assigned increasing sequence numbers by the {@link XLogger} at which they're logged.
    */
  var SequenceNumber: Double = js.native
  /**
    * specifies the name of the class, in which the record was logged.
    *
    * This name might be empty, in case the caller to one of the various `log` methods of {@link XLogger} did not specify it.
    */
  var SourceClassName: String = js.native
  /**
    * specifies the name of the method, in which the record was logged.
    *
    * This name might be empty, in case the caller to one of the various `log` methods of {@link XLogger} did not specify it.
    */
  var SourceMethodName: String = js.native
  var ThreadID: String = js.native
}

object LogRecord {
  @scala.inline
  def apply(
    Level: Double,
    LogTime: DateTime,
    LoggerName: String,
    Message: String,
    SequenceNumber: Double,
    SourceClassName: String,
    SourceMethodName: String,
    ThreadID: String
  ): LogRecord = {
    val __obj = js.Dynamic.literal(Level = Level.asInstanceOf[js.Any], LogTime = LogTime.asInstanceOf[js.Any], LoggerName = LoggerName.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any], SourceClassName = SourceClassName.asInstanceOf[js.Any], SourceMethodName = SourceMethodName.asInstanceOf[js.Any], ThreadID = ThreadID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogRecord]
  }
  @scala.inline
  implicit class LogRecordOps[Self <: LogRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogTime(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoggerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequenceNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceMethodName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceMethodName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreadID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreadID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

