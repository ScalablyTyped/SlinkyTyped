package typingsSlinky.log4js.mod

import typingsSlinky.log4js.log4jsStrings.categoryFilter
import typingsSlinky.log4js.log4jsStrings.console
import typingsSlinky.log4js.log4jsStrings.dateFile
import typingsSlinky.log4js.log4jsStrings.file
import typingsSlinky.log4js.log4jsStrings.fileSync
import typingsSlinky.log4js.log4jsStrings.logLevelFilter
import typingsSlinky.log4js.log4jsStrings.master
import typingsSlinky.log4js.log4jsStrings.multiFile
import typingsSlinky.log4js.log4jsStrings.multiprocess
import typingsSlinky.log4js.log4jsStrings.noLogFilter
import typingsSlinky.log4js.log4jsStrings.recording
import typingsSlinky.log4js.log4jsStrings.stderr
import typingsSlinky.log4js.log4jsStrings.stdout
import typingsSlinky.log4js.log4jsStrings.worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def StandardErrorAppender(`type`: stderr): Appender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  
  @scala.inline
  def CategoryFilterAppender(`type`: categoryFilter): Appender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  
  @scala.inline
  def RecordingAppender(`type`: recording): Appender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  
  @scala.inline
  def MultiFileAppender(base: String, extension: String, property: String, `type`: multiFile): Appender = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  
  @scala.inline
  def StandardOutputAppender(`type`: stdout): Appender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  
  @scala.inline
  def CustomAppender(`type`: String | AppenderModule): Appender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  
  @scala.inline
  def DateFileAppender(filename: String, `type`: dateFile): Appender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  
  @scala.inline
  def FileAppender(filename: String, `type`: file): Appender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  
  @scala.inline
  def SyncfileAppender(filename: String, `type`: fileSync): Appender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  
  @scala.inline
  def NoLogFilterAppender(appender: String, exclude: String | js.Array[String], `type`: noLogFilter): Appender = {
    val __obj = js.Dynamic.literal(appender = appender.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  
  @scala.inline
  def LogLevelFilterAppender(appender: String, level: String, `type`: logLevelFilter): Appender = {
    val __obj = js.Dynamic.literal(appender = appender.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  
  @scala.inline
  def ConsoleAppender(`type`: console): Appender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  
  @scala.inline
  def MultiprocessAppender(mode: master | worker, `type`: multiprocess): Appender = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
}
