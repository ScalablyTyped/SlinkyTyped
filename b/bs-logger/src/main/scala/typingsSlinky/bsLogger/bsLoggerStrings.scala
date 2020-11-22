package typingsSlinky.bsLogger

import typingsSlinky.bsLogger.levelMod.LogLevelName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bsLoggerStrings {
  
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait debug extends LogLevelName
  
  @js.native
  sealed trait error extends LogLevelName
  
  @js.native
  sealed trait fatal extends LogLevelName
  
  @js.native
  sealed trait info extends LogLevelName
  
  @js.native
  sealed trait trace extends LogLevelName
  
  @js.native
  sealed trait warn extends LogLevelName
}
