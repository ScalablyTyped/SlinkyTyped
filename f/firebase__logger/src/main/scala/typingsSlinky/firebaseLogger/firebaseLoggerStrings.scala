package typingsSlinky.firebaseLogger

import typingsSlinky.firebaseLogger.loggerMod.LogLevelString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseLoggerStrings {
  
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  
  @scala.inline
  def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait debug extends LogLevelString
  
  @js.native
  sealed trait error extends LogLevelString
  
  @js.native
  sealed trait info extends LogLevelString
  
  @js.native
  sealed trait silent extends LogLevelString
  
  @js.native
  sealed trait verbose extends LogLevelString
  
  @js.native
  sealed trait warn extends LogLevelString
}
