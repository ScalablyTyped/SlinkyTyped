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
import org.scalablytyped.runtime.StObject
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
trait Appender extends StObject
object Appender {
  
  @scala.inline
  def CategoryFilterAppender(`type`: categoryFilter): typingsSlinky.log4js.mod.CategoryFilterAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.log4js.mod.CategoryFilterAppender]
  }
  
  @scala.inline
  def ConsoleAppender(`type`: console): typingsSlinky.log4js.mod.ConsoleAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.log4js.mod.ConsoleAppender]
  }
  
  @scala.inline
  def CustomAppender(`type`: String | AppenderModule): typingsSlinky.log4js.mod.CustomAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.log4js.mod.CustomAppender]
  }
  
  @scala.inline
  def DateFileAppender(filename: String, `type`: dateFile): typingsSlinky.log4js.mod.DateFileAppender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.log4js.mod.DateFileAppender]
  }
  
  @scala.inline
  def FileAppender(filename: String, `type`: file): typingsSlinky.log4js.mod.FileAppender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.log4js.mod.FileAppender]
  }
  
  @scala.inline
  def LogLevelFilterAppender(appender: String, level: String, `type`: logLevelFilter): typingsSlinky.log4js.mod.LogLevelFilterAppender = {
    val __obj = js.Dynamic.literal(appender = appender.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.log4js.mod.LogLevelFilterAppender]
  }
  
  @scala.inline
  def MultiFileAppender(base: String, extension: String, property: String, `type`: multiFile): typingsSlinky.log4js.mod.MultiFileAppender = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.log4js.mod.MultiFileAppender]
  }
  
  @scala.inline
  def MultiprocessAppender(mode: master | worker, `type`: multiprocess): typingsSlinky.log4js.mod.MultiprocessAppender = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.log4js.mod.MultiprocessAppender]
  }
  
  @scala.inline
  def NoLogFilterAppender(appender: String, exclude: String | js.Array[String], `type`: noLogFilter): typingsSlinky.log4js.mod.NoLogFilterAppender = {
    val __obj = js.Dynamic.literal(appender = appender.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.log4js.mod.NoLogFilterAppender]
  }
  
  @scala.inline
  def RecordingAppender(`type`: recording): typingsSlinky.log4js.mod.RecordingAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.log4js.mod.RecordingAppender]
  }
  
  @scala.inline
  def StandardErrorAppender(`type`: stderr): typingsSlinky.log4js.mod.StandardErrorAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.log4js.mod.StandardErrorAppender]
  }
  
  @scala.inline
  def StandardOutputAppender(`type`: stdout): typingsSlinky.log4js.mod.StandardOutputAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.log4js.mod.StandardOutputAppender]
  }
  
  @scala.inline
  def SyncfileAppender(filename: String, `type`: fileSync): typingsSlinky.log4js.mod.SyncfileAppender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.log4js.mod.SyncfileAppender]
  }
}
