package typingsSlinky.consoleLogLevel

import typingsSlinky.consoleLogLevel.mod.LogLevelNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consoleLogLevelStrings {
  
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
  sealed trait debug extends LogLevelNames
  
  @js.native
  sealed trait error extends LogLevelNames
  
  @js.native
  sealed trait fatal extends LogLevelNames
  
  @js.native
  sealed trait info extends LogLevelNames
  
  @js.native
  sealed trait trace extends LogLevelNames
  
  @js.native
  sealed trait warn extends LogLevelNames
}
