package typingsSlinky.reactMdUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useIntervalMod {
  
  @JSImport("@react-md/utils/types/useInterval", "useInterval")
  @js.native
  def useInterval(callback: js.Function1[/* stop */ js.Function0[Unit], Unit], delay: Double): ReturnValue = js.native
  @JSImport("@react-md/utils/types/useInterval", "useInterval")
  @js.native
  def useInterval(
    callback: js.Function1[/* stop */ js.Function0[Unit], Unit],
    delay: Double,
    defaultRunning: Boolean
  ): ReturnValue = js.native
  
  type ReturnValue = js.Tuple3[Running, StartInterval, StopInterval]
  
  type Running = Boolean
  
  type StartInterval = js.Function0[Unit]
  
  type StopInterval = js.Function0[Unit]
}
