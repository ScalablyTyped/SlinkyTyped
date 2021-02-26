package typingsSlinky.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait sdkDebugLogsLevel extends StObject
@JSImport("instabug-reactnative", "sdkDebugLogsLevel")
@js.native
object sdkDebugLogsLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[sdkDebugLogsLevel with Double] = js.native
  
  @js.native
  sealed trait sdkDebugLogsLevelDebug extends sdkDebugLogsLevel
  /* 1 */ val sdkDebugLogsLevelDebug: typingsSlinky.instabugReactnative.mod.sdkDebugLogsLevel.sdkDebugLogsLevelDebug with Double = js.native
  
  @js.native
  sealed trait sdkDebugLogsLevelError extends sdkDebugLogsLevel
  /* 2 */ val sdkDebugLogsLevelError: typingsSlinky.instabugReactnative.mod.sdkDebugLogsLevel.sdkDebugLogsLevelError with Double = js.native
  
  @js.native
  sealed trait sdkDebugLogsLevelNone extends sdkDebugLogsLevel
  /* 3 */ val sdkDebugLogsLevelNone: typingsSlinky.instabugReactnative.mod.sdkDebugLogsLevel.sdkDebugLogsLevelNone with Double = js.native
  
  @js.native
  sealed trait sdkDebugLogsLevelVerbose extends sdkDebugLogsLevel
  /* 0 */ val sdkDebugLogsLevelVerbose: typingsSlinky.instabugReactnative.mod.sdkDebugLogsLevel.sdkDebugLogsLevelVerbose with Double = js.native
}
