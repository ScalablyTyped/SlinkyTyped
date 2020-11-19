package typingsSlinky.npmlog

import typingsSlinky.npmlog.mod.LogLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object npmlogStrings {
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def notice: notice = "notice".asInstanceOf[notice]
  
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  
  @scala.inline
  def silly: silly = "silly".asInstanceOf[silly]
  
  @scala.inline
  def timing: timing = "timing".asInstanceOf[timing]
  
  @scala.inline
  def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait error extends LogLevels
  
  @js.native
  sealed trait http extends LogLevels
  
  @js.native
  sealed trait info extends LogLevels
  
  @js.native
  sealed trait notice extends LogLevels
  
  @js.native
  sealed trait silent extends LogLevels
  
  @js.native
  sealed trait silly extends LogLevels
  
  @js.native
  sealed trait timing extends LogLevels
  
  @js.native
  sealed trait verbose extends LogLevels
  
  @js.native
  sealed trait warn extends LogLevels
}
