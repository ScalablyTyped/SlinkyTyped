package typingsSlinky.log4js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.log4js.mod.CategoryFilterAppender
  - typingsSlinky.log4js.mod.ConsoleAppender
  - typingsSlinky.log4js.mod.FileAppender
  - typingsSlinky.log4js.mod.SyncfileAppender
  - typingsSlinky.log4js.mod.DateFileAppender
  - typingsSlinky.log4js.mod.LogLevelFilterAppender
  - typingsSlinky.log4js.mod.NoLogFilterAppender
  - typingsSlinky.log4js.mod.MultiFileAppender
  - typingsSlinky.log4js.mod.MultiprocessAppender
  - typingsSlinky.log4js.mod.RecordingAppender
  - typingsSlinky.log4js.mod.StandardErrorAppender
  - typingsSlinky.log4js.mod.StandardOutputAppender
  - typingsSlinky.log4js.mod.CustomAppender
*/
trait Appender extends js.Object

object Appender {
  @scala.inline
  implicit def apply(value: CategoryFilterAppender): Appender = value.asInstanceOf[Appender]
  @scala.inline
  implicit def apply(value: ConsoleAppender): Appender = value.asInstanceOf[Appender]
  @scala.inline
  implicit def apply(value: CustomAppender): Appender = value.asInstanceOf[Appender]
  @scala.inline
  implicit def apply(value: DateFileAppender): Appender = value.asInstanceOf[Appender]
  @scala.inline
  implicit def apply(value: FileAppender): Appender = value.asInstanceOf[Appender]
  @scala.inline
  implicit def apply(value: LogLevelFilterAppender): Appender = value.asInstanceOf[Appender]
  @scala.inline
  implicit def apply(value: MultiFileAppender): Appender = value.asInstanceOf[Appender]
  @scala.inline
  implicit def apply(value: MultiprocessAppender): Appender = value.asInstanceOf[Appender]
  @scala.inline
  implicit def apply(value: NoLogFilterAppender): Appender = value.asInstanceOf[Appender]
  @scala.inline
  implicit def apply(value: RecordingAppender): Appender = value.asInstanceOf[Appender]
  @scala.inline
  implicit def apply(value: StandardErrorAppender): Appender = value.asInstanceOf[Appender]
  @scala.inline
  implicit def apply(value: StandardOutputAppender): Appender = value.asInstanceOf[Appender]
  @scala.inline
  implicit def apply(value: SyncfileAppender): Appender = value.asInstanceOf[Appender]
}

