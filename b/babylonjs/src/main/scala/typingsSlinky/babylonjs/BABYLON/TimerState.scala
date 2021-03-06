package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimerState extends StObject
@JSGlobal("BABYLON.TimerState")
@js.native
object TimerState extends StObject {
  
  /**
    * Timer ended (whether aborted or time reached)
    */
  @js.native
  sealed trait ENDED extends TimerState
  
  /**
    * Timer initialized, not yet started
    */
  @js.native
  sealed trait INIT extends TimerState
  
  /**
    * Timer started and counting
    */
  @js.native
  sealed trait STARTED extends TimerState
}
