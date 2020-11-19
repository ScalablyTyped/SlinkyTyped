package typingsSlinky.audiosprite

import typingsSlinky.audiosprite.mod.LogLevel
import typingsSlinky.audiosprite.mod._ExportType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object audiospriteStrings {
  
  @scala.inline
  def createjs: createjs = "createjs".asInstanceOf[createjs]
  
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def howler: howler = "howler".asInstanceOf[howler]
  
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def jukebox: jukebox = "jukebox".asInstanceOf[jukebox]
  
  @scala.inline
  def notice: notice = "notice".asInstanceOf[notice]
  
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
  
  @js.native
  sealed trait createjs extends _ExportType
  
  @js.native
  sealed trait debug extends LogLevel
  
  @js.native
  sealed trait error extends LogLevel
  
  @js.native
  sealed trait howler extends _ExportType
  
  @js.native
  sealed trait info extends LogLevel
  
  @js.native
  sealed trait jukebox extends _ExportType
  
  @js.native
  sealed trait notice extends LogLevel
  
  @js.native
  sealed trait warning extends LogLevel
}
