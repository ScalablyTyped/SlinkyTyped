package typingsSlinky.rotDashJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.rotDashJs.libSchedulerSpeedMod.SpeedActor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/scheduler", JSImport.Namespace)
@js.native
object libSchedulerMod extends js.Object {
  @js.native
  object default extends js.Object {
    @js.native
    class Action[T] ()
      extends typingsSlinky.rotDashJs.libSchedulerActionMod.default[T]
    
    @js.native
    class Simple[T] ()
      extends typingsSlinky.rotDashJs.libSchedulerSimpleMod.default[T]
    
    @js.native
    class Speed[T /* <: SpeedActor */] ()
      extends typingsSlinky.rotDashJs.libSchedulerSpeedMod.default[T]
    
    @js.native
    object Action
      extends TopLevel[Instantiable0[typingsSlinky.rotDashJs.libSchedulerActionMod.default[js.Object]]]
    
    @js.native
    object Simple
      extends TopLevel[Instantiable0[typingsSlinky.rotDashJs.libSchedulerSimpleMod.default[js.Object]]]
    
    @js.native
    object Speed
      extends TopLevel[Instantiable0[typingsSlinky.rotDashJs.libSchedulerSpeedMod.default[SpeedActor]]]
    
  }
  
}

