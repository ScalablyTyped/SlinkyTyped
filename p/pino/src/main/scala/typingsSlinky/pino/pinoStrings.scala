package typingsSlinky.pino

import typingsSlinky.pino.mod.Level
import typingsSlinky.pino.mod.LevelWithSilent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinoStrings {
  
  @js.native
  sealed trait debug
    extends Level
       with LevelWithSilent
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error
    extends Level
       with LevelWithSilent
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fatal
    extends Level
       with LevelWithSilent
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  
  @js.native
  sealed trait info
    extends Level
       with LevelWithSilent
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait `level-change` extends StObject
  @scala.inline
  def `level-change`: `level-change` = "level-change".asInstanceOf[`level-change`]
  
  @js.native
  sealed trait silent extends LevelWithSilent
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait trace
    extends Level
       with LevelWithSilent
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  
  @js.native
  sealed trait warn
    extends Level
       with LevelWithSilent
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}
