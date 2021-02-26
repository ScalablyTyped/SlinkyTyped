package typingsSlinky.ravenJs

import typingsSlinky.ravenJs.mod.BreadcrumbType
import typingsSlinky.ravenJs.mod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ravenJsStrings {
  
  @js.native
  sealed trait critical extends LogLevel
  @scala.inline
  def critical: critical = "critical".asInstanceOf[critical]
  
  @js.native
  sealed trait debug extends LogLevel
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error extends LogLevel
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fatal extends LogLevel
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  
  @js.native
  sealed trait http extends BreadcrumbType
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait info extends LogLevel
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait log extends LogLevel
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait navigation extends BreadcrumbType
  @scala.inline
  def navigation: navigation = "navigation".asInstanceOf[navigation]
  
  @js.native
  sealed trait warn extends LogLevel
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait warning extends LogLevel
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}
