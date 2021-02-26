package typingsSlinky.consola.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogLevel extends StObject
@JSImport("consola", "LogLevel")
@js.native
object LogLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
  
  @js.native
  sealed trait Debug extends LogLevel
  /* 4 */ val Debug: typingsSlinky.consola.mod.LogLevel.Debug with Double = js.native
  
  @js.native
  sealed trait Error extends LogLevel
  /* 0 */ val Error: typingsSlinky.consola.mod.LogLevel.Error with Double = js.native
  
  @js.native
  sealed trait Fatal extends LogLevel
  /* 0 */ val Fatal: typingsSlinky.consola.mod.LogLevel.Fatal with Double = js.native
  
  @js.native
  sealed trait Info extends LogLevel
  /* 3 */ val Info: typingsSlinky.consola.mod.LogLevel.Info with Double = js.native
  
  @js.native
  sealed trait Log extends LogLevel
  /* 2 */ val Log: typingsSlinky.consola.mod.LogLevel.Log with Double = js.native
  
  @js.native
  sealed trait Silent extends LogLevel
  /* -Infinity */ val Silent: typingsSlinky.consola.mod.LogLevel.Silent with Double = js.native
  
  @js.native
  sealed trait Success extends LogLevel
  /* 3 */ val Success: typingsSlinky.consola.mod.LogLevel.Success with Double = js.native
  
  @js.native
  sealed trait Trace extends LogLevel
  /* 5 */ val Trace: typingsSlinky.consola.mod.LogLevel.Trace with Double = js.native
  
  @js.native
  sealed trait Verbose extends LogLevel
  /* Infinity */ val Verbose: typingsSlinky.consola.mod.LogLevel.Verbose with Double = js.native
  
  @js.native
  sealed trait Warn extends LogLevel
  /* 1 */ val Warn: typingsSlinky.consola.mod.LogLevel.Warn with Double = js.native
}
